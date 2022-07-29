package net.DeusOnCrack.optics;

import net.DeusOnCrack.optics.block.ModBlocks;
import net.DeusOnCrack.optics.items.moditems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Optics implements ModInitializer {

	public static final String MOD_ID = "optics";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		moditems.registerModItems();
		ModBlocks.registerModBlocks();



	}
}
