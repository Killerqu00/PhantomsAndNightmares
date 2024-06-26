package com.killerqu.phantomsandnightmares.item;

import com.killerqu.phantomsandnightmares.PhantomsAndNightmares;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PhantomsAndNightmares.MODID);

    public static final RegistryObject<Item> INSANITY_PILL = ITEMS.register("insanity_pill", () -> new InsanityPillItem(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> SANITY_PILL = ITEMS.register("sanity_pill", () -> new SanityPillItem(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static void register(IEventBus eventBus) {ITEMS.register(eventBus);}
}
