package domain.model.calculated

import domain.model.basic.Point

data class ClickPoint(
    val point: Point,
    val duration: Int,
)
