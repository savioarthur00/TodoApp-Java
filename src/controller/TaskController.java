 
package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import model.Task;
import util.ConnectionFactory;


public class TaskController {
    
    public void save(Task task){
    
    String sql ="INSERT INTO tasks (idProject, name, description, completed, notes, deadline, createdAt , updatedAt) VALUES (?,?,?,?,?,?,?,?)";
    Connection c = null;
    PreparedStatement statement = null;
    
        try {
            c = ConnectionFactory.getConnection();
            statement = c.prepareStatement(sql);
            statement.setInt(1, task.getId_project());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setBoolean(4, task.isIsCompleted());
            statement.setString(5,task.getNotes());
            statement.setDate(6, new java.sql.Date(task.getDeadline().getTime()));
            statement.setDate(7, java.sql.Date.valueOf(java.time.LocalDate.now().format(DateTimeFormatter.ISO_DATE)));
            statement.setDate(8, java.sql.Date.valueOf(java.time.LocalDate.now().format(DateTimeFormatter.ISO_DATE)));
            
            
            statement.execute();
            
           
            
            
            
        } catch (Exception e) {
            throw new RuntimeException("Erro ao salvar tarefa" + e.getMessage(),e);
        }
        finally{
            ConnectionFactory.closeConnection( c,statement);
            
            
        }
    
    
    
    
    
    }
    
    public void update (Task task){
    
    String sql = "UPDATE tasks SET idProject= ?,name= ? ,description= ? ,completed= ? ,notes= ? ,deadline= ? , createdAt = ? , updatedAt = ? WHERE id = ?";
    
    Connection connection = null;
    PreparedStatement statement = null;
    
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, task.getId_project());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setBoolean(4, task.isIsCompleted());
            statement.setString(5,task.getNotes());
            statement.setDate(6, new java.sql.Date(task.getDeadline().getTime()));
            statement.setDate(7, new java.sql.Date(task.getCreatedAt().getTime()));
            statement.setDate(8, new java.sql.Date(task.getUpdatedAt().getTime()));
            statement.setInt(9, task.getId());
            statement.execute();
            
            
            
        } catch (Exception e) {
            throw new RuntimeException("Erro ao atualizar a tarefa");
        }
    
    
    }
    
    public void removeById(int taskId) {
    
        String sql = "DELETE FROM tasks WHERE id = ? ";
        
        Connection c = null;
        PreparedStatement statement = null;
        
        try {
            
            c = ConnectionFactory.getConnection();
            statement = c.prepareStatement(sql);
            statement.setInt(1, taskId);
            statement.execute();
            
            
        } catch (Exception e) {
            throw new RuntimeException("Erro ao deletar a tarefa");
        } finally {
            ConnectionFactory.closeConnection(c,statement);
        }
        
    
    
    }
    
    public List<Task> getAll(int idProject){
        
        String sql = "SELECT * FROM  tasks WHERE idProject = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        List<Task> tasks = new ArrayList<>();
        
        try {
            connection = ConnectionFactory.getConnection();
            statement= connection.prepareStatement(sql);
            statement.setInt(1, idProject);
            
            resultSet=  statement.executeQuery();
            
            
            while (resultSet.next()){
            Task task = new Task();
            task.setId(resultSet.getInt("id"));
            task.setId_project(resultSet.getInt("idProject"));
            task.setName(resultSet.getString("name"));
            task.setDescription(resultSet.getString("description"));
            task.setNotes(resultSet.getString("notes"));
            task.setIsCompleted(resultSet.getBoolean("completed"));
            task.setDeadline(resultSet.getDate("deadline"));
            task.setCreatedAt(resultSet.getDate("createdAt"));
            task.setUpdatedAt(resultSet.getDate("updatedAt"));
            
            tasks.add(task);
            
            }
            
            
        } catch (Exception e) {
            throw new RuntimeException("Erro ao inserir a tarefa" +e);
        }
        
        finally{
        ConnectionFactory.closeConnection(connection,statement);
        
        
        }
        return tasks;
        
        
        
    }
    
    
    
}
