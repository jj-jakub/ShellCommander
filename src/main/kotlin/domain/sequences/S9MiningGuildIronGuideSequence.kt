package domain.sequences

import domain.model.basic.BasicSequence
import domain.model.basic.BasicSequenceEvent
import domain.model.basic.Pause
import domain.model.basic.Square

class S9MiningGuildIronGuideSequence : ComposedSequence {
    override fun getSequence() = BasicSequence(
        repeatTimes = 1,
        events = mutableListOf<BasicSequenceEvent>().apply {
            repeat((8..9).random()) {
                addAll(miningCircleMoves)
            }
            addAll(bankingMoves)
        }
    )

    private val ironSq1 = Square(1420.0F, 796.0F, 1495.0F, 839.0F)
    private val ironSq2 = Square(1342.0F, 701.0F, 1398.0F, 759.0F)
    private val ironSq3 = Square(1441.0F, 635.0F, 1506.0F, 684.0F)
    private val miningDelay = Pause(1000, 1600)

    private val bankSq = Square(375.0F, 918.0F, 421.0F, 978.0F)
    private val emptyEqSq = Square(1765.0F, 1280.0F, 1839.0F, 1356.0F)
    private val emptyEqDelay = Pause(500, 700)

    private val standingSq = Square(2122.0F, 579.0F, 2153.0F, 598.0F)
    private val runningDelay = Pause(5000, 6000)

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