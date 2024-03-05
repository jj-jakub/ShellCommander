package domain.sequences

import domain.model.basic.BasicSequence
import domain.model.basic.BasicSequenceEvent
import domain.model.basic.Pause
import domain.model.basic.Square

class S9ForesterFireSequence : ComposedSequence {
    override fun getSequence() = BasicSequence(
        repeatTimes = 1,
        events = mutableListOf<BasicSequenceEvent>().apply {
            addAll(sequenceMoves)
        }
    )

    // Camera zoom = 4/5 dots Direction East, camera full down, tinderbox in inv, bank opened
//    private val bankSq = Square(1263.0F, 564.0F, 1581.0F, 840.0F)
//    private val delay1 = Pause(800, 1000)
    private val maplesSq = Square(1029.0F, 1185.0F, 1095.0F, 1249.0F)
    private val delay1 = Pause(300, 500)
    private val closeBankSq = Square(1909.0F, 476.0F, 1939.0F, 510.0F)
    private val delay2 = Pause(300, 600)
    private val mapleEqSq = Square(2421.0F, 630.0F, 2494.0F, 693.0F)
    private val delay3 = Pause(500, 700)
    private val fireSq = Square(1070.0F, 811.0F, 1139.0F, 873.0F)
    private val delay4 = Pause(15 * 100, 25 * 100)
    private val makeFireSq = Square(670.0F, 190.0F, 900.0F, 330.0F)
    private val makingDelay = Pause(((178 * 100) / 14) * 27 * 2 - 5000, ((187 * 100) / 14) * 27 * 2 - 5000)
    private val goToBankSq = Square(1814.0F, 527.0F, 1900.0F, 577.0F)
    private val delay5 = Pause(2 * 1000, 3 * 1000)

    private val sequenceMoves = listOf(
        maplesSq,
        delay1,
        closeBankSq,
        delay2,
        mapleEqSq,
        delay3,
        fireSq,
        delay4,
        makeFireSq,
        makingDelay,
        goToBankSq,
        delay5,
    )
}