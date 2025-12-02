package org.tts;

import net.fabricmc.api.ModInitializer;

import org.tts.effects.ModEffects;
import org.tts.util.WakefulnessPoints;

public class NoNightmares implements ModInitializer {
	public static final String MOD_ID = "nonightmares";

	@Override
	public void onInitialize() {
		ModEffects.init();
		WakefulnessPoints.init();
	}
}