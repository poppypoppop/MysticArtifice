package magiciansartifice.blocks.machines;

import magiciansartifice.MagiciansArtifice;
import magiciansartifice.ModInfo;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockWandCarver extends BlockContainer {
    public BlockWandCarver() {
        super(Material.wood);
        this.setBlockName(ModInfo.MODID + ".wandCarver");
        this.setCreativeTab(MagiciansArtifice.tab);
    }

    @Override
    public int getRenderType() { return -1; }

    @Override
    public boolean isOpaqueCube() { return false; }

    @Override
    public boolean renderAsNormalBlock() { return false; }

    @Override
    public TileEntity createNewTileEntity(World var1, int var2) { return null; }
}