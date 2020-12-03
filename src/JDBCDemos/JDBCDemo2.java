package JDBCDemos;

import java.sql.*;

public class JDBCDemo2 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

       // 1. Loading a driver
        Class.forName("com.mysql.cj.jdbc.Driver");

      //  2. Creating a connection
        String user = "root";
        String pass = "root";
        String url="jdbc:mysql://localhost:3306/9pmbatch";

        Connection con = DriverManager.getConnection(url,user,pass);

        // 3. Creating a statement

        Statement st = con.createStatement();

      //  4. Executing a query
        //  (select - DDL - data definition language)

       String sql = "Select * from student where rno=2";

       ResultSet rs = st.executeQuery(sql);

       while(rs.next())
       {
           System.out.print(rs.getInt("rno")+" ");
           System.out.print(rs.getString("name")+" ");
           System.out.print(rs.getString("branch")+" ");
           System.out.print(rs.getInt("marks"));
           System.out.println();
       }

        // close all opened connections

        st.close();
        con.close();



    }


}
