package org.oakbricks.oakores.init;

import java.util.function.Supplier;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public enum PurpiToolMaterial implements IItemTier {

    PURPI_TOOL(3, 1600, 8f, 3f, 20, () -> Ingredient.fromItems(ModItems.PURPI.get()));

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Ingredient repairMaterial;

    PurpiToolMaterial(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial.get();
    }

    @Override
    public int getMaxUses() {
        return this.maxUses;
    }

    @Override
    public float getEfficiency/*Speed*/() {
        return this.efficiency;
    }

    @Override
    public float getAttackDamage/*Bonus*/() {
        return this.attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return this.harvestLevel;
    }

    @Override
    public int getEnchantability/*mentValue*/() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairMaterial/*Ingredient*/() {
        return this.repairMaterial;
    }
}
