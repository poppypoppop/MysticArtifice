package mysticartifice.items;

import cpw.mods.fml.common.registry.GameRegistry;
import mysticartifice.MysticArtifice;
import net.minecraft.item.Item;

public class ItemRegistry {
    public static Item dusts, book;

    public static void registerItems() {
        dusts = new ItemDustMeta().setUnlocalizedName("dustsMeta");
        book = new ItemMagicBook().setUnlocalizedName("MagicArtifice.book").setTextureName("mysticartifice:book").setCreativeTab(MysticArtifice.tab);
        GameRegistry.registerItem(dusts, "ItemDustsMeta");
        GameRegistry.registerItem(book, "MagicBook");
    }
}