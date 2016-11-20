
package tlkp;

public class Tochka {
    protected double x;
    protected double y;
    
    public Tochka(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    void print(){
        System.out.println("Tochka: " + "(" + x + ", " + y + ")");
    }
}
