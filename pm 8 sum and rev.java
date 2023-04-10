import java.util.*;

 // Compiler version JDK 11.0.2
class sumrev{
  int sum=0,rev=0,digit=0;
  void sum(int num)
  {
    int temp=num;
    while(temp>0)
    {
      digit=temp%10;
      rev=rev*10+digit;
      sum=sum+digit;
      temp/=10;
    }
    System.out.println("Sum of "+num+" = "+sum);
    System.out.println("Reverse of "+num+" = "+rev);
   }
}
 class Dcoder
 {
   public static void main(String args[])
   { 
    int num;
    Scanner sn=new Scanner(System.in);
    System.out.println("Enter a number : ");
    num=sn.nextInt();
    sumrev obj=new sumrev();
    obj.sum(num);
   }
 }
