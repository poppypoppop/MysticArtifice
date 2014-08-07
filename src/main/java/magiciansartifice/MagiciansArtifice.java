package magiciansartifice;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Optional;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import magiciansartifice.blocks.BlockRegistry;
import magiciansartifice.client.guis.CreativeTab;
import magiciansartifice.client.guis.GuiHandler;
import magiciansartifice.events.EntityEventHandler;
import magiciansartifice.fluids.LiquidRegistry;
import magiciansartifice.events.EntityEventHandler;
import magiciansartifice.items.ItemRegistry;
import magiciansartifice.libs.ConfigHandler;
import magiciansartifice.libs.ModInfo;
import magiciansartifice.network.PacketHandler;
import magiciansartifice.proxies.CommonProxy;
import magiciansartifice.spells.rituals.Rituals;
import magiciansartifice.tileentities.TileEntityRegistry;
import magiciansartifice.tileentities.machines.TileEntityMetalForge;
import magiciansartifice.tileentities.recipes.RecipesMetalForge;
import magiciansartifice.utils.GenerationHandler;
import magiciansartifice.utils.OreDictHandler;
import magiciansartifice.utils.PlayerHelper;
import magiciansartifice.utils.RecipeRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = ModInfo.MODID, name = ModInfo.NAME, version = ModInfo.VERSION)
public class MagiciansArtifice {
    @Instance(ModInfo.MODID)
    public static MagiciansArtifice instance;
    public static Logger logger = LogManager.getLogger(ModInfo.NAME);

    @SidedProxy(clientSide = ModInfo.CLIENT, serverSide = ModInfo.SERVER)
    public static CommonProxy proxy;

    public static CreativeTabs tab = new CreativeTab(ModInfo.MODID);

    Configuration config;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        config = new Configuration(event.getSuggestedConfigurationFile());
        ConfigHandler.configOptions(config);

        BlockRegistry.registerBlocks();
        Rituals.init();
        ItemRegistry.initItems();
        TileEntityRegistry.registerTEs();
        LiquidRegistry.registerFluids();

        OreDictHandler.registerOreDicts();
        RecipeRegistry.registerModRecipes();
        GameRegistry.registerWorldGenerator(new GenerationHandler(), 8);
        NetworkRegistry.INSTANCE.registerGuiHandler(MagiciansArtifice.instance, new GuiHandler());
        MinecraftForge.EVENT_BUS.register(new EntityEventHandler());

        proxy.load();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        PacketHandler.init();
        RecipeRegistry.registerModRecipes();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

    @Optional.Method(modid="cAPI")
    @EventHandler
    public void capeInit(FMLPreInitializationEvent event) {
        PlayerHelper.players.add("Mitchellbrine");
        PlayerHelper.players.add("poppypoppop");
        PlayerHelper.players.add("allout58");
        PlayerHelper.players.add("isomgirl6");
        PlayerHelper.players.add("sor1n");
        PlayerHelper.players.add("MrComputerGhost");
        PlayerHelper.players.add("hawks008");
        PlayerHelper.players.add("theminecoder");
//        CAPI.instance.addCape("http://i.imgur.com/BrLFljO.png","magician");
    }

}
