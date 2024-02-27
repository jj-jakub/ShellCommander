package domain.sequences

import domain.model.basic.BasicSequence
import domain.model.basic.BasicSequenceEvent
import domain.model.basic.Pause
import domain.model.basic.Square

class S9HerbloreGESequence : ComposedSequence {
    override fun getSequence() = BasicSequence(
        repeatTimes = 1,
        events = mutableListOf<BasicSequenceEvent>().apply {
            addAll(sequenceMoves)
        }
    )

    // Camera zoom = 2.5/5 dots Direction East
    private val bankSq = Square(1440.0F, 665.0F, 1519.0F, 697.0F)
    private val delay1 = Pause(800, 1000)
    private val emptyEqSq = Square(1765.0F, 1280.0F, 1839.0F, 1356.0F)
    private val delay2 = Pause(500, 700)
    private val firstIngredientSq = Square(752.0F, 980.0F, 808.0F, 1035.0F)
    private val secondIngredientSq = Square(891.0F, 980.0F, 946.0F, 1042.0F)
    private val closeBankSq = Square(1909.0F, 476.0F, 1939.0F, 510.0F)
    private val delay3 = Pause(500, 700)
    private val eqFirstIngredientSq = Square(2434.0F, 947.0F, 2481.0F, 997.0F)
    private val eqSecondIngredientSq = Square(2555.0F, 943.0F, 2606.0F, 1001.0F)
    private val delay4 = Pause(500, 700)
    private val makePotionSq = Square(670.0F, 190.0F, 900.0F, 330.0F)
    private val makingDelay = Pause(158 * 100, 169 * 100)

    private val sequenceMoves = listOf(
        bankSq,
        delay1,
        emptyEqSq,
        delay2,
        firstIngredientSq,
        secondIngredientSq,
        closeBankSq,
        delay3,
        eqFirstIngredientSq,
        eqSecondIngredientSq,
        delay4,
        makePotionSq,
        makingDelay,
    )
}