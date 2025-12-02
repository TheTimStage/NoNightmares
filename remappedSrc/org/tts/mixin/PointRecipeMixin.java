package org.tts.mixin;

import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
import net.minecraft.recipe.BrewingRecipeRegistry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.tts.util.WakefulnessPoints;

@Mixin(BrewingRecipeRegistry.class)
public class PointRecipeMixin {
    @Inject(method = "registerDefaults", at = @At("TAIL"))
    private static void nonightmares$addWakefulnessRecipes(BrewingRecipeRegistry.Builder builder, CallbackInfo ci) {
        builder.registerPotionRecipe(Potions.WATER, Items.PHANTOM_MEMBRANE, WakefulnessPoints.WAKEFULNESS);
    }
}
