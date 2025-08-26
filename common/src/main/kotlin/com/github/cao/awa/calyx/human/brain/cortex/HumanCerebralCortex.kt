package com.github.cao.awa.calyx.human.brain.cortex

import com.github.cao.awa.calyx.human.HumanPart
import com.github.cao.awa.calyx.human.brain.cortex.lobe.HumanFrontalLobe
import com.github.cao.awa.calyx.human.brain.cortex.lobe.HumanOccipitalLobe
import com.github.cao.awa.calyx.human.brain.cortex.lobe.HumanParietalLobe
import com.github.cao.awa.calyx.human.brain.cortex.lobe.HumanTemporalLobe

class HumanCerebralCortex: HumanPart {
    val frontalLobe: HumanFrontalLobe = HumanFrontalLobe()
    val parietalLobe: HumanParietalLobe = HumanParietalLobe()
    val temporalLobe: HumanTemporalLobe = HumanTemporalLobe()
    val occipitalLobe: HumanOccipitalLobe = HumanOccipitalLobe()

    override fun tick() {
        this.frontalLobe.tick()
        this.parietalLobe.tick()
        this.temporalLobe.tick()
        this.occipitalLobe.tick()
    }
}