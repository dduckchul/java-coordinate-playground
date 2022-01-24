package shape;

import java.util.ArrayList;
import java.util.List;

public abstract class Shape {
	protected List<CoordinatePoint> points;

	public Shape(){
		this.points = new ArrayList<>();
	}

	public List<CoordinatePoint> getPoints() {
		return points;
	}
}
