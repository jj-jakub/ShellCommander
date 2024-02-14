package domain.model.basic

data class Point(
    val x: Double,
    val y: Double,
) : BasicSequenceEvent {
    constructor(x: Int, y: Int) : this(x = x.toDouble(), y = y.toDouble())
}