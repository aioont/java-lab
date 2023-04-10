import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   { 
    int temp,i,num;
    int a[]=new int[20];
    System.out.println("Enter number to convert : ");
    Scanner sc = new Scanner(System.in);
    num=sc.nextInt();
    temp=num;
    for(i=0;temp>0;i++)
    {
      a[i]=temp%16;
      temp=temp/16;
    }
    System.out.println(num + " equivalent hexadecimal: ");
    for(i=i-1;i>=0;i--)
    {
      if(a[i]>=10)
        {
         char hexchar=(char)(a[i]+55);
       System.out.print(hexchar);
        }
       else
       System.out.print(a[i]);
    }
   }
 }
