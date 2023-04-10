import java.util.*;
class Program1 {
public static void main(String args[]) {
   int a,b;
   float div;
   a=Integer.parseInt(args[0]);
   b=Integer.parseInt(args[1]);
   System.out.println("Sum of "+a+" and "+b+" = "+(a+b));
System.out.println("Difference =  "+(a-b));
System.out.println("Product = "+(a*b));
div=(float)a/b;
System.out.println("Division = "+ (div));
System.out.println("Remainder = "+(a%b));
}
}