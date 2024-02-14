package data.di

import data.click.DefaultClickRepository
import domain.click.CalculateSquareClickPoint
import domain.click.CalculateMenuClickPoint
import domain.click.CalculatePolygonClickPoint
import domain.click.ClickRepository
import domain.click.StartClicking
import domain.commands.ExecuteClickCommand
import domain.commands.ExecuteDelayCommand

object DiModule {
    val clickRepository: ClickRepository = DefaultClickRepository()

    val calculateSquareClickPoint = CalculateSquareClickPoint()
    val calculatePolygonClickPoint = CalculatePolygonClickPoint()
    val calculateMenuClickPoint = CalculateMenuClickPoint()
    val executeClickCommand = ExecuteClickCommand()
    val executeDelayCommand = ExecuteDelayCommand()
    val startClicking = StartClicking(
        clickRepository = clickRepository,
        calculateSquareClickPoint = calculateSquareClickPoint,
        executeClickCommand = executeClickCommand,
        calculatePolygonClickPoint = calculatePolygonClickPoint,
        calculateMenuClickPoint = calculateMenuClickPoint,
        executeDelayCommand = executeDelayCommand,
    )
}