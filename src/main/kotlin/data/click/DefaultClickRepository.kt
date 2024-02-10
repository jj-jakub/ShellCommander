package data.click

import domain.click.ClickRepository
import domain.model.basic.BasicSequence
import domain.sequences.S9BlastFurnaceMithGoldSequence
import domain.sequences.S9MLMSequence

class DefaultClickRepository : ClickRepository {
    override fun getDefaultBasicSequence(): BasicSequence = S9BlastFurnaceMithGoldSequence().getSequence()
}