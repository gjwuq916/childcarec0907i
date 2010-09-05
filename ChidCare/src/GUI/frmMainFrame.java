/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainFrame.java
 *
 * Created on Aug 11, 2010, 11:49:29 PM
 */
package GUI;

import GUI.Component.RightPanel;
import Images.ImageHelper;
import com.l2fprod.common.swing.*;
import java.awt.Image;
import java.util.Date;

import javax.swing.*;

/**
 *
 * @author Admin
 */
public class frmMainFrame extends javax.swing.JFrame {

    private JTaskPane taskPane = null;
    private JTaskPaneGroup group = null;
    private JTaskPaneGroup information = null;
    private JSplitPane splitpane = null;
    private JScrollPane leftpanel = null;
    private RightPanel rightpanel = null;
    private frmChildList ChildList = null;
    private ImageIcon infor;
    private ImageIcon logo;
    private ImageIcon add;
    private ImageIcon addsub;
    private JLabel ImageUser;
    private ThreadTime tt;
    private final JLabel fullName;
    private final JLabel Username;
    private final JLabel Phone;
    private final JLabel Email;
    private final JLabel Address;

    /** Creates new form MainFrame */
    public frmMainFrame(String fullname, String username, String phone, String email, String address, boolean admin) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
        }

        ImageUser = new JLabel();

        fullName = new JLabel();

        Username = new JLabel();

        Phone = new JLabel();

        Email = new JLabel();

        Address = new JLabel();

        taskPane = new JTaskPane();

        //taskPane.setSize(300, 400);
        information = new JTaskPaneGroup();
        infor = ImageHelper.loadImage("login.png");
        add = ImageHelper.loadImage("edit_add.png");
        logo = ImageHelper.loadImage("logo.png");
        addsub = ImageHelper.loadImage("feed--plus.png");

        Image image = logo.getImage();
        setIconImage(image);

        addSubComponent(information);

        group = new JTaskPaneGroup();

        SetCombonentBase(fullname, username, phone, email, address);

        taskPane.add(group);

        addLink(group, "Registered Users");
        addLink(group, "Registered Children");
        addLink(group, "Registered Nanny");
        addLink(group, "Registered Age Group");
        addLink(group, "Registered Activite");
        addLink(group, "Registered Class");

        leftpanel = new JScrollPane(taskPane);

        rightpanel = new RightPanel(this);

        splitpane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, true, leftpanel, rightpanel);
        splitpane.setDividerLocation(220);
        splitpane.setOneTouchExpandable(true);

        tt = new ThreadTime();

        initComponents();

        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    private void SetCombonentBase(String fullname, String username, String phone, String email, String address) {

        ImageUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/admin3.png")));
        ImageUser.setPreferredSize(new java.awt.Dimension(80, 80));
        fullName.setText("FullName: " + fullname);
        Username.setText("UserName: " + username);
        Phone.setText("Phone Number: " + phone);
        Email.setText("Email: " + email);
        Address.setText("Address: " + address);
        information.setIcon(infor);
        information.setTitle("Information of the User");
        taskPane.add(information);
        group.setIcon(add);
        group.setTitle("Add Member");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnTaskPanel = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btListOfUser = new javax.swing.JButton();
        btListOfChildrens = new javax.swing.JButton();
        btListOfNanies = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btListOfClass = new javax.swing.JButton();
        btListOfAgeGroups = new javax.swing.JButton();
        btListOfActivities = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jButton1 = new javax.swing.JButton();
        lbTime = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnFile = new javax.swing.JMenu();
        mniLogout = new javax.swing.JMenuItem();
        mniExit = new javax.swing.JMenuItem();
        mnEdit = new javax.swing.JMenu();
        mniEditPersionnal = new javax.swing.JMenuItem();
        mniChangePass = new javax.swing.JMenuItem();
        mnHelp = new javax.swing.JMenu();
        mniHelpContent = new javax.swing.JMenuItem();
        mniAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Child Care - System");

        pnTaskPanel.setLayout(new java.awt.BorderLayout());

        pnTaskPanel.add("Center", splitpane);

        jToolBar1.setRollover(true);

        btListOfUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user-business.png"))); // NOI18N
        btListOfUser.setToolTipText("This is list of the Users !");
        btListOfUser.setFocusable(false);
        btListOfUser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btListOfUser.setMargin(new java.awt.Insets(4, 4, 4, 4));
        btListOfUser.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btListOfUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListOfUserActionPerformed(evt);
            }
        });
        jToolBar1.add(btListOfUser);

        btListOfChildrens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N
        btListOfChildrens.setToolTipText("This is list of the Childrens !");
        btListOfChildrens.setFocusable(false);
        btListOfChildrens.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btListOfChildrens.setMargin(new java.awt.Insets(4, 4, 4, 4));
        btListOfChildrens.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btListOfChildrens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListOfChildrensActionPerformed(evt);
            }
        });
        jToolBar1.add(btListOfChildrens);

        btListOfNanies.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user-female.png"))); // NOI18N
        btListOfNanies.setToolTipText("This is list of the Nanies !");
        btListOfNanies.setFocusable(false);
        btListOfNanies.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btListOfNanies.setMargin(new java.awt.Insets(4, 4, 4, 4));
        btListOfNanies.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btListOfNanies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListOfNaniesActionPerformed(evt);
            }
        });
        jToolBar1.add(btListOfNanies);
        jToolBar1.add(jSeparator1);

        btListOfClass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home.png"))); // NOI18N
        btListOfClass.setToolTipText("This is list of the Classes !");
        btListOfClass.setFocusable(false);
        btListOfClass.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btListOfClass.setMargin(new java.awt.Insets(4, 4, 4, 4));
        btListOfClass.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btListOfClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListOfClassActionPerformed(evt);
            }
        });
        jToolBar1.add(btListOfClass);

        btListOfAgeGroups.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/User.png"))); // NOI18N
        btListOfAgeGroups.setToolTipText("This is list of the Age Groups !");
        btListOfAgeGroups.setFocusable(false);
        btListOfAgeGroups.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btListOfAgeGroups.setMargin(new java.awt.Insets(5, 5, 5, 5));
        btListOfAgeGroups.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btListOfAgeGroups.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListOfAgeGroupsActionPerformed(evt);
            }
        });
        jToolBar1.add(btListOfAgeGroups);

        btListOfActivities.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/microphone.png"))); // NOI18N
        btListOfActivities.setToolTipText("This is list of Activities !");
        btListOfActivities.setFocusable(false);
        btListOfActivities.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btListOfActivities.setMargin(new java.awt.Insets(4, 4, 4, 4));
        btListOfActivities.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btListOfActivities.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListOfActivitiesActionPerformed(evt);
            }
        });
        jToolBar1.add(btListOfActivities);
        jToolBar1.add(jSeparator2);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/globe-green.png"))); // NOI18N
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setMargin(new java.awt.Insets(4, 4, 4, 4));
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton1);

        lbTime.setFont(new java.awt.Font("Times New Roman", 1, 15));
        lbTime.setForeground(new java.awt.Color(204, 0, 51));
        lbTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clock.png"))); // NOI18N
        lbTime.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbTime.setPreferredSize(new java.awt.Dimension(24, 44));
        jToolBar1.add(lbTime);

        tt.start();
        pnTaskPanel.add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        mnFile.setText("File");

        mniLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Log-Out-16x16.png"))); // NOI18N
        mniLogout.setText("Log out");
        mniLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLogoutActionPerformed(evt);
            }
        });
        mnFile.add(mniLogout);

        mniExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit-16x16.png"))); // NOI18N
        mniExit.setText("Exit");
        mniExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniExitActionPerformed(evt);
            }
        });
        mnFile.add(mniExit);

        jMenuBar1.add(mnFile);

        mnEdit.setText("Edit");

        mniEditPersionnal.setText("Edit information persional");
        mnEdit.add(mniEditPersionnal);

        mniChangePass.setText("Change password");
        mnEdit.add(mniChangePass);

        jMenuBar1.add(mnEdit);

        mnHelp.setText("Help");

        mniHelpContent.setText("Help content");
        mnHelp.add(mniHelpContent);

        mniAbout.setText("About");
        mnHelp.add(mniAbout);

        jMenuBar1.add(mnHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnTaskPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 949, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnTaskPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btListOfChildrensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListOfChildrensActionPerformed
        // TODO add your handling code here:
        addSubPane("Child List");
    }//GEN-LAST:event_btListOfChildrensActionPerformed

    private void btListOfUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListOfUserActionPerformed
        // TODO add your handling code here:
        addSubPane("User List");
    }//GEN-LAST:event_btListOfUserActionPerformed

    private void btListOfNaniesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListOfNaniesActionPerformed
        // TODO add your handling code here:
        addSubPane("Nanny List");
    }//GEN-LAST:event_btListOfNaniesActionPerformed

    private void btListOfAgeGroupsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListOfAgeGroupsActionPerformed
        // TODO add your handling code here:
        addSubPane("AgeGroup List");
    }//GEN-LAST:event_btListOfAgeGroupsActionPerformed

    private void btListOfClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListOfClassActionPerformed
        // TODO add your handling code here:
        addSubPane("Class List");
    }//GEN-LAST:event_btListOfClassActionPerformed

    private void btListOfActivitiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListOfActivitiesActionPerformed
        // TODO add your handling code here:
        addSubPane("Activite List");
    }//GEN-LAST:event_btListOfActivitiesActionPerformed

    private void mniExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniExitActionPerformed
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(this, "Are you exit?", "Exit - Child Care",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (choice == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_mniExitActionPerformed

    private void mniLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLogoutActionPerformed
        // TODO add your handling code here:int choice = JOptionPane.showConfirmDialog(this, "Do you want Log out?", "Exit",
        int choice = JOptionPane.showConfirmDialog(this, "Do you want Log out?", "LogOut - Child Care",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (choice == JOptionPane.YES_OPTION) {
            this.setVisible(false);
            new frmLogin(this, true).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_mniLogoutActionPerformed
    /**
     * @param args the command line arguments
    //     */
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//
//            public void run() {
//                new MainFrame().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btListOfActivities;
    private javax.swing.JButton btListOfAgeGroups;
    private javax.swing.JButton btListOfChildrens;
    private javax.swing.JButton btListOfClass;
    private javax.swing.JButton btListOfNanies;
    private javax.swing.JButton btListOfUser;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lbTime;
    private javax.swing.JMenu mnEdit;
    private javax.swing.JMenu mnFile;
    private javax.swing.JMenu mnHelp;
    private javax.swing.JMenuItem mniAbout;
    private javax.swing.JMenuItem mniChangePass;
    private javax.swing.JMenuItem mniEditPersionnal;
    private javax.swing.JMenuItem mniExit;
    private javax.swing.JMenuItem mniHelpContent;
    private javax.swing.JMenuItem mniLogout;
    private javax.swing.JPanel pnTaskPanel;
    // End of variables declaration//GEN-END:variables

    private void addSubPane(String Title) {

        for (int i = 0; i < rightpanel.getCount(); i++) {
            if (rightpanel.getTabTitle(Title, i)) {
                return;
            }
        }

        rightpanel.addSubPane(Title, rightpanel, this);

    }

    private void addSubPane(String Title, String nameParentTab) {

        for (int i = 0; i < rightpanel.getCount(); i++) {
            if (rightpanel.getTabTitle(Title, i)) {
                return;
            }
        }

        rightpanel.addSubPane(Title, 0);

    }

    private void addSubComponent(final JTaskPaneGroup parent) {

        parent.add(ImageUser);
        parent.add(Username);
        parent.add(fullName);
        parent.add(Address);
        parent.add(Phone);
        parent.add(Email);

    }

    private void addLink(final JTaskPaneGroup parent, String Title) {
        if (Title.equals("Registered Users")) {
            Action addUser = new AbstractAction(Title, addsub) {

                public void actionPerformed(java.awt.event.ActionEvent e) {
                    addSubPane("Add User", "User List");
                }
            };
            parent.add(addUser);
        } else if (Title.equals("Registered Children")) {
            Action addUser = new AbstractAction(Title, addsub) {

                public void actionPerformed(java.awt.event.ActionEvent e) {
                    addSubPane("Add Children", "Child List");
                }
            };
            parent.add(addUser);
        } else if (Title.equals("Registered Nanny")) {
            Action addUser = new AbstractAction(Title, addsub) {

                public void actionPerformed(java.awt.event.ActionEvent e) {
                    addSubPane("Add Nanny", "Nanny List");
                }
            };
            parent.add(addUser);
        } else if (Title.equals("Registered Age Group")) {
            Action addUser = new AbstractAction(Title, addsub) {

                public void actionPerformed(java.awt.event.ActionEvent e) {
                    addSubPane("AgeGroup List");
                }
            };
            parent.add(addUser);
        } else if (Title.equals("Registered Activite")) {
            Action addUser = new AbstractAction(Title, addsub) {

                public void actionPerformed(java.awt.event.ActionEvent e) {
                    addSubPane("Activite List");
                }
            };
            parent.add(addUser);
        } else if (Title.equals("Registered Class")) {
            Action addUser = new AbstractAction(Title, addsub) {

                public void actionPerformed(java.awt.event.ActionEvent e) {
                    addSubPane("Class List");
                }
            };
            parent.add(addUser);
        }
    }

    public class ThreadTime extends Thread {

        @Override
        public void run() {

            while (true) {
                Date d = new Date();
                lbTime.setText(d.toString());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
