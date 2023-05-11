/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import controller.TaskController;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Project;
import model.Task;

/**
 *
 * @author Arthurcc
 */
public class TaskDialogScreen extends javax.swing.JDialog {

    TaskController taskController;
    Project project;
    
    public TaskDialogScreen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        hideErrorFields();
        
        taskController = new TaskController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        toolbar_tarefa = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        adicionar_button_task = new javax.swing.JButton();
        Nome = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TextField_nome_tarefa = new javax.swing.JTextField();
        jLabel_description = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_description = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextArea_notes = new javax.swing.JTextArea();
        TextField_prazo = new javax.swing.JFormattedTextField();
        label_Obrigatorio1 = new javax.swing.JLabel();
        label_obrigatorio2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        toolbar_tarefa.setBackground(new java.awt.Color(0, 102, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TAREFAS");

        adicionar_button_task.setBackground(new java.awt.Color(0, 153, 51));
        adicionar_button_task.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        adicionar_button_task.setForeground(new java.awt.Color(255, 255, 255));
        adicionar_button_task.setText("Adicionar");
        adicionar_button_task.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adicionar_button_taskMouseClicked(evt);
            }
        });
        adicionar_button_task.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionar_button_taskActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout toolbar_tarefaLayout = new javax.swing.GroupLayout(toolbar_tarefa);
        toolbar_tarefa.setLayout(toolbar_tarefaLayout);
        toolbar_tarefaLayout.setHorizontalGroup(
            toolbar_tarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toolbar_tarefaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(adicionar_button_task)
                .addContainerGap())
        );
        toolbar_tarefaLayout.setVerticalGroup(
            toolbar_tarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toolbar_tarefaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(toolbar_tarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(adicionar_button_task))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        Nome.setBackground(new java.awt.Color(255, 255, 255));
        Nome.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setBackground(new java.awt.Color(0, 153, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel_description.setBackground(new java.awt.Color(0, 153, 0));
        jLabel_description.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel_description.setText("Descrição:");

        jLabel4.setBackground(new java.awt.Color(0, 153, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setText("Prazo:");

        jLabel5.setBackground(new java.awt.Color(0, 153, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setText("Notas:");

        jTextArea_description.setColumns(20);
        jTextArea_description.setRows(5);
        jScrollPane1.setViewportView(jTextArea_description);

        TextArea_notes.setColumns(20);
        TextArea_notes.setRows(5);
        jScrollPane2.setViewportView(TextArea_notes);

        TextField_prazo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        label_Obrigatorio1.setForeground(new java.awt.Color(255, 0, 0));
        label_Obrigatorio1.setText("Campo obrigatório!");

        label_obrigatorio2.setForeground(new java.awt.Color(255, 0, 0));
        label_obrigatorio2.setText("Campo obrigatório!");

        javax.swing.GroupLayout NomeLayout = new javax.swing.GroupLayout(Nome);
        Nome.setLayout(NomeLayout);
        NomeLayout.setHorizontalGroup(
            NomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextField_prazo)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, NomeLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(TextField_nome_tarefa))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, NomeLayout.createSequentialGroup()
                        .addGroup(NomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel_description)
                            .addComponent(label_Obrigatorio1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_obrigatorio2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        NomeLayout.setVerticalGroup(
            NomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NomeLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextField_nome_tarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_Obrigatorio1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_description)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextField_prazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(label_obrigatorio2)
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toolbar_tarefa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Nome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(toolbar_tarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Nome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adicionar_button_taskMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adicionar_button_taskMouseClicked
      
        try {
            
            if(isFieldValid()){
                Task task = new Task();
            task.setId_project(project.getId());
            task.setName(TextField_nome_tarefa.getText());
            task.setDescription(jTextArea_description.getText());
            task.setNotes(TextArea_notes.getText());
            task.setIsCompleted(false);
            
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date deadline = null;
            
            deadline = dateFormat.parse(TextField_prazo.getText());
            task.setDeadline(deadline);
           
            taskController.save(task);
            JOptionPane.showMessageDialog(rootPane,"Tarefa cadastrada com sucesso");
            TelaApp1 app1 = new TelaApp1();
            app1.loadTasks(PROPERTIES);
            this.dispose();
            }else{
                    
                    hideErrorFields();
                    if(TextField_nome_tarefa.getText().isEmpty()){
                       
                        label_Obrigatorio1.setVisible(true);                    
                    }
                    if(TextField_prazo.getText().isEmpty()){
                        
                        label_obrigatorio2.setVisible(true);                    
                    }
                    
            }
                               
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(rootPane,"Erro: " + e);
        }
        
        
        
    }//GEN-LAST:event_adicionar_button_taskMouseClicked

    private void adicionar_button_taskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionar_button_taskActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adicionar_button_taskActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TaskDialogScreen dialog = new TaskDialogScreen(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Nome;
    private javax.swing.JTextArea TextArea_notes;
    private javax.swing.JTextField TextField_nome_tarefa;
    private javax.swing.JFormattedTextField TextField_prazo;
    private javax.swing.JButton adicionar_button_task;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_description;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea_description;
    private javax.swing.JLabel label_Obrigatorio1;
    private javax.swing.JLabel label_obrigatorio2;
    private javax.swing.JPanel toolbar_tarefa;
    // End of variables declaration//GEN-END:variables

    public void setProject(Project project) {
        this.project = project;
    }



    public void hideErrorFields(){
        label_Obrigatorio1.setVisible(false);
        label_obrigatorio2.setVisible(false);
        
    }
    
    public boolean isFieldValid(){
        if(!TextField_nome_tarefa.getText().isEmpty() && !TextField_prazo.getText().isEmpty()){
            return true;
        }
        else{
        return false;
        }
    }
    

}
