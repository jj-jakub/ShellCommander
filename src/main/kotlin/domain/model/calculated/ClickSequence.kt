package domain.model.calculated

data class ClickSequence(
    val repeatTimes: Int,
    val events: List<ClickPoint>,
)