
package jframe;

import java.awt.HeadlessException;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import lms.ConnectionProvider;

/**
 *
 * @author Computer Gallery
 */
public class Issue_book extends javax.swing.JFrame {

    
    public Issue_book() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bookId_txt = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        issueBookButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon 1/123456.png"))); // NOI18N
        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(325, 125));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Book ID:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Student ID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Issue Date:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Due Date:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        bookId_txt.setBackground(new java.awt.Color(255, 255, 204));
        bookId_txt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(bookId_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 250, -1));

        jTextField2.setBackground(new java.awt.Color(255, 255, 204));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 250, -1));

        jDateChooser1.setBackground(new java.awt.Color(255, 255, 204));
        jDateChooser1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 250, -1));

        jDateChooser2.setBackground(new java.awt.Color(255, 255, 204));
        jDateChooser2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 250, -1));

        issueBookButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        issueBookButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon 1/issue book.png"))); // NOI18N
        issueBookButton.setText("Issue");
        issueBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueBookButtonActionPerformed(evt);
            }
        });
        getContentPane().add(issueBookButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, -1, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon 1/red-x-mark-transparent-background-3.png"))); // NOI18N
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, -1, -1));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon 1/123456.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, -1));

        setSize(new java.awt.Dimension(700, 450));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void issueBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueBookButtonActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String book_id = bookId_txt.getText();
        String student_id = jTextField2.getText();
        String issue_date = dateFormat.format(jDateChooser1.getDate());
        String due_date = dateFormat.format(jDateChooser2.getDate());
        String return_book = "Pending";// When we issue the book this time writting the status = Pending;
        
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            String query = " SELECT * FROM `book_details` WHERE book_Id = '"+book_id+"' ";
            //String q = " SELECT quantity FROM `book_details` WHERE book_Id = '"+book_id+"' ";
            ResultSet rs = st.executeQuery(query);
            //ResultSet resultSet = st.executeQuery(q);
            if(rs.next()){
                String query2 = " SELECT * FROM `student` WHERE studentID = '"+student_id+"' ";
                ResultSet rs1 = st.executeQuery(query2);
                if(rs1.next()){
                    String query3 = " INSERT INTO issue VALUES( '"+book_id+"', '"+student_id+"', '"+issue_date+"', '"+due_date+"', '"+return_book+"' ) ";
                    st.executeUpdate(query3);
                    JOptionPane.showMessageDialog(null, "Book successfully issued");
                    
                     updateBookCount();
                    
                    setVisible(false);
                    new Issue_book().setVisible(true);  
                    
                }
                else{
                    JOptionPane.showMessageDialog(null, "Incorrect student id");
                }  
            }
            else{
                JOptionPane.showMessageDialog(null, "Incorrect book id");
            }
        }
        catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_issueBookButtonActionPerformed

    public void updateBookCount(){
       String book_id = bookId_txt.getText(); 
       try{
           Connection con = ConnectionProvider.getCon();
           Statement st = con.createStatement();
           String query = " UPDATE book_details SET quantity = quantity-1 WHERE book_id = '"+book_id+"' ";
           int rowCount = st.executeUpdate(query);
           if(rowCount > 0){
               JOptionPane.showMessageDialog(null, "Book count Succussfully updated");
           }
           
       }
       catch(HeadlessException | SQLException e){
           JOptionPane.showMessageDialog(null, e);
       }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Issue_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Issue_book().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bookId_txt;
    private javax.swing.JButton issueBookButton;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
