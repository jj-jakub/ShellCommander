package domain.sequences

import domain.model.basic.BasicSequence
import domain.model.basic.BasicSequenceEvent
import domain.model.basic.Pause
import domain.model.basic.Square

class S9CookingWineGESequence : ComposedSequence {
    override fun getSequence() = BasicSequence(
        repeatTimes = 1,
        events = mutableListOf<BasicSequenceEvent>().apply {
            addAll(sequenceMoves)
        }
    )

    // Camera zoom = 2.5/5 dots Direction East
    private val bankSq = Square(1446.0F, 663.0F, 1556.0F, 738.0F)
    private val delay1 = Pause(800, 1000)
    private val emptyEqSq = Square(1765.0F, 1280.0F, 1839.0F, 1356.0F)
    private val delay2 = Pause(500, 700)
    private val grapesSq = Square(1584.0F, 985.0F, 1630.0F, 1038.0F)
    private val jugsSq = Square(1725.0F, 983.0F, 1773.0F, 1040.0F)
    private val closeBankSq = Square(1909.0F, 476.0F, 1939.0F, 510.0F)
    private val delay3 = Pause(500, 700)
    private val eqGrapesSq = Square(2434.0F, 947.0F, 2481.0F, 997.0F)
    private val eqJugsSq = Square(2555.0F, 943.0F, 2606.0F, 1001.0F)
    private val delay4 = Pause(800, 1200)
    private val makeWineSq = Square(670.0F, 190.0F, 900.0F, 330.0F)
    private val makingDelay = Pause(178 * 100, 187 * 100)

    private val sequenceMoves = listOf(
        bankSq,
        delay1,
        emptyEqSq,
        delay2,
        grapesSq,
        jugsSq,
        closeBankSq,
        delay3,
        eqGrapesSq,
        eqJugsSq,
        delay4,
        makeWineSq,
        makingDelay,
    )
}