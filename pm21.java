import java.sql.*;
import java.util.*;

class Jdbc {
  public static void main(String args[]) throws SQLException {
    Statement smt;
    Connection con=null;
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
      smt=con.createStatement();
      Scanner sn=new Scanner(System.in);
      System.out.println("Enter your id, name, designation and department:");
      int id1=sn.nextInt();
      String name1, dsign1, dept1, sql;
      name1=sn.next();
      dsign1=sn.next();
      dept1=sn.next();
      sql="INSERT INTO employee VALUES ("+id1+",'"+name1+"','"+dsign1+"','"+dept1+"')";
      smt.executeUpdate(sql);
      String query="SELECT * FROM employee";
      ResultSet rs=smt.executeQuery(query); // change Result to ResultSet
      while(rs.next()) {
        int id=rs.getInt("id");
        String name=rs.getString("name");
        String dsign=rs.getString("dsign"); // correct column name
        String dept=rs.getString("dept");
        System.out.format("%d %s %s %s\n",id,name,dsign,dept); // print inside the while loop
      }
      smt.close();
    } catch(Exception e) {
      System.out.println(e);
    } finally {
      con.close();
    }
  }
}
