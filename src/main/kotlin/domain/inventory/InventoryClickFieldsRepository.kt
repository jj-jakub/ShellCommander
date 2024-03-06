package domain.inventory

import domain.model.basic.Square

interface InventoryClickFieldsRepository {
    val firstColumnX1: Int
    val firstColumnX2: Int
    val secondColumnX1: Int
    val secondColumnX2: Int
    val thirdColumnX1: Int
    val thirdColumnX2: Int
    val fourthColumnX1: Int
    val fourthColumnX2: Int

    val firstRowY1: Int
    val firstRowY2: Int
    val secondRowY1: Int
    val secondRowY2: Int
    val thirdRowY1: Int
    val thirdRowY2: Int
    val fourthRowY1: Int
    val fourthRowY2: Int
    val fifthRowY1: Int
    val fifthRowY2: Int
    val sixthRowY1: Int
    val sixthRowY2: Int
    val seventhRowY1: Int
    val seventhRowY2: Int

    fun getField11(): Square = Square(firstColumnX1, firstRowY1, firstColumnX2, firstRowY2)
    fun getField12(): Square = Square(secondColumnX1, firstRowY1, secondColumnX2, firstRowY2)
    fun getField13(): Square = Square(thirdColumnX1, firstRowY1, thirdColumnX2, firstRowY2)
    fun getField14(): Square = Square(fourthColumnX1, firstRowY1, fourthColumnX2, firstRowY2)
    fun getField21(): Square = Square(firstColumnX1, secondRowY1, firstColumnX1, secondRowY2)
    fun getField22(): Square = Square(secondColumnX1, secondRowY1, secondColumnX2, secondRowY2)
    fun getField23(): Square = Square(thirdColumnX1, secondRowY1, thirdColumnX2, secondRowY2)
    fun getField24(): Square = Square(fourthColumnX1, secondRowY1, fourthColumnX2, secondRowY2)
    fun getField31(): Square = Square(firstColumnX1, thirdRowY1, firstColumnX2, thirdRowY2)
    fun getField32(): Square = Square(secondColumnX1, thirdRowY1, secondColumnX2, thirdRowY2)
    fun getField33(): Square = Square(thirdColumnX1, thirdRowY1, thirdColumnX2, thirdRowY2)
    fun getField34(): Square = Square(fourthColumnX1, thirdRowY1, fourthColumnX2, thirdRowY2)
    fun getField41(): Square = Square(firstColumnX1, fourthRowY1, firstColumnX2, fourthRowY2)
    fun getField42(): Square = Square(secondColumnX1, fourthRowY1, secondColumnX2, fourthRowY2)
    fun getField43(): Square = Square(thirdColumnX1, fourthRowY1, thirdColumnX2, fourthRowY2)
    fun getField44(): Square = Square(fourthColumnX1, fourthRowY1, fourthColumnX2, fourthRowY2)
    fun getField51(): Square = Square(firstColumnX1, fifthRowY1, firstColumnX2, fifthRowY2)
    fun getField52(): Square = Square(secondColumnX1, fifthRowY1, secondColumnX2, fifthRowY2)
    fun getField53(): Square = Square(thirdColumnX1, fifthRowY1, thirdColumnX2, fifthRowY2)
    fun getField54(): Square = Square(fourthColumnX1, fifthRowY1, fourthColumnX2, fifthRowY2)
    fun getField61(): Square = Square(firstColumnX1, sixthRowY1, firstColumnX2, sixthRowY2)
    fun getField62(): Square = Square(secondColumnX1, sixthRowY1, secondColumnX2, sixthRowY2)
    fun getField63(): Square = Square(thirdColumnX1, sixthRowY1, thirdColumnX2, sixthRowY2)
    fun getField64(): Square = Square(fourthColumnX1, sixthRowY1, fourthColumnX2, sixthRowY2)
    fun getField71(): Square = Square(firstColumnX1, seventhRowY1, firstColumnX2, seventhRowY2)
    fun getField72(): Square = Square(secondColumnX1, seventhRowY1, secondColumnX2, seventhRowY2)
    fun getField73(): Square = Square(thirdColumnX1, seventhRowY1, thirdColumnX2, seventhRowY2)
    fun getField74(): Square = Square(fourthColumnX1, seventhRowY1, fourthColumnX2, seventhRowY2)
    fun getAllFields() = listOf(
        getField11(),
        getField12(),
        getField13(),
        getField14(),
        getField21(),
        getField22(),
        getField23(),
        getField24(),
        getField31(),
        getField32(),
        getField33(),
        getField34(),
        getField41(),
        getField42(),
        getField43(),
        getField44(),
        getField51(),
        getField52(),
        getField53(),
        getField54(),
        getField61(),
        getField62(),
        getField63(),
        getField64(),
        getField71(),
        getField72(),
        getField73(),
        getField74(),
    )
}