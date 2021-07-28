package org.oakbricks.oakores.world.etc;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;

public class OakOresPredicates {
    public static final class OakOresCustomPredicates {
        public static final RuleTest DEEPSLATE_ONLY = new BlockMatchTest(Blocks.DEEPSLATE);
        public static final RuleTest ENDSTONE_ONLY = new BlockMatchTest(Blocks.END_STONE);
        public static final RuleTest STONE_ONLY = new BlockMatchTest(Blocks.STONE);
        public static final RuleTest GRAVEL_ONLY = new BlockMatchTest(Blocks.GRAVEL);
    }
}
