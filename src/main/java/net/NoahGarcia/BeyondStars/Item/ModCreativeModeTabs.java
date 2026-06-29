package net.NoahGarcia.BeyondStars.Item;

import net.NoahGarcia.BeyondStars.BeyondStars;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BeyondStars.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BEYONDSTARS = CREATIVE_MODE_TABS.register("beyond_stars",
            () -> CreativeModeTab.builder().icon(() ->new ItemStack(ModItems.LIGHT_METAL.get()))
            .title(Component.translatable("creativetab.beyond_stars"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept((ModItems.STARLIGHT_ALLOY.get()));
                        pOutput.accept((ModItems.LIGHT_METAL.get()));
                    })
            .build());


    public static void  register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
