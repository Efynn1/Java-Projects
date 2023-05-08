
package Task01_2;

/**
 *
 * @author Ethan Flynn
 */
public class ShapeCalculator1 {
    
    public static void main(String[] args) {
        
        Shape circle = new Circle(2.5);
        Shape rectangle = new Rectangle (12, 16.5);
        Shape square = new Square(2.5);
        
        circle.calculateArea();
        circle.printInfo();
        
        rectangle.calculateArea();
        rectangle.printInfo();
        
        square.calculateArea();
        square.printInfo();
        
        
    }
}
