package com.killerqu.phantomsandnightmares.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class CommonConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;
    
    public static final ForgeConfigSpec.ConfigValue<Boolean> ENABLE_NATURAL_TIMESINCEREST;
    
    static {
        BUILDER.push("PaN Common Config");
        
        ENABLE_NATURAL_TIMESINCEREST = BUILDER.comment()
                .define("Enable Natural TIME_SINCE_REST Accumulation", true);
        
        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
