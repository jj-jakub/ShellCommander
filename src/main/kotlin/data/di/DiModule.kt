package data.di

import data.click.DefaultClickRepository
import domain.click.CalculateClickPoint
import domain.click.CalculateMenuClickPoint
import domain.click.ClickRepository
import domain.click.StartClicking
import domain.commands.ExecuteClickCommand

object DiModule {
    val clickRepository: ClickRepository = DefaultClickRepository()

    val calculateClickPoint = CalculateClickPoint()
    val calculateMenuClickPoint = CalculateMenuClickPoint()
    val executeClickCommand = ExecuteClickCommand()
    val startClicking = StartClicking(
        clickRepository = clickRepository,
        calculateClickPoint = calculateClickPoint,
        executeClickCommand = executeClickCommand,
        calculateMenuClickPoint = calculateMenuClickPoint,
    )
}