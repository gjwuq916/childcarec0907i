/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * frmNannyList.java
 *
 * Created on Aug 12, 2010, 8:13:41 AM
 */
package GUI;

import BL.NannyBL;
import DAL.ResulSetTableModel;
import GUI.Component.RightPanel;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class frmNannyList extends javax.swing.JPanel {

    private ResulSetTableModel rtm;
    private RightPanel rightpanel;

    /** Creates new form frmNannyList */
    public frmNannyList(RightPanel rightPanel) {
        rightpanel = rightPanel;
        rtm = new ResulSetTableModel();
        rtm.setHostURL();
        rtm.setQuery("Execute spGetAlltbl_Nanny");
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        plSearchAndSort = new javax.swing.JPanel();
        cbSort = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        txtSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btSearch = new javax.swing.JButton();
        plTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbNannyList = new javax.swing.JTable();
        plButton = new javax.swing.JPanel();
        btAdd = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();

        cbSort.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSortActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/webdev-search-16x16.png"))); // NOI18N
        jLabel1.setText("Sort by:");

        btSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search-16x16.png"))); // NOI18N
        btSearch.setText(" Search");
        btSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout plSearchAndSortLayout = new javax.swing.GroupLayout(plSearchAndSort);
        plSearchAndSort.setLayout(plSearchAndSortLayout);
        plSearchAndSortLayout.setHorizontalGroup(
            plSearchAndSortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plSearchAndSortLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addComponent(cbSort, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btSearch)
                .addGap(22, 22, 22))
        );
        plSearchAndSortLayout.setVerticalGroup(
            plSearchAndSortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plSearchAndSortLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(plSearchAndSortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSearch))
                .addContainerGap(6, Short.MAX_VALUE))
        );

        plTable.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "List of the Nannies", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        tbNannyList.setModel(rtm);
        jScrollPane1.setViewportView(tbNannyList);

        javax.swing.GroupLayout plTableLayout = new javax.swing.GroupLayout(plTable);
        plTable.setLayout(plTableLayout);
        plTableLayout.setHorizontalGroup(
            plTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 836, Short.MAX_VALUE)
        );
        plTableLayout.setVerticalGroup(
            plTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plTableLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                .addContainerGap())
        );

        btAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add-16x16.png"))); // NOI18N
        btAdd.setText("  Add");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        btEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Edit-16x16.png"))); // NOI18N
        btEdit.setText("  Edit");
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });

        btDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete-16x16.png"))); // NOI18N
        btDelete.setText("  Delete");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout plButtonLayout = new javax.swing.GroupLayout(plButton);
        plButton.setLayout(plButtonLayout);
        plButtonLayout.setHorizontalGroup(
            plButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plButtonLayout.createSequentialGroup()
                .addContainerGap(544, Short.MAX_VALUE)
                .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btDelete)
                .addGap(37, 37, 37))
        );
        plButtonLayout.setVerticalGroup(
            plButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAdd)
                    .addComponent(btEdit)
                    .addComponent(btDelete))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(plSearchAndSort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(plTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(plButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(plSearchAndSort, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(plTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(plButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchActionPerformed
        // TODO add your handling code here:
        Event("Search");
    }//GEN-LAST:event_btSearchActionPerformed

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        // TODO add your handling code here:
        Event("Add");
    }//GEN-LAST:event_btAddActionPerformed

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
        // TODO add your handling code here:
        Event("Edit");
    }//GEN-LAST:event_btEditActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        // TODO add your handling code here:
        Event("Delete");
        getDataSource();
    }//GEN-LAST:event_btDeleteActionPerformed

    private void cbSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSortActionPerformed
        // TODO add your handling code here:
        Event("Sort");
    }//GEN-LAST:event_cbSortActionPerformed

    private void Event(String evt) {
        int NannyCode;
        if (evt.equals("Delete")) {
            if ((tbNannyList.getSelectedRow()) != -1) {
                NannyCode = Integer.parseInt(tbNannyList.getValueAt(tbNannyList.getSelectedRow(), 0).toString());
                int i = CreateOptionDialog("Are you sure want delete this Nanny ?", "Delete Activite - Child Care");

                if (i == 0) {
                    // TODO add your handling code here:
                    NannyBL nannybl = new NannyBL("Delete", NannyCode);
                }
            } else {
                CreateWarningDialog("Please select Nanny you want delete !", "Warning - Child Care");
            }
        } else if (evt.equals("Edit")) {
            if ((tbNannyList.getSelectedRow()) != -1) {
                NannyCode = Integer.parseInt(tbNannyList.getValueAt(tbNannyList.getSelectedRow(), 0).toString());
                for (int i = 0; i < rightpanel.getCount(); i++) {
                    if (rightpanel.getTabTitle("Edit Nanny", i)) {
                        return;
                    }
                }

                rightpanel.addSubPane("Edit Nanny", NannyCode);
            } else {
                CreateWarningDialog("Please select Nanny you want edit !", "Warning - Child Care");
            }
        } else if (evt.equals("Add")) {
            for (int i = 0; i < rightpanel.getCount(); i++) {
                if (rightpanel.getTabTitle("Add Nanny", i)) {
                    return;
                }
            }

            rightpanel.addSubPane("Add Nanny", 0);
        } else if (evt.equals("Search")) {
            // TODO add your handling code here:
            if ((txtSearch.getText().equals("")) || (txtSearch.getText() == null)) {
                CreateWarningDialog("Please enter Nanny you want search !", "Warning - Child Care");
            } else {
                // TODO add your handling code here:
            }
        } else if (evt.equals("Sort")) {
            // TODO add your handling code here:
//            if ((tbNannyList.getSelectedRow()) != -1) {
//                // TODO add your handling code here:
//            } else {
//                CreateWarningDialog("Please select activite you want view !", "Warning - Child Care");
//            }
        }
    }

    private void CreateWarningDialog(String info, String title) {
        JOptionPane.showMessageDialog(this, info, title, JOptionPane.WARNING_MESSAGE);
    }

    private int CreateOptionDialog(String info, String title) {
        Object[] options = {"Yes", "No"};
        int confirm = JOptionPane.showOptionDialog(this, info, title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        return confirm;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btEdit;
    private javax.swing.JButton btSearch;
    private javax.swing.JComboBox cbSort;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel plButton;
    private javax.swing.JPanel plSearchAndSort;
    private javax.swing.JPanel plTable;
    private javax.swing.JTable tbNannyList;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void getDataSource() {
        rtm = new ResulSetTableModel();
        rtm.setHostURL();
        rtm.setQuery("Execute spGetAlltbl_Nanny");
        tbNannyList.setModel(rtm);
    }
}
