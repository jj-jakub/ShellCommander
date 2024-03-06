package data.click

import domain.click.ClickRepository
import domain.model.basic.BasicSequence
import domain.sequences.S9BattlestavesGESequence
import domain.sequences.S9ForesterFireSequence
import domain.sequences.S9LongbowsGESequence
import domain.sequences.S9SeersMaplesSequence

class DefaultClickRepository : ClickRepository {
    override fun getDefaultBasicSequence(): BasicSequence = S9LongbowsGESequence().getSequence()
}