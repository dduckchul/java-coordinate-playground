import java.util.List;

import shape.CoordinatePoint;
import shape.Shape;
import util.ShapeUtil;
import view.InputView;

public class Main {
	public static void main(String [] args) {
		List<CoordinatePoint> points = InputView.inputString();
		Shape shape = ShapeUtil.parseShape(points);
	}
}
