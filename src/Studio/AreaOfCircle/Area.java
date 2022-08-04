package Studio.AreaOfCircle;

import java.util.Scanner;
//import Studio.AreaOfCircle.Circle;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double radius = input.nextDouble();
        Double newRadius = radius;
        if (newRadius > 0) {
            double area = Circle.getArea(radius);
            System.out.println("The area of a circle of radius " + radius + " is: " + area);
        } else if (newRadius.isNaN() || newRadius < 0) {
            System.out.println("Please enter a valid radius");
            input.close();
        }
    }
}
