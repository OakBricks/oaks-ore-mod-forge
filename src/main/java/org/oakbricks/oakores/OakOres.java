package org.oakbricks.oakores;

import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.oakbricks.oakores.init.ModBlocks;
import org.oakbricks.oakores.init.ModItems;
import org.oakbricks.oakores.world.PurpiOreGen;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("oakores")
public class OakOres
{
	
	public static final String MOD_ID = "oakores";
	
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger(MOD_ID);
    public static final ItemGroup MAIN_GROUP = new TutorialGroup("oakorestab");

    public OakOres() {

    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
    	
        //FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, PurpiOreGen::generateOres);
        
        ModBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());

        ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
                
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void doClientStuff(final FMLClientSetupEvent event) { }
    
    public static class TutorialGroup extends ItemGroup {

		public TutorialGroup(String label) {
			super(label);
		}

//		@Override
//		public ItemStack makeIcon() {
//			// TODO Auto-generated method stub
//			//return ModItems.PURPI.get().getDefaultInstance();
//			return ModItems.PURPI.get().getDefaultInstance();
//		}

		@Override
		public ItemStack createIcon() {
			// TODO Auto-generated method stub
			return ModItems.PURPI_BLOCK.get().getDefaultInstance();
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
