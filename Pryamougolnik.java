
package tlkp;

public class Pryamougolnik extends Kvadrat{
    
    public Pryamougolnik(double x, double y, double a, double b, double c, double l, double k, double z) {
        super(x, y, a, b, c, l, k, z);
    }
    
   public double Length(){
        super.length1 = Math.sqrt((super.a-super.x)*(super.a-super.x) + (super.b-super.y)*(super.b-super.y));
        super.length2 = Math.sqrt((super.c-super.a)*(super.c-super.a) + (super.l-super.b)*(super.l-super.b));
        super.length3 = Math.sqrt((super.k-super.c)*(super.k-super.c) + (super.z-super.l)*(super.z-super.l));
        super.length4 = Math.sqrt((super.x-super.k)*(super.x-super.k) + (super.y-super.z)*(super.y-super.z));
        
        return super.length1;
    }
   
    void print(){
        if(super.length1 == super.length3 || super.length2 == super.length4){
          System.out.println("Pryamougolnik: " + "(" + super.x + ", " + super.y + "), " + "(" + super.a + ", " + super.b + ") " + "(" + c + ", " + l + "), " + "(" + k + ", " + z + ") " + "with length: " + super.length1 + " and " + super.length2);  
        } else {
            System.out.println("Pryamougolnik: " + "(" + super.x + ", " + super.y + "), " + "(" + super.a + ", " + super.b + ") " + "(" + c + ", " + l + "), " + "(" + k + ", " + z + ") " + "Это не прямоугольник!!!");
        }
    }
}
