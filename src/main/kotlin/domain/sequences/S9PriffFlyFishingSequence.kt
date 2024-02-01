package domain.sequences

import domain.model.basic.BasicSequence
import domain.model.basic.BasicSequenceEvent
import domain.model.basic.Pause
import domain.model.basic.Square

class S9PriffFlyFishingSequence : ComposedSequence {
    override fun getSequence() = BasicSequence(
        repeatTimes = 1,
        events = mutableListOf<BasicSequenceEvent>().apply {
            addAll(fishingMoves)
            addAll(dropMoves)
        }
    )

    // Camera zoom = 2/5 dots
    private val fishingSq = Square(1450.0F, 784.0F, 1507.0F, 848.0F)
    private val fishingDelay = Pause(75 * 1000, 85 * 1000)

    private val herbLongClick = Square(2312.0F, 642.0F, 2335.0F, 654.0F)

    //    private val delay2 = Pause(100, 150)
//    private val useHerbSquare = Square(2177.0F, 816.0F, 2435.0F, 839.0F)
//    private val delay3 = Pause(100, 150)
    private val tarSquare = Square(2314.0F, 748.0F, 2356.0F, 784.0F)
//    private val delay4 = Pause(100, 150)

    //    private val dropDelay = Pause(1, 2)
    private val drop1 = Square(2430.0F, 845.0F, 2480.0F, 885.0F)
    private val drop2 = Square(2545.0F, 845.0F, 2595.0F, 885.0F)
    private val drop3 = Square(2660.0F, 845.0F, 2710.0F, 885.0F)

    private val drop4 = Square(2315.0F, 950.0F, 2365.0F, 1000.0F)
    private val drop5 = Square(2430.0F, 950.0F, 2480.0F, 1000.0F)
    private val drop6 = Square(2545.0F, 950.0F, 2595.0F, 1000.0F)
    private val drop7 = Square(2660.0F, 950.0F, 2710.0F, 1000.0F)

    private val drop8 = Square(2315.0F, 1055.0F, 2365.0F, 1095.0F)
    private val drop9 = Square(2430.0F, 1055.0F, 2480.0F, 1095.0F)
    private val drop10 = Square(2545.0F, 1055.0F, 2595.0F, 1095.0F)
    private val drop11 = Square(2660.0F, 1055.0F, 2710.0F, 1095.0F)

    private val drop12 = Square(2315.0F, 1160.0F, 2365.0F, 1210.0F)
    private val drop13 = Square(2430.0F, 1160.0F, 2480.0F, 1210.0F)
    private val drop14 = Square(2545.0F, 1160.0F, 2595.0F, 1210.0F)
    private val drop15 = Square(2660.0F, 1160.0F, 2710.0F, 1210.0F)

    private val drop16 = Square(2315.0F, 1265.0F, 2365.0F, 1315.0F)
    private val drop17 = Square(2430.0F, 1265.0F, 2480.0F, 1315.0F)
    private val drop18 = Square(2545.0F, 1265.0F, 2595.0F, 1315.0F)

    private val fishingMoves = listOf(
        fishingSq,
        fishingDelay,
    )

    private val dropMoves = listOf(
        drop1,
//        dropDelay,
        drop2,
//        dropDelay,
        drop3,
//        dropDelay,
        drop4,
//        dropDelay,
        drop5,
//        dropDelay,
        drop6,
//        dropDelay,
        drop7,
//        dropDelay,
        drop8,
//        dropDelay,
        drop9,
//        dropDelay,
        drop10,
//        dropDelay,
        drop11,
//        dropDelay,
        drop12,
//        dropDelay,
        drop13,
//        dropDelay,
        drop14,
//        dropDelay,
        drop15,
//        dropDelay,
        drop16,
//        dropDelay,
        drop17,
//        dropDelay,
        drop18,
//        dropDelay,
    )
}