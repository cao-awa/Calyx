package com.github.cao.awa.calyx

import net.neoforged.api.distmarker.Dist
import net.neoforged.bus.api.IEventBus
import net.neoforged.bus.api.SubscribeEvent
import net.neoforged.fml.common.Mod
import net.neoforged.neoforge.common.NeoForge
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent

/**
 * Not supported yet now.
 */
@Mod("calyx", dist = [Dist.CLIENT, Dist.DEDICATED_SERVER])
class CalyxNeoForged(bus: IEventBus) {
    init {
        Calyx().onInitialize()

        NeoForge.EVENT_BUS.register(this)
    }

    @SubscribeEvent
    fun register(event: RegisterPayloadHandlersEvent) {
    }
}
