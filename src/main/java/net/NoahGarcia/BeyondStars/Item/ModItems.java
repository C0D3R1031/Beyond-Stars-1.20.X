package net.NoahGarcia.BeyondStars.Item;

import net.NoahGarcia.BeyondStars.BeyondStars;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BeyondStars.MOD_ID);
        // Items added below
    public static final RegistryObject<Item> STARLIGHT_ALLOY = ITEMS.register("starlight_alloy",
                () -> new Item(new Item.Properties()));
public static final RegistryObject<Item> LIGHT_METAL = ITEMS.register("light_metal",
        () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
