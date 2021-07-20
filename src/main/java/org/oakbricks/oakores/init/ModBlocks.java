package org.oakbricks.oakores.init;

import org.oakbricks.oakores.OakOres;
import org.oakbricks.oakores.blocks.PurpiBlock;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			OakOres.MOD_ID);


	public static final RegistryObject<Block> PURPI_BLOCK = BLOCKS
			.register("purpi_block",
					() -> new Block(Block.Properties.create(Material.IRON, MaterialColor.PURPLE)
							.hardnessAndResistance(6.5f, 10.5f).harvestTool(ToolType.PICKAXE).harvestLevel(3)
							.sound(SoundType.METAL).setRequiresTool()));

	public static final RegistryObject<Block> PURPI_ORE = BLOCKS
			.register("purpi_ore",
					() -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE)
							.hardnessAndResistance(3.5f, 10.25f).harvestTool(ToolType.PICKAXE).harvestLevel(3)
							.sound(SoundType.STONE).setRequiresTool()));
	
	public static final RegistryObject<Block> LEAD_ORE = BLOCKS
			.register("lead_ore",
					() -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE)
							.hardnessAndResistance(4.2f, 8.3f).harvestTool(ToolType.PICKAXE).harvestLevel(2)
							.sound(SoundType.STONE).setRequiresTool()));
	
	public static final RegistryObject<Block> DEEPSLATE_LEAD_ORE = BLOCKS
			.register("deepslate_lead_ore", 
					() -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.GRAY)
							.hardnessAndResistance(8.2f, 10.5f).harvestTool(ToolType.PICKAXE).harvestLevel(2)
							.sound(SoundType.STONE).setRequiresTool()));
	
	public static final RegistryObject<Block> LEAD_BLOCK = BLOCKS
			.register("lead_block", 
					() -> new Block(Block.Properties.create(Material.IRON, MaterialColor.GRAY)
							.hardnessAndResistance(8.5f, 17.5f).harvestTool(ToolType.PICKAXE).harvestLevel(2)
							.sound(SoundType.STONE).setRequiresTool()));
	
	
	//public static final Block OTHER_BLOCK = Registry.register(Registry.BLOCK, "other_block", new Block(Block.Properties.of(Material.ROCK)));
	

	
}
