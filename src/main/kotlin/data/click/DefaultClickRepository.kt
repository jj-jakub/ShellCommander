package data.click

import domain.click.ClickRepository
import domain.model.basic.BasicSequence
import domain.sequences.S9MiningGuildIronGuideSequence

class DefaultClickRepository : ClickRepository {
    override fun getDefaultBasicSequence(): BasicSequence = S9MiningGuildIronGuideSequence().getSequence()
}