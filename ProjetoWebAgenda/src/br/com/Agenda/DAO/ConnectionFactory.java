package br.com.Agenda.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	static String url = "jdbc:postgresql://localhost/A.JAVA21.Caelum";
    static String usuario = "postgres";
    static String senha = "postgres";
    static Connection con;
    
    public static Connection getConnection() throws SQLException {

        try{
            Class.forName("org.postgresql.Driver");
            if(con == null){
                con = DriverManager.getConnection(url,usuario,senha);
            }
            return con;
        }catch(ClassNotFoundException e){
            throw new SQLException(e.getMessage());
        }
    }
    
}
