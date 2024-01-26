package data.click

import domain.click.ClickRepository
import domain.model.basic.BasicSequence
import domain.model.basic.BasicSequenceEvent
import domain.model.basic.Pause
import domain.model.basic.Square

class DefaultClickRepository : ClickRepository {
    override fun getDefaultBasicSequence(): BasicSequence = BasicSequence(
        repeatTimes = 5,
        events = mutableListOf<BasicSequenceEvent>().apply {
            repeat((8..9).random()) {
                addAll(miningCircleMoves)
            }
            addAll(bankingMoves)
        }
    )

    private val ironSq1 = Square(1444.0F, 786.0F, 1516.0F, 850.0F)
    private val ironSq2 = Square(1369.0F, 708.0F, 1425.0F, 759.0F)
    private val ironSq3 = Square(1456.0F, 636.0F, 1511.0F, 691.0F)
    private val miningDelay = Pause(1000, 1600)

    private val bankSq = Square(532.0F, 919.0F, 605.0F, 991.0F)
    private val emptyEqSq = Square(1765.0F, 1280.0F, 1839.0F, 1356.0F)
    private val emptyEqDelay = Pause(500, 700)

    private val standingSq = Square(2060.0F, 547.0F, 2112.0F, 592.0F)
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