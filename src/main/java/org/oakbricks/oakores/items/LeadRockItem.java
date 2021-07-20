package org.oakbricks.oakores.items;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;

public class LeadRockItem extends Item {

	//public ItemStack lE = new LivingEntity().getHeldItemOffhand();
	
//	public int maxLeadTimeAllowed() {
//        return 400;
//    }
//	
//	public int ticks;
//	
//	public void leadPoisonCounterIncrement() {
//        this.ticks++;
//    }
	
	public LeadRockItem(Properties properties) {
		super(properties);
		// TODO Auto-generated constructor stub
	}
	
//	public boolean addStatusEffect(net.minecraft.potion.EffectInstance effect) {
//		return false;
//	}
	
//	@SuppressWarnings("static-access")
//	@Override
//	public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
//		
//		//this.lE = lE;
//		
//		if(isSelected == true) {
//			
//			leadPoisonCounterIncrement();
//			
//			if (this.ticks > this.maxLeadTimeAllowed()) {
//                Thread thread = new Thread(() -> {
//                    try { /* This delays it by seven seconds ( i might change it in a later release */
//                        Thread.sleep(7000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println("lead poisoning code is working, i hope")
////                    this.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 70, 3));
////                    this.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 70, 2));
////                    this.addStatusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 70, 1));
////                    this.addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 70, 2));
////                    this.addStatusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 70, 1));
////                    this.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 70, 1));
//                });
//                thread.start();
//            }
//		}
//	}

}
