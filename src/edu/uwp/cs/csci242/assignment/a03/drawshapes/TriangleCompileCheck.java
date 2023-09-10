package edu.uwp.cs.csci242.assignment.a03.drawshapes;

public class TriangleCompileCheck
{

	public static void main(String[] args) {
		Triangle t = new Triangle(10, 10, 10, 10, "");
		//t.setColor("Orange");
		t.setHeight(20);
		t.setWidth(20);
		t.setXPosition(20);
		t.setYPosition(20);
		String s = t.getColor();
		System.out.println(s);
		int i = t.getHeight();
		System.out.println(i);
		i = t.getWidth();
		System.out.println(i);
		i = t.getXPosition();
		System.out.println(i);
		i = t.getYPosition();
		System.out.println(i);
		Point[] ps = t.getVertices();
		boolean b = t.equals(t);
		System.out.println(b);
		b = t.isInsideBox(400, 400);
		
		Triangle t2 = new Triangle(t);
	}

}
