package edu.uwp.cs.csci242.assignment.a03.drawshapes;

/**
 * Hexagon class extends the Shape class to create a Hexagon object.
 * <p>
 *     This class extends Shape class, therefore inheriting all of its public constructors and methods.
 *     Has a parameterized constructor, a soft-copy constructor, an overridden equals method, and a method to
 *     add the points (vertices) of the hexagon.
 * </p>
 *
 * @author Adam Zieman
 * @edu.uwp.cs.242.course CSCI 424 - Computer Science II
 * @edu.uwp.cs.242.section 001
 * @edu.uwp.cs.242.assignment 3
 * @bugs none
 */
public class Hexagon extends Shape {
    // Creates a Point[] variable with 6 indexes
    private Point[] vertices = new Point[6];

    /**
     * Constructs a parameterized Hexagon object
     *
     * @param xPosition int representation of the farthest left x-coordinate of the shape
     * @param yPosition int representation of the highest y-coordinate of the shape
     * @param width int representation of how far right the shape will go
     * @param height int representation of how far down the shape will go
     * @param color String representation of the fill color of the shape
     */
    public Hexagon(int xPosition, int yPosition, int width, int height, String color) {
        setXPosition(xPosition);
        setYPosition(yPosition);
        setWidth(width);
        setHeight(height);
        setColor(color);
    }

    /**
     * Constructs a soft-copy of a Hexagon object
     *
     * @param other Rectangle value that represents an original hexagon
     */
    public Hexagon(Hexagon other) {
    }

    /**
     * Overrides the .equals method to check whether the instance is a Hexagon that is not null
     *
     * @param other Object value of any object
     * @return boolean value whether it is an instance of a Hexagon
     */
    @Override
    public boolean equals(Object other) {
        if (other instanceof Hexagon) {
            if (other != null) {
                return true;
            }
        }
        return false;
    }

    /**
     * Overrides Shape's getVertices to be specific to creating a Hexagon.
     *
     * @return Point[] array value of all Points (x,y) of the hexagon
     */
    @Override
    public Point[] getVertices() {
        // top center
        vertices[0] = new Point(getXPosition() + getWidth() / 2, getYPosition());
        // top right
        vertices[1] = new Point(getXPosition() + getWidth(), getYPosition() + getHeight() / 3);
        // bottom right
        vertices[2] = new Point(getXPosition() + getWidth(), getYPosition() + 2 * getHeight() / 3);
        // bottom center
        vertices[3] = new Point(getXPosition() + getWidth() / 2, getYPosition() + getHeight());
        // bottom left
        vertices[4] = new Point(getXPosition(), getYPosition() + 2 * getHeight() / 3);
        // top left
        vertices[5] = new Point(getXPosition(),getXPosition() + getHeight() / 3);

        return vertices;
    }
}
