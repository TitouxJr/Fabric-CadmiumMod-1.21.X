package net.titoux.cadmiummod;

import net.fabricmc.api.ModInitializer;

import net.titoux.cadmiummod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CadmiumMod implements ModInitializer {
	public static final String MOD_ID = "cadmiummod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}