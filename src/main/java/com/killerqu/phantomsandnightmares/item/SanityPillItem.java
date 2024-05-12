package com.killerqu.phantomsandnightmares.item;

import net.minecraft.stats.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.ActionResult;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SanityPillItem extends Item {
    public SanityPillItem(Properties properties) {
        super(properties);
    }

    public ActionResult<ItemStack> use(World pLevel, PlayerEntity pPlayer, Hand pHand) {
        ItemStack itemstack = pPlayer.getItemInHand(pHand);
        pPlayer.resetStat(Stats.CUSTOM.get(Stats.TIME_SINCE_REST));
        itemstack.shrink(1);
        return ActionResult.consume(itemstack);
    }
}
