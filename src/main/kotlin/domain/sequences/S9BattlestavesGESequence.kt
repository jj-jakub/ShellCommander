package domain.sequences

import domain.model.basic.BasicSequence
import domain.model.basic.BasicSequenceEvent
import domain.model.basic.Pause
import domain.model.basic.Square

class S9BattlestavesGESequence : ComposedSequence {
    override fun getSequence() = BasicSequence(
        repeatTimes = 1,
        events = mutableListOf<BasicSequenceEvent>().apply {
            addAll(sequenceMoves)
        }
    )

    // Camera zoom = 4/5 dots Direction East, camera full down
    private val bankSq = Square(1263.0F, 564.0F, 1581.0F, 840.0F)
    private val delay1 = Pause(800, 1000)
    private val emptyEqSq = Square(1765.0F, 1280.0F, 1839.0F, 1356.0F)
    private val delay2 = Pause(500, 700)
    private val orbSq = Square(1299.0F, 978.0F, 1360.0F, 1037.0F)
    private val battlestaffSq = Square(1435.0F, 978.0F, 1493.0F, 1040.0F)
    private val closeBankSq = Square(1909.0F, 476.0F, 1939.0F, 510.0F)
    private val delay3 = Pause(500, 700)
    private val eqOrbSq = Square(2434.0F, 947.0F, 2481.0F, 997.0F)
    private val eqBattlestaffSq = Square(2555.0F, 943.0F, 2606.0F, 1001.0F)
    private val delay4 = Pause(700, 900)
    private val makeWineSq = Square(670.0F, 190.0F, 900.0F, 330.0F)
    private val makingDelay = Pause(178 * 100, 187 * 100)

    private val sequenceMoves = listOf(
        bankSq,
        delay1,
        emptyEqSq,
        delay2,
        orbSq,
        battlestaffSq,
        closeBankSq,
        delay3,
        eqOrbSq,
        eqBattlestaffSq,
        delay4,
        makeWineSq,
        makingDelay,
    )
}