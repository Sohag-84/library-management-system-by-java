/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jframe;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import lms.ConnectionProvider;

/**
 *
 * @author Computer Gallery
 */
public class Update_delete_book extends javax.swing.JFrame {

    /**
     * Creates new form Update_delete_book
     */
    public Update_delete_book() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        book_search = new javax.swing.JButton();
        book_name = new javax.swing.JTextField();
        author_Name = new javax.swing.JTextField();
        publish_year = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        book_update_button = new javax.swing.JButton();
        book_delete_button = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        student_update_button = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        student_delete_button = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        id_txt = new javax.swing.JTextField();
        student_search = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        student_name = new javax.swing.JTextField();
        father_name = new javax.swing.JTextField();
        faculty_name = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        department_name = new javax.swing.JTextField();
        reset_button = new javax.swing.JButton();
        student_id = new javax.swing.JTextField();
        id_txt1 = new javax.swing.JTextField();
        close_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Update and delete books");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 43, -1, -1));

        jLabel2.setText("Book ID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel3.setText("Book Name:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 145, -1, -1));

        jLabel4.setText("Author Name:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 185, -1, -1));

        jLabel5.setText("Publish Year:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 225, -1, -1));

        jLabel6.setText("Quantity:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 253, -1, -1));

        book_search.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        book_search.setForeground(new java.awt.Color(102, 102, 255));
        book_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon 1/search.png"))); // NOI18N
        book_search.setText("Search");
        book_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_searchActionPerformed(evt);
            }
        });
        getContentPane().add(book_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));
        getContentPane().add(book_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 145, 241, -1));
        getContentPane().add(author_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 185, 241, -1));
        getContentPane().add(publish_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 225, 241, -1));
        getContentPane().add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 253, 241, -1));

        book_update_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        book_update_button.setForeground(new java.awt.Color(102, 102, 255));
        book_update_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon 1/save-icon--1.png"))); // NOI18N
        book_update_button.setText("Update");
        book_update_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_update_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(book_update_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 312, -1, -1));

        book_delete_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        book_delete_button.setForeground(new java.awt.Color(102, 102, 255));
        book_delete_button.setText("Delete");
        book_delete_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_delete_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(book_delete_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, -1, -1));

        jLabel7.setText("Father's Name:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 185, -1, -1));

        student_update_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        student_update_button.setForeground(new java.awt.Color(102, 102, 255));
        student_update_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon 1/save-icon--1.png"))); // NOI18N
        student_update_button.setText("Update");
        student_update_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_update_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(student_update_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 312, -1, -1));

        jLabel8.setText("Faculty :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 225, -1, -1));

        student_delete_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        student_delete_button.setForeground(new java.awt.Color(102, 102, 255));
        student_delete_button.setText("Delete");
        student_delete_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_delete_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(student_delete_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, -1, -1));

        jLabel9.setText("Department:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 253, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Update and delete Student");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 43, -1, -1));
        getContentPane().add(id_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 80, -1));

        student_search.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        student_search.setForeground(new java.awt.Color(102, 102, 255));
        student_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon 1/search.png"))); // NOI18N
        student_search.setText("Search");
        student_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_searchActionPerformed(evt);
            }
        });
        getContentPane().add(student_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 105, -1, -1));

        jLabel11.setText("Student ID:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 108, -1, -1));
        getContentPane().add(student_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 145, 241, -1));
        getContentPane().add(father_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 185, 241, -1));
        getContentPane().add(faculty_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 225, 241, -1));

        jLabel12.setText("Student Name:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 145, -1, -1));
        getContentPane().add(department_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 253, 241, -1));

        reset_button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        reset_button.setForeground(new java.awt.Color(102, 102, 255));
        reset_button.setText("Reset");
        reset_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(reset_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 361, -1, -1));
        getContentPane().add(student_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 105, 80, -1));
        getContentPane().add(id_txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 105, 80, -1));

        close_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon 1/red-x-mark-transparent-background-3.png"))); // NOI18N
        close_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(close_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        setSize(new java.awt.Dimension(837, 465));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void book_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_searchActionPerformed
        // TODO add your handling code here:
        
        int check_id=0;
        String id = id_txt.getText();
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            String query = "SELECT * FROM `book_details` WHERE book_id = '"+id+"' ";
            ResultSet rs = st.executeQuery(query);
            
            while(rs.next()){
                check_id = 1;
                id_txt.setEditable(false);//so that id can't change
                book_name.setText(rs.getString(2));
                author_Name.setText(rs.getString(3));
                publish_year.setText(rs.getString(4));
                quantity.setText(rs.getString(5));
                
            }
            if(check_id == 0){
                JOptionPane.showMessageDialog(null, "Book id doesn't exit");
            }
        }
        catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_book_searchActionPerformed

    private void student_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_searchActionPerformed
        // TODO add your handling code here:
        
        int check_id=0;
        String id = student_id.getText();
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            String query = "SELECT * FROM `student` WHERE studentID = '"+id+"' ";
            ResultSet rs = st.executeQuery(query);
            
            while(rs.next()){
                check_id = 1;
                student_id.setEditable(false);//so that id can't change
                student_name.setText(rs.getString(2));
                father_name.setText(rs.getString(3));
                faculty_name.setText(rs.getString(4));
                department_name.setText(rs.getString(5));
                
            }
            if(check_id == 0){
                JOptionPane.showMessageDialog(null, "Student id doesn't exit");
            }
        }
        catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_student_searchActionPerformed

    private void book_update_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_update_buttonActionPerformed
        // TODO add your handling code here:
        
         // For updated database
        String id = id_txt.getText();
        String bookName = book_name.getText();
        String authorName = author_Name.getText();
        String publishYear = publish_year.getText();
        String bookQuantity = quantity.getText();
        
        try{
            Connection con = ConnectionProvider.getCon();
            String query1 = "UPDATE `book_details` SET book_name=?,author_name=?,publish_year=?,quantity=? where book_id=?";
            PreparedStatement ps = con.prepareStatement(query1);
            
            ps.setString(1, bookName);
            ps.setString(2, authorName);
            ps.setString(3, publishYear);
            ps.setString(4, bookQuantity);
            ps.setString(5, id);
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Updated successfully");
            setVisible(false);
            new Update_delete_book().setVisible(true);
        }
        catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_book_update_buttonActionPerformed

    private void book_delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_delete_buttonActionPerformed
        // TODO add your handling code here:
        
        // For delete information:
        int a = JOptionPane.showConfirmDialog(null, "Do you want to delete","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){ //a==0 means user selected id
            String id = id_txt.getText();
            try{
               Connection con = ConnectionProvider.getCon();
               Statement st = con.createStatement();
               String query = "DELETE FROM book_details WHERE book_id='"+id+"' ";
               st.executeUpdate(query);
               JOptionPane.showMessageDialog(null, "Deleted successfully");
               setVisible(false);
               new Update_delete_book().setVisible(true);
            }
            catch(HeadlessException | SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_book_delete_buttonActionPerformed

    private void reset_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_buttonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Update_delete_book().setVisible(true);
    }//GEN-LAST:event_reset_buttonActionPerformed

    private void student_update_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_update_buttonActionPerformed
        // TODO add your handling code here:
        
         // For updated database
        String id = student_id.getText();
        String studentName = student_name.getText();
        String fatherName = father_name.getText();
        String facultyName = faculty_name.getText();
        String departmentName = department_name.getText();
        
        try{
            Connection con = ConnectionProvider.getCon();
            String query1 = "UPDATE `student` SET name=?,father_name=?,faculty_name=?,department_name=? where studentID=?";
            PreparedStatement ps = con.prepareStatement(query1);
            
            ps.setString(1, studentName);
            ps.setString(2, fatherName);
            ps.setString(3, facultyName);
            ps.setString(4, departmentName);
            ps.setString(5, id);
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Updated successfully");
            setVisible(false);
            new Update_delete_book().setVisible(true);
        }
        catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_student_update_buttonActionPerformed

    private void student_delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_delete_buttonActionPerformed
        // TODO add your handling code here:
        
        // For delete information:
        int a = JOptionPane.showConfirmDialog(null, "Do you want to delete","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){ //a==0 means user selected id
            String id = student_id.getText();
            try{
               Connection con = ConnectionProvider.getCon();
               Statement st = con.createStatement();
               String query = "DELETE FROM student WHERE studentID='"+id+"' ";
               st.executeUpdate(query);
               JOptionPane.showMessageDialog(null, "Deleted successfully");
               setVisible(false);
               new Update_delete_book().setVisible(true);
            }
            catch(HeadlessException | SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_student_delete_buttonActionPerformed

    private void close_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_buttonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_close_buttonActionPerformed

   
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
            java.util.logging.Logger.getLogger(Update_delete_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update_delete_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update_delete_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update_delete_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update_delete_book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField author_Name;
    private javax.swing.JButton book_delete_button;
    private javax.swing.JTextField book_name;
    private javax.swing.JButton book_search;
    private javax.swing.JButton book_update_button;
    private javax.swing.JButton close_button;
    private javax.swing.JTextField department_name;
    private javax.swing.JTextField faculty_name;
    private javax.swing.JTextField father_name;
    private javax.swing.JTextField id_txt;
    private javax.swing.JTextField id_txt1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField publish_year;
    private javax.swing.JTextField quantity;
    private javax.swing.JButton reset_button;
    private javax.swing.JButton student_delete_button;
    private javax.swing.JTextField student_id;
    private javax.swing.JTextField student_name;
    private javax.swing.JButton student_search;
    private javax.swing.JButton student_update_button;
    // End of variables declaration//GEN-END:variables
}
