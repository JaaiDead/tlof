package org.arcticquests.dev.block.entity;


import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.*;
import org.arcticquests.dev.block.ModBlocks;
import org.arcticquests.dev.tlof;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, tlof.MOD_ID);

    public static final RegistryObject<BlockEntityType<SapExtractorBlockEntity>> SAP_EXTRACTOR =
            BLOCK_ENTITIES.register("sap_extractor", () ->
                    BlockEntityType.Builder.of(SapExtractorBlockEntity::new,
                            ModBlocks.SAP_EXTRACTOR.get()).build(null));

    public static void register(IEventBus bus) {
        BLOCK_ENTITIES.register(bus);
    }
}
