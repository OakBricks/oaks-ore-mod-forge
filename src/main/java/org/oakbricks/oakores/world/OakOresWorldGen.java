package org.oakbricks.oakores.world;

import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import org.oakbricks.oakores.config.OakOresConfig;
import org.oakbricks.oakores.init.ModBlocks;
import org.oakbricks.oakores.world.etc.OakOresPredicates;

public class OakOresWorldGen {

	public static void generateOres(final BiomeLoadingEvent event) {
		if (!(event.getCategory().equals(Biome.BiomeCategory.NETHER) || event.getCategory().equals(Biome.BiomeCategory.THEEND))) {
			generateOre(event.getGeneration(), OreConfiguration.Predicates.NATURAL_STONE,
					ModBlocks.PURPI_ORE.get().defaultBlockState(), OakOresConfig.purpiVeinSize.get(), OakOresConfig.purpiMinHeight.get(), OakOresConfig.purpiMaxHeight.get(), OakOresConfig.purpiAmount.get());
			generateOreBottomMinTopMax(event.getGeneration(), OreConfiguration.Predicates.NATURAL_STONE,
					ModBlocks.LEAD_ORE.get().defaultBlockState(), 5, 25);
			generateOre(event.getGeneration(), OakOresPredicates.OakOresCustomPredicates.DEEPSLATE_ONLY,
					ModBlocks.DEEPSLATE_LEAD_ORE.get().defaultBlockState(), 5, 0, 48, 25);
		} else if (!(event.getCategory().equals(Biome.BiomeCategory.NETHER)) && (event.getCategory().equals(Biome.BiomeCategory.THEEND))) {
			generateOreBottomMinTopMax(event.getGeneration(), OakOresPredicates.OakOresCustomPredicates.ENDSTONE_ONLY,
					ModBlocks.ENDERITE_ORE.get().defaultBlockState(), 5, 8);
		}/* else if (!(event.getCategory().equals(Biome.BiomeCategory.THEEND)) && (event.getCategory().equals(Biome.BiomeCategory.NETHER))) {

		}*/
	}

	private static void generateOre(BiomeGenerationSettingsBuilder settings, RuleTest fillerType, BlockState state, int veinSize, int minHeight, int maxHeight, int amount) {
		settings.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,
				Feature.ORE.configured(new OreConfiguration(fillerType, state, veinSize))
						//.decorated(FeatureDecorator.RANGE.configured(new RangeDecoratorConfiguration(new HeightProvider())))
						.rangeUniform(VerticalAnchor.absolute(minHeight), VerticalAnchor.absolute(maxHeight))
						.squared().count(amount));
	}

	private static void generateOreBottomMin(BiomeGenerationSettingsBuilder settings, RuleTest fillerType, BlockState state, int veinSize, int maxHeight, int amount) {
		settings.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,
				Feature.ORE.configured(new OreConfiguration(fillerType, state, veinSize))
						//.decorated(FeatureDecorator.RANGE.configured(new RangeDecoratorConfiguration(new HeightProvider())))
						.rangeUniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(maxHeight))
						.squared().count(amount));
	}

	private static void generateOreBottomMinTopMax(BiomeGenerationSettingsBuilder settings, RuleTest fillerType, BlockState state, int veinSize, int amount) {
		settings.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,
				Feature.ORE.configured(new OreConfiguration(fillerType, state, veinSize))
						//.decorated(FeatureDecorator.RANGE.configured(new RangeDecoratorConfiguration(new HeightProvider())))
						.rangeUniform(VerticalAnchor.bottom(), VerticalAnchor.top())
						.squared().count(amount));
	}
	
}
