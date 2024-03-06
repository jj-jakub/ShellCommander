package data.click

import data.inventory.GetInventoryClickFieldsRepository
import domain.click.ClickRepository
import domain.model.basic.BasicSequence
import domain.sequences.S9LongbowsGESequence

class DefaultClickRepository(
    private val getInventoryClickFieldsRepository: GetInventoryClickFieldsRepository,
) : ClickRepository {
    override fun getDefaultBasicSequence(): BasicSequence = S9LongbowsGESequence(getInventoryClickFieldsRepository.invoke()).getSequence()
}