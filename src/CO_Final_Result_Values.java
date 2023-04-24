import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class CO_Final_Result_Values extends javax.swing.JFrame {
    MyConnection dbc=new MyConnection();
    Connection conn=dbc.connectme();
    ResultSet rs;
    PreparedStatement pstmt;
    
    public CO_Final_Result_Values() {
        super("CO's VALUES ATTAINMENT");
        initComponents();
        jTable1.setRowHeight(35);
    }
    
    public void CalculationUniversity()
    {
        float percentage=0;
        try
        {
            //pstmt=conn.prepareStatement("delete from CO_FINAL_RESULT");
            //pstmt.execute();
            
            for(int i=1;i<=5;i++)
            {
                pstmt=conn.prepareStatement("insert into CO_FINAL_RESULT (BATCH, SEMESTER, SUBJECT_CODE, CO_NUMBER, CO_TARGET) values (?,?,?,?,?)");
                pstmt.setString(1,batch.getSelectedItem().toString());
                pstmt.setString(2,semester.getSelectedItem().toString());
                pstmt.setString(3,subcode.getSelectedItem().toString());
                pstmt.setInt(4,i);
                pstmt.setInt(5,3);
                pstmt.execute();
            }
            
            pstmt=conn.prepareStatement("select * from EXTERNAL_EXAM_RESULT where BATCH=? and SEMESTER=? and SUBJECT_CODE=?");
            pstmt.setString(1,batch.getSelectedItem().toString());
            pstmt.setString(2,semester.getSelectedItem().toString());
            pstmt.setString(3,subcode.getSelectedItem().toString());
            rs=pstmt.executeQuery();
            rs.next();
            percentage=rs.getInt("PERCENTAGE");
            rs.close();
            pstmt.close();
            
            if(percentage >= 60)
            {
                pstmt=conn.prepareStatement("update CO_FINAL_RESULT set ATTAINMENT_LVL_UNIVERSITY = 3 \n"+
                                                                 "where BATCH=? and SEMESTER=? and SUBJECT_CODE=?");
                pstmt.setString(1,batch.getSelectedItem().toString());
                pstmt.setString(2,semester.getSelectedItem().toString());
                pstmt.setString(3,subcode.getSelectedItem().toString());
                pstmt.execute();
            }
            else if(percentage >= 55)
            {
                pstmt=conn.prepareStatement("update CO_FINAL_RESULT set ATTAINMENT_LVL_UNIVERSITY = 2 \n"+
                                                                 "where BATCH=? and SEMESTER=? and SUBJECT_CODE=?");
                pstmt.setString(1,batch.getSelectedItem().toString());
                pstmt.setString(2,semester.getSelectedItem().toString());
                pstmt.setString(3,subcode.getSelectedItem().toString());
                pstmt.execute();
            }
            else if(percentage >= 50)
            {
                pstmt=conn.prepareStatement("update CO_FINAL_RESULT set ATTAINMENT_LVL_UNIVERSITY = 1 \n"+
                                                                 "where BATCH=? and SEMESTER=? and SUBJECT_CODE=?");
                pstmt.setString(1,batch.getSelectedItem().toString());
                pstmt.setString(2,semester.getSelectedItem().toString());
                pstmt.setString(3,subcode.getSelectedItem().toString());
                pstmt.execute();
            }
            else
            {
                pstmt=conn.prepareStatement("update CO_FINAL_RESULT set ATTAINMENT_LVL_UNIVERSITY = 0 \n"+
                                                                 "where BATCH=? and SEMESTER=? and SUBJECT_CODE=?");
                pstmt.setString(1,batch.getSelectedItem().toString());
                pstmt.setString(2,semester.getSelectedItem().toString());
                pstmt.setString(3,subcode.getSelectedItem().toString());
                pstmt.execute();
            }
        }
        catch(SQLException e)
        { 
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public void CalculationIA()
    {
        float percentage=0;
        try
        {
            for(int i=1;i<=5;i++)
            {
                pstmt=conn.prepareStatement("select * from CO_RESULT where BATCH=? and SEMESTER=? and SUBJECT_CODE=? and CO_NUMBER=?");
                pstmt.setString(1,batch.getSelectedItem().toString());
                pstmt.setString(2,semester.getSelectedItem().toString());
                pstmt.setString(3,subcode.getSelectedItem().toString());
                pstmt.setInt(4,i);
                rs=pstmt.executeQuery();
                rs.next();
                percentage=rs.getFloat("PERCENTAGE");

                if(percentage >= 60)
                {
                    pstmt=conn.prepareStatement("update CO_FINAL_RESULT set ATTAINMENT_LVL_IA = 3 \n"+
                                                                     "where BATCH=? and SEMESTER=? and SUBJECT_CODE=? and CO_NUMBER=?");
                    pstmt.setString(1,batch.getSelectedItem().toString());
                    pstmt.setString(2,semester.getSelectedItem().toString());
                    pstmt.setString(3,subcode.getSelectedItem().toString());
                    pstmt.setInt(4,i);
                    pstmt.execute();
                }
                else if(percentage >= 55)
                {
                    pstmt=conn.prepareStatement("update CO_FINAL_RESULT set ATTAINMENT_LVL_IA = 2 \n"+
                                                                     "where BATCH=? and SEMESTER=? and SUBJECT_CODE=? and CO_NUMBER=?");
                    pstmt.setString(1,batch.getSelectedItem().toString());
                    pstmt.setString(2,semester.getSelectedItem().toString());
                    pstmt.setString(3,subcode.getSelectedItem().toString());
                    pstmt.setInt(4,i);
                    pstmt.execute();
                }
                else if(percentage >= 50)
                {
                    pstmt=conn.prepareStatement("update CO_FINAL_RESULT set ATTAINMENT_LVL_IA = 1 \n"+
                                                                     "where BATCH=? and SEMESTER=? and SUBJECT_CODE=? and CO_NUMBER=?");
                    pstmt.setString(1,batch.getSelectedItem().toString());
                    pstmt.setString(2,semester.getSelectedItem().toString());
                    pstmt.setString(3,subcode.getSelectedItem().toString());
                    pstmt.setInt(4,i);
                    pstmt.execute();
                }
                else
                {
                    pstmt=conn.prepareStatement("update CO_FINAL_RESULT set ATTAINMENT_LVL_IA = 0 \n"+
                                                                     "where BATCH=? and SEMESTER=? and SUBJECT_CODE=? and CO_NUMBER=?");
                    pstmt.setString(1,batch.getSelectedItem().toString());
                    pstmt.setString(2,semester.getSelectedItem().toString());
                    pstmt.setString(3,subcode.getSelectedItem().toString());
                    pstmt.setInt(4,i);
                    pstmt.execute();
                }
                
                pstmt=conn.prepareStatement("update CO_FINAL_RESULT set OVERALL_ATTAINMENT = ((0.4*ATTAINMENT_LVL_IA)+(0.6*ATTAINMENT_LVL_UNIVERSITY)) \n"+
                                                                 "where BATCH=? and SEMESTER=? and SUBJECT_CODE=? and CO_NUMBER=?");
                pstmt.setString(1,batch.getSelectedItem().toString());
                pstmt.setString(2,semester.getSelectedItem().toString());
                pstmt.setString(3,subcode.getSelectedItem().toString());
                pstmt.setInt(4,i);
                pstmt.execute();
            }
        }
        catch(SQLException e)
        { 
            JOptionPane.showMessageDialog(null,e);
        }
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
        btnshowbook = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true), "Final CO's Values Attainment", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 0, 20))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CO's VALUES ATTAINMENT");

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

        btnshowbook.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnshowbook.setText("SHOW");
        btnshowbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowbookActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CO", "CO TARGET", "ATTAINMENT LVL-IA", "ATTAINMENT LVL-UNIVERSITY", "OVERALL ATTAINMENT"
            }
        ));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(454, 454, 454)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(semester, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(batch, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(58, 58, 58)
                                .addComponent(subcode, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnshowbook)))
                .addGap(230, 230, 230))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnback)
                .addGap(574, 574, 574))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(batch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(semester, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(subcode, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnshowbook))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
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

    private void btnshowbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowbookActionPerformed
        try
        {
            CalculationUniversity();
            
            CalculationIA();
            
            try
            {            
                pstmt=conn.prepareStatement("select CO_NUMBER as [CO NUMBER], CO_TARGET as [CO TARGET], ATTAINMENT_LVL_IA as [IA ATTAINMENT LEVEL], ATTAINMENT_LVL_UNIVERSITY as [UNIVERSITY ATTAINMENT LEVEL], OVERALL_ATTAINMENT as [OVERALL ATTAINMENT]\n" +
                                                                 "from CO_FINAL_RESULT where BATCH=? and SEMESTER=? and SUBJECT_CODE=?");
                pstmt.setString(1,batch.getSelectedItem().toString());
                pstmt.setString(2,semester.getSelectedItem().toString());
                pstmt.setString(3,subcode.getSelectedItem().toString());
                rs=pstmt.executeQuery();
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            }
            catch(SQLException e)
            { 
                JOptionPane.showMessageDialog(null,e);
            }
        }
        catch(HeadlessException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnshowbookActionPerformed

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
            java.util.logging.Logger.getLogger(CO_Final_Result_Values.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CO_Final_Result_Values.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CO_Final_Result_Values.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CO_Final_Result_Values.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CO_Final_Result_Values().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> batch;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnshowbook;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> semester;
    private javax.swing.JComboBox<String> subcode;
    // End of variables declaration//GEN-END:variables
}
