import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   { 
    int sum=0,r,c,i,j;
    int mat[][]=new int[10][10];
    int tra[][]=new int[10][10];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of row and column  : ");
    r=sc.nextInt();
    c=sc.nextInt();
    System.out.println("r="+r+"c="+c);
    if(r!=c)
      System.out.println("only square matrix");
    
    else 
    {
      System.out.println("Enter elements : ");
      for(i=0;i<r;i++)
      {
        for(j=0;j<c;j++)
        {
          mat[i][j] = sc.nextInt();
          tra[j][i] = mat[i][j];
          if(i==j)
             sum+=mat[i][j];
        }
      }
      
      System.out.println("Sum = "+ sum);
      System.out.println("Transpose = ");
      for(i=0;i<r;i++)
      {
        for(j=0;j<c;j++)
        {
          System.out.print(tra[i][j] + "   ");
        }
      System.out.println("");
      }
      
    }
    
   }
 }
