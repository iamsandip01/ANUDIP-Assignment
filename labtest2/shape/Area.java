package labtest2.shape;
//create another class Area 
public class Area  implements Shape{ //Implementation
	
	@Override
	//Rectangle area method
	public double rectangleArea(double length,double breadth) {
		return length*breadth;
	}
	@Override
	//Square area method
	public double squareArea(double side) {
		return side*side;
	}
	@Override
	//Circle area method
	public double circleArea(double radius) {
		return 3.14*radius*radius;
	}
}
