package domain.sequences

import domain.model.basic.BasicSequence
import domain.model.basic.BasicSequenceEvent
import domain.model.basic.Pause
import domain.model.basic.Point
import domain.model.basic.Polygon
import domain.model.basic.Square

class S9FaladorRooftopsSequence : ComposedSequence {
    override fun getSequence() = BasicSequence(
        repeatTimes = 1,
        events = mutableListOf<BasicSequenceEvent>().apply {
            addAll(PolygonSequence.getSequenceMoves())
        }
    )

    private object PolygonSequence {
        // Camera zoom = 1,5/5 dots, look North, start at the end of course
        private val treeSq = Polygon(
            listOf(
                Point(1963.0, 197.0),
                Point(1992.0, 203.0),
                Point(1970, 254),
                Point(1943.0, 254.0),
            )
        )
        private val runningDelay0 = Pause(5000, 6000)
        private val roofSq1 = Polygon(
            listOf(
                Point(1765.0, 641.0),
                Point(1809.0, 641.0),
                Point(1814, 677),
                Point(1767.0, 677.0),
            )
        )
        private val runningDelay1 = Pause(7000, 8000)
        private val roofSq2 = Polygon(
            listOf(
                Point(1671.0, 111.0),
                Point(1754.0, 108.0),
                Point(1770, 232),
                Point(1761.0, 267.0),
                Point(1679.0, 263.0),
            )
        )
        private val runningDelay2 = Pause(9000, 10000)
        private val roofSq3 = Polygon(
            listOf(
                Point(1283.0, 518.0),
                Point(1358.0, 514.0),
                Point(1364, 626),
                Point(1292.0, 622.0),
            )
        )
        private val runningDelay3 = Pause(3000, 4000)
        private val roofSq4 = Polygon(
            listOf(
                Point(1168.0, 496.0),
                Point(1237.0, 500.0),
                Point(1248, 520),
                Point(1217.0, 791.0),
                Point(1136.0, 796.0),
                Point(1131.0, 776.0),
            )
        )
        private val runningDelay4 = Pause(3000, 4000)
        private val roofSq5 = Polygon(
            listOf(
                Point(920.0, 685.0),
                Point(973.0, 679.0),
                Point(975, 734),
                Point(922.0, 730.0),
            )
        )
        private val runningDelay5 = Pause(9000, 10000)
        private val roofSq6 = Polygon(
            listOf(
                Point(1296.0, 793.0),
                Point(1342.0, 791.0),
                Point(1342.0, 842.0),
                Point(1298, 840),
            )
        )
        private val runningDelay6 = Pause(4000, 5000)
        private val roofSq7 = Polygon(
            listOf(
                Point(1017.0, 749.0),
                Point(1336.0, 749.0),
                Point(1367.0, 771.0),
                Point(1030, 765),
            )
        )
        private val runningDelay7 = Pause(3000, 4000)
        private val roofSq8 = Polygon(
            listOf(
                Point(1175.0, 985.0),
                Point(1314.0, 949.0),
                Point(1312.0, 1038.0),
                Point(1173, 1071),
            )
        )
        private val runningDelay8 = Pause(3000, 4000)
        private val roofSq9 = Polygon(
            listOf(
                Point(1162.0, 903.0),
                Point(1441.0, 949.0),
                Point(1435.0, 980.0),
                Point(1124, 965),
            )
        )
        private val runningDelay9 = Pause(3000, 4000)
        private val roofSq10 = Polygon(
            listOf(
                Point(1507.0, 1278.0),
                Point(1600.0, 1276.0),
                Point(1596.0, 1368.0),
                Point(1530, 1326),
            )
        )
        private val runningDelay10 = Pause(4000, 5000)
        private val roofSq11 = Polygon(
            listOf(
                Point(1591.0, 752.0),
                Point(1897.0, 687.0),
                Point(1891.0, 789.0),
                Point(1587, 842),
            )
        )
        private val runningDelay11 = Pause(3000, 4000)
        private val roofSq12 = Polygon(
            listOf(
                Point(1780.0, 709.0),
                Point(2051.0, 776.0),
                Point(2067.0, 844.0),
                Point(2047, 855),
                Point(1774, 804),
                Point(1769, 723),
            )
        )
        private val runningDelay12 = Pause(4000, 5000)

        fun getSequenceMoves() = listOf(
            treeSq,
            runningDelay0,
            roofSq1,
            runningDelay1,
            roofSq2,
            runningDelay2,
            roofSq3,
            runningDelay3,
            roofSq4,
            runningDelay4,
            roofSq5,
            runningDelay5,
            roofSq6,
            runningDelay6,
            roofSq7,
            runningDelay7,
            roofSq8,
            runningDelay8,
            roofSq9,
            runningDelay9,
            roofSq10,
            runningDelay10,
            roofSq11,
            runningDelay11,
            roofSq12,
            runningDelay12,
        )
    }

    private object SquareSequence {
        // Camera zoom = 1,5/5 dots, look North, start at the end of course
        private val treeSq = Square(1950.0F, 197.0F, 1963.0F, 232.0F)
        private val runningDelay0 = Pause(5000, 6000)
        private val roofSq1 = Square(1765.0F, 625.0F, 1814.0F, 656.0F)
        private val runningDelay1 = Pause(7000, 8000)
        private val roofSq2 = Square(1685.0F, 119.0F, 1754.0F, 221.0F)
        private val runningDelay2 = Pause(9000, 10000)
        private val roofSq3 = Square(1286.0F, 524.0F, 1357.0F, 609.0F)
        private val runningDelay3 = Pause(3000, 4000)
        private val roofSq4 = Square(1174.0F, 495.0F, 1219.0F, 689.0F)
        private val runningDelay4 = Pause(3000, 4000)
        private val roofSq5 = Square(931.0F, 665.0F, 967.0F, 714.0F)
        private val runningDelay5 = Pause(9000, 10000)
        private val roofSq6 = Square(1299.0F, 792.0F, 1339.0F, 841.0F)
        private val runningDelay6 = Pause(4000, 5000)
        private val roofSq7 = Square(1045.0F, 750.0F, 1330.0F, 770.0F)
        private val runningDelay7 = Pause(3000, 4000)
        private val roofSq8 = Square(1190.0F, 970.0F, 1292.0F, 1019.0F)
        private val runningDelay8 = Pause(3000, 4000)
        private val roofSq9 = Square(1167.0F, 910.0F, 1401.0F, 966.0F)
        private val runningDelay9 = Pause(3000, 4000)
        private val roofSq10 = Square(1522.0F, 1282.0F, 1586.0F, 1358.0F)
        private val runningDelay10 = Pause(4000, 5000)
        private val roofSq11 = Square(1595.0F, 760.0F, 1878.0F, 776.0F)
        private val runningDelay11 = Pause(3000, 4000)
        private val roofSq12 = Square(1803.0F, 752.0F, 2041.0F, 832.0F)
        private val runningDelay12 = Pause(4000, 5000)

        fun getSequenceMoves() = listOf(
            treeSq,
            runningDelay0,
            roofSq1,
            runningDelay1,
            roofSq2,
            runningDelay2,
            roofSq3,
            runningDelay3,
            roofSq4,
            runningDelay4,
            roofSq5,
            runningDelay5,
            roofSq6,
            runningDelay6,
            roofSq7,
            runningDelay7,
            roofSq8,
            runningDelay8,
            roofSq9,
            runningDelay9,
            roofSq10,
            runningDelay10,
            roofSq11,
            runningDelay11,
            roofSq12,
            runningDelay12,
        )
    }
}