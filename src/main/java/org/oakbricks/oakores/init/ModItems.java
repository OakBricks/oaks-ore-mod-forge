package org.oakbricks.oakores.init;

import org.oakbricks.oakores.OakOres;
import org.oakbricks.oakores.items.LeadRockItem;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, OakOres.MOD_ID);

    public static final RegistryObject<Item> PURPI = ITEMS.register("purpi", () -> new Item(new Item.Properties().group(OakOres.MAIN_GROUP)));
    
    public static final RegistryObject<Item> PURPI_BLOCK = ITEMS.register("purpi_block", () -> new BlockItem(ModBlocks.PURPI_BLOCK.get(), new Item.Properties().group(OakOres.MAIN_GROUP)));
    
    public static final RegistryObject<Item> PURPI_ORE = ITEMS.register("purpi_ore", () -> new BlockItem(ModBlocks.PURPI_ORE.get(), new Item.Properties().group(OakOres.MAIN_GROUP)));
    
    public static final RegistryObject<Item> LEAD_BLOCK = ITEMS.register("lead_block", () -> new BlockItem(ModBlocks.LEAD_BLOCK.get(), new Item.Properties().group(OakOres.MAIN_GROUP)));
    
    public static final RegistryObject<Item> LEAD_ORE = ITEMS.register("lead_ore", () -> new BlockItem(ModBlocks.LEAD_ORE.get(), new Item.Properties().group(OakOres.MAIN_GROUP)));
    
    public static final RegistryObject<Item> DEEPSLATE_LEAD_ORE = ITEMS.register("deepslate_lead_ore", () -> new BlockItem(ModBlocks.DEEPSLATE_LEAD_ORE.get(), new Item.Properties().group(OakOres.MAIN_GROUP)));
    
    public static final RegistryObject<SwordItem> PURPI_SWORD = ITEMS.register("purpi_sword", () -> new SwordItem(PurpiToolMaterial.PURPI_TOOL, 5, -2f, new Item.Properties().group(OakOres.MAIN_GROUP)));
    
    public static final RegistryObject<ShovelItem> PURPI_SPADE = ITEMS.register("purpi_shovel", () -> new ShovelItem(PurpiToolMaterial.PURPI_TOOL, -2.5f, -3f, new Item.Properties().group(OakOres.MAIN_GROUP)));
    
    public static final RegistryObject<PickaxeItem> PURPI_PICKAXE = ITEMS.register("purpi_pickaxe", () -> new PickaxeItem(PurpiToolMaterial.PURPI_TOOL, 3, -1.6f, new Item.Properties().group(OakOres.MAIN_GROUP)));
    
    public static final RegistryObject<AxeItem> PURPI_AXE = ITEMS.register("purpi_axe", () -> new AxeItem(PurpiToolMaterial.PURPI_TOOL, 2f, -1f, new Item.Properties().group(OakOres.MAIN_GROUP)));
    
    public static final RegistryObject<HoeItem> PURPI_HOE = ITEMS.register("purpi_hoe", () -> new HoeItem(PurpiToolMaterial.PURPI_TOOL, -4, -2f, new Item.Properties().group(OakOres.MAIN_GROUP)));
    
    public static final RegistryObject<ArmorItem> PURPI_HELMET = ITEMS.register("purpi_helmet", () -> new ArmorItem(PurpiArmorMaterial.PURPI_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().group(OakOres.MAIN_GROUP)));

    public static final RegistryObject<ArmorItem> PURPI_CHESTPLATE = ITEMS.register("purpi_chestplate", () -> new ArmorItem(PurpiArmorMaterial.PURPI_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().group(OakOres.MAIN_GROUP)));
    
    public static final RegistryObject<ArmorItem> PURPI_LEGGINGS = ITEMS.register("purpi_leggings", () -> new ArmorItem(PurpiArmorMaterial.PURPI_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().group(OakOres.MAIN_GROUP)));
    
    public static final RegistryObject<ArmorItem> PURPI_BOOTS = ITEMS.register("purpi_boots", () -> new ArmorItem(PurpiArmorMaterial.PURPI_ARMOR, EquipmentSlotType.FEET, new Item.Properties().group(OakOres.MAIN_GROUP)));
    
    public static final RegistryObject<Item> LEAD_ROCK = ITEMS.register("lead_rock", () -> new LeadRockItem(new Item.Properties().group(OakOres.MAIN_GROUP)));
}
