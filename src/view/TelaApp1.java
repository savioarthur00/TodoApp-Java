/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ProjectController;
import controller.TaskController;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import model.Project;
import model.Task;
import util.ButtonColumnCellRenderer;
import util.DeadlineColumnCellRenderer;
import util.TaskTableModel;

/**
 *
 * @author Arthurcc
 */
public class TelaApp1 extends javax.swing.JFrame {

    ProjectController projectController;
    TaskController taskController;
    
    DefaultListModel projectsModel;
    
    TaskTableModel tasksModel;
    
    
    public TelaApp1() {
        initComponents();
       
        initDataController();
        initComponentsModel();
        
         decorateTableTask();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPaneTasks = new javax.swing.JScrollPane();
        Jtable_task = new javax.swing.JTable();
        Toolbar_inicial = new javax.swing.JPanel();
        Panel_Adicionar_Project = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Panel_adicionar_tarefa = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        Panel_list_projects = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel7 = new javax.swing.JPanel();
        jPanelEmptyList = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        Jtable_task.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Jtable_task.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Descrição", "Prazo", "Tarefa Concluida"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Jtable_task.setRowHeight(50);
        Jtable_task.setSelectionBackground(new java.awt.Color(0, 102, 0));
        Jtable_task.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Jtable_task.setShowHorizontalLines(true);
        Jtable_task.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jtable_taskMouseClicked(evt);
            }
        });
        jScrollPaneTasks.setViewportView(Jtable_task);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Toolbar_inicial.setBackground(new java.awt.Color(0, 102, 51));

        javax.swing.GroupLayout Toolbar_inicialLayout = new javax.swing.GroupLayout(Toolbar_inicial);
        Toolbar_inicial.setLayout(Toolbar_inicialLayout);
        Toolbar_inicialLayout.setHorizontalGroup(
            Toolbar_inicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Toolbar_inicialLayout.setVerticalGroup(
            Toolbar_inicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 137, Short.MAX_VALUE)
        );

        Panel_Adicionar_Project.setBackground(java.awt.Color.white);
        Panel_Adicionar_Project.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setBackground(new java.awt.Color(0, 153, 102));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText("PROJETOS");

        jButton1.setBackground(new java.awt.Color(0, 153, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("+");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_Adicionar_ProjectLayout = new javax.swing.GroupLayout(Panel_Adicionar_Project);
        Panel_Adicionar_Project.setLayout(Panel_Adicionar_ProjectLayout);
        Panel_Adicionar_ProjectLayout.setHorizontalGroup(
            Panel_Adicionar_ProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Adicionar_ProjectLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        Panel_Adicionar_ProjectLayout.setVerticalGroup(
            Panel_Adicionar_ProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Adicionar_ProjectLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(Panel_Adicionar_ProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        Panel_adicionar_tarefa.setBackground(new java.awt.Color(255, 255, 255));
        Panel_adicionar_tarefa.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 0));
        jLabel2.setText("+ TAREFAS ");

        jButton2.setBackground(new java.awt.Color(0, 153, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("+");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel_adicionar_tarefaLayout = new javax.swing.GroupLayout(Panel_adicionar_tarefa);
        Panel_adicionar_tarefa.setLayout(Panel_adicionar_tarefaLayout);
        Panel_adicionar_tarefaLayout.setHorizontalGroup(
            Panel_adicionar_tarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_adicionar_tarefaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        Panel_adicionar_tarefaLayout.setVerticalGroup(
            Panel_adicionar_tarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_adicionar_tarefaLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(Panel_adicionar_tarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Panel_list_projects.setBackground(new java.awt.Color(255, 255, 255));
        Panel_list_projects.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jList1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jList1.setFixedCellHeight(30);
        jList1.setFixedCellWidth(30);
        jList1.setSelectionBackground(new java.awt.Color(0, 102, 51));
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout Panel_list_projectsLayout = new javax.swing.GroupLayout(Panel_list_projects);
        Panel_list_projects.setLayout(Panel_list_projectsLayout);
        Panel_list_projectsLayout.setHorizontalGroup(
            Panel_list_projectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_list_projectsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        Panel_list_projectsLayout.setVerticalGroup(
            Panel_list_projectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_list_projectsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanelEmptyList.setMinimumSize(new java.awt.Dimension(500, 500));
        jPanelEmptyList.setPreferredSize(new java.awt.Dimension(200, 200));

        jLabel3.setText("LISTA VAZIA");

        javax.swing.GroupLayout jPanelEmptyListLayout = new javax.swing.GroupLayout(jPanelEmptyList);
        jPanelEmptyList.setLayout(jPanelEmptyListLayout);
        jPanelEmptyListLayout.setHorizontalGroup(
            jPanelEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmptyListLayout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(jLabel3)
                .addContainerGap(220, Short.MAX_VALUE))
        );
        jPanelEmptyListLayout.setVerticalGroup(
            jPanelEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmptyListLayout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.add(jPanelEmptyList, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Toolbar_inicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Panel_list_projects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Panel_Adicionar_Project, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Panel_adicionar_tarefa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Toolbar_inicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Panel_adicionar_tarefa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel_Adicionar_Project, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel_list_projects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
        ProjectDialogScreen dialogScreen = new ProjectDialogScreen (this,rootPaneCheckingEnabled);
        dialogScreen.setVisible(true);
        
        dialogScreen.addWindowListener(new WindowAdapter(){
            
                public void WindowClosed(WindowEvent e){
                loadProjects();
                }
    
     
        });
        
        
        
        
        
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        
        TaskDialogScreen dialogScreen = new TaskDialogScreen(this, rootPaneCheckingEnabled);
       
        
        int projectIndex = jList1.getSelectedIndex();
        Project project  = (Project) projectsModel.get(projectIndex);
        dialogScreen.setProject(project);
        
        
        dialogScreen.setVisible(true);
        
        
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
            
        
        int projectIndex= jList1.getSelectedIndex();
        Project project = (Project) projectsModel.get(projectIndex);
        loadTasks(project.getId());
        
        
    }//GEN-LAST:event_jList1MouseClicked

    private void Jtable_taskMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jtable_taskMouseClicked
            
        
        int rowIndex = Jtable_task.rowAtPoint(evt.getPoint());
        int columnIndex = Jtable_task.columnAtPoint(evt.getPoint());
        Task task = tasksModel.getTasks().get(rowIndex);
        switch (columnIndex) {
            case 3:
               
                taskController.update(task);
                break;
            
            case 5: 
               
                taskController.removeById(task.getId());
                tasksModel.getTasks().remove(task);
                
                int projectIndex= jList1.getSelectedIndex();
                Project project = (Project) projectsModel.get(projectIndex);
                loadTasks(project.getId());
                break;
                
            default:
                throw new AssertionError();
        }
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_Jtable_taskMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Java swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaApp1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaApp1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaApp1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaApp1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaApp1().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Jtable_task;
    private javax.swing.JPanel Panel_Adicionar_Project;
    private javax.swing.JPanel Panel_adicionar_tarefa;
    private javax.swing.JPanel Panel_list_projects;
    private javax.swing.JPanel Toolbar_inicial;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanelEmptyList;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneTasks;
    // End of variables declaration//GEN-END:variables

public void decorateTableTask(){

    Jtable_task.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD,14));
    Jtable_task.getTableHeader().setBackground(new Color(0,153,102));
    Jtable_task.getTableHeader().setForeground(new Color(255,255,255));

    Jtable_task.setAutoCreateRowSorter(true);
    
    Jtable_task.getColumnModel().getColumn(2).setCellRenderer(new DeadlineColumnCellRenderer());
    Jtable_task.getColumnModel().getColumn(5).setCellRenderer(new ButtonColumnCellRenderer("lixeira"));
    Jtable_task.getColumnModel().getColumn(4).setCellRenderer(new ButtonColumnCellRenderer("edit"));


}
public void loadTasks(int idProject){

   List<Task> tasks = taskController.getAll(idProject);
   tasksModel.setTasks(tasks);
       
   showJtableTasks(!tasks.isEmpty());
    
}

public void initDataController(){
    projectController = new ProjectController();
    taskController = new TaskController();

}

public void initComponentsModel(){
     projectsModel = new DefaultListModel();
     loadProjects();
     tasksModel = new TaskTableModel();
     Jtable_task.setModel(tasksModel);
     loadTasks(0);
     
     if(!projectsModel.isEmpty()){
         jList1.setSelectedIndex(0);
         Project project = (Project) projectsModel.get(0);
         loadTasks(project.getId());
     
     }
     
     
}



public void loadProjects(){

   List<Project> projects = projectController.getAll();
   
   projectsModel.clear();
   
    for (int i = 0; i < projects.size(); i++) {
        Project project = projects.get(i);
        projectsModel.addElement(project);
        
    }
    jList1.setModel(projectsModel);
    
    
}



    private void showJtableTasks(boolean hasTasks){
        if(hasTasks){
        
            if(jPanelEmptyList.isVisible()){
                jPanelEmptyList.setVisible(false);
                jPanel7.remove(jPanelEmptyList);
                
            }
            
            jPanel7.add(jScrollPaneTasks);
            jScrollPaneTasks.setVisible(true);
            jScrollPaneTasks.setSize(jPanel7.getWidth(),jPanel7.getHeight());         
            
             
        
        }else {
            if(jScrollPaneTasks.isVisible()){
                jScrollPaneTasks.setVisible(false);
                jPanel7.remove(jScrollPaneTasks);
                
            }
            jPanel7.add(jPanelEmptyList);
            jPanelEmptyList.setVisible(true);
            jPanelEmptyList.setSize(jPanel7.getWidth(),jPanel7.getHeight());
        
        }


    }

}

