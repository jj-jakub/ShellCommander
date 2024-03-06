package data.click

import data.inventory.GetInventoryClickFieldsRepository
import domain.click.ClickRepository
import domain.model.basic.BasicSequence
import domain.sequences.test.ClickEveryEqFieldSequence

class DefaultClickRepository(
    private val getInventoryClickFieldsRepository: GetInventoryClickFieldsRepository,
) : ClickRepository {
    override fun getDefaultBasicSequence(): BasicSequence = ClickEveryEqFieldSequence(getInventoryClickFieldsRepository.invoke()).getSequence()
}