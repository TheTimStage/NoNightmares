package org.tts.effects;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import org.tts.NoNightmares;

public class ModEffects {
    public static StatusEffect WAKEFULNESS;
    public static RegistryEntry<StatusEffect> WAKEFULNESS_ENTRY;

    public static void init() {

        WAKEFULNESS = Registry.register(
                Registries.STATUS_EFFECT,
                Identifier.of(NoNightmares.MOD_ID, "wakefulness"),
                new WakefulnessStatusEffect(StatusEffectCategory.BENEFICIAL, 0x37ffe3)
        );

        WAKEFULNESS_ENTRY = Registries.STATUS_EFFECT.getEntry(WAKEFULNESS);
    }
}
