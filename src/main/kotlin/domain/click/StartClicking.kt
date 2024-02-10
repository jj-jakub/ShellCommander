package domain.click

import domain.commands.ExecuteClickCommand
import domain.model.basic.MenuSquareClick
import domain.model.basic.Pause
import domain.model.basic.Point
import domain.model.basic.Square
import domain.model.calculated.ClickPoint

class StartClicking(
    private val clickRepository: ClickRepository,
    private val calculateClickPoint: CalculateClickPoint,
    private val calculateMenuClickPoint: CalculateMenuClickPoint,
    private val executeClickCommand: ExecuteClickCommand,
) {
    operator fun invoke(indefinitely: Boolean) {
        do {
            val basicSequence = clickRepository.getDefaultBasicSequence()
            var previousCalculatedPoint: ClickPoint? = null
            repeat(basicSequence.repeatTimes) {
                basicSequence.events.forEach { event ->
                    when (event) {
                        is Pause -> {
                            val scheduledDelay =
                                (event.delayBottom..(event.delayTop ?: event.delayBottom)).random().toLong()
                            var elapsedDelay = 0L
                            val period = 1000L
                            while (elapsedDelay < scheduledDelay) {
                                println("Time till next click: ${scheduledDelay - elapsedDelay}")
                                Thread.sleep(period)
                                elapsedDelay += period
                            }
                        }

                        is Point -> {
//                            TODO()
                        }

                        is Square -> {
                            val calculatedPoint = calculateClickPoint(square = event)
                            previousCalculatedPoint = calculatedPoint
                            executeClickCommand(clickPoint = calculatedPoint)
                        }

                        is MenuSquareClick -> {
                            val calculateMenuClickPoint = calculateMenuClickPoint(
                                square = previousCalculatedPoint?.point ?: return,
                                menuSquareClick = event,
                            )
                            executeClickCommand(calculateMenuClickPoint)
                        }
                    }
                }
            }
        } while (indefinitely)
    }
}