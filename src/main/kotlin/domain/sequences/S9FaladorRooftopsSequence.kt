package domain.sequences

import domain.model.basic.BasicSequence
import domain.model.basic.BasicSequenceEvent
import domain.model.basic.Pause
import domain.model.basic.Square

class S9FaladorRooftopsSequence : ComposedSequence {
    override fun getSequence() = BasicSequence(
        repeatTimes = 1,
        events = mutableListOf<BasicSequenceEvent>().apply {
            addAll(sequenceMoves)
        }
    )

    // Camera zoom = 1,5/5 dots, look North, start at the end of course
    private val treeSq = Square(1950.0F, 197.0F, 1963.0F, 232.0F)
    private val runningDelay0 = Pause(5000, 6000)
    private val roofSq1 = Square(1765.0F, 625.0F, 1814.0F, 656.0F)
    private val runningDelay1 = Pause(7000, 8000)
    private val roofSq2 = Square(1685.0F, 119.0F, 1754.0F, 221.0F)
    private val runningDelay2 = Pause(9000, 10000)
    private val roofSq3 = Square(1286.0F, 524.0F, 1357.0F, 609.0F)
    private val runningDelay3 = Pause(3000, 4000)
    private val roofSq4 = Square(1174.0F, 495.0F, 1219.0F, 689.0F)
    private val runningDelay4 = Pause(3000, 4000)
    private val roofSq5 = Square(931.0F, 665.0F, 967.0F, 714.0F)
    private val runningDelay5 = Pause(9000, 10000)
    private val roofSq6 = Square(1299.0F, 792.0F, 1339.0F, 841.0F)
    private val runningDelay6 = Pause(4000, 5000)
    private val roofSq7 = Square(1045.0F, 750.0F, 1330.0F, 770.0F)
    private val runningDelay7 = Pause(3000, 4000)
    private val roofSq8 = Square(1190.0F, 970.0F, 1292.0F, 1019.0F)
    private val runningDelay8 = Pause(3000, 4000)
    private val roofSq9 = Square(1167.0F, 910.0F, 1401.0F, 966.0F)
    private val runningDelay9 = Pause(3000, 4000)
    private val roofSq10 = Square(1522.0F, 1282.0F, 1586.0F, 1358.0F)
    private val runningDelay10 = Pause(4000, 5000)
    private val roofSq11 = Square(1595.0F, 760.0F, 1878.0F, 776.0F)
    private val runningDelay11 = Pause(3000, 4000)
    private val roofSq12 = Square(1803.0F, 752.0F, 2041.0F, 832.0F)
    private val runningDelay12 = Pause(4000, 5000)

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
        roofSq6,
        runningDelay6,
        roofSq7,
        runningDelay7,
        roofSq8,
        runningDelay8,
        roofSq9,
        runningDelay9,
        roofSq10,
        runningDelay10,
        roofSq11,
        runningDelay11,
        roofSq12,
        runningDelay12,
    )
}