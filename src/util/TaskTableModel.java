/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Task;

/**
 *
 * @author Arthurcc
 */
public class TaskTableModel extends AbstractTableModel{
    
    String[] columns = {"Nome","Descrição","Prazo","Tarefa Concluída ","Editar","Excluir"};
    List<Task> tasks = new ArrayList();

    @Override
    public int getRowCount() {
    return tasks.size();      
    
    }
    
    @Override
    public Class<?> getColumnClass(int ColumnIndex){
    
            if(tasks.isEmpty()){
                   return Object.class;
            }
            
            return this.getValueAt(0, ColumnIndex).getClass();
     
    }
    
    @Override
    public int getColumnCount() {
    return columns.length;
    
    
    }
    
       
    public boolean isCellEditable(int rowIndex,int columnIndex){
       
        return columnIndex==3;
    }
    
    @Override
    public String getColumnName(int columnIndex){
        return columns[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
    
        
        switch (columnIndex) {
            case 0:
                return tasks.get(rowIndex).getName();
                
            case 1:
               return tasks.get(rowIndex).getDescription();
            case 2:
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                return dateFormat.format(tasks.get(rowIndex).getDeadline());
            case 3:
                return tasks.get(rowIndex).isIsCompleted();
            case 4:
                return "";
            case 5:
                return "";
            default:
                return "Dados não encontrados";
                                          
                
        }
    
    }

    
    @Override
    public void setValueAt(Object value,int rowIndex,int columnIndex){
        
        tasks.get(rowIndex).setIsCompleted((boolean) value);
    }
    
    public String[] getColumns() {
        return columns;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
    
    
    
}
