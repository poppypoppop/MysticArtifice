package magiciansartifice.main.items;

import java.util.ArrayList;

import magiciansartifice.main.compat.ticon.toolparts.ToolPartPickHead;
import magiciansartifice.main.items.magicalitems.ItemHorcrux;
import magiciansartifice.main.items.magicalitems.ItemLetterMerlin;
import magiciansartifice.main.items.magicalitems.ItemRitualCatalyst;
import magiciansartifice.main.items.magicalitems.ItemSpiderFang;
import magiciansartifice.main.items.magicalitems.ItemWand;
import magiciansartifice.main.items.ores.ItemDustMeta;
import magiciansartifice.main.items.ores.ItemIngotMeta;
import magiciansartifice.main.items.tools.ItemDarkestBook;
import magiciansartifice.main.items.tools.ItemMagicBook;
import magiciansartifice.main.items.tools.ItemMagicBookAdv;
import magiciansartifice.main.items.tools.ItemRitualBook;
import magiciansartifice.main.items.tools.ItemSpellBook;
import magiciansartifice.main.items.tools.ItemToolChisel;
import magiciansartifice.main.items.tools.ItemUnforgivableBook;
import magiciansartifice.main.items.tools.starsteel.ItemAxeStarSteel;
import magiciansartifice.main.items.tools.starsteel.ItemHoeStarSteel;
import magiciansartifice.main.items.tools.starsteel.ItemPickStarSteel;
import magiciansartifice.main.items.tools.starsteel.ItemShovelStarSteel;
import magiciansartifice.main.items.tools.starsteel.ItemSwordStarSteel;
import magiciansartifice.main.items.tools.steel.ItemAxeSteel;
import magiciansartifice.main.items.tools.steel.ItemHoeSteel;
import magiciansartifice.main.items.tools.steel.ItemPickSteel;
import magiciansartifice.main.items.tools.steel.ItemShovelSteel;
import magiciansartifice.main.items.tools.steel.ItemSwordSteel;
import magiciansartifice.main.items.wood.ItemSticksMeta;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Optional;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemRegistry
{
    private static Item.ToolMaterial iron = Item.ToolMaterial.IRON;
    private static Item.ToolMaterial diamond = Item.ToolMaterial.EMERALD;

    public static ArrayList<Item> items = new ArrayList<Item>();

    public static Item.ToolMaterial steel = EnumHelper.addToolMaterial("steel", iron.getHarvestLevel(), iron.getMaxUses() + 50, iron.getEfficiencyOnProperMaterial(), iron.getDamageVsEntity(), iron.getEnchantability());
    public static Item.ToolMaterial starSteel = EnumHelper.addToolMaterial("starSteel", diamond.getHarvestLevel(), diamond.getMaxUses() + 100, diamond.getEfficiencyOnProperMaterial(), diamond.getDamageVsEntity(), diamond.getEnchantability());

    public static Item ingotsMeta;
    public static Item dustsMeta;
    public static Item sticksMeta;
    public static Item saplingMeta;

    public static Item magiciansWand;
    public static Item magiciansWand2;
    public static Item magiciansWand3;
    public static Item creativeWand;
    public static Item chiselTool;
    public static Item netherChisel;
    public static Item enderChisel;
    public static Item book;
    public static Item advBook;
    public static Item ritualBook;
    public static Item unforgivableBook;
    public static Item darkestBook;
    public static Item spellBook;
    public static Item merlinLetter;
    public static Item ritualCatalyst;
    public static Item horcrux;

    public static Item steelSword;
    public static Item steelPick;
    public static Item steelShovel;
    public static Item steelAxe;
    public static Item steelHoe;
    public static Item starSteelSword;
    public static Item starSteelPick;
    public static Item starSteelShovel;
    public static Item starSteelAxe;
    public static Item starSteelHoe;

    public static Item spiderFang;
    
    public static Item debugger;

    public static void initItems() {

        dustsMeta = new ItemDustMeta();
        ingotsMeta = new ItemIngotMeta();
        sticksMeta = new ItemSticksMeta();
        
        magiciansWand = new ItemWand(1);
        magiciansWand2 = new ItemWand(2);
        magiciansWand3 = new ItemWand(3);
        creativeWand = new ItemWand(4);
        book = new ItemMagicBook();
        advBook = new ItemMagicBookAdv();
        ritualBook = new ItemRitualBook();
        spellBook = new ItemSpellBook();
        unforgivableBook = new ItemUnforgivableBook();
        darkestBook = new ItemDarkestBook();
        chiselTool = new ItemToolChisel();
        netherChisel = new ItemToolChisel(1);
        enderChisel = new ItemToolChisel(2);
        merlinLetter = new ItemLetterMerlin();
        ritualCatalyst = new ItemRitualCatalyst();

        steelSword = new ItemSwordSteel();
        steelPick = new ItemPickSteel();
        steelShovel = new ItemShovelSteel();
        steelAxe = new ItemAxeSteel();
        steelHoe = new ItemHoeSteel();

        starSteelSword = new ItemSwordStarSteel();
        starSteelPick = new ItemPickStarSteel();
        starSteelShovel = new ItemShovelStarSteel();
        starSteelAxe = new ItemAxeStarSteel();
        starSteelHoe = new ItemHoeStarSteel();

        horcrux = new ItemHorcrux();

        spiderFang = new ItemSpiderFang();
        debugger = new Debugger();
        
        for (Item item : items) {
            GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
        }
    }
}
