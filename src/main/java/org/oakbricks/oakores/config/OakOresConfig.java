package org.oakbricks.oakores.config;

import com.supermartijn642.configlib.ModConfig;
import com.supermartijn642.configlib.ModConfigBuilder;

import java.util.function.Supplier;

import net.minecraftforge.common.ForgeConfigSpec;

public final class OakOresConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Integer> purpiVeinSize;
    public static final ForgeConfigSpec.ConfigValue<Integer> purpiMinHeight;
    public static final ForgeConfigSpec.ConfigValue<Integer> purpiMaxHeight;
    public static final ForgeConfigSpec.ConfigValue<Integer> purpiAmount;

    static {
        BUILDER.push("Config for Tutorial Mod!");

        purpiVeinSize = BUILDER.comment("This is an integer. Default value is 6.").define("Purpi Ore Vein Size", 6);
        purpiMinHeight = BUILDER.comment("This is an integer. Default value is 5.").define("Purpi Ore Vein Size", 5);
        purpiMaxHeight = BUILDER.comment("This is an integer. Default value is 28.").define("Purpi Ore Vein Size", 28);
        purpiAmount = BUILDER.comment("Amount of Purpi Ore in a world, default value is 10").define("Purpi Ore Amount", 10);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
