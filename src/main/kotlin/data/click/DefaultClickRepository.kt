package data.click

import domain.click.ClickRepository
import domain.model.basic.BasicSequence
import domain.sequences.S9PriffFlyFishingSequence
import domain.sequences.S9VarrockMithrilArrowtipsSmithingSequence

class DefaultClickRepository : ClickRepository {
    override fun getDefaultBasicSequence(): BasicSequence = S9VarrockMithrilArrowtipsSmithingSequence().getSequence()
}