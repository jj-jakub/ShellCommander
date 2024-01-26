package domain.click

import domain.ExecuteClickCommand
import domain.model.basic.Pause
import domain.model.basic.Point
import domain.model.basic.Square

class StartClicking(
    private val clickRepository: ClickRepository,
    private val calculateClickPoint: CalculateClickPoint,
    private val executeClickCommand: ExecuteClickCommand,
) {
    operator fun invoke(indefinitely: Boolean) {
        val basicSequence = clickRepository.getDefaultBasicSequence()
        do {
            repeat(basicSequence.repeatTimes) {
                basicSequence.events.forEach { event ->
                    when (event) {
                        is Pause -> Thread.sleep(
                            (event.delayBottom..(event.delayTop ?: event.delayBottom)).random().toLong()
                        )

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