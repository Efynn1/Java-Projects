package Task01_2;

/**
 *
 * @author Ethan Flynn
 */
public class Square extends Rectangle {
    
    double side;
    
    public Square(double side) {
        super(side);
        this.side = side;
    }
    
    @Override
    public void calculateArea() {
        this.area = this.side * this.side;
    }
    
}
