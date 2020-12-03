package JDBCDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {

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
        //  (insert / update /delete - DML - data manupulation language)

        String sql = "insert into student values(2,'xyz','IT',78)";

        st.executeUpdate(sql);

        // close all opened connections

        st.close();
        con.close();



    }


}
