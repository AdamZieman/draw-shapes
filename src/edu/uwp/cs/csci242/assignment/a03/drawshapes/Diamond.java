package edu.uwp.cs.csci242.assignment.a03.drawshapes;

/**
 *  Diamond class extends the Shape class to create a Diamond object.
 *  <p>
 *      This class extends Shape class, therefore inheriting all of its public constructors and methods.
 *      Has a parameterized constructor, a soft-copy constructor, an overridden equals method, and a method to
 *      add the points (vertices) of the diamond.
 *  </p>
 *
 * @author Adam Zieman
 * @edu.uwp.cs.242.course CSCI 424 - Computer Science II
 * @edu.uwp.cs.242.section 001
 * @edu.uwp.cs.242.assignment 3
 * @bugs none
 */
public class Diamond extends Shape {
    // Creates a Point[] variable with 4 indexes
    private Point[] vertices = new Point[4];

    /**
     * Constructs a parameterized Diamond object
     *
     * @param xPosition int representation of the farthest left x-coordinate of the shape
     * @param yPosition int representation of the highest y-coordinate of the shape
     * @param width int representation of how far right the shape will go
     * @param height int representation of how far down the shape will go
     * @param color String representation of the fill color of the shape
     */
    public Diamond(int xPosition, int yPosition, int width, int height, String color) {
        setXPosition(xPosition);
        setYPosition(yPosition);
        setWidth(width);
        setHeight(height);
        setColor(color);
    }

    /**
     * Constructs a soft-copy of a Diamond object
     *
     * @param other Rectangle value that represents an original diamond
     */
    public Diamond(Rectangle other) {
    }

    /**
     * Overrides the .equals method to check whether the instance is a Diamond that is not null
     *
     * @param other Object value of any object
     * @return boolean value whether it is an instance of a diamond
     */
    @Override
    public boolean equals(Object other) {
        if (other instanceof Diamond) {
            if (other != null) {
                return true;
            }
        }
        return false;
    }

    /**
     * Overrides Shape's getVertices to be specific to creating a Diamond.
     *
     * @return Point[] array value of all Points (x,y) of the diamond
     */
    @Override
    public Point[] getVertices() {
        vertices[0] = new Point(getXPosition() + getWidth() / 2, getYPosition());
        vertices[1] = new Point(getXPosition() + getWidth(), getYPosition() + getHeight() / 2);
        vertices[2] = new Point(getXPosition() + getWidth() / 2, getYPosition() + getHeight());
        vertices[3] = new Point(getXPosition(), getYPosition() + getHeight() / 2);

        return vertices;
    }
}
