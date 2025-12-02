package org.tts.mixin;

import net.minecraft.block.entity.BeaconBlockEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.registry.entry.RegistryEntry;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.tts.effects.ModEffects;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Mixin(BeaconBlockEntity.class)
public class BeaconEffectAddMixin {
    @Shadow @Final @Mutable
    public static List<List<RegistryEntry>> EFFECTS_BY_LEVEL;

    @Shadow @Final @Mutable
    private static Set<RegistryEntry> EFFECTS;

    @Inject(method = "<clinit>", at = @At("RETURN"))
    private static void addCustomBeaconEffect(CallbackInfo ci) {
        List<List<RegistryEntry>> newLevels = new ArrayList<>(EFFECTS_BY_LEVEL);
        List<RegistryEntry> level4 = new ArrayList<>(newLevels.get(3));
        level4.add(ModEffects.WAKEFULNESS_ENTRY);

        newLevels.set(3, List.copyOf(level4));
        EFFECTS_BY_LEVEL = List.copyOf(newLevels);

        Set<RegistryEntry> newEffects = new HashSet<>(EFFECTS);
        newEffects.add(ModEffects.WAKEFULNESS_ENTRY);
        EFFECTS = Set.copyOf(newEffects);
    }
}
