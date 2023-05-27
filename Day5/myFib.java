import java.util.*;
public class myFib {
   
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println("Fibonacci series is");
        for(int i=0; i<=a; ++i)
        {
            System.out.print(myFibb(i)+"\t");
        }
    }

    public static int myFibb(int n)
    {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        
        return myFibb(n-1) + myFibb(n-2);
    }

}
