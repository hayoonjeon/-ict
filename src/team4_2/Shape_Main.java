package team4_2;

public class Shape_Main {

	public static void main(String[] args) {
		Shape rectangle = new Rectangle();
		Shape ellipse = new Ellipse();
		Shape line = new Line();
		drawShapes(rectangle);
		drawShapes(ellipse);
		drawShapes(line);
		
		
	}
	
	public static void drawShapes(Shape shape) {
		shape.draw();
		shape.name();
		
	}
	

}
