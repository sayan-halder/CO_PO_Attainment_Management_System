import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Add_IA_Marks extends javax.swing.JFrame {
    MyConnection dbc=new MyConnection();
    Connection conn=dbc.connectme();
    ResultSet rs;
    PreparedStatement pstmt;
    
    public Add_IA_Marks() {
        super("ADD IA MARKS");
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
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        btnclear = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        q1 = new javax.swing.JComboBox<>();
        q5 = new javax.swing.JComboBox<>();
        q2 = new javax.swing.JComboBox<>();
        q6 = new javax.swing.JComboBox<>();
        q3 = new javax.swing.JComboBox<>();
        q7 = new javax.swing.JComboBox<>();
        q4 = new javax.swing.JComboBox<>();
        q8 = new javax.swing.JComboBox<>();
        asgn = new javax.swing.JComboBox<>();
        iano = new javax.swing.JComboBox<>();
        btnsubmit = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        usn = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true), "Add IA Marks", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 0, 20))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ADD INTERNAL ASSESSMENT MARKS");

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

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("IA NUMBER");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Q1");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Q5");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Q2");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Q6");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Q3");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Q7");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Q4");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Q8");

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("ASSINGMENT");

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("CO");

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

        q1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        q1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select marks", "Not Attempted", "0", "1", "2", "3", "4", "5", "6", "7", "8" }));
        q1.setPreferredSize(new java.awt.Dimension(6, 30));

        q5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        q5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select marks", "Not Attempted", "0", "1", "2", "3", "4", "5", "6", "7", "8" }));
        q5.setPreferredSize(new java.awt.Dimension(6, 30));

        q2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        q2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select marks", "Not Attempted", "0", "1", "2", "3", "4", "5", "6", "7", "8" }));
        q2.setPreferredSize(new java.awt.Dimension(6, 30));

        q6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        q6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select marks", "Not Attempted", "0", "1", "2", "3", "4", "5", "6", "7", "8" }));
        q6.setPreferredSize(new java.awt.Dimension(6, 30));

        q3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        q3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select marks", "Not Attempted", "0", "1", "2", "3", "4", "5", "6", "7", "8" }));
        q3.setPreferredSize(new java.awt.Dimension(6, 30));

        q7.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        q7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select marks", "Not Attempted", "0", "1", "2", "3", "4", "5", "6", "7", "8" }));
        q7.setPreferredSize(new java.awt.Dimension(6, 30));

        q4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        q4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select marks", "Not Attempted", "0", "1", "2", "3", "4", "5", "6", "7", "8" }));
        q4.setPreferredSize(new java.awt.Dimension(6, 30));

        q8.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        q8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select marks", "Not Attempted", "0", "1", "2", "3", "4", "5", "6", "7", "8" }));
        q8.setPreferredSize(new java.awt.Dimension(6, 30));

        asgn.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        asgn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select marks", "Not Attempted", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        asgn.setPreferredSize(new java.awt.Dimension(6, 30));

        iano.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        iano.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Internal Assessment number", "1st", "2nd", "3rd" }));
        iano.setPreferredSize(new java.awt.Dimension(6, 30));

        btnsubmit.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnsubmit.setText("SUBMIT");
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap(347, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(iano, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(subcode, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(semester, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(usn, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel28)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel29)
                                    .addGap(18, 18, 18)
                                    .addComponent(asgn, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(137, 137, 137))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(btnsubmit)
                                            .addGap(48, 48, 48)
                                            .addComponent(btnclear)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnback))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel8)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(q2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel6)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(q1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel10)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(q3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel13)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(q4, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(106, 106, 106)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel7)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(q5, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel9)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(q6, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel11)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(q7, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel15)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(q8, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                    .addGap(45, 45, 45))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(322, 322, 322)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(batch, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(390, 390, 390)
                        .addComponent(jLabel5)))
                .addContainerGap(332, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(subcode, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iano, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(q5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(q7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(q3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(q8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(q4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29)
                    .addComponent(asgn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnback)
                    .addComponent(btnsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnclear))
                .addContainerGap(82, Short.MAX_VALUE))
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
        /*semester.setSelectedIndex(0);
        academicyear.setSelectedIndex(0);
        subcode.removeAllItems();
        subcode.addItem("Select subject code");
        iano.setSelectedIndex(0);*/
        usn.removeAllItems();
        usn.addItem("Select USN");
        q1.setSelectedIndex(0);
        q5.setSelectedIndex(0);
        q2.setSelectedIndex(0);
        q6.setSelectedIndex(0);
        q3.setSelectedIndex(0);
        q7.setSelectedIndex(0);
        q4.setSelectedIndex(0);
        q8.setSelectedIndex(0);
        asgn.setSelectedIndex(0);
        semester.requestFocus();
    }//GEN-LAST:event_btnclearActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        setVisible(false);
        Home_Page ob=new Home_Page();
        ob.setVisible(true);
    }//GEN-LAST:event_btnbackActionPerformed

    public int fetchCOValue(int q)
    {
        int co = 0;
        try
        {
            pstmt=conn.prepareStatement("select * from IA_COS where BATCH=? and SEMESTER=? and SUBJECT_CODE=? and IA_NUMBER=? and QUESTION=?");
            pstmt.setString(1,batch.getSelectedItem().toString());
            pstmt.setString(2,semester.getSelectedItem().toString());
            pstmt.setString(3,subcode.getSelectedItem().toString());
            pstmt.setString(4,iano.getSelectedItem().toString());
            pstmt.setString(5,String.valueOf(q));
            rs=pstmt.executeQuery();
            if(rs.next())
            {
                co = rs.getInt("CO");
                rs.close();
                pstmt.close();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Subject code not found1!!!!","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(HeadlessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        return co;
    }
    
    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        int co = 0;
        try
        {
            co = fetchCOValue(1);
            pstmt=conn.prepareStatement("insert into IA_MARKS (BATCH, SEMESTER, SUBJECT_CODE, IA_NUMBER, USN, QUESTION, CO, MARKS) values (?,?,?,?,?,?,?,?)");
            pstmt.setString(1,batch.getSelectedItem().toString());
            pstmt.setString(2,semester.getSelectedItem().toString());
            pstmt.setString(3,subcode.getSelectedItem().toString());
            pstmt.setString(4,iano.getSelectedItem().toString());
            pstmt.setString(5,usn.getSelectedItem().toString());
            pstmt.setInt(6,1);
            pstmt.setString(7,Integer.toString(co));
            if(!"Not Attempted".equals(q1.getSelectedItem().toString()))
                pstmt.setInt(8,Integer.parseInt(q1.getSelectedItem().toString()));
            else
                pstmt.setInt(8,-1);
            pstmt.execute();

            co = fetchCOValue(2);
            pstmt=conn.prepareStatement("insert into IA_MARKS (BATCH, SEMESTER, SUBJECT_CODE, IA_NUMBER, USN, QUESTION, CO, MARKS) values (?,?,?,?,?,?,?,?)");
            pstmt.setString(1,batch.getSelectedItem().toString());
            pstmt.setString(2,semester.getSelectedItem().toString());
            pstmt.setString(3,subcode.getSelectedItem().toString());
            pstmt.setString(4,iano.getSelectedItem().toString());
            pstmt.setString(5,usn.getSelectedItem().toString());
            pstmt.setInt(6,2);
            pstmt.setString(7,Integer.toString(co));
            if(!"Not Attempted".equals(q2.getSelectedItem().toString()))
                pstmt.setInt(8,Integer.parseInt(q2.getSelectedItem().toString()));
            else
                pstmt.setInt(8,-1);
            pstmt.execute();

            co = fetchCOValue(3);
            pstmt=conn.prepareStatement("insert into IA_MARKS (BATCH, SEMESTER, SUBJECT_CODE, IA_NUMBER, USN, QUESTION, CO, MARKS) values (?,?,?,?,?,?,?,?)");
            pstmt.setString(1,batch.getSelectedItem().toString());
            pstmt.setString(2,semester.getSelectedItem().toString());
            pstmt.setString(3,subcode.getSelectedItem().toString());
            pstmt.setString(4,iano.getSelectedItem().toString());
            pstmt.setString(5,usn.getSelectedItem().toString());
            pstmt.setInt(6,3);
            pstmt.setString(7,Integer.toString(co));
            if(!"Not Attempted".equals(q3.getSelectedItem().toString()))
                pstmt.setInt(8,Integer.parseInt(q3.getSelectedItem().toString()));
            else
                pstmt.setInt(8,-1);
            pstmt.execute();

            co = fetchCOValue(4);
            pstmt=conn.prepareStatement("insert into IA_MARKS (BATCH, SEMESTER, SUBJECT_CODE, IA_NUMBER, USN, QUESTION, CO, MARKS) values (?,?,?,?,?,?,?,?)");
            pstmt.setString(1,batch.getSelectedItem().toString());
            pstmt.setString(2,semester.getSelectedItem().toString());
            pstmt.setString(3,subcode.getSelectedItem().toString());
            pstmt.setString(4,iano.getSelectedItem().toString());
            pstmt.setString(5,usn.getSelectedItem().toString());
            pstmt.setInt(6,4);
            pstmt.setString(7,Integer.toString(co));
            if(!"Not Attempted".equals(q4.getSelectedItem().toString()))
                pstmt.setInt(8,Integer.parseInt(q4.getSelectedItem().toString()));
            else
                pstmt.setInt(8,-1);
            pstmt.execute();

            co = fetchCOValue(5);
            pstmt=conn.prepareStatement("insert into IA_MARKS (BATCH, SEMESTER, SUBJECT_CODE, IA_NUMBER, USN, QUESTION, CO, MARKS) values (?,?,?,?,?,?,?,?)");
            pstmt.setString(1,batch.getSelectedItem().toString());
            pstmt.setString(2,semester.getSelectedItem().toString());
            pstmt.setString(3,subcode.getSelectedItem().toString());
            pstmt.setString(4,iano.getSelectedItem().toString());
            pstmt.setString(5,usn.getSelectedItem().toString());
            pstmt.setInt(6,5);
            pstmt.setString(7,Integer.toString(co));
            if(!"Not Attempted".equals(q5.getSelectedItem().toString()))
                pstmt.setInt(8,Integer.parseInt(q5.getSelectedItem().toString()));
            else
                pstmt.setInt(8,-1);
            pstmt.execute();

            co = fetchCOValue(6);
            pstmt=conn.prepareStatement("insert into IA_MARKS (BATCH, SEMESTER, SUBJECT_CODE, IA_NUMBER, USN, QUESTION, CO, MARKS) values (?,?,?,?,?,?,?,?)");
            pstmt.setString(1,batch.getSelectedItem().toString());
            pstmt.setString(2,semester.getSelectedItem().toString());
            pstmt.setString(3,subcode.getSelectedItem().toString());
            pstmt.setString(4,iano.getSelectedItem().toString());
            pstmt.setString(5,usn.getSelectedItem().toString());
            pstmt.setInt(6,6);
            pstmt.setString(7,Integer.toString(co));
            if(!"Not Attempted".equals(q6.getSelectedItem().toString()))
                pstmt.setInt(8,Integer.parseInt(q6.getSelectedItem().toString()));
            else
                pstmt.setInt(8,-1);
            pstmt.execute();

            co = fetchCOValue(7);
            pstmt=conn.prepareStatement("insert into IA_MARKS (BATCH, SEMESTER, SUBJECT_CODE, IA_NUMBER, USN, QUESTION, CO, MARKS) values (?,?,?,?,?,?,?,?)");
            pstmt.setString(1,batch.getSelectedItem().toString());
            pstmt.setString(2,semester.getSelectedItem().toString());
            pstmt.setString(3,subcode.getSelectedItem().toString());
            pstmt.setString(4,iano.getSelectedItem().toString());
            pstmt.setString(5,usn.getSelectedItem().toString());
            pstmt.setInt(6,7);
            pstmt.setString(7,Integer.toString(co));
            if(!"Not Attempted".equals(q7.getSelectedItem().toString()))
                pstmt.setInt(8,Integer.parseInt(q7.getSelectedItem().toString()));
            else
                pstmt.setInt(8,-1);
            pstmt.execute();

            co = fetchCOValue(8);
            pstmt=conn.prepareStatement("insert into IA_MARKS (BATCH, SEMESTER, SUBJECT_CODE, IA_NUMBER, USN, QUESTION, CO, MARKS) values (?,?,?,?,?,?,?,?)");
            pstmt.setString(1,batch.getSelectedItem().toString());
            pstmt.setString(2,semester.getSelectedItem().toString());
            pstmt.setString(3,subcode.getSelectedItem().toString());
            pstmt.setString(4,iano.getSelectedItem().toString());
            pstmt.setString(5,usn.getSelectedItem().toString());
            pstmt.setInt(6,8);
            pstmt.setString(7,Integer.toString(co));
            if(!"Not Attempted".equals(q8.getSelectedItem().toString()))
                pstmt.setInt(8,Integer.parseInt(q8.getSelectedItem().toString()));
            else
                pstmt.setInt(8,-1);
            pstmt.execute();

            co = fetchCOValue(9);
            pstmt=conn.prepareStatement("insert into IA_MARKS (BATCH, SEMESTER, SUBJECT_CODE, IA_NUMBER, USN, QUESTION, CO, MARKS) values (?,?,?,?,?,?,?,?)");
            pstmt.setString(1,batch.getSelectedItem().toString());
            pstmt.setString(2,semester.getSelectedItem().toString());
            pstmt.setString(3,subcode.getSelectedItem().toString());
            pstmt.setString(4,iano.getSelectedItem().toString());
            pstmt.setString(5,usn.getSelectedItem().toString());
            pstmt.setInt(6,9);
            pstmt.setString(7,Integer.toString(co));
            if(!"Not Attempted".equals(asgn.getSelectedItem().toString()))
                pstmt.setInt(8,Integer.parseInt(asgn.getSelectedItem().toString()));
            else
                pstmt.setInt(8,-1);
            pstmt.execute();

            JOptionPane.showMessageDialog(null,"Marks for Internal Assessment "+ iano.getSelectedItem().toString() +" for usn "+ usn.getSelectedItem().toString() +" added successfully!!!!");
            
            pstmt=conn.prepareStatement("insert into IAM (BATCH, SEMESTER, SUBJECT_CODE, IA_NUMBER, USN, Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pstmt.setString(1,batch.getSelectedItem().toString());
            pstmt.setString(2,semester.getSelectedItem().toString());
            pstmt.setString(3,subcode.getSelectedItem().toString());
            pstmt.setString(4,iano.getSelectedItem().toString());
            pstmt.setString(5,usn.getSelectedItem().toString());
            
            if(!"Not Attempted".equals(q1.getSelectedItem().toString()))
                pstmt.setInt(6,Integer.parseInt(q1.getSelectedItem().toString()));
            else
                pstmt.setInt(6,-1);
            
            if(!"Not Attempted".equals(q2.getSelectedItem().toString()))
                pstmt.setInt(7,Integer.parseInt(q2.getSelectedItem().toString()));
            else
                pstmt.setInt(7,-1);
            
            if(!"Not Attempted".equals(q3.getSelectedItem().toString()))
                pstmt.setInt(8,Integer.parseInt(q3.getSelectedItem().toString()));
            else
                pstmt.setInt(8,-1);
            
            if(!"Not Attempted".equals(q4.getSelectedItem().toString()))
                pstmt.setInt(9,Integer.parseInt(q4.getSelectedItem().toString()));
            else
                pstmt.setInt(9,-1);
            
            if(!"Not Attempted".equals(q5.getSelectedItem().toString()))
                pstmt.setInt(10,Integer.parseInt(q5.getSelectedItem().toString()));
            else
                pstmt.setInt(10,-1);
            
            if(!"Not Attempted".equals(q6.getSelectedItem().toString()))
                pstmt.setInt(11,Integer.parseInt(q6.getSelectedItem().toString()));
            else
                pstmt.setInt(11,-1);
            
            if(!"Not Attempted".equals(q7.getSelectedItem().toString()))
                pstmt.setInt(12,Integer.parseInt(q7.getSelectedItem().toString()));
            else
                pstmt.setInt(12,-1);
            
            if(!"Not Attempted".equals(q8.getSelectedItem().toString()))
                pstmt.setInt(13,Integer.parseInt(q8.getSelectedItem().toString()));
            else
                pstmt.setInt(13,-1);
            
            if(!"Not Attempted".equals(asgn.getSelectedItem().toString()))
                pstmt.setInt(14,Integer.parseInt(asgn.getSelectedItem().toString()));
            else
                pstmt.setInt(15,-1);
            
            pstmt.execute();
        }
        catch(HeadlessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_btnsubmitActionPerformed

    private void usnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usnMouseClicked
        usn.removeAllItems();
        try
        {
            pstmt = conn.prepareStatement("select USN from STUDENT where BATCH=?");
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
            java.util.logging.Logger.getLogger(Add_IA_Marks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_IA_Marks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_IA_Marks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_IA_Marks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_IA_Marks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> asgn;
    private javax.swing.JComboBox<String> batch;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JComboBox<String> iano;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> q1;
    private javax.swing.JComboBox<String> q2;
    private javax.swing.JComboBox<String> q3;
    private javax.swing.JComboBox<String> q4;
    private javax.swing.JComboBox<String> q5;
    private javax.swing.JComboBox<String> q6;
    private javax.swing.JComboBox<String> q7;
    private javax.swing.JComboBox<String> q8;
    private javax.swing.JComboBox<String> semester;
    private javax.swing.JComboBox<String> subcode;
    private javax.swing.JComboBox<String> usn;
    // End of variables declaration//GEN-END:variables
}
