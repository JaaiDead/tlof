package org.arcticquests.dev.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.arcticquests.dev.block.ModBlocks;
import org.arcticquests.dev.tlof;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, tlof.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SAP_ITEMS_TAB = CREATIVE_MODE_TABS.register("sap_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAP.get()))
                    .title(Component.translatable("creativetab.tlof.sap_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.SAP.get());
                        output.accept(ModItems.SAPEXTRACTOR.get());

                        output.accept(ModBlocks.SAP_BLOCK.get());

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
