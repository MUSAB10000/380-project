import java.sql.*;
public class GFG {
 public static void main(String arg[]) {
 Connection connection = null;
 try {
 Class.forName("com.mysql.cj.jdbc.Driver");
 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","mydbuser", "mydbuser"); //change the //localhost:3306/mydb
 Statement statement = connection.createStatement();
 ResultSet resultSet = statement.executeQuery("select * from designation");
 int code;
 String title;
 while (resultSet.next()) {
 code = resultSet.getInt("code");
 title = resultSet.getString("title").trim();
 System.out.println("Code : " + code + " Title : " + title);
 }
 resultSet.close();
 statement.close();
 connection.close();
 }
 catch (Exception exception) {
 System.out.println(exception);
 }
 } // function ends
} // class ends 
