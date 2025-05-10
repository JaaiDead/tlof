package org.arcticquests.dev.entity;


import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.*;
import org.arcticquests.dev.tlof;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES =
            DeferredRegister.create(Registries.ENTITY_TYPE, tlof.MOD_ID);

    public static final RegistryObject<EntityType<SapEntity>> SAP_ENTITY = ENTITIES.register("sap_entity",
            () -> EntityType.Builder.of(SapEntity::new, MobCategory.MONSTER)
                    .sized(0.8f, 1.8f)
                    .build("sap_entity"));


    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 20.0)
                .add(Attributes.ATTACK_DAMAGE, 4.0)
                .add(Attributes.MOVEMENT_SPEED, 0.25);
    }

    public static void register(IEventBus bus) {
        ENTITIES.register(bus);
    }

}
