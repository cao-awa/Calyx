package com.github.cao.awa.calyx

import net.fabricmc.api.ModInitializer
import org.apache.logging.log4j.LogManager

class CalyxFabric : ModInitializer {
    companion object {
        private val LOGGER = LogManager.getLogger("CalyxFabric")
    }

    override fun onInitialize() {
        LOGGER.info("Calyx fabric bootstrap running")

        Calyx().onInitialize()
    }
}
