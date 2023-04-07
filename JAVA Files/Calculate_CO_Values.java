import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class Calculate_CO_Values extends javax.swing.JFrame {
    MyConnection dbc=new MyConnection();
    Connection conn=dbc.connectme();
    ResultSet rs;
    PreparedStatement pstmt;
    
    public Calculate_CO_Values() throws SQLException {
        super("CALCULATE CO's VALUES");
        initComponents();
        jTable1.setRowHeight(35);
        pstmt=conn.prepareStatement("delete from CO_RESULT");
        pstmt.execute();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        semester = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        batch = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        subcode = new javax.swing.JComboBox<>();
        btnback = new javax.swing.JButton();
        btnshow = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        conumber = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true), "Calculate CO's Values", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 0, 20))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CALCULATE CO's VALUES");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SEMESTER");

        semester.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        semester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select semester number", "1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th", "9th", "10th" }));
        semester.setPreferredSize(new java.awt.Dimension(6, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("BATCH");

        batch.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        batch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select batch", "2020-2022", "2021-2023", "2022-2024", "2023-2025", "2024-2026", "2025-2027", "2026-2028", "2027-2029", "2028-2030", "2029-2031", "2030-2032", "2031-2033", "2032-2034" }));
        batch.setPreferredSize(new java.awt.Dimension(6, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SUBJECT CODE");

        subcode.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        subcode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select subject code" }));
        subcode.setPreferredSize(new java.awt.Dimension(6, 30));
        subcode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subcodeMouseClicked(evt);
            }
        });

        btnback.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnback.setText("GO BACK");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        btnshow.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnshow.setText("SHOW");
        btnshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "USN", "PERCENTAGE", "TARGET"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTable1);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("CO");

        conumber.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        conumber.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select CO number", "1", "2", "3", "4", "5" }));
        conumber.setPreferredSize(new java.awt.Dimension(6, 30));

        jTable2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TOTAL STUDENTS", "TOTAL STUDENTS SCORED ABOVE 70% IN THIS CO", "PERCENTAGE"
            }
        ));
        jTable2.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(464, 464, 464)
                                        .addComponent(jLabel5)
                                        .addGap(68, 68, 68))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(batch, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(semester, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(subcode, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(480, 480, 480)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(conumber, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(btnshow))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(559, 559, 559)
                        .addComponent(btnback)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(semester, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(subcode, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(batch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(conumber, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnshow))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnback)
                .addContainerGap())
        );

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

    private void subcodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subcodeMouseClicked
        subcode.removeAllItems();
        try
        {
            pstmt= conn.prepareStatement("select SUBJECT_CODE from SUBJECT where SEMESTER=? and BATCH=?");
            pstmt.setString(1,semester.getSelectedItem().toString());
            pstmt.setString(2,batch.getSelectedItem().toString());
            rs= pstmt.executeQuery();
            while(rs.next())
            {
                String code = rs.getString("SUBJECT_CODE");
                subcode.addItem(code);
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_subcodeMouseClicked

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        setVisible(false);
        Home_Page ob=new Home_Page();
        ob.setVisible(true);
    }//GEN-LAST:event_btnbackActionPerformed

    public void coResult()
    {
        try
        {
            /*********/
            pstmt=conn.prepareStatement("select count(USN) from CO_CALCULATION where BATCH=? and SEMESTER=? and SUBJECT_CODE=? and CO=?" );
            pstmt.setString(1,batch.getSelectedItem().toString());
            pstmt.setString(2,semester.getSelectedItem().toString());
            pstmt.setString(3,subcode.getSelectedItem().toString());
            pstmt.setString(4,conumber.getSelectedItem().toString());
            rs=pstmt.executeQuery();
            rs.next();
            int countStudent = rs.getInt(1);
            
            /*********/
            pstmt=conn.prepareStatement("select count(USN)*100 from CO_CALCULATION where BATCH=? and SEMESTER=? and SUBJECT_CODE=? and CO=? and TARGET='Y'" );
            pstmt.setString(1,batch.getSelectedItem().toString());
            pstmt.setString(2,semester.getSelectedItem().toString());
            pstmt.setString(3,subcode.getSelectedItem().toString());
            pstmt.setString(4,conumber.getSelectedItem().toString());
            rs=pstmt.executeQuery();
            rs.next();
            int countStudentCO = rs.getInt(1);
            
             /*********/
            pstmt=conn.prepareStatement("insert into CO_RESULT (BATCH, SEMESTER, SUBJECT_CODE, CO_NUMBER, TOTAL_STUDENT, TOTAL_CO) values (?,?,?,?,?,?)");
            pstmt.setString(1,batch.getSelectedItem().toString());
            pstmt.setString(2,semester.getSelectedItem().toString());
            pstmt.setString(3,subcode.getSelectedItem().toString());
            pstmt.setInt(4,Integer.parseInt(conumber.getSelectedItem().toString()));
            pstmt.setInt(5,countStudent);
            pstmt.setInt(6,countStudentCO);
            pstmt.execute();
            
            /*********/
            pstmt=conn.prepareStatement("update CO_RESULT set PERCENTAGE=TOTAL_CO / TOTAL_STUDENT \n" + 
                                                             "where BATCH=? and SEMESTER=? and SUBJECT_CODE=? and CO_NUMBER=?");
            pstmt.setString(1,batch.getSelectedItem().toString());
            pstmt.setString(2,semester.getSelectedItem().toString());
            pstmt.setString(3,subcode.getSelectedItem().toString());
            pstmt.setString(4,conumber.getSelectedItem().toString());
            pstmt.execute();
            
            pstmt=conn.prepareStatement("select TOTAL_STUDENT as [TOTAL STUDENTS], TOTAL_CO/100 as [TOTAL STUDENTS SCORED ABOVE 70% IN THIS CO], PERCENTAGE as [PERCENTAGE] from CO_RESULT \n" +
                                                             "where BATCH=? and SEMESTER=? and SUBJECT_CODE=? and CO_NUMBER=?" );
            pstmt.setString(1,batch.getSelectedItem().toString());
            pstmt.setString(2,semester.getSelectedItem().toString());
            pstmt.setString(3,subcode.getSelectedItem().toString());
            pstmt.setString(4,conumber.getSelectedItem().toString());
            rs=pstmt.executeQuery();
            jTable2.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(NumberFormatException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Values for co-"+conumber.getSelectedItem().toString()+" already calculated.");
        }
    }
    
    private void btnshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowActionPerformed
        try
        {
            pstmt=conn.prepareStatement("delete from CO_CALCULATION");
            pstmt.execute();
            
            String con = conumber.getSelectedItem().toString();
            
            if(!"5".equals(con))
            {
                pstmt=conn.prepareStatement("\n" +
                   "insert into CO_CALCULATION (BATCH, SEMESTER, SUBJECT_CODE, USN, CO, COUNT_QUESTION, TOTAL_MARKS)\n" +
                   "select BATCH, SEMESTER, SUBJECT_CODE, USN, CO, count(QUESTION)*8, sum(MARKS)*100\n" +
                   "from IA_MARKS\n" +
                   "where BATCH=? and SEMESTER=? and SUBJECT_CODE=? and CO=? and MARKS>-1\n" +
                   "group by BATCH, SEMESTER, SUBJECT_CODE, USN, CO");
            }
            else
            {
                pstmt=conn.prepareStatement("\n" +
                   "insert into CO_CALCULATION (BATCH, SEMESTER, SUBJECT_CODE, USN, CO, COUNT_QUESTION, TOTAL_MARKS)\n" +
                   "select BATCH, SEMESTER, SUBJECT_CODE, USN, CO, count(QUESTION)*10, sum(MARKS)*100\n" +
                   "from IA_MARKS\n" +
                   "where BATCH=? and SEMESTER=? and SUBJECT_CODE=? and CO=? and MARKS>-1\n" +
                   "group by BATCH, SEMESTER, SUBJECT_CODE, USN, CO");
            }            
            
            pstmt.setString(1,batch.getSelectedItem().toString());
            pstmt.setString(2,semester.getSelectedItem().toString());
            pstmt.setString(3,subcode.getSelectedItem().toString());
            pstmt.setString(4,conumber.getSelectedItem().toString());
            pstmt.execute();
            
            pstmt=conn.prepareStatement("update CO_CALCULATION set PERCENTAGE=TOTAL_MARKS / COUNT_QUESTION");
            pstmt.execute();
            
            pstmt=conn.prepareStatement("update CO_CALCULATION set TARGET = 'Y' where PERCENTAGE >= 70.00");
            pstmt.execute();
            
            pstmt=conn.prepareStatement("update CO_CALCULATION set TARGET = 'N' where PERCENTAGE < 70.00");
            pstmt.execute();
            
            pstmt=conn.prepareStatement("select USN as [USN], PERCENTAGE as [PERCENTAGE], TARGET as [TARGET Y/N] from CO_CALCULATION\n" +
                                                             "where BATCH=? and SEMESTER=? and SUBJECT_CODE=? and CO=?" );
            pstmt.setString(1,batch.getSelectedItem().toString());
            pstmt.setString(2,semester.getSelectedItem().toString());
            pstmt.setString(3,subcode.getSelectedItem().toString());
            pstmt.setString(4,conumber.getSelectedItem().toString());
            rs=pstmt.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
            coResult();
        }
        catch(SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_btnshowActionPerformed

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
            java.util.logging.Logger.getLogger(Calculate_CO_Values.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculate_CO_Values.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculate_CO_Values.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculate_CO_Values.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Calculate_CO_Values().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Calculate_CO_Values.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> batch;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnshow;
    private javax.swing.JComboBox<String> conumber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JComboBox<String> semester;
    private javax.swing.JComboBox<String> subcode;
    // End of variables declaration//GEN-END:variables
}
