
package br.com.lauto.integrador.db;

import java.sql.*;

public class DBManager {
    
    public static Connection conn;
    public static Statement st;
    
    private static final String url = "jdbc:mysql://localhost:3306/SascarIntegra?autoReconnect=true&useSSL=false";
    private static final String user = "root";
    private static final String passwd = "fvm1291";
    
    public static ResultSet runQuery(String query) throws SQLException{
        return st.executeQuery(query);
    }
    
    public DBManager() throws ClassNotFoundException, SQLException{
        
        Class.forName("com.mysql.jdbc.Driver");
        
        conn = DriverManager.getConnection(url, user, passwd);
        st = conn.createStatement();
    }
    
}
