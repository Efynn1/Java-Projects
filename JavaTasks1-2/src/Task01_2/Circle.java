package Task01_2;

/**
 *
 * @author Ethan Flynn
 */
public class Circle extends Shape
{
    
    double radius;
    
    
    public Circle(double rad) {
        super("Circle");
        this.radius = rad;
    }

    @Override
    public void calculateArea() {
        this.area = radius * radius * Math.PI;
    }
    
}
