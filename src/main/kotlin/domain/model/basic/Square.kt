package domain.model.basic

data class Square(
    val x1: Float,
    val y1: Float,
    val x2: Float,
    val y2: Float,
    val duration: Pause? = null,
) : BasicSequenceEvent {
    constructor(
        x1: Int,
        y1: Int,
        x2: Int,
        y2: Int,
        duration: Pause? = null,
    ) : this(
        x1 = x1.toFloat(),
        y1 = y1.toFloat(),
        x2 = x2.toFloat(),
        y2 = y2.toFloat(),
        duration = duration,
    )
}

data class MenuSquareClick(
    val dyTop: Int,
    val dyBottom: Int,
    val dxTolerance: Int,
) : BasicSequenceEvent