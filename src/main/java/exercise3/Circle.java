package exercise3;

public class Circle extends Ellipsis {
	private int radius;
	public Circle(Point center, int radius){
		super(center, radius, radius);
		this.radius=radius;
	}
}
