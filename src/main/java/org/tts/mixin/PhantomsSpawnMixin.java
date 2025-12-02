package org.tts.mixin;

import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.spawner.PhantomSpawner;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.tts.effects.ModEffects;

@Mixin(PhantomSpawner.class)
public class PhantomsSpawnMixin {
    @Inject(method = "spawn", at = @At("HEAD"), cancellable = true)
    private void noNightmares$noPhantoms(ServerWorld world, boolean spawnMonsters, CallbackInfo ci) {

        for (ServerPlayerEntity player : world.getPlayers()) {
            if (player.hasStatusEffect(ModEffects.WAKEFULNESS_ENTRY)) {
                ci.cancel();
                return;
            }
        }
    }

}
