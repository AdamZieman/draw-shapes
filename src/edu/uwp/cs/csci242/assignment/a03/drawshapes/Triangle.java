package edu.uwp.cs.csci242.assignment.a03.drawshapes;

/**
 * Triangle class extends the Shape class to create a Triangle object.
 * <p>
 *     This class extends Shape class, therefore inheriting all of its public constructors and methods.
 *     Has a parameterized constructor, a soft-copy constructor, an overridden equals method, and a method to
 *     add the points (vertices) of the triangle.
 * </p>
 *
 * @author Adam Zieman
 * @edu.uwp.cs.242.course CSCI 424 - Computer Science II
 * @edu.uwp.cs.242.section 001
 * @edu.uwp.cs.242.assignment 3
 * @bugs none
 */
public class Triangle extends Shape {
    // Creates a Point[] variable with 3 indexes
    private Point[] vertices = new Point[3];

    /**
     * Constructs a parameterized Triangle object
     *
     * @param xPosition int representation of the farthest left x-coordinate of the shape
     * @param yPosition int representation of the highest y-coordinate of the shape
     * @param width int representation of how far right the shape will go
     * @param height int representation of how far down the shape will go
     * @param color String representation of the fill color of the shape
     */
    public Triangle(int xPosition, int yPosition, int width, int height, String color) {
        setXPosition(xPosition);
        setYPosition(yPosition);
        setWidth(width);
        setHeight(height);
        setColor(color);
    }

    /**
     * Constructs a soft-copy of a Triangle object
     *
     * @param other Rectangle value that represents an original triangle
     */
    // A copy constructor
    public Triangle(Triangle other) {
    }

    /**
     * Overrides the .equals method to check whether the instance is a Triangle that is not null
     *
     * @param other Object value of any object
     * @return boolean value whether it is an instance of a Triangle
     */
    @Override
    public boolean equals(Object other) {
        if (other instanceof Triangle) {
            if (other != null) {
                return true;
            }
        }
        return false;
    }

    /**
     * Overrides Shape's getVertices to be specific to creating a Triangle.
     *
     * @return Point[] array value of all Points (x,y) of the Triangle
     */
    @Override
    public Point[] getVertices() {
        vertices[0] = new Point(getXPosition(), getYPosition());
        vertices[1] = new Point(getXPosition() + getWidth(), getYPosition() + getHeight());
        vertices[2] = new Point(getXPosition(), getYPosition() + getHeight());

        return vertices;
    }
}
