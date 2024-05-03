package com.killerqu.phantomsandnightmares.item;

import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class InsanityPillItem extends Item {
    public InsanityPillItem(Properties properties) {
        super(properties);
    }

    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pHand) {
        ItemStack itemstack = pPlayer.getItemInHand(pHand);
        pPlayer.awardStat(Stats.TIME_SINCE_REST, 72000);
        itemstack.shrink(1);
        return InteractionResultHolder.consume(itemstack);
    }
}
