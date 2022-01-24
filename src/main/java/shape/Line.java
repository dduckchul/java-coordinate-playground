package shape;

import java.awt.*;

public class Line extends Shape implements IfShape{

	public Line(CoordinatePoint a, CoordinatePoint b){
		this.points.add(a);
		this.points.add(b);
	}

	@Override
	public double calculate() {
		return 0;
	}

	@Override
	public void draw() {

	}
}
