import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   { 
     int temp;
    int a,b,num1,num2;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter two no :");
    a=sc.nextInt();
    b=sc.nextInt();
    num1=a;
    num2=b;
    while(b!=0) 
     {
       temp=b;
       b=a%b;
       a=temp;
     }
     int hcf=a;
     int lcm=(num1*num2)/hcf;
    System.out.println("HCF of " + num1 + "&"+ num2 + "=" + hcf);
    System.out.println("LCM of "+ num1 + "&" + num2 + "=" + lcm);
   }
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
