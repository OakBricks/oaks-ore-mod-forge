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
			if (OakOresConfig.fixOresSpawningInNonStoneBlocks.get().equals(false)) {
				// Purpi Ore Gen
				generateOre(event.getGeneration(), OreConfiguration.Predicates.NATURAL_STONE,
						ModBlocks.PURPI_ORE.get().defaultBlockState(), OakOresConfig.purpiVeinSize.get(), OakOresConfig.purpiMinHeight.get(), OakOresConfig.purpiMaxHeight.get(), OakOresConfig.purpiAmount.get());
				// Lead Ore Gen
				generateOreBottomMinTopMax(event.getGeneration(), OreConfiguration.Predicates.NATURAL_STONE,
						ModBlocks.LEAD_ORE.get().defaultBlockState(), OakOresConfig.leadVeinSize.get(), OakOresConfig.leadAmount.get());
				// Deepslate Lead Ore Gen
				generateOreBottomMinTopMax(event.getGeneration(), OakOresPredicates.OakOresCustomPredicates.DEEPSLATE_ONLY,
						ModBlocks.DEEPSLATE_LEAD_ORE.get().defaultBlockState(), OakOresConfig.deepLeadVeinSize.get(), OakOresConfig.deepLeadAmount.get());
			} else if (OakOresConfig.fixOresSpawningInNonStoneBlocks.get().equals(true)) {
				// Purpi Ore Gen
				generateOre(event.getGeneration(), OakOresPredicates.OakOresCustomPredicates.STONE_ONLY,
						ModBlocks.PURPI_ORE.get().defaultBlockState(), OakOresConfig.purpiVeinSize.get(), OakOresConfig.purpiMinHeight.get(), OakOresConfig.purpiMaxHeight.get(), OakOresConfig.purpiAmount.get());
				// Lead Ore Gen
				generateOreBottomMin(event.getGeneration(), OakOresPredicates.OakOresCustomPredicates.STONE_ONLY,
						ModBlocks.LEAD_ORE.get().defaultBlockState(), OakOresConfig.leadVeinSize.get(), OakOresConfig.leadMaxHeight.get(), OakOresConfig.leadAmount.get());
				// Deepslate Lead Ore Gen
				generateOreBottomMinTopMax(event.getGeneration(), OakOresPredicates.OakOresCustomPredicates.DEEPSLATE_ONLY,
						ModBlocks.DEEPSLATE_LEAD_ORE.get().defaultBlockState(), OakOresConfig.deepLeadVeinSize.get(), OakOresConfig.deepLeadAmount.get());
			}

		} else if (!(event.getCategory().equals(Biome.BiomeCategory.NETHER)) && (event.getCategory().equals(Biome.BiomeCategory.THEEND)) && OakOresConfig.enableEnderite.get().equals(true)) {
			generateOreBottomMinTopMax(event.getGeneration(), OakOresPredicates.OakOresCustomPredicates.ENDSTONE_ONLY,
					ModBlocks.ENDERITE_ORE.get().defaultBlockState(), OakOresConfig.enderiteVeinSize.get(), OakOresConfig.enderiteAmount.get());
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
