package org.oakbricks.oakores.init;

import java.util.function.Supplier;


import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public enum PurpiToolMaterial implements Tier {
    PURPI_TOOL(3, 1600, 8f, 3f, 20, () -> Ingredient.of(ModItems.PURPI.get()));

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
    public float getAttackDamageBonus() {
        return this.attackDamage;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public int getLevel() {
        return this.harvestLevel;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairMaterial;
    }

    @Override
    public float getSpeed() {
        return this.efficiency;
    }

    @Override
    public int getUses() {
        return this.maxUses;
    }
}