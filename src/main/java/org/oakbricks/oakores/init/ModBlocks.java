package org.oakbricks.oakores.init;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import org.oakbricks.oakores.OakOres;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.oakbricks.oakores.blocks.EnderiteOreBlock;
import org.oakbricks.oakores.blocks.LeadOreBlock;
import org.oakbricks.oakores.blocks.PurpiOreBlock;

public class ModBlocks {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			OakOres.MOD_ID);


	public static final RegistryObject<Block> PURPI_BLOCK = BLOCKS
			.register("purpi_block",
					() -> new Block(Block.Properties.of(Material.METAL, MaterialColor.COLOR_PURPLE)
							.harvestLevel(3).strength(6.5f, 10.5f).requiresCorrectToolForDrops().harvestTool(ToolType.PICKAXE)
							.sound(SoundType.METAL)));

	public static final RegistryObject<Block> PURPI_ORE = BLOCKS
			.register("purpi_ore",
					() -> new PurpiOreBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE)
							.strength(3.5f, 10.25f).harvestTool(ToolType.PICKAXE).harvestLevel(3)
							.sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(3, 8)));

	public static final RegistryObject<Block> NETHER_PURPI_ORE = BLOCKS
			.register("nether_purpi_ore",
					() -> new PurpiOreBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE)
							.strength(3.25f, 8.25f).harvestTool(ToolType.PICKAXE).harvestLevel(3)
							.sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(2, 9)));
	
	public static final RegistryObject<Block> LEAD_ORE = BLOCKS
			.register("lead_ore",
					() -> new LeadOreBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE)
							.strength(4.2f, 8.3f).harvestTool(ToolType.PICKAXE).harvestLevel(2)
							.sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(1, 3)));
	
	public static final RegistryObject<Block> DEEPSLATE_LEAD_ORE = BLOCKS
			.register("deepslate_lead_ore", 
					() -> new LeadOreBlock(Block.Properties.of(Material.STONE, MaterialColor.STONE)
							.strength(8.2f, 10.5f).harvestTool(ToolType.PICKAXE).harvestLevel(2)
							.sound(SoundType.STONE).requiresCorrectToolForDrops(), UniformInt.of(4, 7)));
	
	public static final RegistryObject<Block> LEAD_BLOCK = BLOCKS
			.register("lead_block", 
					() -> new Block(Block.Properties.of(Material.METAL, MaterialColor.STONE)
							.strength(8.5f, 17.5f).harvestTool(ToolType.PICKAXE).harvestLevel(3)
							.sound(SoundType.STONE).requiresCorrectToolForDrops()));

	public static final RegistryObject<OreBlock> ENDERITE_ORE = BLOCKS.register("enderite_ore", () -> new EnderiteOreBlock(OreBlock.Properties.of(Material.STONE, MaterialColor.SAND).sound(SoundType.STONE).harvestLevel(2).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().strength(5.0F, 10.0F), UniformInt.of(8, 16)));

	public static final RegistryObject<Block> ENDERITE_BLOCK = BLOCKS.register("enderite_block", () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL, MaterialColor.TERRACOTTA_CYAN).sound(SoundType.METAL).harvestLevel(2).strength(4.5F, 9.5F).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops()));
	
}