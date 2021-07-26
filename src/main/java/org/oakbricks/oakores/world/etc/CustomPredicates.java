package org.oakbricks.oakores.world.etc;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;

public class CustomPredicates {
    public static final class OakOresPredicates {
        public static final RuleTest DEEPSLATE_ONLY = new BlockMatchTest(Blocks.DEEPSLATE);
        public static final RuleTest ENDSTONE_ONLY = new BlockMatchTest(Blocks.END_STONE);
    }
}
