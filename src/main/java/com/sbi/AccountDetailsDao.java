package com.sbi;

import java.sql.*;

public class AccountDetailsDao {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/mydb","root","Harry@12345");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from account_details where address = 'hyd' or address = 'mumbai';");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  "
                    + rs.getString(3) + " " + rs.getInt(4));
        }
        stmt.close();
        con.close();
    }
}
