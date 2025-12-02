package org.tts.util;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import org.tts.NoNightmares;
import org.tts.effects.ModEffects;

public class WakefulnessPoints {
    public static final RegistryEntry<Potion> WAKEFULNESS = Registry.registerReference(Registries.POTION,
            Identifier.of(NoNightmares.MOD_ID, "wakefulness"),
            new Potion("wakefulness", new StatusEffectInstance(ModEffects.WAKEFULNESS_ENTRY, 120_000, 0)));

    public static void init() {}
}

