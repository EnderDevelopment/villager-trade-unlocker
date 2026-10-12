package com.sadik31388.villagertradeunlockermod.mixin;

import net.minecraft.world.entity.npc.Villager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Villager.class)
public class VillagerMixin {
    @Inject(method = "updateTrades", at = @At("HEAD"), cancellable = true)
    private void unlockAllTrades(CallbackInfo ci) {
        Villager villager = (Villager) (Object) this;
        villager.setVillagerXp(50); // Set XP to max level
        ci.cancel(); // Cancel the original method
    }
}
