import java.util.*;

 class Main
 {
   public static void main(String args[])
   { 
    int x,y,z;
    Scanner sc=new Scanner(System.in);
    double area=0;
    System.out.println("Enter 3 sides in ascending order : ");
    x=sc.nextInt();
    y=sc.nextInt();
    z=sc.nextInt();
    if((x+y)>z && (x+z)>y && (y+z)>x)
      {
       if(x==y && y==z)
         System.out.println("Equilateral");
       else if(x==y || x==z || y==z)
         System.out.println("Isosceles");
       else
         System.out.println("Scalar");
       double s=(x+y+z)/2;
       area = Math.sqrt(s*(s-x)*(s-y)*(s-z));
       System.out.println("Area = " + area);
       }
     else
       System.out.println("Not a triangle");
     
        
      
  
   }
 }
