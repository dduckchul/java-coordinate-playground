package shape;

public class Rectangle extends Shape implements IfShape{
	public static int POINT_SIZE = 4;

	public Rectangle(CoordinatePoint a, CoordinatePoint b, CoordinatePoint c, CoordinatePoint d){
		this.points.add(a);
		this.points.add(b);
		this.points.add(c);
		this.points.add(d);
	}

	@Override
	public double calculate() {
		return 0;
	}

	@Override
	public void draw() {

	}

	public boolean validateRectangle(){
		return true;
	}
}
