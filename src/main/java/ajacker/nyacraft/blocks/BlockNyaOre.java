package ajacker.nyacraft.blocks;

import ajacker.nyacraft.creativetab.CreativeTabsLoader;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import static ajacker.nyacraft.NyaCraft.MODID;

public class BlockNyaOre extends Block {
    public static final String BlockId = "BlockNyaOre";

    public BlockNyaOre(Material material) {
        super(material);
        this.setCreativeTab(CreativeTabsLoader.tabFMLTutor);//创造模式标签页
        this.setBlockName(MODID + "." + BlockId);//设置名字(tile.nyacraft.BlockNyaOre.name)
        this.setLightLevel(1.0f);//设置光亮度最大
        this.setHarvestLevel("pickaxe", 2);//开采等级：铁镐
        this.setHardness(2.5f);//硬度:石头1.5，矿石3.0

    }

    public void init() {
        GameRegistry.registerBlock(this, BlockId);//注册方块
    }
}
