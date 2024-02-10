package domain.sequences

import domain.model.basic.BasicSequence
import domain.model.basic.BasicSequenceEvent
import domain.model.basic.MenuSquareClick
import domain.model.basic.Pause
import domain.model.basic.Square

class S9BlastFurnaceMithGoldSequence : ComposedSequence {
    override fun getSequence() = BasicSequence(
        repeatTimes = 1,
        events = mutableListOf<BasicSequenceEvent>().apply {
            repeat(3) {
                addAll(miningCircleMoves)
            }
            addAll(drinkStaminaMoves)
        }
    )

    // Bank - second bottom row, scrolled down, X X X Stamina Gold Mithril X X
    // Camera zoom = 2/5, bank open, look East, gold gauntlets on, coal bag filled, gauntlets and bag in inv
//    private val bankSq = Square(1534.0F, 693.0F, 1585.0F, 749.0F)

    private val goldBankSq = Square(1300.0F, 1056.0F, 1364.0F, 1118.0F)
    private val mithrilBankSq = Square(1437.0F, 1056.0F, 1502.0F, 1118.0F)
    private val coalBagEqSqLong = Square(2428.0F, 628.0F, 2494.0F, 695.0F, Pause(350, 500))
    private val bankEmptyCoalBagSq = MenuSquareClick(
        580
        /**553*/
        , 600
        /**625*/
        , 280
    )
    private val bankFillCoalBagSq = MenuSquareClick(
        580
        /**553*/
        , 600
        /**625*/
        , 280
    )

    //    private val coalBagSq = Square(2428.0F, 632.0F, 2494.0F, 688.0F)
    private val gauntletsEqSq = Square(2303.0F, 628.0F, 2372.0F, 695.0F)
    private val conveyorBeltSq = Square(464.0F, 1051.0F, 569.0F, 1129.0F)
    private val closeBankSq = Square(1909.0F, 476.0F, 1939.0F, 510.0F)
    private val walkDelay1 = Pause(7 * 1000, 8 * 1000)

    private val eqEmptyCoalBag = MenuSquareClick(353, 410, 205)
    private val conveyorBeltSq2 = Square(1441.0F, 598.0F, 1495.0F, 671.0F)

    private val barDispenserSq = Square(1740.0F, 865.0F, 1800.0F, 920.0F)
    private val wearGauntletsDelay = Pause(8 * 100, 10 * 100)
    private val actionDelay = Pause(4 * 100, 5 * 100)
    private val walkDelay2 = Pause(3 * 1000, 4 * 1000)

    private val getBarsSq = Square(657.0F, 164.0F, 906.0F, 342.0F)
    private val delay3 = Pause(4 * 100, 5 * 100)
    private val bankSq2 = Square(1974.0F, 222.0F, 2026.0F, 252.0F)
    private val walkDelay4 = Pause(5 * 1000, 6 * 1000)
    private val emptyBarsEqSq = Square(2542.0F, 632.0F, 2608.0F, 688.0F)

    private val staminaBankSq = Square(1029.0F, 1163.0F, 1087.0F, 1230.0F)
    private val staminaEqSq = Square(2552.0F, 632.0F, 2600.0F, 693.0F)
    private val staminaEqSq2 = Square(2670.0F, 632.0F, 2713.0F, 693.0F)
    private val bankSq = Square(1534.0F, 693.0F, 1585.0F, 749.0F)

    private val drinkStaminaMoves = listOf(
        staminaBankSq,
        actionDelay,
        closeBankSq,
        actionDelay,
        staminaEqSq,
        actionDelay,
        bankSq,
        actionDelay,
        staminaEqSq,
        staminaEqSq2,
    )

    private val miningCircleMoves = listOf(
//        bankSq,
        coalBagEqSqLong,
        bankEmptyCoalBagSq,
        coalBagEqSqLong,
        bankFillCoalBagSq,
        actionDelay,
        goldBankSq,
        actionDelay,

        closeBankSq,
        actionDelay,
        conveyorBeltSq,
        walkDelay1,
        coalBagEqSqLong,
        eqEmptyCoalBag,
        actionDelay,
        conveyorBeltSq2,
        actionDelay,
        actionDelay,
        actionDelay,
        gauntletsEqSq, // Ice from now
        wearGauntletsDelay,
        barDispenserSq,
        walkDelay2,
        getBarsSq,
        delay3,
        bankSq2,
        walkDelay4,

        emptyBarsEqSq,
        coalBagEqSqLong,
        bankEmptyCoalBagSq,
        coalBagEqSqLong,
        bankFillCoalBagSq,
        actionDelay,
        mithrilBankSq,
        actionDelay,

        closeBankSq,
        actionDelay,
        conveyorBeltSq,
        walkDelay1,
        coalBagEqSqLong,
        eqEmptyCoalBag,
        actionDelay,
        conveyorBeltSq2,
        actionDelay,
        actionDelay,
        actionDelay,
        barDispenserSq,
        walkDelay2,
        getBarsSq,
        delay3,
        gauntletsEqSq, // Gold from now
        wearGauntletsDelay,
        bankSq2,
        walkDelay4,
        emptyBarsEqSq,
        actionDelay,
    )
}