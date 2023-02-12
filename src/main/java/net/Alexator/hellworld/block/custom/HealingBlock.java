package net.Alexator.hellworld.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class HealingBlock extends Block {
    public HealingBlock(Properties properties) {
        super(properties);
    }


    @Override
    public void stepOn(Level level, BlockPos blockPos, BlockState blockState, Entity entity) {
        if(entity instanceof LivingEntity livingEntity){
livingEntity.addEffect(new MobEffectInstance(MobEffects.HEAL,200));
        }

        super.stepOn(level, blockPos, blockState, entity);
    }
}
