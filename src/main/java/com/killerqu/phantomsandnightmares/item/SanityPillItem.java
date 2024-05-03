package com.killerqu.phantomsandnightmares.item;

import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class SanityPillItem extends Item {
    public SanityPillItem(Properties properties) {
        super(properties);
    }

    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pHand) {
        ItemStack itemstack = pPlayer.getItemInHand(pHand);
        pPlayer.resetStat(Stats.CUSTOM.get(Stats.TIME_SINCE_REST));
        itemstack.shrink(1);
        return InteractionResultHolder.consume(itemstack);
    }
}
