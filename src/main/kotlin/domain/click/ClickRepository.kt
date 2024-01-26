package domain.click

import domain.model.basic.BasicSequence

interface ClickRepository {
    fun getDefaultBasicSequence(): BasicSequence
}