package exercise3;

public class ConvexPolygon {
	protected Point vertices[];//private car rectangle et square n'ont pas besoin d'être défini par tout leur sommets

	public ConvexPolygon(Point ver[]) {
		this.vertices = ver;
	}

	public double areaTriangle(Point a, Point b, Point c) {
		return (Math.abs((((a.getX() - c.getX()) * (b.getY() - c.getY())) - ((a.getY() - c.getY()) * (b.getX() - c.getX()))) / 2));
	}

	public double perimeter() {
		double perimeter = 0;
		for (int i = 0; i < vertices.length; i++) {
			if (i + 1 == vertices.length) {//quand je suis à mon dernier point, calculer la longueur par rapport au premier point
				perimeter += vertices[i].distance(vertices[0]);
			} else {//sinon toujours calculer par rapport au point suivant
				perimeter += vertices[i].distance(vertices[i + 1]);
			}
		}
		return perimeter;
	}

	public double area() {//version de mehdi, tracer des triangles dans la figure
		double area = 0;
		Point centre = new Point(0, 0);
		for (Point i : vertices) {
			centre.setX(centre.getX() + i.getX());
			centre.setY(centre.getY() + i.getY());
		}
		centre.setX(centre.getX() / vertices.length);
		centre.setY(centre.getY() / vertices.length);

		for (int i = 0; i < vertices.length; i++) {
			if (i + 1 != vertices.length) area += areaTriangle(vertices[i], vertices[i + 1], centre);
			else area += areaTriangle(vertices[i], vertices[0], centre);
		}
		return area;
	}
}
	/*public double area(){//je vais implémenter la technique avec le parcours du tableau de points de wikihow, qui fct dans tout les cas : https://www.wikihow.com/Calculate-the-Area-of-a-Polygon
		double area=0;
		double parcours1=0;
		double parcours2=0;
		for(int i=0; i<vertices.length; i++){
			if(i+1 != vertices.length){
				parcours1+=vertices[i].getX()*vertices[i+1].getY();
			}
			else{
				parcours1+=vertices[i].getX()*vertices[0].getY();
			}
		}
		for(int i=0; i<vertices.length; i++) {
			if(i+1 != vertices.length){
				parcours2+=vertices[i].getY()*vertices[i+1].getX();
			}
			else{
				parcours2+=vertices[i].getY()*vertices[0].getX();
			}
		}
		area=((parcours1-parcours2)/2);
		return area;// y'a un bug avec çà, je comprend pas pk
		}
		*/


