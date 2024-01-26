package domain.commands

import domain.model.calculated.ClickPoint

class ExecuteDelayCommand {
    operator fun invoke(clickPoint: ClickPoint) {
        val x = clickPoint.point.x
        val y = clickPoint.point.y
        val duration = clickPoint.duration
        val cmd = "adb -s 2a2268c63d027ece shell input swipe $x $y $x $y $duration"
        Runtime.getRuntime().exec(cmd).waitFor()
        println("Executed command: $cmd")
    }
}