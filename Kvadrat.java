
package tlkp;

public class Kvadrat extends Liniya{
    protected double c;
    protected double l;
    protected double k;
    protected double z;
    protected double length1;
    protected double length2;
    protected double length3;
    protected double length4;
                            
    public Kvadrat(double x, double y, double a, double b, double c, double l, double k, double z) {
        super(x, y, a, b);
        this.c = c;
        this.l = l;
        this.k = k;
        this.z = z;
    }
    
    public double Length(){
        length1 = Math.sqrt((super.a-super.x)*(super.a-super.x) + (super.b-super.y)*(super.b-super.y));
        length2 = Math.sqrt((c-super.a)*(c-super.a) + (l-super.b)*(l-super.b));
        length3 = Math.sqrt((k-c)*(k-c) + (z-l)*(z-l));
        length4 = Math.sqrt((super.x-k)*(super.x-k) + (super.y-z)*(super.y-z));
        
        return length1;
    }
    
    void print(){
        if(length1 == length2 || length2 == length3 || length3 == length4){
          System.out.println("Kvadrat: " + "(" + super.x + ", " + super.y + "), " + "(" + super.a + ", " + super.b + ") " + "(" + c + ", " + l + "), " + "(" + k + ", " + z + ") " + "with length: " + length1);  
        } else {
            System.out.println("Kvadrat: " + "(" + super.x + ", " + super.y + "), " + "(" + super.a + ", " + super.b + ") " + "(" + c + ", " + l + "), " + "(" + k + ", " + z + ") " + "Это не квадрат!!!");
        }
    }
}
