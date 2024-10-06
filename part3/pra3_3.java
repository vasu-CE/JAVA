import java.util.Scanner;

class Bottle{
    double volum;
    Bottle(double volum){
        this.volum = volum;
    }
    double retvol(){
        return volum;
    }
}

class SodaBottel extends Bottle
{
    String bottlName;
    SodaBottel(String temp,double volum){
        super(volum);
        bottlName = temp;
    }
    public String toString(){
        // System.out.println(super.retvol());
        return bottlName+ "," + volum + " litres";
        // return bottlName;
    }
}

public class pra3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in the name of the soda: ");
        String nameString = sc.nextLine();
        System.out.println("Type in the volume of the bottle: ");
        double volum = sc.nextDouble();
        SodaBottel objBottel = new SodaBottel(nameString,volum);
        System.out.println(objBottel);
        System.out.println("23ce054 Vasu Kamani");
    }
}
