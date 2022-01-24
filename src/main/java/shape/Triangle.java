package shape;

public class Triangle extends Shape implements IfShape{
	public Triangle(CoordinatePoint a, CoordinatePoint b, CoordinatePoint c){
		this.points.add(a);
		this.points.add(b);
		this.points.add(c);
	}

	@Override
	public double calculate() {
		return 0;
	}

	@Override
	public void draw() {

	}
}
