package exercise3;

public class Point {
	private int x;
	private int y;
	public Point(int x, int y) {
		// TODO implement this class internal state and a way to access it.
		this.x=x;
		this.y=y;
	}
	public double distance(Point b){
		return (Math.sqrt(Math.pow(this.x-b.getX(),2)+Math.pow(this.y-b.getY(),2)));
	}
	public int getX()
	{
		return this.x;
	}
	public int getY(){
		return this.y;
	}
	public void setX(int nvx){
		this.x=nvx;
	}
	public void setY(int nvy){
		this.y=nvy;
	}
}
