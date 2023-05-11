
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class ConnectionFactory {
    
        
    public static final String URL = "jdbc:mysql://localhost:3306/todoapp";
    public static final String USER ="root";
    public static final String PASS =""; 
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static Connection  getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL,USER,PASS);
            
        } catch (Exception e) {
            throw new RuntimeException("Erro na conex�o com o BD" + e);
        }
    
    } 
    
    public static void closeConnection(Connection connection){
        try {
            if(connection != null){
                connection.close();
            }
            
            
        } catch (Exception e) {
            throw new RuntimeException("Erro ao fechar BD");
            
        }
    
    
    }
    public static void closeConnection(Connection connection , PreparedStatement statement){
        try {
            if(connection != null){
                connection.close();
            }
            if(statement != null){
                statement.close();
            }
            
        } catch (Exception e) {
            throw new RuntimeException("Erro ao fechar BD");
            
        }
    
    
    }
    
    public static void closeConnection(Connection connection , PreparedStatement statement, ResultSet resultSet){
        try {
            if(connection != null){
                connection.close();
            }
            if(statement != null){
                statement.close();
            }
            if(resultSet != null){
                resultSet.close();
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro ao fechar BD");
            
        }
    
    
    }
    
    
    
}
