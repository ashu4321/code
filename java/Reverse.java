import java.util.*;
 class Reverse{

     public static void main(String []args){
     
      Scanner sc=new Scanner(System.in);
         String str=sc.next();
      String rev=" ";
    int len=str.length();
      for(int i=len-1;i>=0;i--)
   {
          rev=rev+str.charAt(i);
        }
      if(str.equalsIgnoreCase(rev.trim()))
      {
        System.out.println("yes plaindrome");
      }
else{
  System.out.println("  not plaindrome");
}
         System.out.println("original string is ="+str+" "+"reversed String is="+rev);
    } 
}