package data.di

import data.click.DefaultClickRepository
import data.inventory.GetInventoryClickFieldsRepository
import domain.click.CalculateMenuClickPoint
import domain.click.CalculatePolygonClickPoint
import domain.click.CalculateSquareClickPoint
import domain.click.ClickRepository
import domain.click.StartClicking
import domain.commands.ExecuteClickCommand
import domain.commands.ExecuteDelayCommand

object DiModule {
    val getInventoryClickFieldsRepository = GetInventoryClickFieldsRepository()
    val clickRepository: ClickRepository = DefaultClickRepository(getInventoryClickFieldsRepository = getInventoryClickFieldsRepository)

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