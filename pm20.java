import java.io.*;

abstract class Shapes {
  double area;
  abstract void calculateArea();
}

class TwoDim extends Shapes {
  int x, y;
  void calculateArea() {
    System.out.println("\n2D shapes area");
  }
}

class ThreeDim extends Shapes {
  int x;
  void calculateArea() {
    System.out.println("\n3D shapes have surface area and volume");
  }
}

class Square extends TwoDim {
  void calculateArea() {
    try {
      super.calculateArea();
      DataInputStream in = new DataInputStream(System.in);
      System.out.print("Enter the side of Square : ");
      int n = Integer.parseInt(in.readLine());
      area = n * n;
      System.out.println("Area = " + area);
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}

class Triangle extends TwoDim {
  void calculateArea() {
    try {
      super.calculateArea();
      DataInputStream in = new DataInputStream(System.in);
      System.out.print("Enter the base of Triangle : ");
      int b = Integer.parseInt(in.readLine());
      System.out.print("Enter the height of Triangle : ");
      int h = Integer.parseInt(in.readLine());
      area = 0.5 * b * h;
      System.out.println("Area = " + area);
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}

class Cube extends ThreeDim {
  void calculateArea() {
    try {
      super.calculateArea();
      DataInputStream in = new DataInputStream(System.in);
      System.out.print("Enter the length of cube : ");
      int n = Integer.parseInt(in.readLine());

      area = 6 * n * n;

      System.out.println("Surface Area = " + area);
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}

class Sphere extends ThreeDim {
  void calculateArea() {
    try {
      super.calculateArea();
      DataInputStream in = new DataInputStream(System.in);
      System.out.println("Enter the radius of a sphere:");
      int n = Integer.parseInt(in.readLine());
      double area = 4 + 3.15 * 2 * n;
      System.out.println("Surface Area = " + area);
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}

class ShapesMain {
  public static void main(String[] args) {
    Square s = new Square();
    Cube c = new Cube();
    Triangle t = new Triangle();
    Sphere sp = new Sphere();

    s.calculateArea();
    c.calculateArea();
    t.calculateArea();
    sp.calculateArea();
  }
}
