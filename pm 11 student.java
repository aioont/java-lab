import java.util.*;

class Student 
  {
  String name1,dept,clg;
  int rollno;
  void read()
  {
    Scanner sn=new Scanner(System.in);
    System.out.println("Enter rollno: ");
    rollno=sn.nextInt();
    System.out.println("Enter name: ");
    name1=sn.next();
    System.out.println("Enter department: ");
    dept=sn.next();
    System.out.println("Enter college: ");
    clg=sn.next(); 
  }
  void display()
   {
    System.out.println("Roll number = "+ rollno);
    System.out.println("Name = "+ name1);
    System.out.println("Department = "+ dept);
    System.out.println("College = "+ clg);
   }
  }
class Result extends Student 
{
  int mark[]=new int[5];
  int i,sum=0;
  float avg;
  void mark()
  {
    Scanner sn=new Scanner(System.in);
    System.out.println("Enter 5 subjects mark : ");
    for(i=0;i<5;i++)
      {
        mark[i]=sn.nextInt();
        sum=sum+mark[i];       
      }
     avg=(float)sum/5;
   }
   void markDisplay()
   {
    System.out.println("Total mark = "+sum);
    System.out.println("Average = "+ avg);
    if(avg>80)
      System.out.println("Grade A");
    else if(avg>60 && avg<=80)
      System.out.println("Grade B");
    else if(avg>40 && avg<=60)
      System.out.println("Grade C");
    else 
      System.out.println("Grade F");
   }
}

 class Dcoder
 {
   public static void main(String args[])
   { 
    Result r=new Result();
    r.read();
    r.mark();
    r.display();
    r.markDisplay();
   }
 }
