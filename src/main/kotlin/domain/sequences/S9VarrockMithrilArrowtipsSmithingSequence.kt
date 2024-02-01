package domain.sequences

import domain.model.basic.BasicSequence
import domain.model.basic.BasicSequenceEvent
import domain.model.basic.Pause
import domain.model.basic.Square

class S9VarrockMithrilArrowtipsSmithingSequence : ComposedSequence {
    override fun getSequence() = BasicSequence(
        repeatTimes = 1,
        events = mutableListOf<BasicSequenceEvent>().apply {
            addAll(sequenceMoves)
        }
    )

    // Camera zoom = 1,5/5 dots
    private val anvilSq = Square(1703.0F, 1395.0F, 1718.0F, 1426.0F)
    private val runningDelay = Pause(4000, 4500)
    private val dartTipOptionSq = Square(1520.0F, 580.0F, 1637.0F, 682.0F)
    private val smithingDelay = Pause(82 * 1000, 87 * 1000)

    private val bankSq = Square(1370.0F, 256.0F, 1392.0F, 299.0F)
    private val emptyDartsSq = Square(2438.0F, 639.0F, 2469.0F, 689.0F)
    private val mithrilBarsSq = Square(1443.0F, 1088.0F, 1500.0F, 1140.0F)

    private val sequenceMoves = listOf(
        anvilSq,
        runningDelay,
        dartTipOptionSq,
        smithingDelay,
        bankSq,
        runningDelay,
        emptyDartsSq,
        mithrilBarsSq,
    )
}