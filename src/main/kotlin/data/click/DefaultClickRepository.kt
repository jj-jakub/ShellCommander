package data.click

import domain.click.ClickRepository
import domain.model.basic.BasicSequence
import domain.sequences.S9BattlestavesGESequence
import domain.sequences.S9BlastFurnaceMithGoldSequence
import domain.sequences.S9CanifisRooftopsSequence
import domain.sequences.S9FaladorRooftopsSequence
import domain.sequences.S9HerbloreGESequence
import domain.sequences.S9MLMSequence

class DefaultClickRepository : ClickRepository {
    override fun getDefaultBasicSequence(): BasicSequence = S9BattlestavesGESequence().getSequence()
}