package domain.model.basic

data class Pause(
    val delayBottom: Int,
    val delayTop: Int? = null,
) : BasicSequenceEvent
