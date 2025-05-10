package org.arcticquests.dev.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Blocks;
import org.arcticquests.dev.item.ModItems;

import static net.minecraft.world.level.block.Block.popResource;

public class SapExtractorBlockEntity extends BlockEntity {
    private int tickCount = 0;

    public SapExtractorBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.SAP_EXTRACTOR.get(), pos, state);
    }

    public void tick() {
        if (!level.isClientSide) {
            tickCount++;
            if (tickCount >= 100) {
                tickCount = 0;
                // Simple logic: drop a sap item every few seconds
                ItemStack sap = new ItemStack(org.arcticquests.dev.item.ModItems.SAP.get());
                popResource(level, worldPosition, sap);
            }
        }
    }
}
