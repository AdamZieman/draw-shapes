package edu.uwp.cs.csci242.assignment.a03.drawshapes;

public class DrawShapes {

    public static void main(String[] args) {
        ShapeDisplayer disp = new ShapeDisplayer();
        // Add valid triangles
        disp.addShape(new Triangle(10, 10, 10, 10, "white"));
        disp.addShape(new Rectangle(20, 20, 50, 50, "green"));
        disp.addShape(new Hexagon(25, 25, 40, 40, "blue"));
        disp.addShape(new Triangle(80, 259, 20, 40, "gray"));
        disp.addShape(new Rectangle(275, 275, 20, 20, "red"));
        disp.addShape(new Hexagon(100, 100, 200, 150, "yellow"));
        disp.addShape(new Octagon(85, 15, 105, 90, "red"));
        // Should not display
        disp.addShape(new Rectangle(100, 290, 20, 20, "red"));
        disp.addShape(new Hexagon(100, 290, 20, 20, "red"));

        // Should display, but should not be displayed in pink (should be one of the other colors).
        disp.addShape(new Rectangle(250, 50, 20, 20, "pink"));
        Rectangle r1 = new Rectangle(200, 250, 30, 50, "green");
        disp.addShape(r1);

        // Adam Zieman's shape
        disp.addShape(new Diamond(15, 150, 70, 140, "blue"));

        /**
         * Uncomment and execute thd following if statement after you indlude
         * contains() method in DrawShapes class as specified in Step 13 in problen description
         **/

        //Check if the arrayList contains Rectangle r1

        if (disp.contains(r1))
            System.out.println("Rectangle" + r1 + " is Present");
        else
            System.out.println("Rectangle" + r1 + " is NOT Present");

    }

}

