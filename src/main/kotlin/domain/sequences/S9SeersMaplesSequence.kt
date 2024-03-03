package domain.sequences

import domain.model.basic.BasicSequence
import domain.model.basic.BasicSequenceEvent
import domain.model.basic.Pause
import domain.model.basic.Point
import domain.model.basic.Polygon
import domain.model.basic.Square

class S9SeersMaplesSequence : ComposedSequence {
    override fun getSequence() = BasicSequence(
        repeatTimes = 1,
        events = mutableListOf<BasicSequenceEvent>().apply {
            addAll(sequenceMoves)
        }
    )

    // Camera zoom = 2/5 dots Direction North, start on most right bank tile with empty eq
    private val firstTreePoly = Polygon(
        listOf(
            Point(
                1360, 117,
            ),
            Point(
                1394, 119,
            ),
            Point(
                1450, 188,
            ),
            Point(
                1413, 216,
            ),
            Point(
                1364, 216,
            ),
            Point(
                1343, 179,
            ),
        )
    )
    private val delay1 = Pause(9 * 1000 + 50 * 1000, 70 * 1000)
    private val secondTreePoly = Polygon(
        listOf(
            Point(
                1819, 585,
            ),
            Point(
                1880, 576,
            ),
            Point(
                1920, 637,
            ),
            Point(
                1891, 688,
            ),
            Point(
                1828, 680,
            ),
            Point(
                1798, 626,
            ),
        )
    )
    private val delay2 = Pause(3 * 1000 + 50 * 1000, 70 * 1000)
    private val thirdTreePoly = Polygon(
        listOf(
            Point(
                1656, 701,
            ),
            Point(
                1714, 701,
            ),
            Point(
                1749, 757,
            ),
            Point(
                1725, 809,
            ),
            Point(
                1665, 798,
            ),
            Point(
                1630, 749,
            ),
        )
    )
    private val delay3 = Pause(3 * 1000 + 50 * 1000, 70 * 1000)
    private val bankSq = Square(1278.0F, 1191.0F, 1353.0F, 1260.0F)
    private val runningDelay = Pause(10 * 1000, 12 * 1000)
    private val emptyEqSq = Square(1765.0F, 1280.0F, 1839.0F, 1356.0F)
    private val delay4 = Pause(500, 1000)

    private val sequenceMoves = listOf(
        firstTreePoly,
        delay1,
        secondTreePoly,
        delay2,
        thirdTreePoly,
        delay3,
        bankSq,
        runningDelay,
        emptyEqSq,
        delay4,
    )
}