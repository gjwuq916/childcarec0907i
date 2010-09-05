/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frmChildList.java
 *
 * Created on Aug 12, 2010, 8:44:40 AM
 */
package GUI;

import BL.UserBL;
import GUI.Component.RightPanel;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Admin
 */
public class frmAddOrEditUser extends javax.swing.JPanel {

    private String Title;
    private RightPanel RightPanel;
    private int UserCode;
    private UserBL userbl;
    private ResultSet rs;
    private String Username;
    private String Password;
    private String Comfirmpass;
    private String FullName;
    private String Phone;
    private String Address;
    private String Email;
    private String StartDate;
    private String Feedback;
    private String Birthday;
    private String Sex;
    private String Admin;

    /** Creates new form frmChildList */
    public frmAddOrEditUser(String tilte, RightPanel rightPanel) {
        Title = tilte;
        RightPanel = rightPanel;
        initComponents();
        //plEditOrAdd
        plEditOrAdd.setBorder(BorderFactory.createTitledBorder(null, Title + " of the User", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Times New Roman", 1, 17)));
    }

    public frmAddOrEditUser(String tilte, int Code, RightPanel rightPanel) {
        Title = tilte;
        RightPanel = rightPanel;
        UserCode = Code;
        initComponents();
        //plEditOrAdd
        plEditOrAdd.setBorder(BorderFactory.createTitledBorder(null, Title + " of the User", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Times New Roman", 1, 17)));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        plEditOrAdd = new javax.swing.JPanel();
        plButton = new javax.swing.JPanel();
        btSave = new javax.swing.JButton();
        btReset = new javax.swing.JButton();
        btClose = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        txtBirthday = new com.toedter.calendar.JDateChooser();
        txtAddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        txtComfirmPass = new javax.swing.JPasswordField();
        txtUserName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtStartDate = new com.toedter.calendar.JDateChooser();
        txtFeedback = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        chbAdmin = new javax.swing.JCheckBox();
        rbMale = new javax.swing.JRadioButton();
        rbFemale = new javax.swing.JRadioButton();

        plEditOrAdd.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add of the User", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 17))); // NOI18N

        btSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save-16x16.png"))); // NOI18N
        btSave.setText(" Save");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        btReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/arrow-circle-double-135.png"))); // NOI18N
        btReset.setText(" Reset");
        btReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResetActionPerformed(evt);
            }
        });

        btClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cross.png"))); // NOI18N
        btClose.setText(" Close");
        btClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout plButtonLayout = new javax.swing.GroupLayout(plButton);
        plButton.setLayout(plButtonLayout);
        plButtonLayout.setHorizontalGroup(
            plButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plButtonLayout.createSequentialGroup()
                .addContainerGap(433, Short.MAX_VALUE)
                .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btReset, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btClose)
                .addGap(38, 38, 38))
        );
        plButtonLayout.setVerticalGroup(
            plButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSave)
                    .addComponent(btReset)
                    .addComponent(btClose))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Detail of The User"));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jLabel3.setText("FullName :");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jLabel4.setText("Sex :");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jLabel5.setText("Birthday :");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jLabel6.setText("Address :");

        txtBirthday.setDateFormatString("MMMM/dd/yyyy");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jLabel7.setText("Phone :");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jLabel8.setText("Email :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel9.setText("UserName :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel10.setText("Password :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel11.setText("Comfirm Password:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel12.setText("Start Date:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel13.setText("Feedback :");

        txtStartDate.setDateFormatString("MMMM/dd/yyyy");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel14.setText("Full Control :");

        chbAdmin.setText(" Admin");

        rbMale.setText("Male");

        rbFemale.setText("Female");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtFullName, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtPass, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtComfirmPass, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtBirthday, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtUserName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rbMale)
                        .addGap(10, 10, 10)
                        .addComponent(rbFemale)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtFeedback)
                        .addComponent(txtStartDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEmail)
                        .addComponent(txtPhoneNumber)
                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chbAdmin))
                .addGap(71, 71, 71))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtComfirmPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12))
                    .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(rbMale)
                    .addComponent(rbFemale))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(txtBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chbAdmin)
                        .addComponent(jLabel14)))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout plEditOrAddLayout = new javax.swing.GroupLayout(plEditOrAdd);
        plEditOrAdd.setLayout(plEditOrAddLayout);
        plEditOrAddLayout.setHorizontalGroup(
            plEditOrAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plEditOrAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plEditOrAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(plButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        plEditOrAddLayout.setVerticalGroup(
            plEditOrAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plEditOrAddLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(plButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(274, 274, 274))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(plEditOrAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(plEditOrAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        // TODO add your handling code here:
        Boolean test = check();
        if (test == false) {
            return;
        }
        getText();
        Save();
        setText();
    }//GEN-LAST:event_btSaveActionPerformed

    private void btCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCloseActionPerformed
        // TODO add your handling code here:
        close();
}//GEN-LAST:event_btCloseActionPerformed

    private void btResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResetActionPerformed
        // TODO add your handling code here:
        setText(0);
    }//GEN-LAST:event_btResetActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btClose;
    private javax.swing.JButton btReset;
    private javax.swing.JButton btSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chbAdmin;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel plButton;
    private javax.swing.JPanel plEditOrAdd;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JTextField txtAddress;
    private com.toedter.calendar.JDateChooser txtBirthday;
    private javax.swing.JPasswordField txtComfirmPass;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFeedback;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtPhoneNumber;
    private com.toedter.calendar.JDateChooser txtStartDate;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

    private void close() {
        for (int i = 0; i < RightPanel.getCount(); i++) {
            if (RightPanel.getTabTitle(Title + " User", i)) {
                RightPanel.RemoveTabAt(i);
            }
        }
    }

    private Boolean check() {
        String strEmail = "\\w+(\\.\\w+)*@\\w+(\\.\\w+)+";
        Date d = new Date();
        if (txtUserName.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please, Enter UserName");
            txtUserName.requestFocus();
            return false;
        } else if (txtPass.getPassword() == null) {
            JOptionPane.showMessageDialog(this, "Please, Enter ParentName");
            txtPass.requestFocus();
            return false;
        } else if (txtComfirmPass.getPassword() == null) {
            JOptionPane.showMessageDialog(this, "Please, Enter ParentName");
            txtComfirmPass.requestFocus();
            return false;
        } else if (txtFullName.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please, Enter FullName");
            txtFullName.requestFocus();
            return false;
        } else if (!rbMale.isSelected() || rbFemale.isSelected()) {
            JOptionPane.showMessageDialog(this, "Please, Select Male or Female");
            return false;
        } else if (txtBirthday.getDate() != null) {
            if (txtBirthday.getCalendar().getTime().after(d)) {
                JOptionPane.showMessageDialog(this, "Birthday Date < today");
                txtBirthday.setDate(null);
                txtBirthday.requestFocus();
                return false;
            }
        } else if (txtAddress.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please, Enter Address");
            txtAddress.requestFocus();
            return false;
        } else if (txtPhoneNumber.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please, Enter MobileNumber");
            txtPhoneNumber.requestFocus();
            return false;
        } else if (Pattern.matches("[0-9]", txtPhoneNumber.getText())) {
            JOptionPane.showMessageDialog(this, "Parent Mobile number most is number");
            txtPhoneNumber.requestFocus();
            return false;
        } else if (txtEmail.getText().length() != 0) {
            if (!Pattern.matches(strEmail, txtEmail.getText())) {
                JOptionPane.showMessageDialog(this, "Email no match!");
                txtEmail.requestFocus();
                txtEmail.selectAll();
                return false;
            }
        } else if (txtStartDate.getDate() != null) {
            if (txtStartDate.getCalendar().getTime().after(d)) {
                JOptionPane.showMessageDialog(this, "RegistrationDate Date <= today");
                txtStartDate.setDate(null);
                txtStartDate.requestFocus();
                return false;
            }
        }
        return true;
    }

    private void setText(int x) {
        txtAddress.setText("");
        txtEmail.setText("");
        txtFullName.setText("");
        txtPhoneNumber.setText("");
        txtFeedback.setText("");
    }

    private void setText() {
        if (Title.equals("Edit")) {
            if (UserCode >= 1) {
                userbl = new UserBL();
                rs = userbl.ExecuteSQLProc("spGet_Users", UserCode);
                try {
                    if (rs.next()) {
                        UserCode = rs.getInt("UserCode");
                        txtUserName.setText(rs.getString("ParentName"));
                        txtPass.setText(rs.getString("ParentWorkNumber"));
                        txtComfirmPass.setText(rs.getString("ParentMobileNumber"));
                        txtFullName.setText(rs.getString("LastName"));
                        txtPhoneNumber.setText(rs.getString("FirstName"));
                        txtAddress.setText(rs.getString("Address"));
                        txtEmail.setText(rs.getString("CurrentMedication"));
                        txtStartDate.setDate(rs.getDate("PassIllness"));
                        txtFeedback.setText(rs.getString("DoctorName"));
                        txtBirthday.setDate(rs.getDate("DateOfBirth"));
                        if (rs.getBoolean("Sex")) {
                            rbMale.setSelected(true);
                        } else {
                            rbFemale.setSelected(true);
                        }
                        if (rs.getBoolean("")) {
                            chbAdmin.setSelected(true);
                        }
                        txtUserName.setEditable(false);
                        txtPass.setEditable(false);
                        txtComfirmPass.setEditable(false);
                        rbMale.setEnabled(false);
                        rbFemale.setEnabled(false);
                        txtBirthday.setEnabled(false);
                        txtStartDate.setEnabled(false);

                    } else {
                        JOptionPane.showMessageDialog(null, "Not find this ChildCode");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(frmAddOrEditChild.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else if (Title.equals("Add")) {
            txtUserName.setText("");
            txtPass.setText("");
            txtAddress.setText("");
            txtComfirmPass.setText("");
            txtEmail.setText("");
            txtFullName.setText("");
            txtPhoneNumber.setText("");
            txtFeedback.setText("");
            txtBirthday.setDate(null);
            txtStartDate.setDate(null);

        }
    }

    private void getText() {
        Username = txtUserName.getText();
        Password = new String(txtPass.getPassword());
        Comfirmpass = new String(txtComfirmPass.getPassword());
        FullName = txtFullName.getText();
        Phone = txtPhoneNumber.getText();
        Address = txtAddress.getText();
        Email = txtEmail.getText();
        StartDate = txtStartDate.getCalendar().getTime().toLocaleString();
        Feedback = txtFeedback.getText();
        Birthday = txtBirthday.getCalendar().getTime().toLocaleString();
        if (rbMale.isSelected()) {
            Sex = "1";
        } else {
            Sex = "0";
        }
        if (chbAdmin.isSelected()) {
            Admin = "1";
        }
    }

    private void Save() {
        int j = 0;
        userbl = new UserBL(Title, UserCode, FullName, Phone, Password, Sex, Address, Birthday, Phone, Email, StartDate, Feedback, Admin);
        userbl.setStatement();
        userbl.ExecuteSQLProc();
        for (int i = 0; i < RightPanel.getCount(); i++) {
            if (RightPanel.getTabTitle("User List", i)) {
                RightPanel.RemoveTabAt(i);
                j = i;
            }
        }
        if (j > 0) {
            RightPanel.addSubPane("User List", RightPanel, null);
        }
    }
}
