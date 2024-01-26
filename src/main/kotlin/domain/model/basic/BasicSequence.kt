package domain.model.basic

data class BasicSequence(
    val repeatTimes: Int,
    val events: List<BasicSequenceEvent>,
)
