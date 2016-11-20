
package tlkp;

public class Liniya extends Tochka {
    protected double a;
    protected double b;
    protected double length;
    
    public Liniya(double x, double y, double a, double b) {
        super(x, y);
        this.a = a;
        this.b = b;
    }
    
    public double Length(){
        length = Math.sqrt((a-super.x)*(a-super.x) + (b-super.y)*(b-super.y));
        return length;
    }
    
    void print(){
        System.out.println("Liniya: " + "(" + super.x + ", " + super.y + "), " + "(" + a + ", " + b + ") " + "with length: " + length);
    }
}
