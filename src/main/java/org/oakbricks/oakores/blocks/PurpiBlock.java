package org.oakbricks.oakores.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class PurpiBlock extends Block {

	public PurpiBlock() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(6.5f, 10.5f)
                .sound(SoundType.METAL)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool());
    }
}
