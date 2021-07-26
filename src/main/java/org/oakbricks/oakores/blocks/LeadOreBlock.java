package org.oakbricks.oakores.blocks;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class LeadOreBlock extends OreBlock {
    public LeadOreBlock(BlockBehaviour.Properties properties, UniformInt expDrop) {
        super(properties, expDrop);
    }
}
