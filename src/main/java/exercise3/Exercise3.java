package exercise3;

public class Exercise3 {
	static ConvexPolygon buildConvexPolygon(Point[] vertices) {
		// TODO build a ConvexPolygon
		//return null;
		ConvexPolygon convexPolygon = new ConvexPolygon(vertices);
		//System.out.println("polygone : perimetre = "+ convexPolygon.perimeter() + " aire = " + convexPolygon.area());
		return convexPolygon;
	}

	static ConvexPolygon buildRectangle(Point upperLeft, Point lowerRight) {
		// TODO build a Rectangle
		//return null;
		Rectangle rectangle = new Rectangle(upperLeft, lowerRight);
		//System.out.println("rectangle : perimetre = "+ rectangle.perimeter() + " aire = " + rectangle.area());
		return  rectangle;
	}

	static ConvexPolygon buildSquare(Point upperLeft, int sideLength) {
		// TODO build a square
		//return null;
		Square square = new Square(upperLeft, sideLength);
		//System.out.println("carré : perimetre = "+ square.perimeter() + " aire = " + square.area());
		return square;
	}

	static Ellipsis buildEllipsis(Point center, int xAxisLength, int yAxisLength) {
		// TODO build an ellipsis
		//return null;
		Ellipsis ellipsis = new Ellipsis(center, xAxisLength, yAxisLength);
		//System.out.println("ellipse : perimetre = "+ ellipsis.perimeter() + " aire = " + ellipsis.area());
		return ellipsis;
	}

	static Ellipsis buildCircle(Point center, int radius) {
		// TODO build a circle
		//return null;
		Circle circle = new Circle(center, radius);
		//System.out.println("cercle : perimetre = "+ circle.perimeter() + " aire = " + circle.area());
		return circle;
	}

	static double computePerimeter(ConvexPolygon convexPolygon) {
		// TODO ask the convexPolygon to compute its perimeter
		//return 0.0;
		return convexPolygon.perimeter();
	}

	static double computeArea(ConvexPolygon convexPolygon) {
		// TODO ask the convexPolygon to compute its area
		//return 0.0;
		return convexPolygon.area();
	}

	static double computePerimeter(Ellipsis ellipsis) {
		// TODO ask the ellipsis to compute its perimeter
		//return 0.0;
		return ellipsis.perimeter();
	}

	static double computeArea(Ellipsis ellipsis) {
		// TODO ask the ellipsis to compute its area
		//return 0.0;
		return ellipsis.area();
	}
}
