package Task01_2;

import java.util.Scanner;

/**
 *
 * @author Ethan Flynn
 */
public class ShapeCalculator2 {
    
    public static void main(String[] args) {
        
        System.out.println("Please Select a Shape: \n 1. Rectangle \n 2. Circle \n 3.Square");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        
        try {
            int option = Integer.parseInt(str.trim());
            switch (option) {
                case 1:
                    System.out.println("Input length: ");
                    str = scan.nextLine();
                    double length = Double.parseDouble(str);
                    System.out.println("Input width: ");
                    str = scan.nextLine();
                    double width = Double.parseDouble(str);
                    Rectangle Rec1 = new Rectangle(length, width);
                    
                    Rec1.calculateArea();
                    Rec1.printInfo();
                    break;
                case 2:
                    System.out.println("Input radius: ");
                    str = scan.nextLine();
                    double radius = Double.parseDouble(str);
                    Circle circle1 = new Circle(radius);
                    
                    circle1.calculateArea();
                    circle1.printInfo();
                    break;
                    
                case 3:
                    System.out.println("Input side length");
                    str = scan.nextLine();
                    double side = Double.parseDouble(str);
                    Square sq1 = new Square(side);
                    
                    sq1.calculateArea();
                    sq1.printInfo();
                    break;
                    
                default:
                    System.out.println("Wrong Input");
                    break;
            }
        
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Not an integer");
        }
    }
    
}
