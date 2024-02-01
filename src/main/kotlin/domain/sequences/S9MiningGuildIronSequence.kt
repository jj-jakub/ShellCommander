package domain.sequences

import domain.model.basic.BasicSequence
import domain.model.basic.BasicSequenceEvent
import domain.model.basic.Pause
import domain.model.basic.Square

class S9MiningGuildIronSequence : ComposedSequence {
    override fun getSequence() = BasicSequence(
        repeatTimes = 1,
        events = mutableListOf<BasicSequenceEvent>().apply {
            repeat((8..9).random()) {
                addAll(miningCircleMoves)
            }
            addAll(bankingMoves)
        }
    )

    // Camera zoom = 2/5 dots
    private val ironSq1 = Square(1446.0F, 781.0F, 1503.0F, 828.0F)
    private val ironSq2 = Square(1378.0F, 711.0F, 1424.0F, 750.0F)
    private val ironSq3 = Square(1456.0F, 638.0F, 1506.0F, 680.0F)
    private val miningDelay = Pause(1000, 1600)

    private val bankSq = Square(655.0F, 925.0F, 687.0F, 987.0F)
    private val emptyEqSq = Square(1765.0F, 1280.0F, 1839.0F, 1356.0F)
    private val emptyEqDelay = Pause(500, 700)

    private val standingSq = Square(2057.0F, 516.0F, 2098.0F, 555.0F)
    private val runningDelay = Pause(6000, 7000)

    private val miningCircleMoves = listOf(
        ironSq1,
        miningDelay,
        ironSq2,
        miningDelay,
        ironSq3,
        miningDelay,
    )

    private val bankingMoves = listOf(
        bankSq,
        runningDelay,
        emptyEqSq,
        emptyEqDelay,
        standingSq,
        runningDelay,
    )
}