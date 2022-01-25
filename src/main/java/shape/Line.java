package shape;

public class Line extends Shape{
	public static int POINT_SIZE = 2;

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
