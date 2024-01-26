package domain.click;

import com.snatik.polygon.Point;
import com.snatik.polygon.Polygon;
import domain.model.ClickPolygon;

public class CalculateClickCoordinates {

    public int calculate(ClickPolygon polygon) {
      Polygon libPolygon = Polygon.Builder()
                .addVertex(new Point(polygon.getX1(), polygon.getY1()))
                .addVertex(new Point(polygon.getX1(), polygon.getY1()))
                .addVertex(new Point(polygon.getX1(), polygon.getY1()))
                .addVertex(new Point(polygon.getX1(), polygon.getY1())).build();
        libPolygon.getSides()
    }
}