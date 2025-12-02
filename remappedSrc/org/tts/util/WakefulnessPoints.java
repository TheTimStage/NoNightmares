package org.tts.util;

import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.recipe.BrewingRecipeRegistry;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import org.tts.NoNightmares;
import org.tts.effects.ModEffects;

import java.util.List;
import java.util.Map;

public class WakefulnessPoints {
    public static final RegistryEntry<Potion> WAKEFULNESS = Registry.registerReference(Registries.POTION,
            Identifier.of(NoNightmares.MOD_ID, "wakefulness"),
            new Potion("wakefulness", new StatusEffectInstance(ModEffects.WAKEFULNESS_ENTRY, 120_000, 0)));

    public static void init() {}
}

