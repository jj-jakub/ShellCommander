package domain.click

import domain.model.basic.MenuSquareClick
import domain.model.basic.Point
import domain.model.calculated.ClickPoint

class CalculateMenuClickPoint {
    operator fun invoke(square: Point, menuSquareClick: MenuSquareClick): ClickPoint {
        val yDiff = (menuSquareClick.dyTop..menuSquareClick.dyBottom).random()
        val xDiff = (-menuSquareClick.dxTolerance..menuSquareClick.dxTolerance).random()
        val duration = (MIN_CLICK_DURATION_MS..MAX_CLICK_DURATION_MS).random()
        return ClickPoint(
            point = Point(x = square.x + xDiff, y = square.y + yDiff),
            duration = duration,
        )
    }
}