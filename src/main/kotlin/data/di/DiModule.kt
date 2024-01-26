package data.di

import data.click.DefaultClickRepository
import domain.commands.ExecuteClickCommand
import domain.click.CalculateClickPoint
import domain.click.ClickRepository
import domain.click.StartClicking

object DiModule {
    val clickRepository: ClickRepository = DefaultClickRepository()

    val calculateClickPoint = CalculateClickPoint()
    val executeClickCommand = ExecuteClickCommand()
    val startClicking = StartClicking(
        clickRepository = clickRepository,
        calculateClickPoint = calculateClickPoint,
        executeClickCommand = executeClickCommand,
    )
}