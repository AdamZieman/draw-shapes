package edu.uwp.cs.csci242.assignment.a03.drawshapes;

/**
 *  Octagon class extends the Shape class to create an Octagon object.
 * <p>
 *     This class extends Shape class, therefore inheriting all of its public constructors and methods.
 *     Has a parameterized constructor, a soft-copy constructor, an overridden equals method, and a method to
 *     add the points (vertices) of the octagon.
 * </p>
 *
 * @author Adam Zieman
 * @edu.uwp.cs.242.course CSCI 424 - Computer Science II
 * @edu.uwp.cs.242.section 001
 * @edu.uwp.cs.242.assignment 3
 * @bugs none
 */
public class Octagon extends Shape {
    // Creates a Point[] variable with 8 indexes
    private Point[] vertices = new Point[8];

    /**
     * Constructs a parameterized Octagon object
     *
     * @param xPosition int representation of the farthest left x-coordinate of the shape
     * @param yPosition int representation of the highest y-coordinate of the shape
     * @param width int representation of how far right the shape will go
     * @param height int representation of how far down the shape will go
     * @param color String representation of the fill color of the shape
     */
    public Octagon(int xPosition, int yPosition, int width, int height, String color) {
        setXPosition(xPosition);
        setYPosition(yPosition);
        setWidth(width);
        setHeight(height);
        setColor(color);
    }

    /**
     * Constructs a soft-copy of a Octagon object
     *
     * @param other Rectangle value that represents an original octagon
     */
    public Octagon(Octagon other) {
    }

    /**
     * Overrides the .equals method to check whether the instance is an Octagon that is not null
     *
     * @param other Object value of any object
     * @return boolean value whether it is an instance of an Octagon
     */
    @Override
    public boolean equals(Object other) {
        if (other instanceof Octagon) {
            if (other != null) {
                return true;
            }
        }
        return false;
    }

    /**
     * Overrides Shape's getVertices to be specific to creating an Octagon.
     *
     * @return Point[] array value of all Points (x,y) of the octagon
     */
    @Override
    public Point[] getVertices() {
        vertices[0] = new Point(getXPosition(), getYPosition() + getHeight() / 3);
        vertices[1] = new Point(getXPosition() + getWidth() / 3, getYPosition());
        vertices[2] = new Point(getXPosition() + 2 * getWidth() / 3, getYPosition());
        vertices[3] = new Point(getXPosition() + getWidth(), getYPosition() + getHeight() / 3);
        vertices[4] = new Point(getXPosition() + getWidth(), getYPosition() + 2 * getHeight() / 3);
        vertices[5] = new Point(getXPosition() + 2 * getWidth() / 3, getYPosition() + getHeight());
        vertices[6] = new Point(getXPosition() + getWidth() / 3, getYPosition() + getHeight());
        vertices[7] = new Point(getXPosition(), getYPosition() + 2 * getHeight() / 3);

        return vertices;
    }
}
