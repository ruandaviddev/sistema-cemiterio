/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Váleria Matias
 */
public class ConnectionFactory {
    private static final String DRIVER = "org.mariadb.jdbc.Driver";
    private static final String URL = "jdbc:mariadb://localhost:3306/sistema_cemiterio";
    private static final String USER = "root";
    private static final String PASS = "#S3nh4$D1f1c1l#";

    public static Connection getConnection(){
    
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL,USER,PASS);
            
        } catch (ClassNotFoundException  | SQLException ex) {
            throw new RuntimeException("Erro na conexão",ex);
        }
    
    }

}
