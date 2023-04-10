import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   { 
    int n,m,i,count=0;
    int a[]=new int[10];
    int b[]=new int[10];
    int c[]=new int[20];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of 1st array :");
    n=sc.nextInt();
    System.out.println("Enter size of 2nd array :");
    m=sc.nextInt();
    System.out.println("Enter elements of 1st array :");
    for(i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
      c[i]= a[i];
      count++;
    }
    System.out.println("Enter elements of 2nd array :");
    for(i=0;i<m;i++)
    {
      b[i]=sc.nextInt();
      c[count++]= b[i]; 
    }
    System.out.println("count: "+count);
    System.out.println("Append array ");
    
    for(i=0;i<m+n;i++)
      System.out.println(c[i]+ " ");
    
    
   }
 }
