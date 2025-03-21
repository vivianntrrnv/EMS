/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import Config.dbConnector;
import eventm.loginForm;
import eventm.regForm;
import static eventm.regForm.uemail;
import static eventm.regForm.usname;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jake
 */
public class createUserForm extends javax.swing.JFrame {

  
    public createUserForm() {
        initComponents();
    }
         public boolean updateCheck(){
        dbConnector dbc= new dbConnector();
        try{
             String query= "SELECT*FROM tbl_user WHERE( u_username='"+un.getText()+"'OR u_email= '"
                     +email.getText()+"')AND u_id != '"+uiid.getText()+"'";
            ResultSet resultSet= dbc.getData(query);
            
            if(resultSet.next()){
                uemail= resultSet.getString("u_email");
                if(uemail.equals(email.getText())){
                    JOptionPane.showMessageDialog(null,"Email is Already Used!");
                    email.setText("");
                }
                usname= resultSet.getString("u_username");
                        if(usname.equals(un.getText())){
                    JOptionPane.showMessageDialog(null,"Username is Already Used!");
                    un.setText("");
                }
                
                  return true;
            }else{
                return false;
            }
                    
        }catch(SQLException ex){
            System.out.println(""+ex);
            return false;
            
            
        }
        
    }
     
     public boolean duplicateCheck(){
        dbConnector dbc= new dbConnector();
        
        try{
             String query= "SELECT*FROM tbl_user WHERE u_username='"+un.getText()+"'OR u_email= '"
                     +email.getText()+"'";
            ResultSet resultSet= dbc.getData(query);
            
            if(resultSet.next()){
                uemail= resultSet.getString("u_email");
                if(uemail.equals(email.getText())){
                    JOptionPane.showMessageDialog(null,"Email is Already Used!");
                    email.setText("");
                }
                usname= resultSet.getString("u_username");
                        if(usname.equals(un.getText())){
                    JOptionPane.showMessageDialog(null,"Username is Already Used!");
                    un.setText("");
                }
                
                  return true;
            }else{
                return false;
            }
                    
        }catch(SQLException ex){
            System.out.println(""+ex);
            return false;
            
            
        }
        
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        ln = new javax.swing.JTextField();
        fn = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        un = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ut = new javax.swing.JComboBox<>();
        us = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        uiid = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        ps = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 227));
        jPanel1.setForeground(new java.awt.Color(240, 240, 240));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 227));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(37, 61, 44)));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(37, 61, 44));
        jLabel2.setText("Last Name:");

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(37, 61, 44));
        jLabel1.setText("First Name:");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(37, 61, 44));
        jLabel3.setText("Email:");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(37, 61, 44));
        jLabel4.setText("Username:");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(37, 61, 44));
        jLabel5.setText("Password:");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(37, 61, 44));
        jLabel6.setText("Account Type:");

        ut.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        ut.setForeground(new java.awt.Color(37, 61, 44));
        ut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        ut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utActionPerformed(evt);
            }
        });

        us.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        us.setForeground(new java.awt.Color(37, 61, 44));
        us.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending" }));
        us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(37, 61, 44));
        jLabel7.setText("User Status:");

        add.setBackground(new java.awt.Color(204, 204, 204));
        add.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        add.setForeground(new java.awt.Color(37, 61, 44));
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(37, 61, 44));
        jLabel8.setText("User ID:");

        uiid.setEnabled(false);

        update.setBackground(new java.awt.Color(204, 204, 204));
        update.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        update.setForeground(new java.awt.Color(37, 61, 44));
        update.setText("Update");
        update.setEnabled(false);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(204, 204, 204));
        delete.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        delete.setForeground(new java.awt.Color(37, 61, 44));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(204, 204, 204));
        clear.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        clear.setForeground(new java.awt.Color(37, 61, 44));
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        cancel.setBackground(new java.awt.Color(204, 204, 204));
        cancel.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        cancel.setForeground(new java.awt.Color(37, 61, 44));
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        refresh.setBackground(new java.awt.Color(204, 204, 204));
        refresh.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        refresh.setForeground(new java.awt.Color(37, 61, 44));
        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ps, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(un, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(ut, 0, 332, Short.MAX_VALUE)
                        .addComponent(us, 0, 332, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8)
                        .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                        .addComponent(uiid, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(ln, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(clear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(44, 44, 44)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(38, 38, 38))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uiid, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ln, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(un, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(10, 10, 10)
                .addComponent(ps, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(us, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, 620));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(37, 61, 44));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Please enter the required information below. ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 590, -1));

        jPanel2.setBackground(new java.awt.Color(37, 61, 44));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 227));
        jLabel14.setText("Event Management System");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 192, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void utActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_utActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        
        if (fn.getText().isEmpty() || ln.getText().isEmpty() || email.getText().isEmpty() || un.getText().isEmpty() || ps.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields are required!");
        } 

        else if (ps.getText().length() < 8 || !ps.getText().matches(".*[A-Z].*") || !ps.getText().matches(".*[a-z].*") || !ps.getText().matches(".*[0-9].*") || !ps.getText().matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
            JOptionPane.showMessageDialog(null, "Password must be at least 8 characters long, contains at least one uppercase letter, one lowercase letter, one number, and one special character.");
            ps.setText("");
        } 

        else if (!email.getText().matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$")) {
            JOptionPane.showMessageDialog(null, "Please enter a valid email address.");
            email.setText("");
        } 

        else if (duplicateCheck()) {
            JOptionPane.showMessageDialog(null, "Duplicate exist.");
        } 

        else {
            dbConnector dbc = new dbConnector();
            if (dbc.insertData("INSERT INTO tbl_user(u_fname, u_lname, u_email, u_username, u_password, u_type, u_status) "
                + "VALUES('" + fn.getText() + "','" + ln.getText() + "','" + email.getText() + "','" + un.getText() + "','" + ps.getText() + "','" + ut.getSelectedItem() + "','')")) {

                JOptionPane.showMessageDialog(null, "Inserted Successfully!");
                new usersForm().setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Connection error!");
    }
}

    }//GEN-LAST:event_addActionPerformed

    private void usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
      
        if (fn.getText().isEmpty() || ln.getText().isEmpty() || email.getText().isEmpty() || un.getText().isEmpty() || ps.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields are required!");
         
        }else if (ps.getText().length() < 8 || !ps.getText().matches(".*[A-Z].*") || !ps.getText().matches(".*[a-z].*") || !ps.getText().matches(".*[0-9].*") || !ps.getText().matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
            JOptionPane.showMessageDialog(null, "Password must be at least 8 characters long, contain at least one uppercase letter, one lowercase letter, one number, and one special character.");
            ps.setText("");
       
         } else if (!email.getText().matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$")) {
            JOptionPane.showMessageDialog(null, "Please enter a valid email address.");
            email.setText("");
       
         } else if (updateCheck()) {
            JOptionPane.showMessageDialog(null, "Duplicate exists.");
       
         } else {
            dbConnector dbc = new dbConnector();
            dbc.updateData("UPDATE tbl_user SET u_fname= '"+fn.getText()+"', u_lname= '"+ln.getText()+"', u_email= '"+email.getText()+"', u_username= '"+un.getText()+
                           "', u_password= '"+ps.getText()+"', u_type= '"+ut.getSelectedItem()+"', u_status= '"+us.getSelectedItem()+"' WHERE u_id= '"+uiid.getText()+"'");

                usersForm uf= new usersForm();
                uf.setVisible(true);
                this.dispose();
}

    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        usersForm usf= new usersForm();
        usf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshActionPerformed

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
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createUserForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton add;
    private javax.swing.JButton cancel;
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    public javax.swing.JTextField email;
    public javax.swing.JTextField fn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JTextField ln;
    public javax.swing.JTextField ps;
    private javax.swing.JButton refresh;
    public javax.swing.JTextField uiid;
    public javax.swing.JTextField un;
    public javax.swing.JButton update;
    public javax.swing.JComboBox<String> us;
    public javax.swing.JComboBox<String> ut;
    // End of variables declaration//GEN-END:variables
}
