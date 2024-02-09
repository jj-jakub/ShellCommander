package domain.sequences

import domain.model.basic.BasicSequence
import domain.model.basic.BasicSequenceEvent
import domain.model.basic.Pause
import domain.model.basic.Square

class S9BakePieGESequence : ComposedSequence {
    override fun getSequence() = BasicSequence(
        repeatTimes = 1,
        events = mutableListOf<BasicSequenceEvent>().apply {
            addAll(sequenceMoves)
        }
    )

    // Camera zoom = 2.5/5 dots Direction East
    private val bankSq = Square(1429.0F, 639.0F, 1528.0F, 725.0F)
    private val delay1 = Pause(800, 1000)
    private val emptyPiesSq = Square(2434.0F, 947.0F, 2481.0F, 997.0F)
    private val delay2 = Pause(500, 700)
    private val piesSq = Square(1584.0F, 985.0F, 1630.0F, 1038.0F)
    private val closeBankSq = Square(1909.0F, 476.0F, 1939.0F, 510.0F)
    private val delay3 = Pause(500, 700)
    private val bakePieSq = Square(302.0F, 602.0F, 347.0F, 650.0F)
    private val makingDelay = Pause(47 * 1000, 51 * 1000)

    private val sequenceMoves = listOf(
        bankSq,
        delay1,
        emptyPiesSq,
        delay2,
        piesSq,
        closeBankSq,
        delay3,
        bakePieSq,
        makingDelay,
    )
}