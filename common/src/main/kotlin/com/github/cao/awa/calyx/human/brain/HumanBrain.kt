package com.github.cao.awa.calyx.human.brain

import com.github.cao.awa.calyx.com.github.cao.awa.calyx.human.HumanPart
import com.github.cao.awa.calyx.human.brain.cortex.HumanCerebralCortex

class HumanBrain: HumanPart {
    val cortex: HumanCerebralCortex = HumanCerebralCortex()

    override fun tick() {
        this.cortex.tick()
    }
}