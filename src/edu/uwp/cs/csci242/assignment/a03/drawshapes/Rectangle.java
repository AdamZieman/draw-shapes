package edu.uwp.cs.csci242.assignment.a03.drawshapes;

/**
 * Rectangle class extends the Shape class to create a Rectangle object.
 * <p>
 *     This class extends Shape class, therefore inheriting all of its public constructors and methods.
 *     Has a parameterized constructor, a soft-copy constructor, an overridden equals method, and a method to
 *     add the points (vertices) of the rectangle.
 * </p>
 *
 * @author Adam Zieman
 * @edu.uwp.cs.242.course CSCI 424 - Computer Science II
 * @edu.uwp.cs.242.section 001
 * @edu.uwp.cs.242.assignment 3
 * @bugs none
 */
public class Rectangle extends Shape {
    // Creates a Point[] variable with 4 indexes
    private Point[] vertices = new Point[4];

    /**
     * Constructs a parameterized Rectangle object
     *
     * @param xPosition int representation of the farthest left x-coordinate of the shape
     * @param yPosition int representation of the highest y-coordinate of the shape
     * @param width int representation of how far right the shape will go
     * @param height int representation of how far down the shape will go
     * @param color String representation of the fill color of the shape
     */
    public Rectangle(int xPosition, int yPosition, int width, int height, String color) {
        setXPosition(xPosition);
        setYPosition(yPosition);
        setWidth(width);
        setHeight(height);
        setColor(color);
    }

    /**
     * Constructs a soft-copy of a Rectangle object
     *
     * @param other Rectangle value that represents an original rectangle
     */
    public Rectangle(Rectangle other) {
    }

    /**
     * Overrides the .equals method to check whether the instance is a Rectangle that is not null
     *
     * @param other Object value of any object
     * @return boolean value whether it is an instance of a Rectangle
     */
    @Override
    public boolean equals(Object other) {
        if (other instanceof Rectangle) {
            if (other != null) {
                return true;
            }
        }
        return false;
    }

    /**
     * Overrides Shape's getVertices to be specific to creating a rectangle.
     *
     * @return Point[] array value of all Points (x,y) of the rectangle
     */
    @Override
    public Point[] getVertices() {
        vertices[0] = new Point(getXPosition(), getYPosition());
        vertices[1] = new Point(getXPosition() + getWidth(), getYPosition());
        vertices[2] = new Point(getXPosition() + getWidth(), getYPosition() + getHeight());
        vertices[3] = new Point(getXPosition(), getYPosition() + getHeight());

        return vertices;
    }
}

