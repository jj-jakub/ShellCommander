package domain.model.basic

data class Polygon(
    val points: List<Point>,
    val duration: Pause? = null,
) : BasicSequenceEvent