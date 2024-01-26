fun main(args: Array<String>) {
    println("Hello World!")

    while (true) {
        commands.forEach {
            println("exec $it")
            Runtime.getRuntime().exec(it()).waitFor()
        }
    }
}

private val commands = listOf(
    { "adb shell input swipe 368 568 368 568 " + (50..390).random() },
    { "adb shell input swipe 769 564 769 564 " + (50..390).random() },
    { "adb shell input swipe 248 854 248 854 " + (50..390).random() },
    { "adb shell input swipe 790 848 790 848 " + (50..390).random() },
    { "adb shell input swipe 295 1267 295 1267 " + (50..390).random() },
)