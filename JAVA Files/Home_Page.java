import java.awt.Image;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Home_Page extends javax.swing.JFrame {

    public Home_Page() {
        super("HOME PAGE");
        initComponents();
        //this.setExtendedState(this.getExtendedState() | Home_Page.MAXIMIZED_BOTH);
        imageSize();
    }
    
    public void imageSize()
    {
        ImageIcon icon1 = new ImageIcon("C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\CPAMS\\src\\bmslogo.png");
        Image img1 = icon1.getImage();
        Image imgScale1 = img1.getScaledInstance(jLabel11.getWidth(), jLabel11.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon1 = new ImageIcon(imgScale1);
        jLabel11.setIcon(scaledIcon1);
        
        ImageIcon icon2 = new ImageIcon("C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\CPAMS\\src\\bmsit.jpg");
        Image img2 = icon2.getImage();
        Image imgScale2 = img2.getScaledInstance(jLabel22.getWidth(), jLabel22.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon2 = new ImageIcon(imgScale2);
        jLabel22.setIcon(scaledIcon2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        btnaddstudent = new javax.swing.JButton();
        btnaddsubject = new javax.swing.JButton();
        iaco = new javax.swing.JButton();
        iamarks = new javax.swing.JButton();
        cocalculation = new javax.swing.JButton();
        coresult = new javax.swing.JButton();
        externalmarks = new javax.swing.JButton();
        externalexamresult = new javax.swing.JButton();
        podetails = new javax.swing.JButton();
        poresult = new javax.swing.JButton();
        poresult1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        filemenu = new javax.swing.JMenu();
        logoutmenuitem = new javax.swing.JMenuItem();
        exitmenuitem = new javax.swing.JMenuItem();
        viewmenu = new javax.swing.JMenu();
        regstudmenuitem = new javax.swing.JMenuItem();
        regsubmenuitem = new javax.swing.JMenuItem();
        regiacomenuitem = new javax.swing.JMenuItem();
        regiamarksmenuitem = new javax.swing.JMenuItem();
        regexternalmarksmenuitem = new javax.swing.JMenuItem();
        regpodetailsmenuitem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 51, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setToolTipText("");
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        btnaddstudent.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnaddstudent.setText("ADD NEW STUDENT");
        btnaddstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddstudentActionPerformed(evt);
            }
        });

        btnaddsubject.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnaddsubject.setText("ADD NEW SUBJECT");
        btnaddsubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddsubjectActionPerformed(evt);
            }
        });

        iaco.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        iaco.setText("ADD IA CO's");
        iaco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iacoActionPerformed(evt);
            }
        });

        iamarks.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        iamarks.setText("ADD IA MARKS");
        iamarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iamarksActionPerformed(evt);
            }
        });

        cocalculation.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        cocalculation.setText("CALCULATE CO");
        cocalculation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cocalculationActionPerformed(evt);
            }
        });

        coresult.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        coresult.setText("CO ATTAINMENT");
        coresult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coresultActionPerformed(evt);
            }
        });

        externalmarks.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        externalmarks.setText("ADD EXTERNAL MARKS");
        externalmarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                externalmarksActionPerformed(evt);
            }
        });

        externalexamresult.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        externalexamresult.setText("EXTERNAL EXAM RESULT");
        externalexamresult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                externalexamresultActionPerformed(evt);
            }
        });

        podetails.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        podetails.setText("ADD PO DETAILS");
        podetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                podetailsActionPerformed(evt);
            }
        });

        poresult.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        poresult.setText("PO RESULT");
        poresult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poresultActionPerformed(evt);
            }
        });

        poresult1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        poresult1.setText("FINAL PO RESULT");
        poresult1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poresult1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(iaco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cocalculation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnaddsubject, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(externalmarks, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(externalexamresult, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnaddstudent, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(coresult, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(podetails, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(poresult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(poresult1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(iamarks, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(156, 156, 156))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(btnaddstudent)
                .addGap(18, 18, 18)
                .addComponent(btnaddsubject)
                .addGap(18, 18, 18)
                .addComponent(iaco)
                .addGap(18, 18, 18)
                .addComponent(iamarks)
                .addGap(18, 18, 18)
                .addComponent(cocalculation)
                .addGap(18, 18, 18)
                .addComponent(externalmarks)
                .addGap(18, 18, 18)
                .addComponent(externalexamresult)
                .addGap(18, 18, 18)
                .addComponent(coresult)
                .addGap(18, 18, 18)
                .addComponent(podetails)
                .addGap(18, 18, 18)
                .addComponent(poresult)
                .addGap(18, 18, 18)
                .addComponent(poresult1)
                .addContainerGap(102, Short.MAX_VALUE))
            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenuBar1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N

        filemenu.setText("FILE");
        filemenu.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N

        logoutmenuitem.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        logoutmenuitem.setText("Logout");
        logoutmenuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutmenuitemActionPerformed(evt);
            }
        });
        filemenu.add(logoutmenuitem);

        exitmenuitem.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        exitmenuitem.setText("Exit");
        exitmenuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitmenuitemActionPerformed(evt);
            }
        });
        filemenu.add(exitmenuitem);

        jMenuBar1.add(filemenu);

        viewmenu.setText("VIEW");
        viewmenu.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N

        regstudmenuitem.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        regstudmenuitem.setText("Registered Students");
        regstudmenuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regstudmenuitemActionPerformed(evt);
            }
        });
        viewmenu.add(regstudmenuitem);

        regsubmenuitem.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        regsubmenuitem.setText("Registered Subjects");
        regsubmenuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regsubmenuitemActionPerformed(evt);
            }
        });
        viewmenu.add(regsubmenuitem);

        regiacomenuitem.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        regiacomenuitem.setText("IA COs");
        regiacomenuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regiacomenuitemActionPerformed(evt);
            }
        });
        viewmenu.add(regiacomenuitem);

        regiamarksmenuitem.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        regiamarksmenuitem.setText("IA Marks");
        regiamarksmenuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regiamarksmenuitemActionPerformed(evt);
            }
        });
        viewmenu.add(regiamarksmenuitem);

        regexternalmarksmenuitem.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        regexternalmarksmenuitem.setText("External Marks");
        regexternalmarksmenuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regexternalmarksmenuitemActionPerformed(evt);
            }
        });
        viewmenu.add(regexternalmarksmenuitem);

        regpodetailsmenuitem.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        regpodetailsmenuitem.setText("PO Details");
        regpodetailsmenuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regpodetailsmenuitemActionPerformed(evt);
            }
        });
        viewmenu.add(regpodetailsmenuitem);

        jMenuBar1.add(viewmenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutmenuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutmenuitemActionPerformed
        setVisible(false);
        Login_Menu ob=new Login_Menu();
        ob.setVisible(true);
    }//GEN-LAST:event_logoutmenuitemActionPerformed

    private void exitmenuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitmenuitemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitmenuitemActionPerformed

    private void regstudmenuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regstudmenuitemActionPerformed
        setVisible(false);
        Show_Students ob=new Show_Students();
        ob.setVisible(true);
    }//GEN-LAST:event_regstudmenuitemActionPerformed

    private void regsubmenuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regsubmenuitemActionPerformed
        setVisible(false);
        Show_Subjects ob=new Show_Subjects();
        ob.setVisible(true);
    }//GEN-LAST:event_regsubmenuitemActionPerformed

    private void btnaddstudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddstudentActionPerformed
        setVisible(false);
        New_Student ob = new New_Student();
        ob.setVisible(true);
    }//GEN-LAST:event_btnaddstudentActionPerformed

    private void btnaddsubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddsubjectActionPerformed
        setVisible(false);
        New_Subject ob=new New_Subject();
        ob.setVisible(true);
    }//GEN-LAST:event_btnaddsubjectActionPerformed

    private void iamarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iamarksActionPerformed
        setVisible(false);
        Add_IA_Marks ob = new Add_IA_Marks();
        ob.setVisible(true);
    }//GEN-LAST:event_iamarksActionPerformed

    private void cocalculationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cocalculationActionPerformed
        try
        {
            setVisible(false);
            Calculate_CO_Values ob = new Calculate_CO_Values();
            ob.setVisible(true);
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_cocalculationActionPerformed

    private void coresultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coresultActionPerformed
        setVisible(false);
        CO_Final_Result_Values ob = new CO_Final_Result_Values();
        ob.setVisible(true);
    }//GEN-LAST:event_coresultActionPerformed

    private void externalmarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_externalmarksActionPerformed
        setVisible(false);
        Add_External_Marks ob = new Add_External_Marks();
        ob.setVisible(true);
    }//GEN-LAST:event_externalmarksActionPerformed

    private void externalexamresultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_externalexamresultActionPerformed
        setVisible(false);
        External_Marks_Result ob = new External_Marks_Result();
        ob.setVisible(true);
    }//GEN-LAST:event_externalexamresultActionPerformed

    private void podetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_podetailsActionPerformed
        setVisible(false);
        Add_POs ob = new Add_POs();
        ob.setVisible(true);
    }//GEN-LAST:event_podetailsActionPerformed

    private void poresultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poresultActionPerformed
        setVisible(false);
        Calculate_PO_Values ob = new Calculate_PO_Values();
        ob.setVisible(true);
    }//GEN-LAST:event_poresultActionPerformed

    private void poresult1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poresult1ActionPerformed
        setVisible(false);
        PO_Final_Result_Values ob = new PO_Final_Result_Values();
        ob.setVisible(true);
    }//GEN-LAST:event_poresult1ActionPerformed

    private void regiacomenuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regiacomenuitemActionPerformed
        setVisible(false);
        Show_IA_COs ob = new Show_IA_COs();
        ob.setVisible(true);
    }//GEN-LAST:event_regiacomenuitemActionPerformed

    private void regiamarksmenuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regiamarksmenuitemActionPerformed
        setVisible(false);
        Show_IA_Marks ob = new Show_IA_Marks();
        ob.setVisible(true);
    }//GEN-LAST:event_regiamarksmenuitemActionPerformed

    private void regpodetailsmenuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regpodetailsmenuitemActionPerformed
        setVisible(false);
        Show_PO_Details ob = new Show_PO_Details();
        ob.setVisible(true);
    }//GEN-LAST:event_regpodetailsmenuitemActionPerformed

    private void regexternalmarksmenuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regexternalmarksmenuitemActionPerformed
        setVisible(false);
        Show_External_Marks ob = new Show_External_Marks();
        ob.setVisible(true);
    }//GEN-LAST:event_regexternalmarksmenuitemActionPerformed

    private void iacoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iacoActionPerformed
        setVisible(false);
        Add_COs ob=new Add_COs();
        ob.setVisible(true);
    }//GEN-LAST:event_iacoActionPerformed

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
            java.util.logging.Logger.getLogger(Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddstudent;
    private javax.swing.JButton btnaddsubject;
    private javax.swing.JButton cocalculation;
    private javax.swing.JButton coresult;
    private javax.swing.JMenuItem exitmenuitem;
    private javax.swing.JButton externalexamresult;
    private javax.swing.JButton externalmarks;
    private javax.swing.JMenu filemenu;
    private javax.swing.JButton iaco;
    private javax.swing.JButton iamarks;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem logoutmenuitem;
    private javax.swing.JButton podetails;
    private javax.swing.JButton poresult;
    private javax.swing.JButton poresult1;
    private javax.swing.JMenuItem regexternalmarksmenuitem;
    private javax.swing.JMenuItem regiacomenuitem;
    private javax.swing.JMenuItem regiamarksmenuitem;
    private javax.swing.JMenuItem regpodetailsmenuitem;
    private javax.swing.JMenuItem regstudmenuitem;
    private javax.swing.JMenuItem regsubmenuitem;
    private javax.swing.JMenu viewmenu;
    // End of variables declaration//GEN-END:variables
}
