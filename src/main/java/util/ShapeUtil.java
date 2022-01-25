package util;

import static util.ExceptionMsg.*;

import java.util.List;

import shape.CoordinatePoint;
import shape.Line;
import shape.Rectangle;
import shape.Shape;
import shape.Triangle;

public class ShapeUtil {
	private static final int MAXIMUM_POINTS_TO_SHAPE = 4;

	public static Shape parseShape(List<CoordinatePoint> points){
		if(points == null || points.isEmpty() || points.size() == 1){
			throw new IllegalArgumentException(WRONG_COORDINATE_POINTS);
		}

		if(points.size() > MAXIMUM_POINTS_TO_SHAPE){
			throw new IllegalArgumentException(OVER_COORDINATE_POINTS);
		}

		Shape shape = null;

		if(points.size() == Line.POINT_SIZE){
			shape = new Line(points.get(0), points.get(1));
		}

		if(points.size() == Triangle.POINT_SIZE){
			shape = new Triangle(points.get(0), points.get(1), points.get(2));
		}

		if(points.size() == Rectangle.POINT_SIZE){
			shape = new Rectangle(points.get(0), points.get(1), points.get(2), points.get(3));
		}

		return shape;
	}
}
