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

import BL.NannyBL;
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
public class frmAddOrEditNannies extends javax.swing.JPanel {

    private String Title;
    private int ClassCode;
    private int AgeGroupCode;
    private int NannyCode;
    private frmSelectClasses SelectClassCode;
    private frmSelectChild SelectChildCode;
    private final RightPanel RightPanel;
    private int ChildCode;
    private NannyBL nannybl;
    private ResultSet rs;
    private String Name;
    private String classCode;
    private String DateOfBirth;
    private String Sex;
    private String Address;
    private String Phone;
    private String Email;
    private String Charge;
    private String WorkingHours;
    private String childCode;

    /** Creates new form frmChildList */
    public frmAddOrEditNannies(String title, RightPanel rihtpanel) {
        Title = title;
        ClassCode = 0;
        AgeGroupCode = 0;
        ChildCode = 0;
        initComponents();
        plTable.setBorder(BorderFactory.createTitledBorder(null, Title + " of the Nanny", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Times New Roman", 1, 17)));
        setText();
        RightPanel = rihtpanel;
    }

    public frmAddOrEditNannies(String title, int Code, RightPanel rihtpanel) {
        Title = title;
        ClassCode = 0;
        AgeGroupCode = 0;
        ChildCode = 0;
        NannyCode = Code;
        initComponents();
        plTable.setBorder(BorderFactory.createTitledBorder(null, Title + " of the Children", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Times New Roman", 1, 17)));
        setText();
        RightPanel = rihtpanel;
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
        plTable = new javax.swing.JPanel();
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
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtCharge = new javax.swing.JTextField();
        txtChild = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtClass = new javax.swing.JTextField();
        btClass = new javax.swing.JButton();
        btChild = new javax.swing.JButton();
        rbMale = new javax.swing.JRadioButton();
        rbFemale = new javax.swing.JRadioButton();
        cbWorkingHours = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        plTable.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add of the Nanny", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 17))); // NOI18N

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
        btClose.setText("Close");
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
                .addContainerGap(285, Short.MAX_VALUE)
                .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btReset, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btClose, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );
        plButtonLayout.setVerticalGroup(
            plButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btClose)
                    .addComponent(btReset)
                    .addComponent(btSave))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Detail of The Nanny"));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("FullName :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Sex :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Birthday :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Address :");

        txtBirthday.setDateFormatString("MMMM/dd/yyyy");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Phone Number :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Email :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Charge :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Working Hours :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Child assigned :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Class :");

        btClass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/disk--arrow.png"))); // NOI18N
        btClass.setText("Select");
        btClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClassActionPerformed(evt);
            }
        });

        btChild.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/disk--arrow.png"))); // NOI18N
        btChild.setText("Select");
        btChild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btChildActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbMale);
        rbMale.setText("Male");

        buttonGroup1.add(rbFemale);
        rbFemale.setText("Female");

        cbWorkingHours.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "6", "8", "12" }));

        jLabel1.setText("Hours");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtAddress)
                        .addComponent(txtBirthday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtFullName, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                        .addComponent(txtPhoneNumber))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rbMale)
                        .addGap(18, 18, 18)
                        .addComponent(rbFemale)))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtChild)
                            .addComponent(txtClass, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(cbWorkingHours, 0, 59, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btChild)
                            .addComponent(btClass)))
                    .addComponent(txtCharge)
                    .addComponent(txtEmail))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9)
                            .addComponent(txtCharge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbMale)
                            .addComponent(rbFemale))
                        .addGap(30, 30, 30)
                        .addComponent(txtBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(cbWorkingHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(btClass)))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtChild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btChild))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout plTableLayout = new javax.swing.GroupLayout(plTable);
        plTable.setLayout(plTableLayout);
        plTableLayout.setHorizontalGroup(
            plTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plTableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(plButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        plTableLayout.setVerticalGroup(
            plTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plTableLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(plButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(plTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(203, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(plTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
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

    private void btResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResetActionPerformed
        // TODO add your handling code here:
        setText(0);
    }//GEN-LAST:event_btResetActionPerformed

    private void btCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCloseActionPerformed
        // TODO add your handling code here:
        close();
    }//GEN-LAST:event_btCloseActionPerformed

    private void btClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClassActionPerformed
        // TODO add your handling code here:
        getClassCodeAndAgeGroupCode();
}//GEN-LAST:event_btClassActionPerformed

    private void btChildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btChildActionPerformed
        // TODO add your handling code here:
        getChildCode();
    }//GEN-LAST:event_btChildActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btChild;
    private javax.swing.JButton btClass;
    private javax.swing.JButton btClose;
    private javax.swing.JButton btReset;
    private javax.swing.JButton btSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbWorkingHours;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel plButton;
    private javax.swing.JPanel plTable;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JTextField txtAddress;
    private com.toedter.calendar.JDateChooser txtBirthday;
    private javax.swing.JTextField txtCharge;
    private javax.swing.JTextField txtChild;
    private javax.swing.JTextField txtClass;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtPhoneNumber;
    // End of variables declaration//GEN-END:variables

    private void close() {
        for (int i = 0; i < RightPanel.getCount(); i++) {
            if (RightPanel.getTabTitle(Title + " Nanny", i)) {
                RightPanel.RemoveTabAt(i);
            }
        }
    }

    private Boolean check() {
        String strEmail = "\\w+(\\.\\w+)*@\\w+(\\.\\w+)+";
        Date d = new Date();
        if (txtFullName.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please, Enter LastName");
            txtFullName.requestFocus();
            return false;
        } else if (txtAddress.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please, Enter Address");
            txtAddress.requestFocus();
            return false;
        } else if (txtCharge.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please, Enter Charge");
            txtCharge.requestFocus();
            return false;
        } else if (txtClass.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please, Enter Class");
            txtClass.requestFocus();
            return false;
        } //        try {
        //            int age = Integer.parseInt(txtParentMobileNumber.getText());
        //        } catch (Exception e) {
        //            JOptionPane.showMessageDialog(this, "PhoneNumBer must Number");
        //            return;
        //        }
        else if (txtEmail.getText().length() != 0) {
            if (!Pattern.matches(strEmail, txtEmail.getText())) {
                JOptionPane.showMessageDialog(this, "Email no match!");
                txtEmail.requestFocus();
                txtEmail.selectAll();
                return false;
            }
        } else if (txtBirthday.getDate() != null) {
            if (txtBirthday.getCalendar().getTime().after(d)) {
                JOptionPane.showMessageDialog(this, "Birthday Date < today");
                txtBirthday.setDate(null);
                txtBirthday.requestFocus();
                return false;
            }
        }
        return true;
    }

    private void setText(int x) {
        txtAddress.setText("");
        txtPhoneNumber.setText("");
        txtEmail.setText("");
        txtCharge.setText("");
        txtClass.setText("");
        txtChild.setText("");
    }

    private void setText() {
        if (Title.equals("Edit")) {
            if (NannyCode >= 1) {
                nannybl = new NannyBL();
                rs = nannybl.getResult("spGetNanny", NannyCode);
                try {
                    if (rs.next()) {
                        NannyCode = rs.getInt("NannyCode");
                        txtFullName.setText(rs.getString("Name"));
                        txtBirthday.setDate(rs.getDate("YearOfBirth"));
                        txtAddress.setText(rs.getString("Address"));
                        txtPhoneNumber.setText(rs.getString("Phone"));
                        txtEmail.setText(rs.getString("Mail"));
                        txtCharge.setText(rs.getString("Charge"));
                        cbWorkingHours.setSelectedItem(rs.getString("WorkingHours"));
                        txtClass.setText(rs.getString("ClassCode"));
                        txtChild.setText(rs.getString("ChildCode"));
                        if (rs.getBoolean("Sex")) {
                            rbMale.setSelected(true);
                        } else {
                            rbFemale.setSelected(true);
                        }
                        txtFullName.setEditable(false);
                        txtBirthday.setEnabled(false);
                        rbMale.setEnabled(false);
                        rbFemale.setEnabled(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "Not find this ChildCode");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(frmAddOrEditChild.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else if (Title.equals("Add")) {
            txtFullName.setText("");
            txtBirthday.setDate(null);
            txtAddress.setText("");
            txtPhoneNumber.setText("");
            txtEmail.setText("");
            txtCharge.setText("");
            txtClass.setText("");
            txtChild.setText("");

        }
    }

    private void getText() {
        ClassCode = Integer.parseInt(txtClass.getText());
        Name = txtFullName.getText();
        DateOfBirth = txtBirthday.getCalendar().getTime().toLocaleString();
        Sex = "0";
        if (rbMale.isSelected()) {
            Sex = "1";
        }
        Address = txtAddress.getText();
        Phone = txtPhoneNumber.getText();
        Email = txtEmail.getText();
        Charge = txtCharge.getText();
        WorkingHours = cbWorkingHours.getSelectedItem().toString();
        ChildCode = Integer.parseInt(txtChild.getText());
    }

    private void Save() {
        int j = 0;
        nannybl = new NannyBL(Title, NannyCode, ClassCode, ChildCode, Name, DateOfBirth, Sex, Address, Phone, Email, Charge, WorkingHours);
        for (int i = 0; i < RightPanel.getCount(); i++) {
            if (RightPanel.getTabTitle("Nanny List", i)) {
                RightPanel.RemoveTabAt(i);
                j = i;
            }
        }
        if (j > 0) {
            RightPanel.addSubPane("Nanny List", RightPanel, null);
        }
    }

    private void getClassCodeAndAgeGroupCode() {
        SelectClassCode = new frmSelectClasses(null, true);
        SelectClassCode.setVisible(true);
        ClassCode = SelectClassCode.getClassCode();
        AgeGroupCode = SelectClassCode.getAgeGroupCode();
        if (ClassCode != 0) {
            txtClass.setText("" + ClassCode);
        }
    }

    private void getChildCode() {
        SelectChildCode = new frmSelectChild(null, true, AgeGroupCode);
        SelectChildCode.setVisible(true);
        ChildCode = SelectChildCode.getChildCode();
        if (ChildCode != 0) {
            txtChild.setText("" + ChildCode);
        }
    }
}
