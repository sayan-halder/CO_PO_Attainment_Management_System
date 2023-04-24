import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Add_External_Marks extends javax.swing.JFrame {
    MyConnection dbc=new MyConnection();
    Connection conn=dbc.connectme();
    ResultSet rs;
    PreparedStatement pstmt;
    
    public Add_External_Marks() {
        super("ADD EXTERNAL MARKS");
        initComponents();
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
        btnclear = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        usn = new javax.swing.JComboBox<>();
        btnsubmit = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        marks = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        percentage = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true), "Add External Marks", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 0, 20))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ADD EXTERNAL MARKS");

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

        btnclear.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnclear.setText("CLEAR ALL FIELDS");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        btnback.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnback.setText("GO BACK");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("USN");

        usn.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        usn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select USN" }));
        usn.setPreferredSize(new java.awt.Dimension(6, 30));
        usn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usnMouseClicked(evt);
            }
        });

        btnsubmit.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnsubmit.setText("SUBMIT");
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("MARKS");

        marks.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        marks.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("PERCENTAGE");

        percentage.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        percentage.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(491, 491, 491)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                .addComponent(subcode, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(batch, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(semester, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnsubmit)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(percentage, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                                        .addComponent(marks)
                                        .addComponent(usn, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(398, 398, 398)
                        .addComponent(btnclear)
                        .addGap(92, 92, 92)
                        .addComponent(btnback)))
                .addContainerGap(332, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
                    .addComponent(subcode, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(usn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(marks, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(percentage, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnclear)
                    .addComponent(btnback))
                .addContainerGap(202, Short.MAX_VALUE))
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

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        /*academicyear.setSelectedIndex(0);
        semester.setSelectedIndex(0);
        subcode.removeAllItems();
        subcode.addItem("Select subject code");*/
        usn.removeAllItems();
        usn.addItem("Select USN");
        marks.setText("");
        //semester.requestFocus();
    }//GEN-LAST:event_btnclearActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        setVisible(false);
        Home_Page ob=new Home_Page();
        ob.setVisible(true);
    }//GEN-LAST:event_btnbackActionPerformed

    private void usnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usnMouseClicked
        usn.removeAllItems();
        try
        {
            pstmt= conn.prepareStatement("select USN from STUDENT where BATCH=?");
            pstmt.setString(1,batch.getSelectedItem().toString());
            rs= pstmt.executeQuery();
            while(rs.next())
            {
                String code = rs.getString("USN");
                usn.addItem(code);
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_usnMouseClicked

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        try
        {
            pstmt=conn.prepareStatement("insert into EXTERNAL_MARKS (BATCH, SEMESTER, SUBJECT_CODE, USN, MARKS) values (?,?,?,?,?)");
            pstmt.setString(1,batch.getSelectedItem().toString());
            pstmt.setString(2,semester.getSelectedItem().toString());
            pstmt.setString(3,subcode.getSelectedItem().toString());
            pstmt.setString(4,usn.getSelectedItem().toString());
            pstmt.setInt(5,Integer.parseInt(marks.getText()));
            pstmt.execute();

            pstmt=conn.prepareStatement("update EXTERNAL_MARKS set PERCENTAGE = (MARKS * 100) / 60"); //+
                                                             /*"where BATCH=? and SEMESTER=? and SUBJECT_CODE=? and USN=?");
            pstmt.setString(1,academicyear.getSelectedItem().toString());
            pstmt.setString(2,semester.getSelectedItem().toString());
            pstmt.setString(3,subcode.getSelectedItem().toString());
            pstmt.setString(4,usn.getSelectedItem().toString());*/
            pstmt.execute();

            pstmt=conn.prepareStatement("select PERCENTAGE from EXTERNAL_MARKS  where BATCH=? and SEMESTER=? and SUBJECT_CODE=? and USN=?");
            pstmt.setString(1,batch.getSelectedItem().toString());
            pstmt.setString(2,semester.getSelectedItem().toString());
            pstmt.setString(3,subcode.getSelectedItem().toString());
            pstmt.setString(4,usn.getSelectedItem().toString());
            rs=pstmt.executeQuery();

            if(rs.next())
            {
                Float m=rs.getFloat("PERCENTAGE");
                percentage.setText(m.toString());
            }
            
            JOptionPane.showMessageDialog(null,"Marks for external exam  for usn "+ usn.getSelectedItem().toString() +" added successfully!!!!");
        }
        catch(HeadlessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_btnsubmitActionPerformed

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
            java.util.logging.Logger.getLogger(Add_External_Marks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_External_Marks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_External_Marks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_External_Marks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_External_Marks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> batch;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField marks;
    private javax.swing.JTextField percentage;
    private javax.swing.JComboBox<String> semester;
    private javax.swing.JComboBox<String> subcode;
    private javax.swing.JComboBox<String> usn;
    // End of variables declaration//GEN-END:variables
}
