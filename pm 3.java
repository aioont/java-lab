import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   { 
    int n,temp,i,j;
    int a[]=new int[20];
    System.out.println("Enter no of elements : ");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    System.out.println("Enter " + n + " element : ");
    for(i=0;i<n-1;i++)
      a[i]=sc.nextInt();
    
    for(i=0;i<n-1;i++)
    {
     for(j=i+1;j<n;j++)
       {
         if(a[i]>a[j])
          {
           temp=a[i];
           a[i]=a[j];
           a[j]=temp;
          }
       }
     }
     System.out.println("Small = " + a[1]);
     System.out.println("Second largest = "+ a[n-2]);
      
    
    
   }
 }
