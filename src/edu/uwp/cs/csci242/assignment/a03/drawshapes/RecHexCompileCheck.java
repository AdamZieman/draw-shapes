package edu.uwp.cs.csci242.assignment.a03.drawshapes;

public class RecHexCompileCheck
{

	private static void testRect() {
		Rectangle t = new Rectangle(10, 10, 10, 10, "red");
		t.setColor("blue");
		t.setHeight(20);
		t.setWidth(20);
		t.setXPosition(20);
		t.setYPosition(20);
		String s = t.getColor();
		int i = t.getHeight();
		i = t.getWidth();
		i = t.getXPosition();
		i = t.getYPosition();
		Point[] ps = t.getVertices();
		boolean b = t.equals(t);
		System.out.println(b);
		b = t.isInsideBox(400, 400);
		Rectangle r2 = new Rectangle(t);
		b = r2.equals(t);
		b = t.isInsideBox(41, 40);
		System.out.println(b);
	}

	private static void testHexagon() {
		Hexagon h = new Hexagon(10, 10, 10, 10, "red");
		h.setColor("blue");
		h.setHeight(20);
		h.setWidth(20);
		h.setXPosition(20);
		h.setYPosition(20);
		String s = h.getColor();
		int i = h.getHeight();
		i = h.getWidth();
		i = h.getXPosition();
		i = h.getYPosition();
		Point[] ps = h.getVertices();
		boolean b = h.equals(h);
		System.out.println(b);
		b = h.isInsideBox(400, 400);
		Hexagon h2 = new Hexagon(h);
		b = h2.equals(h);
		System.out.println(b);
	}
	
	private static void testOctagon() {
		Octagon o = new Octagon(10, 10, 10, 10, "red");
		o.setColor("blue");
		o.setHeight(20);
		o.setWidth(20);
		o.setXPosition(20);
		o.setYPosition(20);
		String s = o.getColor();
		int i = o.getHeight();
		i = o.getWidth();
		i = o.getXPosition();
		i = o.getYPosition();
		Point[] ps = o.getVertices();
		boolean b = o.equals(o);
		System.out.println(b);
		b = o.isInsideBox(400, 400);
		Octagon o2 = new Octagon(o);
		b = o2.equals(o);
		System.out.println(b);
	}

	public static void main(String[] args) {
		testRect();
		testHexagon();
		testOctagon();
	}

}
