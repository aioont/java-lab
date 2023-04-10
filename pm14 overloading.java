import java.util.*;

 // Compiler version JDK 11.0.2
class Volume {
  double vol,a,b,c;
  void findVolume(double a){
    System.out.println("Volume of cube = " + (a*a*a));
  }
  void findVolume(double a, double b){
    System.out.println("Volume of cylinder = " + (3.14*a*a*b));
  }
  void findVolume(double a, double b, double c){
    System.out.println("Volume of rectangle = " + (a*b*c));
  }  
}

 class Dcoder
 {  
   public static void main(String args[])
   { 
    double a,b,c;
    Scanner sn = new Scanner(System.in);
    Volume obj=new Volume();
     
    System.out.println("Enter side of cube : ");
    a=sn.nextDouble();
    obj.findVolume(a);
    
    System.out.println("Enter len,wid,height of rect :  : ");
    a=sn.nextDouble();
    b=sn.nextDouble();
    c=sn.nextDouble();
    obj.findVolume(a,b,c);
    
    System.out.println("Enter radius and height of cylinder  : ");
    a=sn.nextDouble();
    b=sn.nextDouble();
    obj.findVolume(a,b);
      
   }
 }
