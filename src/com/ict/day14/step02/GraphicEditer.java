package com.ict.day14.step02;

public class GraphicEditer {
	public static void main(String[] args) {
		
		Shape s1 = new Line(); //(업캐스팅)
		drawShapes(s1);
		Shape s2 = new Rectangle();
		drawShapes(s2);		
		Shape s3 = new Ellipse();
		drawShapes(s3);
		
		
		
		
		
	}
	public static void drawShapes(Shape shape){
		shape.draw();
		
		
		
	}

}
