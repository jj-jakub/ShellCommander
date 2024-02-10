package domain.sequences

import domain.model.basic.BasicSequence
import domain.model.basic.BasicSequenceEvent
import domain.model.basic.Pause
import domain.model.basic.Square

class S9MLMSequence : ComposedSequence {
    override fun getSequence() = BasicSequence(
        repeatTimes = 1,
        events = mutableListOf<BasicSequenceEvent>().apply {
            addAll(miningCircleMoves)
        }
    )

    // Camera zoom = full out, full top, look west
    private val mineSq1 = Square(1416.0F, 220.0F, 1447.0F, 265.0F)
    private val walkDelay1 = Pause(7 * 1000, 9 * 1000)
    private val miningDelay = Pause(15 * 1000, 17 * 1000)

    private val mineSq2 = Square(1523.0F, 285.0F, 1547.0F, 403.0F)
    private val mineSq3 = Square(1523.0F, 600.0F, 1550.0F, 678.0F)
    private val mineSq4 = Square(1523.0F, 600.0F, 1550.0F, 678.0F)
    private val mineSq5 = Square(1523.0F, 600.0F, 1550.0F, 678.0F)

    private val mineSq6 = Square(1695.0F, 544.0F, 1709.0F, 620.0F)
    private val mineSq7 = Square(1523.0F, 600.0F, 1550.0F, 678.0F)
    private val mineSq8 = Square(1523.0F, 600.0F, 1550.0F, 678.0F)
    private val mineSq9 = Square(1523.0F, 600.0F, 1550.0F, 678.0F)

    private val walkSq = Square(1780.0F, 1360.0F, 1789.0F, 1399.0F)
    private val walkDelay = Pause(5000, 6000)

    private val hopperSq = Square(1333.0F, 1116.0F, 1374.0F, 1160.0F)
    private val walkHopperDelay = Pause(5000, 6000)

    private val sackSq = Square(706.0F, 709.0F, 744.0F, 751.0F)
    private val walkSackDelay = Pause(6000, 7000)

    private val depositSq = Square(1788.0F, 1322.0F, 1815.0F, 1364.0F)
    private val walkDepositDelay = Pause(4000, 5000)

    private val emptyEqSq = Square(1412.0F, 1219.0F, 1474.0F, 1281.0F)
    private val emptyEqDelay = Pause(750, 1000)

    private val rightOfSackSq = Square(1257.0F, 358.0F, 1278.0F, 378.0F)
    private val walkRightOfSackDelay = Pause(4000, 5000)

    private val miningCircleMoves = listOf(
        mineSq1,
        walkDelay1,
        miningDelay,
        mineSq2,
        miningDelay,
        mineSq3,
        miningDelay,
        mineSq4,
        miningDelay,
        mineSq5,
        miningDelay,
        mineSq6,
        miningDelay,
        mineSq7,
        miningDelay,
        mineSq8,
        miningDelay,
        mineSq9,
        miningDelay,
        walkSq,
        walkDelay,
        hopperSq,
        walkHopperDelay,
        sackSq,
        walkSackDelay,
        depositSq,
        walkDepositDelay,
        emptyEqSq,
        emptyEqDelay,
        rightOfSackSq,
        walkRightOfSackDelay,
    )
}