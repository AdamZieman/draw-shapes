package edu.uwp.cs.csci242.assignment.a03.drawshapes;

/**
 * Shape class is the parent class to all shape types.
 * <p>
 *     Shape class is the parent class to Triangle, Rectangle, Diamond, Hexagon, and Octagon class. This class contains
 *     the class variables, which will be present in all children classes, a general constructor, and a constructor
 *     containing all class variables. This class contains a toString method that is used by this class and all children
 *     to print the x/y-coordinates, depth/height, and color of the shapes. There is a method to check whether the shape
 *     is inside of the required parameters. And lastly, getters and setters for all the class variables.
 * </p>
 *
 * @author Adam Zieman
 * @edu.uwp.cs.242.course CSCI 424 - Computer Science II
 * @edu.uwp.cs.242.section 001
 * @edu.uwp.cs.242.assignment 3
 * @bugs none
 */
public class Shape {
    private int xPosition;
    private int yPosition;
    private int width;
    private int height;
    private String color;
    private Point[] vertices;

    /**
     * Parameterized constructor of Shape which allows for the creation of a Shape object.
     *
     * @param xPosition int representation of the farthest left x-coordinate of the shape
     * @param yPosition int representation of the highest y-coordinate of the shape
     * @param width int representation of how far right the shape will go
     * @param height int representation of how far down the shape will go
     * @param color String representation of the fill color of the shape
     */
    public Shape (int xPosition, int yPosition, int width, int height, String color) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.width = width;
        this.height = height;
        setColor(color);
    }

    /**
     * Default constructor of Shape, utilized by the children classes.
     */
    public Shape() {}

    /**
     * Overrides the toString to output useful information regarding the Shape object and all children classes.
     *
     * @return String value of the (x,y) starting coordinate, width, height, and color
     */
    @Override
    public String toString() {
        return " at (" + getXPosition() + ", " + getYPosition() + ") with width=" +
                getWidth() + ", height=" + getHeight() + ", and color=" + getColor();
    }

    /**
     * Method takes input to compare a Shape object (or child object) to return a boolean whether the object extends
     * past the max X, Y values.
     *
     * @param maxX int value of the farthest to the right, x-coordinate
     * @param maxY int value of the farthest to the bottom, y-coordinate
     * @return boolean value of whether the Shape object is less than or equal to the max values
     */
    public boolean isInsideBox(int maxX, int maxY) {
        if (getXPosition() < 0) {
            return false;
        } else if (getXPosition() + width > maxX) {
            return false;
        } else if (getYPosition() < 0) {
            return false;
        } else if (getYPosition() + height > maxY) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Returns the vertices
     *
     * @return Point[] value of the vertices
     */
    public Point[] getVertices() {
        return vertices;
    }

    /**
     * Returns the x-coordinate of the shape
     *
     * @return int value of x-coordinate
     */
    public int getXPosition() {
        return xPosition;
    }

    /**
     * Returns the y-coordinate of the shape
     *
     * @return int value of y-coordinate
     */
    public int getYPosition() {
        return yPosition;
    }

    /**
     * Returns the width of the shape
     *
     * @return int value of the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * Returns the height of the shape
     *
     * @return int value of the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * Returns the color of the shape
     *
     * @return String value of the color
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the x-coordinate of the shape
     *
     * @param xPosition int value of the shape's x-coordinate
     */
    public void setXPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    /**
     * Sets the y-coordinate of the shape
     *
     * @param yPosition int value of the shape's y-coordinate
     */
    public void setYPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    /**
     * Sets the width of the shape
     *
     * @param width int value of the shape's width
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Sets the height of the shape
     *
     * @param height int value of the shape's height
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Sets the color of the shape
     * <p>
     *     Sets the color of the shape to blue, green, yellow, red, white, or gray. If any other color is input,
     *     a message will be printed to the terminal, indicating and area and set the shape's color to white by default.
     * </p>
     *
     * @param color String value of the shape's color
     */
    public void setColor(String color) {
        if (color == "blue" || color == "green" || color == "yellow" ||
                color == "red" || color == "white" || color == "gray") {
            this.color = color;
        } else {
            this.color = "white";
            System.out.println(color + " is an invalid color selection!" +
                    " Setting color to white...");
        }
    }
}
