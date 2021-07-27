package org.oakbricks.oakores.config;

import net.minecraftforge.common.ForgeConfigSpec;

public final class OakOresConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Boolean> enableEnderite;

    public static final ForgeConfigSpec.ConfigValue<Integer> purpiVeinSize;
    public static final ForgeConfigSpec.ConfigValue<Integer> purpiMinHeight;
    public static final ForgeConfigSpec.ConfigValue<Integer> purpiMaxHeight;
    public static final ForgeConfigSpec.ConfigValue<Integer> purpiAmount;

    public static final ForgeConfigSpec.ConfigValue<Integer> leadAmount;
    public static final ForgeConfigSpec.ConfigValue<Integer> leadVeinSize;

    static {

        BUILDER.push("Config for OakOres - Master");

        enableEnderite = BUILDER.comment("Enables OakOres' Enderite support").define("Enable OakOres' Enderite support", true);

        BUILDER.push("Config for OakOres - Purpi Gen");

        purpiVeinSize = BUILDER.comment("Size of a Purpi Ore vein, default value is 6.").define("Purpi Ore Vein Size", 6);
        purpiMinHeight = BUILDER.comment("Minimum height for Purpi Ore to generate in a world, default value is 5.").define("Purpi Ore Minimum Height", 5);
        purpiMaxHeight = BUILDER.comment("Maximum height for Purpi Ore to generate in a world, default value is 28.").define("Purpi Ore Maximum Height", 28);
        purpiAmount = BUILDER.comment("Amount of Purpi Ore in a world, default value is 10").define("Purpi Ore Amount", 10);

        BUILDER.push("Config for OakOres - Lead Gen");

        leadVeinSize = BUILDER.comment("Amount of Lead Ore in a world, default value is 25").define("Lead Ore Vein Size", 5);
        leadAmount = BUILDER.comment("Amount of Lead Ore in a world, default value is 25").define("Lead Ore Amount", 25);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
