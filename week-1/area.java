import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a Shape:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");
        System.out.println("4. Triangle");
        System.out.println("5. Parallelogram");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                double circleArea = Math.PI * r * r;
                System.out.println("Area of Circle = " + circleArea);
                break;

            case 2:
                System.out.print("Enter length: ");
                double length = sc.nextDouble();
                System.out.print("Enter breadth: ");
                double breadth = sc.nextDouble();
                double rectangleArea = length * breadth;
                System.out.println("Area of Rectangle = " + rectangleArea);
                break;

            case 3:
                System.out.print("Enter side: ");
                double side = sc.nextDouble();
                double squareArea = side * side;
                System.out.println("Area of Square = " + squareArea);
                break;

            case 4:
                System.out.print("Enter base: ");
                double base = sc.nextDouble();
                System.out.print("Enter height: ");
                double height = sc.nextDouble();
                double triangleArea = 0.5 * base * height;
                System.out.println("Area of Triangle = " + triangleArea);
                break;

            case 5:
                System.out.print("Enter base: ");
                double b = sc.nextDouble();
                System.out.print("Enter height: ");
                double h = sc.nextDouble();
                double parallelogramArea = b * h;
                System.out.println("Area of Parallelogram = " + parallelogramArea);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}