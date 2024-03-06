package domain.sequences

import domain.model.basic.BasicSequence

interface ComposedSequence {
    fun getSequence(): BasicSequence
}
