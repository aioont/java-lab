import java.util.*;

interface Volume {
  Scanner sn=new Scanner(System.in);
  public double pi=3.14;
  public void readData();
  public void dispVolume();
}

class Sphere implements Volume {
  public int r;
  public void readData(){
    System.out.println("Enter the radius : ");
    r=sn.nextInt();
  }
  public void dispVolume(){
    System.out.println("Volume of sphere = "+(4*pi*r*r*r)/3);
  }
}

class Cylinder implements Volume {
  public int r,h;
  public void readData(){
    System.out.println("Enter the radius and height : ");
    r=sn.nextInt();
    h=sn.nextInt();
  }
  public void dispVolume(){
    System.out.println("Volume of cylinder = "+(pi*r*r*h));
  }
}

 class Dcoder
 {
   public static void main(String args[])
   { 
     int r,h;
    Sphere s=new Sphere();
    Cylinder c=new Cylinder(); 
    System.out.println("Sphere");
    s.readData();
    s.dispVolume();
  
    System.out.println("Cylinder");
    c.readData();
    c.dispVolume();
    
   }
 }
