import java.util.*;
 class Complex {
   int real,img;
   Complex(int i,int r) 
   {
     real=i;
     img=r;
   }
   Complex addComp(Complex c1, Complex c2)
   {
   Complex sum=new Complex(0,0);
   sum.real=c1.real+c2.real;
   sum.img=c1.img+c2.img;
   return sum;
   }
 }
 class Dcoder
 {
   public static void main(String args[])
   { 
    int r,i;
    Scanner sn=new Scanner(System.in);
    System.out.println("Enter real and imaginery part of first complex number : ");
    r=sn.nextInt();
    i=sn.nextInt();
    Complex c1=new Complex(r,i);
    System.out.println("Complex number 1 : "+c1.real+"+"+c1.img+"i"); 
   
    System.out.println("Enter real and imaginery part of second complex number : ");
    r=sn.nextInt();
    i=sn.nextInt();
    Complex c2=new Complex(r,i);
    System.out.println("Complex number 2 : "+c2.real+"+"+c2.img+"i"); 
  
    Complex c3=new Complex(0,0);
    c3=c3.addComp(c1,c2);
    System.out.println("Sum of complex number : "+c3.real+" + " + c3.img + "i");
    
   }
 }
