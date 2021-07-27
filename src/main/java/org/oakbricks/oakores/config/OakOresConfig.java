package org.oakbricks.oakores.config;

import net.minecraftforge.common.ForgeConfigSpec;

public final class OakOresConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Boolean> enableEnderite;
    public static final ForgeConfigSpec.ConfigValue<Boolean> enableNetherOres;

    public static final ForgeConfigSpec.ConfigValue<Integer> purpiVeinSize;
    public static final ForgeConfigSpec.ConfigValue<Integer> purpiMinHeight;
    public static final ForgeConfigSpec.ConfigValue<Integer> purpiMaxHeight;
    public static final ForgeConfigSpec.ConfigValue<Integer> purpiAmount;

    public static final ForgeConfigSpec.ConfigValue<Integer> leadAmount;
    public static final ForgeConfigSpec.ConfigValue<Integer> leadVeinSize;

    public static final ForgeConfigSpec.ConfigValue<Integer> deepLeadAmount;
    public static final ForgeConfigSpec.ConfigValue<Integer> deepLeadVeinSize;

    static {

        BUILDER.push("Config for OakOres - Master");

        enableEnderite = BUILDER.comment("Enables OakOres' Enderite support").worldRestart().define("Enable OakOres' Enderite support", true);

        enableNetherOres = BUILDER.comment("Enables OakOres' ability to generate ores in the nether").worldRestart().define("Enable OakOres' Nether Ores", true);

        BUILDER.push("Config for OakOres - Purpi Gen");

        purpiVeinSize = BUILDER.comment("Size of a Purpi Ore vein, default value is 6, maximum value of 64.").worldRestart().defineInRange("Purpi Ore Vein Size", 6, 0, 64);
        purpiMinHeight = BUILDER.comment("Minimum height for Purpi Ore to generate in a world, default value is 5, maximum value of 250.").worldRestart().defineInRange("Purpi Ore Minimum Height", 5, 0, 250);
        purpiMaxHeight = BUILDER.comment("Maximum height for Purpi Ore to generate in a world, default value is 28, maximum value of 256.").worldRestart().defineInRange("Purpi Ore Maximum Height", 28, 6, 256);
        purpiAmount = BUILDER.comment("Amount of Purpi Ore in a world, default value is 10, maximum value of 64").worldRestart().defineInRange("Purpi Ore Amount", 10, 0, 64);

        BUILDER.pop();

        BUILDER.push("Config for OakOres - Lead Gen");

        leadVeinSize = BUILDER.comment("Size of Lead Ore veins, default value is 16").worldRestart().defineInRange("Lead Ore Vein Size", 16, 0, 64);
        leadAmount = BUILDER.comment("Amount of Lead Ore in a world, default value is 25").worldRestart().defineInRange("Lead Ore Amount", 25, 0, 64);

        BUILDER.pop();

        BUILDER.push("Config for OakOres - Deepslate Lead Gen");

        deepLeadVeinSize = BUILDER.comment("Size of Deepslate Lead Ore veins, default value is 9").worldRestart().defineInRange("Deepslate Lead Ore Vein Size", 9, 0, 64);
        deepLeadAmount = BUILDER.comment("Amount of Deepslate Lead Ore in a world, default value is 4").worldRestart().defineInRange("Deepslate Lead Ore Amount", 4, 0, 64);


        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
