package com.killerqu.phantomsandnightmares.mixin;

import com.killerqu.phantomsandnightmares.config.CommonConfig;
import net.minecraft.util.ResourceLocation;
import net.minecraft.stats.Stats;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = PlayerEntity.class)
public class PlayerMixin {
    @Inject(method = "Lnet/minecraft/entity/player/PlayerEntity;awardStat(Lnet/minecraft/util/ResourceLocation;)V", at = @At(value = "HEAD"), cancellable = true)
    private void phantomsandnightmares$awardStatRedirect(ResourceLocation pStatKey, CallbackInfo info) {
        if (!CommonConfig.ENABLE_NATURAL_TIMESINCEREST.get() && pStatKey == Stats.TIME_SINCE_REST) info.cancel();
    }
}