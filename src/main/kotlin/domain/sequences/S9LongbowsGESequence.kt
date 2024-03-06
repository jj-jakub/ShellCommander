package domain.sequences

import domain.inventory.InventoryClickFieldsRepository
import domain.model.basic.BasicSequence
import domain.model.basic.BasicSequenceEvent
import domain.model.basic.Pause
import domain.model.basic.Square

class S9LongbowsGESequence(
    private val inventoryClickFieldsRepository: InventoryClickFieldsRepository,
) : ComposedSequence {
    override fun getSequence() = BasicSequence(
        repeatTimes = 1,
        events = mutableListOf<BasicSequenceEvent>().apply {
            addAll(getSequenceMoves())
        }
    )

    // Camera zoom = 2.5/5 dots Direction East
    private val bankSq = Square(1446.0F, 663.0F, 1556.0F, 738.0F)
    private val delay1 = Pause(800, 1000)
    private fun eqLogsSq() =
        (inventoryClickFieldsRepository.getAllFields() - inventoryClickFieldsRepository.getField11()).random()

    private val delay2 = Pause(500, 700)
    private val logsSq = Square(1018.0F, 1183.0F, 1097.0F, 1249.0F)
    private val closeBankSq = Square(1909.0F, 476.0F, 1939.0F, 510.0F)
    private val delay3 = Pause(500, 700)
    private val eqKnifeSq = Square(2301.0F, 626.0F, 2365.0F, 699.0F)
    private val delay4 = Pause(800, 1200)
    private val makeLongbowSq = Square(670.0F, 190.0F, 900.0F, 330.0F)
    private val makingDelay = Pause(49 * 1000, 53 * 1000)

    private fun getSequenceMoves() = listOf(
        bankSq,
        delay1,
        eqLogsSq(),
        delay2,
        logsSq,
        closeBankSq,
        delay3,
        eqKnifeSq,
        eqLogsSq(),
        delay4,
        makeLongbowSq,
        makingDelay,
    )
}