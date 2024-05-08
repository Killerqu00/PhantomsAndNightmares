package com.killerqu.phantomsandnightmares.mixin;

import com.killerqu.phantomsandnightmares.config.CommonConfig;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.stats.Stats;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value = Player.class)
public class PlayerMixin {
    @Redirect(method = "tick", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/player/Player;awardStat(Lnet/minecraft/resources/ResourceLocation;)V"))
    private void phantomsandnightmares$awardStatRedirect(Player player, ResourceLocation location) {
        if (CommonConfig.ENABLE_NATURAL_TIMESINCEREST.get() || location != Stats.TIME_SINCE_REST) {
            player.awardStat(location);
        }
    }
}
