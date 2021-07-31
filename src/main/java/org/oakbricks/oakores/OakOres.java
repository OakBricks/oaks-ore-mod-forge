package org.oakbricks.oakores;

import net.minecraft.client.color.block.BlockColors;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.oakbricks.oakores.config.OakOresConfig;
import org.oakbricks.oakores.init.ModBlocks;
import org.oakbricks.oakores.init.ModItems;
import org.oakbricks.oakores.world.OakOresWorldGen;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("oakores")
public class OakOres
{
	
	public static final String MOD_ID = "oakores";
	
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger(MOD_ID);
    public static final CreativeModeTab MAIN_GROUP = new MainGroup("oakorestab");

    public OakOres() {

    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OakOresWorldGen::generateOres);
        
        ModBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());

        ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, OakOresConfig.SPEC, "oakores-common.toml");
                
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
    
    public static class MainGroup extends CreativeModeTab {

		public MainGroup(String label) {
			super(label);
		}

//		@Override
//		public ItemStack makeIcon() {
//			// TODO Auto-generated method stub
//			//return ModItems.PURPI.get().getDefaultInstance();
//			return ModItems.PURPI.get().getDefaultInstance();
//		}

		@Override
		public ItemStack makeIcon() {
			// TODO Auto-generated method stub
			//return ModItems.PURPI_BLOCK.get().getDefaultInstance();
            return ModBlocks.PURPI_BLOCK.get().asItem().getDefaultInstance();
		}
	}

    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            // register a new block here
            //LOGGER.info("HELLO from Register Block");
        	//ModBlocks.registerShit();
        }
    }
}
