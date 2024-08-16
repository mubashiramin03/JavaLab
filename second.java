import java.util.Scanner;

public class second {
    public static void main(String args[]) {
        double radius, length, width, areaOfCircle, perimeterOfCircle, areaOfRectangle, perimeterOfRectangle;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle : ");
        radius = scanner.nextDouble();

        System.out.print("Enter the length and width of the rectangle : ");
        length = scanner.nextDouble();
        width = scanner.nextDouble();

        areaOfCircle = Math.PI * Math.pow(radius, 2);
        perimeterOfCircle = 2 * Math.PI * radius;
        areaOfRectangle = length * width;
        perimeterOfRectangle = 2 * (length + width);

        System.out.println("Area of Circle = " + areaOfCircle);
        System.out.println("Perimeter of Circle = " + perimeterOfCircle);
        System.out.println("Area of Rectangle = " + areaOfRectangle);
        System.out.println("Perimeter of Rectangle = " + perimeterOfRectangle);
    }
}