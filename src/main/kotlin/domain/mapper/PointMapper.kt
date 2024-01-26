package domain.mapper

import domain.model.basic.Point
import domain.model.basic.Square

fun Point.toSquare() = Square(
    x1 = x,
    x2 = x,
    y1 = y,
    y2 = y,
)