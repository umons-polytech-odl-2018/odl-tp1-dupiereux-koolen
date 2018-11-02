package exercise3;

public class Exercise3 {
	static ConvexPolygon buildConvexPolygon(Point[] vertices) {
		// TODO build a ConvexPolygon
		return null;
	}

	static ConvexPolygon buildRectangle(Point upperLeft, Point lowerRight) {
		// TODO build a Rectangle
		return null;
	}

	static ConvexPolygon buildSquare(Point upperLeft, int sideLength) {
		// TODO build a square
		return null;
	}

	static Ellipsis buildEllipsis(Point center, int xAxisLength, int yAxisLength) {
		return new Ellipsis(center,xAxisLength,yAxisLength);
	}

	static Ellipsis buildCircle(Point center, int radius) {
		return new Circle(center,radius);
	}

	static double computePerimeter(ConvexPolygon convexPolygon) {
		// TODO ask the convexPolygon to compute its perimeter
		return 0.0;
	}

	static double computeArea(ConvexPolygon convexPolygon) {
		// TODO ask the convexPolygon to compute its area
		return 0.0;
	}

	static double computePerimeter(Ellipsis ellipsis) {
		return ellipsis.periEllipse();
	}

	static double computeArea(Ellipsis ellipsis) {
		return ellipsis.aireEllipse();
	}
}
