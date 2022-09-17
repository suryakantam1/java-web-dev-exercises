package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        AreaOfRectangle areaOfRectangle = new AreaOfRectangle();
        areaOfRectangle.calculateAreaOfRectangle();
    }

    public void calculateAreaOfRectangle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of the rectangle: ");
        double myRectangleLength = scanner.nextDouble();
        System.out.println("Please enter the width of the rectangle: ");
        double myRectangleWidth = scanner.nextDouble();
        double area = myRectangleLength * myRectangleWidth;
        System.out.println("The area of the rectangle having length "+ myRectangleLength + " and " + myRectangleWidth + " is: " + area);

    }
}
