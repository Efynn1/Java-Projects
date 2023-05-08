package Task01_2;

/**
 *
 * @author Ethan Flynn
 */
public class Rectangle extends Shape
{
    
    double length, width;
    
    
    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    public Rectangle(double sidelength){
        super("Square");
        length = sidelength;
        width = sidelength;
    }
    
    @Override
    public void calculateArea() {
        this.area = width * length;
    }
    
}
