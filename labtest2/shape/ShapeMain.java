package labtest2.shape;

public class ShapeMain {

	public static void main(String[] args) {
		//instance of area
		Area area=new Area();
		//print area of rectangle
		System.out.println(area.rectangleArea(3,7));
		//print area of square
		System.out.println(area.squareArea(3));
		//print area of circle
		System.out.println(area.circleArea(3));

	}

}
