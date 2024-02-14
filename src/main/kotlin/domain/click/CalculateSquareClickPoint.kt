package domain.click

import domain.model.basic.Point
import domain.model.basic.Square
import domain.model.calculated.ClickPoint

const val MIN_CLICK_DURATION_MS = 51
const val MAX_CLICK_DURATION_MS = 243

class CalculateSquareClickPoint {
    operator fun invoke(square: Square): ClickPoint {
        val randomX = ((square.x1 * 10).toInt()..(square.x2 * 10).toInt()).random() / 10.0
        val randomY = ((square.y1 * 10).toInt()..(square.y2 * 10).toInt()).random() / 10.0
        val duration = ((square.duration?.delayBottom ?: MIN_CLICK_DURATION_MS).. (square.duration?.delayTop ?: MAX_CLICK_DURATION_MS)).random()
        return ClickPoint(
            point = Point(x = randomX, y = randomY),
            duration = duration,
        )
    }
}