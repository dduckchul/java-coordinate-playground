package shape;

import static util.ExceptionMsg.*;

import java.awt.*;

public class CoordinatePoint {
	private final static int VALIDATE_POINT_VALUE_LENGTH = 2;
	private final static int VALIDATE_POINT_VALUE_MAXIMUM = 24;
	private final Point point;

	public CoordinatePoint(String coordinateString){
		int [] coordinateValues = parseString(coordinateString);
		this.point = new Point(coordinateValues[0], coordinateValues[1]);
	}

	public int [] parseString(String coordinateString){
		if(coordinateString == null || coordinateString.isEmpty()){
			throw new IllegalArgumentException(WRONG_STRING_INPUT);
		}

		if(!coordinateString.contains(",")){
			throw new IllegalArgumentException(WRONG_STRING_SPLITTER);
		}

		String [] values = coordinateString.split(",");

		if(values.length != VALIDATE_POINT_VALUE_LENGTH){
			throw new IllegalArgumentException(WRONG_STRING_INPUT);
		}

		int x = Integer.parseInt(values[0]);
		int y = Integer.parseInt(values[1]);

		if(x > VALIDATE_POINT_VALUE_MAXIMUM || y > VALIDATE_POINT_VALUE_MAXIMUM){
			throw new IllegalArgumentException(OVER_POINTER_VALUES);
		}

		return new int[]{x,y};
	}

	public Point getPoint(){
		return this.point;
	}
}
