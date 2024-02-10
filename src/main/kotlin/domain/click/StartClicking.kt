package domain.click

import domain.commands.ExecuteClickCommand
import domain.model.basic.Pause
import domain.model.basic.Point
import domain.model.basic.Square

class StartClicking(
    private val clickRepository: ClickRepository,
    private val calculateClickPoint: CalculateClickPoint,
    private val executeClickCommand: ExecuteClickCommand,
) {
    operator fun invoke(indefinitely: Boolean) {
        do {
            val basicSequence = clickRepository.getDefaultBasicSequence()
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
                            executeClickCommand(clickPoint = calculatedPoint)
                        }
                    }
                }
            }
        } while (indefinitely)
    }
}