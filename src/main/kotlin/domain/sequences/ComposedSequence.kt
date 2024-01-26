package domain.sequences

import domain.model.basic.BasicSequence

sealed interface ComposedSequence {
    fun getSequence(): BasicSequence
}
