import part3.pra3_4;

import java.util.Scanner;
public class pra3_4_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int x=sc.nextInt();
        pra3_4 p=new pra3_4();

        System.out.println("Harmonic sum:="+p.calculate(x));
        System.out.println("23Ce054 Vasu Kamani");
    }
}
