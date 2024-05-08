package com.killerqu.phantomsandnightmares;

import com.killerqu.phantomsandnightmares.config.CommonConfig;
import com.killerqu.phantomsandnightmares.item.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod("phantomsandnightmares")
public class PhantomsAndNightmares {
    public static final String MODID = "phantomsandnightmares";
    private static final Logger LOGGER = LogUtils.getLogger();

    public PhantomsAndNightmares() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, CommonConfig.SPEC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.register(eventBus);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("Phantoms And Nightmares loaded.");
    }
}
