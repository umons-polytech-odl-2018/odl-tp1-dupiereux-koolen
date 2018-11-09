package exercise3;

public class Ellipsis {
	protected Point center;//ellipse et centre (qui en hérite) ont al meme déf du centre => protected
	protected int xAxisLength;
	protected int yAxisLenght;
	//! ce sont les tailles des demis axes !
	public Ellipsis(Point O, int x, int y){
		this.center=O;
		this.xAxisLength=x;
		this.yAxisLenght=y;
	}
	public double perimeter(){
		return (2*Math.PI*Math.sqrt(((Math.pow(xAxisLength, 2))+Math.pow(yAxisLenght,2))/2));
	}
	public double area(){
		return Math.PI*xAxisLength*yAxisLenght;
	}
}
