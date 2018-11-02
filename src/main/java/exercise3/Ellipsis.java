package exercise3;

public class Ellipsis {
	protected Point center;
	protected int xAxisLength;
	protected int yAxisLength;

	public Ellipsis(){

	}
	public Ellipsis(Point C, int a, int b)
	{
		center = C;
		xAxisLength = a;
		yAxisLength = b;
	}
	public double periEllipse (){
		return (2.0*Math.PI*Math.sqrt((0.5)*((xAxisLength^2) + (yAxisLength^2))));
	}
	public double aireEllipse(){
		return (Math.PI*xAxisLength*yAxisLength);
	}
}
