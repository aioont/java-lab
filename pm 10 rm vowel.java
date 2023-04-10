import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   { 
    char v[] = new char[5];
    String str= "";
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string : ");
    str=sc.nextLine();
    for(int i=0;i<str.length();i++)
      {
        if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
           continue;
        else 
         System.out.print(str.charAt(i));
      }
  
   }
 }
