package com.sadik31388.villagertradeunlockermod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VillagerTradeUnlockerMod implements ModInitializer {
    public static final String MOD_ID = "villagertradeunlockermod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Villager Trade Unlocker Mod has been initialized!");
    }
}