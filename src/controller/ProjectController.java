
package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import model.Project;
import util.ConnectionFactory;

/**
 *
 * @author Arthurcc
 */
public class ProjectController {

      
    
    public void save(Project project){
    
    String sql ="INSERT INTO projects (name, description, createdAt , updatedAt) VALUES (?,?,?,?)";
    Connection c = null;
    PreparedStatement statement = null;
    
        try {
            c = ConnectionFactory.getConnection();
            statement = c.prepareStatement(sql);
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, java.sql.Date.valueOf(java.time.LocalDate.now()));
            statement.setDate(4, java.sql.Date.valueOf(java.time.LocalDate.now()));
                       
            
            statement.execute();           
           
            
            
            
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(),e);
        }
        finally{
            ConnectionFactory.closeConnection( c,statement);
            
            
        }
    
    
    
    
    
    }
    
    public void update (Project project){
    
    String sql = "UPDATE projects SET name= ? ,description= ? , createdAt = ? , updatedAt = ? WHERE id = ?";
    
    Connection connection = null;
    PreparedStatement statement = null;
    
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new java.sql.Date (project.getCreatedAt().getTime()));
            statement.setDate(4, new java.sql.Date (project.getUpdatedAt().getTime()));
            
          
            statement.setInt(5, project.getId());
            statement.execute();
            
            
            
        } catch (Exception e) {
            throw new RuntimeException("Erro ao atualizar projeto");
        }
    
    
    }
    
    public void removeById(int project_id) throws SQLException{
    
        String sql = "DELETE FROM projects WHERE id = ? ";
        
        Connection c = null;
        PreparedStatement statement = null;
        
        try {
            
            c = ConnectionFactory.getConnection();
            statement = c.prepareStatement(sql);
            statement.setInt(1, project_id);
            statement.execute();
            
            
        } catch (Exception e) {
            throw new RuntimeException("Erro ao deletar projeto");
        } finally {
            ConnectionFactory.closeConnection(c,statement);
        }
        
    
    
    }
    
    public List<Project> getAll(){
        
        String sql = "SELECT * FROM  projects";
        
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        List<Project> project = new ArrayList<>();
        
        try {
            connection = ConnectionFactory.getConnection();
            statement= connection.prepareStatement(sql);
            
            
            resultSet=  statement.executeQuery();
            
            
            while (resultSet.next()){
            Project project1 = new Project();
            project1.setId(resultSet.getInt("id"));
            project1.setName(resultSet.getString("name"));
            project1.setDescription(resultSet.getString("description"));
            project1.setCreatedAt(resultSet.getDate("createdAt"));
            project1.setUpdatedAt(resultSet.getDate("updatedAt"));
            
            project.add(project1);
            
            }
            
            
        } catch (Exception e) {
            throw new RuntimeException("Erro ao inserir a tarefa");
        }
        
        finally{
        ConnectionFactory.closeConnection(connection,statement);
        
        
        }
        return project;
        
        
        
    }
    
    
    
}


