import java.util.Scanner;

abstract class instrument{
    abstract void play();
    String what()
    {
        return "instrument";
    }
   abstract void adjust();
    
    
    

}

class wind extends instrument{
        void play()
        {
            System.out.println("Wind instrument played");
        }
        String what()
        { 
            System.out.println (super.what());
            return "wind";
        }
        void adjust()
        {
            System.out.println("instrument turned properly");
        }
}
class percussion extends instrument{
   
    void play()
    {
        System.out.println("percussion instrument played");
    }
    String what()
    {   System.out.println(super.what());
        return "percussion";
    }
    void adjust()
    {
        System.out.println("instrument turned properly");
    }
}
class stringed extends instrument{
    void play()
    {
        System.out.println("stringed instrument played");
    }
    String what()
    {   System.out.println(super.what());
        return "stringed";
    }
    void adjust()
    {
        System.out.println("instrument turned properly");
    }
}
class woodwine extends wind{
    void play()
    {   super.play();
        System.out.println("woodwine instrument played");
    }
    String what()
    {   
        System.out.println(super.what());
        return "woodwine";
    }
   
}
class brass extends wind{
    void play()
    {   super.play();
        System.out.println("brass instrument played");
    }
    void adjust()
    {   super.adjust();
        System.out.println("instrument turned properly");
    }
}

public class pra3_1{
    
    public static void main(String[] args) {
        
    Scanner sc =new Scanner(System.in);
        percussion p=new percussion();
        stringed s=new stringed();
        woodwine w=new woodwine();
        brass b=new brass();
        System.out.println("ENTER 1 FOR WOODWINE:");
        System.out.println("ENTER 2 FOR BRASS:");
        System.out.println("ENTER 3 FOR PERCUSSION:");
        System.out.println("ENTER 4 FOR STRINGED:");
        int x=sc.nextInt();
        switch(x)
        {
            case 1:
            {
                w.play();
                String s1= w.what();
                System.out.println(s1);
                break;
            }
            case 2:
            {
                b.play();
                b.adjust();
                break;
            }
            case 3:
            {
                p.play();
                p.adjust();
               String s1= p.what();
               System.out.println(s1);
               break;
            }
            case 4:
            {
                s.play();
                s.adjust();
                 String s1=s.what();
                 System.out.println(s1);
            }
        }
       System.out.println("23CE054 Vasu Kamani");
    }
}


