package exercise3;

public class Square extends Rectangle{
	private Point vertex;
	private int sideLenght;
	public Square(Point vertex, int sideLenght){
		super(vertex, new Point(vertex.getX()+sideLenght, vertex.getY()-sideLenght));
		//attention il reprend le constructeur de la classe parent => RECTANGLE !, qui ne prend que 2 paramètres !!!
		this.vertex=vertex;
		this.sideLenght=sideLenght;
	}
}
