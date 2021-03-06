package magiciansartifice.main.items.crafting.modifiers;

import magiciansartifice.api.modifiers.BasicWandHandle;
import magiciansartifice.main.MagiciansArtifice;
import magiciansartifice.main.core.libs.ModInfo;
import magiciansartifice.main.core.utils.KeyHelper;
import magiciansartifice.main.core.utils.TextHelper;
import magiciansartifice.main.core.utils.registries.ItemRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

/**
 * Created by Mitchellbrine on 2014.
 */
public class ItemHandleModifier extends BasicWandHandle{

    public ItemHandleModifier(int capacity, String handleName) {
        super(capacity);
        this.setMaxStackSize(1);
        this.setCreativeTab(MagiciansArtifice.partsTab);
        this.setUnlocalizedName("wandHandle."+handleName);
        this.setTextureName(ModInfo.MODID + ":wands/handles/"+handleName);
        Modifiers.modifiers.add(this);
        ItemRegistry.items.add(this);
    }

    @Override
    @SuppressWarnings({"rawtypes","unchecked"})
    public void addInformation(ItemStack stack, EntityPlayer player, List lore, boolean par4) {
        if (KeyHelper.isShiftKeyDown()) {
            if (this.getCapacity() != 0) {
                lore.add(TextHelper.PINK + "Wand Capactiy Modifier: +" + this.getCapacity());
            }
        }
    }

}
