import java.util.Scanner;

interface Recyclable
{
    default  void  method()
    {
        System.out.println("GIVE PROPER INPUT");
    }
}
class fabric implements Recyclable
{
    public  String toString()
    {
        return "fabric recycled";
    }
}
class bottle implements Recyclable
{
    public  String toString()
    {
        return "bottle recycled";
    }
}
class paper implements Recyclable
{
    public  String toString()
    {
        return "paper recycled";
    }
}


public class prac3_2 {
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
         System.out.println("What do you want to recycle? Choose a number. ");
         System.out.println("1 - Clothes "); 
         System.out.println("2 - Bottles "); 
         System.out.println("3 - Newspapers "); 
         System.out.println("4 - Exit "); 
         fabric f=new fabric();
         bottle b=new bottle();
         paper p=new paper();
         int x;
        do{
            x=sc.nextInt();

        switch(x)
        {
            case 1:
            {
               
                System.out.println(f.toString());
                break;
            }
            case 2:
            {
               
                System.out.println(b.toString());
                break;
            }
            case 3:
            {
               
                System.out.println(p.toString());
                break;
            }
            case 4:
            {
                System.out.println("Thanks for coming...");
            }
            default:
                f.method();
          
        }
        }while(x!=4);
        System.out.println("23CE054 Vasu Kamani");
         
    }
    
}
