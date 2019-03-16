import java.util.Scanner;

public class abc{

     public static void main(String []args){
     int i=1,fact=1;
       System.out.println("enter number");
       Scanner sc=new Scanner(System.in);
       
       int d=sc.nextInt();
       System.out.println("enter String");
       Scanner sc1=new Scanner(System.in);
       String s=sc1.next();
       System.out.println(s);

       while(i<=d)
       {
           
          fact=fact*i;
          i++;
           
       }
       System.out.println(fact);
       System.out.println();
     }
}