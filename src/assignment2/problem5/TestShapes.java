package assignment2.problem5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestShapes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.println("Enter C for Circle");
            System.out.println("Enter R for Rectangle");
            System.out.println("Enter T for Triangle");

            String choice = scanner.next();

            switch (choice) {
                case "C":
                    System.out.println("Enter the radius of the Circle:");
                    double radius;
                    while(true){
                        try{
                            radius = scanner.nextDouble();
                            break;
                        }catch(InputMismatchException e){
                            System.out.println("Invalid input, Try again:");
                            scanner.nextLine();
                        }
                    }
                    Circle circle = new Circle(radius);
                    System.out.printf("The area of Circle is: %.2f%n", circle.computeArea());
                    break;

                case "R":
                    System.out.println("Enter the width of the Rectangle:");
                    double width;
                    while(true){
                        try{
                            width = scanner.nextDouble();
                            break;
                        }catch(InputMismatchException e){
                            System.out.println("Invalid input, Try again:");
                            scanner.nextLine();
                        }
                    }
                    System.out.println("Enter the height of the Rectangle:");
                    double length;
                    while(true){
                        try{
                            length = scanner.nextDouble();
                            break;
                        }catch(InputMismatchException e){
                            System.out.println("Invalid input, Try again:");
                            scanner.nextLine();
                        }
                    }
                    Rectangle rectangle = new Rectangle(width, length);
                    System.out.printf("The area of Rectangle is: %.2f%n", rectangle.computeArea());
                    break;

                case "T":
                    System.out.println("Enter the base of the Triangle:");
                    double base;
                    while(true){
                        try{
                            base = scanner.nextDouble();
                            break;
                        }catch(InputMismatchException e){
                            System.out.println("Invalid input, Try again:");
                            scanner.nextLine();
                        }
                    }
                    System.out.println("Enter the height of the Triangle:");
                    double height;
                    while(true){
                        try{
                            height = scanner.nextDouble();
                            break;
                        }catch(InputMismatchException e){
                            System.out.println("Invalid input, Try again:");
                            scanner.nextLine();
                        }
                    }

                    Triangle triangle = new Triangle(base, height);
                    System.out.printf("The area of Triangle is: %.2f%n", triangle.computeArea());
                    break;

                default:
                    System.out.println("Invalid input. Please enter C, R, or T.");
            }

            do {
                System.out.println("Do you want to continue (y/n) :");
                input = scanner.next();
            }while (!input.equalsIgnoreCase("y") && !input.equalsIgnoreCase("n"));

        } while (input.equalsIgnoreCase("y"));

        scanner.close();
    }
}
