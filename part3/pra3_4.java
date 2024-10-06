package part3;

import java.util.Scanner;

public class pra3_4 {
    double sum=0;
    public double calculate(int n){
        for(double i=1;i<=n;i++)
        {
            sum=sum+1/i;
        }
        return sum;
    }
}
