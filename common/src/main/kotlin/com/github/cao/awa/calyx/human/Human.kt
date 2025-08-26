package com.github.cao.awa.calyx.human

import com.github.cao.awa.calyx.com.github.cao.awa.calyx.human.HumanPart
import com.github.cao.awa.calyx.human.brain.HumanBrain

class Human: HumanPart {
    val brain: HumanBrain = HumanBrain()

    override fun tick() {
        this.brain.tick()
    }
}