package org.oakbricks.oakores.init;

import org.oakbricks.oakores.OakOres;
import org.oakbricks.oakores.items.LeadRockItem;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, OakOres.MOD_ID);

    public static final RegistryObject<Item> PURPI = ITEMS.register("purpi", () -> new Item(new Item.Properties().tab(OakOres.MAIN_GROUP)));
    
    public static final RegistryObject<Item> PURPI_BLOCK = ITEMS.register("purpi_block", () -> new BlockItem(ModBlocks.PURPI_BLOCK.get(), new Item.Properties().tab(OakOres.MAIN_GROUP)));
    
    public static final RegistryObject<Item> PURPI_ORE = ITEMS.register("purpi_ore", () -> new BlockItem(ModBlocks.PURPI_ORE.get(), new Item.Properties().tab(OakOres.MAIN_GROUP)));
    
    public static final RegistryObject<Item> LEAD_BLOCK = ITEMS.register("lead_block", () -> new BlockItem(ModBlocks.LEAD_BLOCK.get(), new Item.Properties().tab(OakOres.MAIN_GROUP)));
    
    public static final RegistryObject<Item> LEAD_ORE = ITEMS.register("lead_ore", () -> new BlockItem(ModBlocks.LEAD_ORE.get(), new Item.Properties().tab(OakOres.MAIN_GROUP)));
    
    public static final RegistryObject<Item> DEEPSLATE_LEAD_ORE = ITEMS.register("deepslate_lead_ore", () -> new BlockItem(ModBlocks.DEEPSLATE_LEAD_ORE.get(), new Item.Properties().tab(OakOres.MAIN_GROUP)));

    public static final RegistryObject<Item> ENDERITE_ORE = ITEMS.register("enderite_ore", () -> new BlockItem(ModBlocks.ENDERITE_ORE.get(), new Item.Properties().tab(OakOres.MAIN_GROUP)));

    public static final RegistryObject<Item> ENDERITE_BLOCK = ITEMS.register("enderite_block", () -> new BlockItem(ModBlocks.ENDERITE_BLOCK.get(), new Item.Properties().tab(OakOres.MAIN_GROUP)));

    public static final RegistryObject<SwordItem> PURPI_SWORD = ITEMS.register("purpi_sword", () -> new SwordItem(OakOresToolMaterials.PURPI_TOOL, 5, -2f, new Item.Properties().tab(OakOres.MAIN_GROUP)));
    
    public static final RegistryObject<ShovelItem> PURPI_SPADE = ITEMS.register("purpi_shovel", () -> new ShovelItem(OakOresToolMaterials.PURPI_TOOL, -2.5f, -3f, new Item.Properties().tab(OakOres.MAIN_GROUP)));
    
    public static final RegistryObject<PickaxeItem> PURPI_PICKAXE = ITEMS.register("purpi_pickaxe", () -> new PickaxeItem(OakOresToolMaterials.PURPI_TOOL, 3, -1.6f, new Item.Properties().tab(OakOres.MAIN_GROUP)));
    
    public static final RegistryObject<AxeItem> PURPI_AXE = ITEMS.register("purpi_axe", () -> new AxeItem(OakOresToolMaterials.PURPI_TOOL, 2f, -1f, new Item.Properties().tab(OakOres.MAIN_GROUP)));
    
    public static final RegistryObject<HoeItem> PURPI_HOE = ITEMS.register("purpi_hoe", () -> new HoeItem(OakOresToolMaterials.PURPI_TOOL, -4, -2f, new Item.Properties().tab(OakOres.MAIN_GROUP)));
    
    public static final RegistryObject<ArmorItem> PURPI_HELMET = ITEMS.register("purpi_helmet", () -> new ArmorItem(OakOresArmorMaterials.PURPI_ARMOR, EquipmentSlot.HEAD, new Item.Properties().tab(OakOres.MAIN_GROUP)));

    public static final RegistryObject<ArmorItem> PURPI_CHESTPLATE = ITEMS.register("purpi_chestplate", () -> new ArmorItem(OakOresArmorMaterials.PURPI_ARMOR, EquipmentSlot.CHEST, new Item.Properties().tab(OakOres.MAIN_GROUP)));
    
    public static final RegistryObject<ArmorItem> PURPI_LEGGINGS = ITEMS.register("purpi_leggings", () -> new ArmorItem(OakOresArmorMaterials.PURPI_ARMOR, EquipmentSlot.LEGS, new Item.Properties().tab(OakOres.MAIN_GROUP)));
    
    public static final RegistryObject<ArmorItem> PURPI_BOOTS = ITEMS.register("purpi_boots", () -> new ArmorItem(OakOresArmorMaterials.PURPI_ARMOR, EquipmentSlot.FEET, new Item.Properties().tab(OakOres.MAIN_GROUP)));
    
    public static final RegistryObject<Item> LEAD_ROCK = ITEMS.register("lead_rock", () -> new LeadRockItem(new Item.Properties().tab(OakOres.MAIN_GROUP)));

    public static final RegistryObject<Item> ENDERITE_GEM = ITEMS.register("enderite_gem", () -> new Item(new Item.Properties().tab(OakOres.MAIN_GROUP)));
}