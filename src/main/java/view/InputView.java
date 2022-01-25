package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import shape.CoordinatePoint;
import shape.Shape;

public class InputView {
	private static final String INPUT_TEXT = "좌표를 입력하세요.";
	private static final String COORDINATE_STRING_PATTERN = "(\\(\\d{1,2},\\d{1,2}\\))+";

	public static List<CoordinatePoint> inputString() {
		System.out.println(INPUT_TEXT);
		Scanner scan = new Scanner(System.in);
		String inputString = scan.nextLine();
		List<String> stringList = parseString(inputString);

		List<CoordinatePoint> coordinatePointList = new ArrayList<>();

		for(String coordinateString : stringList){
			coordinatePointList.add(new CoordinatePoint(coordinateString));
		}

		return coordinatePointList;
	}

	protected static List<String> parseString(String inputString){
		List<String> stringList = new ArrayList<>();

		Pattern pattern = Pattern.compile(COORDINATE_STRING_PATTERN);
		Matcher matcher = pattern.matcher(inputString);

		while(matcher.find()){
			String matchedString = matcher.group();
			matchedString = matchedString.substring(1,matchedString.length()-1);
			stringList.add(matchedString);
		}

		return stringList;
	}
}
