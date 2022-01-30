/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SMS;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
//import com.sun.jdi.connect.spi.Connection;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author whois
 */
public class ManageStudents extends javax.swing.JFrame {

    /**
     * Creates new form ManageStudents
     */
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    public ManageStudents() {
        initComponents();
        setStudentDetailsToTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        firstname = new app.bolivia.swing.JCTextField();
        lastname = new app.bolivia.swing.JCTextField();
        txt_email = new app.bolivia.swing.JCTextField();
        txt_class = new javax.swing.JComboBox<>();
        txt_faculty = new javax.swing.JComboBox<>();
        txt_address = new java.awt.TextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rSMaterialButtonCircle1 = new rojerusan.RSMaterialButtonCircle();
        updateBtn = new rojerusan.RSMaterialButtonCircle();
        jLabel10 = new javax.swing.JLabel();
        std_no = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_stdDetails = new rojerusan.RSTableMetro();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setToolTipText("");
        jPanel1.setPreferredSize(new java.awt.Dimension(510, 710));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 153, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SMS/images/icons8_double_left_40px.png"))); // NOI18N
        jLabel1.setText("GO BACK");
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, -1));

        firstname.setBackground(new java.awt.Color(255, 55, 55));
        firstname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        firstname.setForeground(new java.awt.Color(255, 255, 255));
        firstname.setToolTipText("");
        firstname.setCaretColor(new java.awt.Color(255, 255, 255));
        firstname.setPhColor(new java.awt.Color(255, 255, 255));
        firstname.setPlaceholder("First name...");
        jPanel1.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 110, -1, -1));

        lastname.setBackground(new java.awt.Color(255, 55, 55));
        lastname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        lastname.setForeground(new java.awt.Color(255, 255, 255));
        lastname.setToolTipText("");
        lastname.setPhColor(new java.awt.Color(255, 255, 255));
        lastname.setPlaceholder("Last name...");
        lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameActionPerformed(evt);
            }
        });
        jPanel1.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 168, -1, -1));

        txt_email.setBackground(new java.awt.Color(255, 55, 55));
        txt_email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txt_email.setToolTipText("");
        txt_email.setPhColor(new java.awt.Color(255, 255, 255));
        txt_email.setPlaceholder("Email Address...");
        jPanel1.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 211, -1, -1));

        txt_class.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Class 11", "Class 12" }));
        txt_class.setBorder(null);
        txt_class.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_classActionPerformed(evt);
            }
        });
        jPanel1.add(txt_class, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 256, 200, 37));

        txt_faculty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Commerce", "Science" }));
        jPanel1.add(txt_faculty, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 304, 200, 37));
        jPanel1.add(txt_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 362, 200, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SMS/images/icons8_user_40px.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 110, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SMS/images/icons8_user_40px.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 160, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SMS/images/icons8_email_open_40px.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 203, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SMS/images/icons8_class_40px.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 253, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SMS/images/icons8_math_book_40px_1.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 301, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SMS/images/icons8_address_40px_1.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 362, -1, -1));

        rSMaterialButtonCircle1.setBackground(new java.awt.Color(0, 153, 255));
        rSMaterialButtonCircle1.setText("ADD");
        rSMaterialButtonCircle1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSMaterialButtonCircle1MouseClicked(evt);
            }
        });
        jPanel1.add(rSMaterialButtonCircle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 442, -1, 60));

        updateBtn.setBackground(new java.awt.Color(0, 153, 255));
        updateBtn.setText("UPDATE");
        updateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateBtnMouseClicked(evt);
            }
        });
        jPanel1.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 442, -1, 60));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Student no");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));
        jPanel1.add(std_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 60, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 690));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SMS/images/icons8_multiply_30px_1.png"))); // NOI18N
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, 68, 40));

        tbl_stdDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Id", "First Name", "Last Name", "Class", "Faculty", "Email", "Address"
            }
        ));
        tbl_stdDetails.setColorBackgoundHead(new java.awt.Color(255, 55, 55));
        tbl_stdDetails.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tbl_stdDetails.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tbl_stdDetails.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tbl_stdDetails.setRowHeight(40);
        tbl_stdDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_stdDetailsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_stdDetails);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 860, 240));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setText("Manage Students");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 1328, 710));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    int std_id;
        String fname, lname,std_classname,std_faculty,std_email, std_address;
        DefaultTableModel model;
    public void setStudentDetailsToTable (){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/smt","root","");
            pst = con.prepareStatement("select * From students");
            rs = pst.executeQuery();
            
            while(rs.next()){
                String std_id = rs.getString("id");
                String fname = rs.getString("fname");
                String lname = rs.getString("lname");
                String std_classname = rs.getString("class");
                String std_faculty = rs.getString("faculty");
                String std_email = rs.getString("email");
                String std_address = rs.getString("address");
                Object[] obj = {std_id,fname,lname,std_classname,std_faculty,std_email,std_address};
                 model = (DefaultTableModel) tbl_stdDetails.getModel();
                 model.addRow(obj);
                 
            }  
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManageStudents.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ManageStudents.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public boolean addStudent(){
          fname = firstname.getText();
          lname = lastname.getText();
          std_classname = (String) txt_class.getSelectedItem();
          std_faculty = (String) txt_faculty.getSelectedItem();
          std_email = txt_email.getText();
          std_address = txt_address.getText();
          Boolean isAdded = null;
          if(fname.length()==0 || lname.length()==0 || std_email.length()==0)
        {
            JOptionPane.showMessageDialog(this, "You need to fill all the details to Register");
        }else{
         try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/smt","root","");
            pst = con.prepareStatement("insert into students(fname,lname,class,faculty,email,address) values (?,?,?,?,?,?) ");
            pst.setString(1,fname);
            pst.setString(2,lname);
            pst.setString(3,std_classname);
            pst.setString(4,std_faculty);
            pst.setString(5,std_email);
            pst.setString(6,std_address);
            int rowCount = pst.executeUpdate();
            if(rowCount > 0){
                isAdded = true;
            }else{
                isAdded = false;
            }
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManageStudents.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ManageStudents.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return isAdded;
    }
       return false; 
    }
    
    public boolean updateStudent(){
         fname = firstname.getText();
          lname = lastname.getText();
          std_classname = (String) txt_class.getSelectedItem();
          std_faculty = (String) txt_faculty.getSelectedItem();
          std_email = txt_email.getText();
          std_address = txt_address.getText();
          std_id = Integer.parseInt(std_no.getText());
          boolean isUpdated = false;
          try{
              Class.forName("com.mysql.jdbc.Driver");
              con = DriverManager.getConnection("jdbc:mysql://localhost/smt","root","");
              pst = con.prepareStatement("update students set fname=?,lname=?,class=?,faculty=?,email=?,address=? where id=?");
              pst.setString(1, fname);
              pst.setString(2, lname);
              pst.setString(3, std_classname);
              pst.setString(4, std_faculty);
              pst.setString(5, std_email);
              pst.setString(6, std_address);
              pst.setInt(7, std_id);
              
              int rowCount = pst.executeUpdate();
              if(rowCount>0){
                  isUpdated = true;
              }else{
                  isUpdated = false;
              }
          }catch (ClassNotFoundException ex) {
            Logger.getLogger(ManageStudents.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ManageStudents.class.getName()).log(Level.SEVERE, null, ex);
        } 
          return isUpdated;
    }
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        DashBoard dashBoard = new DashBoard();
        dashBoard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void txt_classActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_classActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_classActionPerformed

    private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameActionPerformed

    private void tbl_stdDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_stdDetailsMouseClicked
        int rowNo = tbl_stdDetails.getSelectedRow();
        TableModel model = tbl_stdDetails.getModel();
        std_no.setText((String)model.getValueAt(rowNo, 0));
        firstname.setText((String) model.getValueAt(rowNo, 1));
        lastname.setText((String) model.getValueAt(rowNo, 2));
        txt_class.setSelectedItem(model.getValueAt(rowNo, 3));
        txt_faculty.setSelectedItem(model.getValueAt(rowNo, 4));
        txt_email.setText((String) model.getValueAt(rowNo, 5));
        txt_address.setText((String) model.getValueAt(rowNo, 6));
        
       
            
        
    }//GEN-LAST:event_tbl_stdDetailsMouseClicked

    private void rSMaterialButtonCircle1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle1MouseClicked
        if(addStudent()==true){
            JOptionPane.showMessageDialog(this, "Student Added");
            clearTable();
            setStudentDetailsToTable();
            firstname.setText("");
            lastname.setText("");
            txt_email.setText("");
            txt_address.setText("");
        }else{
            JOptionPane.showMessageDialog(this, "Something Went Wrong");
        }
    }//GEN-LAST:event_rSMaterialButtonCircle1MouseClicked

    private void updateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtnMouseClicked
           if(updateStudent()==true){
            JOptionPane.showMessageDialog(this, "Stduent Details Updated");
            
            clearTable();
            setStudentDetailsToTable();
             firstname.setText("");
            lastname.setText("");
            txt_email.setText("");
            txt_address.setText("");
        }else{
               JOptionPane.showMessageDialog(this, "Update failed");
           }
    }//GEN-LAST:event_updateBtnMouseClicked
    public void clearTable(){
        DefaultTableModel model = (DefaultTableModel) tbl_stdDetails.getModel();
        model.setRowCount(0);
    }
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
            java.util.logging.Logger.getLogger(ManageStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageStudents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private app.bolivia.swing.JCTextField firstname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private app.bolivia.swing.JCTextField lastname;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle1;
    private javax.swing.JLabel std_no;
    private rojerusan.RSTableMetro tbl_stdDetails;
    private java.awt.TextArea txt_address;
    private javax.swing.JComboBox<String> txt_class;
    private app.bolivia.swing.JCTextField txt_email;
    private javax.swing.JComboBox<String> txt_faculty;
    private rojerusan.RSMaterialButtonCircle updateBtn;
    // End of variables declaration//GEN-END:variables
}
