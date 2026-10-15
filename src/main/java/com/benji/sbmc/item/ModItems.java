package com.benji.sbmc.item;

import com.benji.sbmc.SBModdingCore;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SBModdingCore.MOD_ID);

    // Start Items

    public static final DeferredItem<Item> Verity = ITEMS.registerSimpleItem("verity");

    // End Items

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
