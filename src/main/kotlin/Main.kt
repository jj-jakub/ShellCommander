import data.di.DiModule
import java.io.File

/**
 * First of all, text file is loaded into fileContent field.
 * In second step, every line of text is parsed to the TextLine data class for simplicity. List is sorted by line number.
 * In third step, it can be noticed that amount of lines in every pyramid row is increasing by one, so index of the row == number of entries in given row.
 * Index of the last item in a row is equal to the index of item in previous row plus number of current pyramid row. That's the logic for item selection.
 * After correct items are selected, then they can be printed to the screen.
 */
fun main(args: Array<String>) {
    val fileContent = File("coding_qual_input.txt").readText()
    val sortedTextLines = fileContent.split("\n").mapNotNull { line ->
        parseTextLine(line)
    }.sortedBy {
        it.number
    }
    selectTextLines(sortedTextLines).forEach { line ->
        print(line.text)
        print(" ")
    }
}

fun parseTextLine(line: String): TextLine? = if (line.length > 3) {
    val (number, word) = line.split(" ")
    TextLine(number.toInt(), word)
} else {
    null
}

fun selectTextLines(sortedTextLines: List<TextLine>): List<TextLine> {
    var latestPyramidRow = 1
    var latestTextLineNumber = 0
    val selectedLines = mutableListOf<TextLine>()
    while (latestTextLineNumber < sortedTextLines.last().number) {
        val selectedLine = sortedTextLines[latestPyramidRow - 1 + latestTextLineNumber]
        selectedLines.add(selectedLine)
        latestPyramidRow++
        latestTextLineNumber = selectedLine.number
    }
    return selectedLines
}

data class TextLine(
    val number: Int,
    val text: String,
)
