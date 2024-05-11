package com.killerqu.phantomsandnightmares.mixin;

import com.killerqu.phantomsandnightmares.config.CommonConfig;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.stats.Stats;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(value = Player.class)
public class PlayerMixin {
    @WrapOperation(method = "tick", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/player/Player;awardStat(Lnet/minecraft/resources/ResourceLocation;)V"))
    private void phantomsandnightmares$awardStatRedirect(Player instance, ResourceLocation pStatKey, Operation<Void> original) {
        if (CommonConfig.ENABLE_NATURAL_TIMESINCEREST.get() || pStatKey != Stats.TIME_SINCE_REST) {
            original.call(instance, pStatKey);
        }
    }
}