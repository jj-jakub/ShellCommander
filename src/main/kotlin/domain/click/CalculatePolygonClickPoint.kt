package domain.click

import domain.model.basic.Point
import domain.model.basic.Polygon
import domain.model.calculated.ClickPoint
import kotlin.random.Random
import kotlin.system.measureNanoTime

class CalculatePolygonClickPoint {
    operator fun invoke(polygon: Polygon): ClickPoint {
        lateinit var point: Point
        val execNs = measureNanoTime {
            point = randomPointInsidePolygon(polygon = polygon.points)
        }
        println("Calculated polygon point in $execNs ns")
        val duration = ((polygon.duration?.delayBottom ?: MIN_CLICK_DURATION_MS)
                ..(polygon.duration?.delayTop ?: MAX_CLICK_DURATION_MS)).random()
        return ClickPoint(
            point = point,
            duration = duration,
        )
    }

    private fun isInsidePolygon(polygon: List<Point>, point: Point): Boolean {
        var inside = false
        var i = 0
        var j = polygon.size - 1
        while (i < polygon.size) {
            if ((polygon[i].y > point.y) != (polygon[j].y > point.y) &&
                (point.x < (polygon[j].x - polygon[i].x) * (point.y - polygon[i].y) /
                        (polygon[j].y - polygon[i].y) + polygon[i].x)
            ) {
                inside = !inside
            }
            j = i++
        }
        return inside
    }

    private fun randomPointInsidePolygon(polygon: List<Point>): Point {
        // Find the bounding box of the polygon
        val minX = polygon.minByOrNull { it.x }?.x ?: polygon.first().x
        val maxX = polygon.maxByOrNull { it.x }?.x ?: polygon.first().x
        val minY = polygon.minByOrNull { it.y }?.y ?: polygon.first().y
        val maxY = polygon.maxByOrNull { it.y }?.y ?: polygon.first().y

        // Generate random points until one is inside the polygon
        while (true) {
            val randomX = Random.nextDouble(minX, maxX)
            val randomY = Random.nextDouble(minY, maxY)
            val randomPoint = Point(randomX, randomY)
            if (isInsidePolygon(polygon, randomPoint)) {
                return randomPoint
            }
        }
    }
}