package dao;
import java.sql.*;
public class DBService {
  private static Connection con;  
  static {
    try{  
     Class.forName("com.mysql.jdbc.Driver");
     String url = "jdbc:mysql://localhost:3306/mydb";
     String user = "root";
     String pass = "root";
     con = DriverManager.getConnection(url, user, pass);
    }catch(Exception e) {
      System.out.println("Connection Error : "+e.getMessage());
    }
  }
  
  public static Connection getConnection() {
   return con;
  }
  
  public static int updateData(String dmlQuery)  {
      try {
      Statement st = con.createStatement();
      int ur = st.executeUpdate(dmlQuery);
      return ur;
      }catch(Exception e){
       System.out.println("UPDATE ERROR : "+e.getMessage());
       return -1;
      }
  }
  
  public static ResultSet selectData(String projectQuery){
      try {
      Statement st = con.createStatement();
      ResultSet rs = st.executeQuery(projectQuery);
      return rs;
      }catch(Exception e){
       System.out.println("SELECT ERROR : "+e.getMessage());
       return null;
      }
  }
  
  public static PreparedStatement getPreparedStatement(String blankQuery){
   try {
      PreparedStatement pst = con.prepareStatement(blankQuery);
      return pst;
      }catch(Exception e){
       System.out.println("PREPARED STATEMENT ERROR : "+e.getMessage());
       return null;
      }
  }
}
