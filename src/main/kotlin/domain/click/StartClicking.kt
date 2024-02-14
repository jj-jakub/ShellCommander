package domain.click

import domain.commands.ExecuteClickCommand
import domain.commands.ExecuteDelayCommand
import domain.model.basic.MenuSquareClick
import domain.model.basic.Pause
import domain.model.basic.Point
import domain.model.basic.Polygon
import domain.model.basic.Square
import domain.model.calculated.ClickPoint

class StartClicking(
    private val clickRepository: ClickRepository,
    private val calculateSquareClickPoint: CalculateSquareClickPoint,
    private val calculatePolygonClickPoint: CalculatePolygonClickPoint,
    private val calculateMenuClickPoint: CalculateMenuClickPoint,
    private val executeClickCommand: ExecuteClickCommand,
    private val executeDelayCommand: ExecuteDelayCommand,
) {
    operator fun invoke(indefinitely: Boolean) {
        do {
            val basicSequence = clickRepository.getDefaultBasicSequence()
            var previousCalculatedPoint: ClickPoint? = null
            repeat(basicSequence.repeatTimes) {
                basicSequence.events.forEach { event ->
                    when (event) {
                        is Pause -> executePause(event = event)

                        is Point -> {
//                            TODO()
                        }

                        is Square -> {
                            val calculatedPoint = calculateSquareClickPoint(square = event)
                            previousCalculatedPoint = calculatedPoint
                            executeClickCommand(clickPoint = calculatedPoint)
                        }

                        is MenuSquareClick -> {
                            val calculateMenuClickPoint = calculateMenuClickPoint(
                                square = previousCalculatedPoint?.point ?: return,
                                menuSquareClick = event,
                            )
                            executeClickCommand(clickPoint = calculateMenuClickPoint)
                        }

                        is Polygon -> {
                            val calculatedPoint = calculatePolygonClickPoint(polygon = event)
                            previousCalculatedPoint = calculatedPoint
                            executeClickCommand(clickPoint = calculatedPoint)
                        }
                    }
                }
            }
        } while (indefinitely)
    }

    private fun executePause(event: Pause) {
        executeDelayCommand(event) { timeLeft ->
            println("Time till next event: $timeLeft")
        }
    }
}