package domain.commands

import domain.model.basic.Pause

class ExecuteDelayCommand {
    operator fun invoke(pause: Pause, onTimeLeftUpdated: (Long) -> Unit) {
        val scheduledDelay =
            (pause.delayBottom..(pause.delayTop ?: pause.delayBottom)).random().toLong()
        var elapsedDelay = 0L
        val period = 1000L
        while (elapsedDelay < scheduledDelay) {
            onTimeLeftUpdated(scheduledDelay - elapsedDelay)
            Thread.sleep(period)
            elapsedDelay += period
        }
    }
}