
package tlkp;

public class TLKP {

    public static void main(String[] args) {
        Tochka newTochka = new Tochka(3, 4);
        newTochka.print();
        Liniya newLin = new Liniya(5,6,7,1);
        newLin.Length();
        newLin.print();
        Kvadrat newkvad = new Kvadrat(1,1,3,1,3,3,1,3);
        newkvad.Length();
        newkvad.print();
        Pryamougolnik newpr = new Pryamougolnik(1,1,4,1,4,3,1,3);
        newpr.Length();
        newpr.print();
    } 
}
