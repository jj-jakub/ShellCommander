package domain.sequences.test

import domain.inventory.InventoryClickFieldsRepository
import domain.model.basic.BasicSequence
import domain.model.basic.BasicSequenceEvent
import domain.sequences.ComposedSequence

class ClickEveryEqFieldSequence(
    inventoryClickFieldsRepository: InventoryClickFieldsRepository,
) : ComposedSequence {
    override fun getSequence() = BasicSequence(
        repeatTimes = 1,
        events = mutableListOf<BasicSequenceEvent>().apply {
            addAll(sequenceMoves)
        }
    )

    private val sequenceMoves = listOf(
        inventoryClickFieldsRepository.getField11(),
        inventoryClickFieldsRepository.getField12(),
        inventoryClickFieldsRepository.getField13(),
        inventoryClickFieldsRepository.getField14(),
        inventoryClickFieldsRepository.getField21(),
        inventoryClickFieldsRepository.getField22(),
        inventoryClickFieldsRepository.getField23(),
        inventoryClickFieldsRepository.getField24(),
        inventoryClickFieldsRepository.getField31(),
        inventoryClickFieldsRepository.getField32(),
        inventoryClickFieldsRepository.getField33(),
        inventoryClickFieldsRepository.getField34(),
        inventoryClickFieldsRepository.getField41(),
        inventoryClickFieldsRepository.getField42(),
        inventoryClickFieldsRepository.getField43(),
        inventoryClickFieldsRepository.getField44(),
        inventoryClickFieldsRepository.getField51(),
        inventoryClickFieldsRepository.getField52(),
        inventoryClickFieldsRepository.getField53(),
        inventoryClickFieldsRepository.getField54(),
        inventoryClickFieldsRepository.getField61(),
        inventoryClickFieldsRepository.getField62(),
        inventoryClickFieldsRepository.getField63(),
        inventoryClickFieldsRepository.getField64(),
        inventoryClickFieldsRepository.getField71(),
        inventoryClickFieldsRepository.getField72(),
        inventoryClickFieldsRepository.getField73(),
        inventoryClickFieldsRepository.getField74(),
    )
}