package domain.sequences

import domain.model.basic.BasicSequence
import domain.model.basic.BasicSequenceEvent
import domain.model.basic.Pause
import domain.model.basic.Square

class S9CanifisRooftopsSequence : ComposedSequence {
    override fun getSequence() = BasicSequence(
        repeatTimes = 1,
        events = mutableListOf<BasicSequenceEvent>().apply {
            addAll(sequenceMoves)
        }
    )

    // Camera zoom = 1,5/5 dots, look North, start at the end of course
    private val treeSq = Square(1310.0F, 360.0F, 1348.0F, 464.0F)
    private val runningDelay0 = Pause(6000, 7000)
    private val roofSq1 = Square(1422.0F, 317.0F, 1477.0F, 373.0F)
    private val runningDelay1 = Pause(4000, 5000)
    private val roofSq2 = Square(1029.0F, 665.0F, 1098.0F, 779.0F)
    private val runningDelay2 = Pause(4000, 5000)
    private val roofSq3 = Square(878.0F, 1028.0F, 949.0F, 1164.0F)
    private val runningDelay3 = Pause(4000, 5000)
    private val roofSq4 = Square(1359.0F, 1244.0F, 1406.0F, 1344.0F)
    private val runningDelay4 = Pause(3000, 4000)
    private val roofSq5 = Square(1602.0F, 923.0F, 1680.0F, 988.0F)
    private val runningDelay5 = Pause(6000, 7000)
    private val roofSq6 = Square(2569.0F, 656.0F, 2639.0F, 754.0F)
    private val actionDelay = Pause(200, 400)
    private val roofSq62 = Square(2676.0F, 685.0F, 2748.0F, 752.0F)
    private val runningDelay6 = Pause(6000, 7000)
    private val roofSq7 = Square(1453.0F, 270.0F, 1511.0F, 311.0F)
    private val runningDelay7 = Pause(4000, 5000)

    private val sequenceMoves = listOf(
        treeSq,
        runningDelay0,
        roofSq1,
        runningDelay1,
        roofSq2,
        runningDelay2,
        roofSq3,
        runningDelay3,
        roofSq4,
        runningDelay4,
        roofSq5,
        runningDelay5,
        roofSq62,
        actionDelay,
        roofSq6,
        runningDelay6,
        roofSq7,
        runningDelay7,
    )
}