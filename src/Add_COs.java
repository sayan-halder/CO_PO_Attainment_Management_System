import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Add_COs extends javax.swing.JFrame {
    MyConnection dbc=new MyConnection();
    Connection conn=dbc.connectme();
    ResultSet rs;
    PreparedStatement pstmt;
    
    public Add_COs() {
        super("ADD CO's");
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
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        btnsubmit = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        coq1 = new javax.swing.JComboBox<>();
        coq2 = new javax.swing.JComboBox<>();
        coq3 = new javax.swing.JComboBox<>();
        coq4 = new javax.swing.JComboBox<>();
        coq5 = new javax.swing.JComboBox<>();
        coq6 = new javax.swing.JComboBox<>();
        coq7 = new javax.swing.JComboBox<>();
        coq8 = new javax.swing.JComboBox<>();
        iano = new javax.swing.JComboBox<>();
        asgnco = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true), "Add CO's", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 0, 20))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ADD INTERNAL ASSESSMENT CO's VALUES");

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

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("CO");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Q5");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("CO");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Q2");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("CO");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Q6");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("CO");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Q3");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("CO");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Q7");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("CO");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Q4");

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("CO");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Q8");

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("CO");

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("ASSINGMENT");

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("CO");

        btnsubmit.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnsubmit.setText("SUBMIT");
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
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

        coq1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        coq1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select CO number", "1", "2", "3", "4", "5" }));
        coq1.setPreferredSize(new java.awt.Dimension(6, 30));

        coq2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        coq2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select CO number", "1", "2", "3", "4", "5" }));
        coq2.setPreferredSize(new java.awt.Dimension(6, 30));

        coq3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        coq3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select CO number", "1", "2", "3", "4", "5" }));
        coq3.setPreferredSize(new java.awt.Dimension(6, 30));

        coq4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        coq4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select CO number", "1", "2", "3", "4", "5" }));
        coq4.setPreferredSize(new java.awt.Dimension(6, 30));

        coq5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        coq5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select CO number", "1", "2", "3", "4", "5" }));
        coq5.setPreferredSize(new java.awt.Dimension(6, 30));

        coq6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        coq6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select CO number", "1", "2", "3", "4", "5" }));
        coq6.setPreferredSize(new java.awt.Dimension(6, 30));

        coq7.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        coq7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select CO number", "1", "2", "3", "4", "5" }));
        coq7.setPreferredSize(new java.awt.Dimension(6, 30));

        coq8.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        coq8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select CO number", "1", "2", "3", "4", "5" }));
        coq8.setPreferredSize(new java.awt.Dimension(6, 30));

        iano.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        iano.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Internal Assessment number", "1st", "2nd", "3rd" }));
        iano.setPreferredSize(new java.awt.Dimension(6, 30));

        asgnco.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        asgnco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select CO number", "1", "2", "3", "4", "5" }));
        asgnco.setPreferredSize(new java.awt.Dimension(6, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(477, 477, 477)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel26)
                            .addGap(18, 18, 18)
                            .addComponent(coq8, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel14))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel18))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel22)))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(coq6, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(coq5, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(coq7, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel29)
                        .addGap(18, 18, 18)
                        .addComponent(asgnco, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107)))
                .addContainerGap(288, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel20)
                                    .addGap(18, 18, 18)
                                    .addComponent(coq3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel24)
                                    .addGap(18, 18, 18)
                                    .addComponent(coq4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel16)
                                    .addGap(18, 18, 18)
                                    .addComponent(coq2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel12)
                                    .addGap(18, 18, 18)
                                    .addComponent(coq1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(619, 619, 619))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnsubmit)
                            .addGap(104, 104, 104)
                            .addComponent(btnclear)
                            .addGap(90, 90, 90)
                            .addComponent(btnback)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(iano, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(batch, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(semester, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(31, 31, 31)
                                    .addComponent(subcode, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(299, 299, 299)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(345, 345, 345))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jLabel14)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12)
                    .addComponent(coq1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(coq5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel8)
                    .addComponent(jLabel18)
                    .addComponent(jLabel9)
                    .addComponent(coq2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coq6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel22)
                    .addComponent(jLabel20)
                    .addComponent(jLabel10)
                    .addComponent(coq3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coq7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(jLabel26)
                        .addComponent(coq8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel24)
                        .addComponent(jLabel13)
                        .addComponent(coq4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29)
                    .addComponent(asgnco, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnclear)
                    .addComponent(btnsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnback))
                .addContainerGap(142, Short.MAX_VALUE))
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

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        try
        {
            pstmt=conn.prepareStatement("insert into IA_COS (BATCH, SEMESTER, SUBJECT_CODE, IA_NUMBER, QUESTION, CO) values (?,?,?,?,?,?)");
            pstmt.setString(1,batch.getSelectedItem().toString());
            pstmt.setString(2,semester.getSelectedItem().toString());
            pstmt.setString(3,subcode.getSelectedItem().toString());
            pstmt.setString(4,iano.getSelectedItem().toString());
            pstmt.setInt(5,1);
            pstmt.setString(6,coq1.getSelectedItem().toString());
            pstmt.execute();

            pstmt=conn.prepareStatement("insert into IA_COS (BATCH, SEMESTER, SUBJECT_CODE, IA_NUMBER, QUESTION, CO) values (?,?,?,?,?,?)");
            pstmt.setString(1,batch.getSelectedItem().toString());
            pstmt.setString(2,semester.getSelectedItem().toString());
            pstmt.setString(3,subcode.getSelectedItem().toString());
            pstmt.setString(4,iano.getSelectedItem().toString());
            pstmt.setInt(5,2);
            pstmt.setString(6,coq2.getSelectedItem().toString());
            pstmt.execute();
            
            pstmt=conn.prepareStatement("insert into IA_COS (BATCH, SEMESTER, SUBJECT_CODE, IA_NUMBER, QUESTION, CO) values (?,?,?,?,?,?)");
            pstmt.setString(1,batch.getSelectedItem().toString());
            pstmt.setString(2,semester.getSelectedItem().toString());
            pstmt.setString(3,subcode.getSelectedItem().toString());
            pstmt.setString(4,iano.getSelectedItem().toString());
            pstmt.setInt(5,3);
            pstmt.setString(6,coq3.getSelectedItem().toString());
            pstmt.execute();
            
            pstmt=conn.prepareStatement("insert into IA_COS (BATCH, SEMESTER, SUBJECT_CODE, IA_NUMBER, QUESTION, CO) values (?,?,?,?,?,?)");
            pstmt.setString(1,batch.getSelectedItem().toString());
            pstmt.setString(2,semester.getSelectedItem().toString());
            pstmt.setString(3,subcode.getSelectedItem().toString());
            pstmt.setString(4,iano.getSelectedItem().toString());
            pstmt.setInt(5,4);
            pstmt.setString(6,coq4.getSelectedItem().toString());
            pstmt.execute();
            
            pstmt=conn.prepareStatement("insert into IA_COS (BATCH, SEMESTER, SUBJECT_CODE, IA_NUMBER, QUESTION, CO) values (?,?,?,?,?,?)");
            pstmt.setString(1,batch.getSelectedItem().toString());
            pstmt.setString(2,semester.getSelectedItem().toString());
            pstmt.setString(3,subcode.getSelectedItem().toString());
            pstmt.setString(4,iano.getSelectedItem().toString());
            pstmt.setInt(5,5);
            pstmt.setString(6,coq5.getSelectedItem().toString());
            pstmt.execute();
            
            pstmt=conn.prepareStatement("insert into IA_COS (BATCH, SEMESTER, SUBJECT_CODE, IA_NUMBER, QUESTION, CO) values (?,?,?,?,?,?)");
            pstmt.setString(1,batch.getSelectedItem().toString());
            pstmt.setString(2,semester.getSelectedItem().toString());
            pstmt.setString(3,subcode.getSelectedItem().toString());
            pstmt.setString(4,iano.getSelectedItem().toString());
            pstmt.setInt(5,6);
            pstmt.setString(6,coq6.getSelectedItem().toString());
            pstmt.execute();
            
            pstmt=conn.prepareStatement("insert into IA_COS (BATCH, SEMESTER, SUBJECT_CODE, IA_NUMBER, QUESTION, CO) values (?,?,?,?,?,?)");
            pstmt.setString(1,batch.getSelectedItem().toString());
            pstmt.setString(2,semester.getSelectedItem().toString());
            pstmt.setString(3,subcode.getSelectedItem().toString());
            pstmt.setString(4,iano.getSelectedItem().toString());
            pstmt.setInt(5,7);
            pstmt.setString(6,coq7.getSelectedItem().toString());
            pstmt.execute();
            
            pstmt=conn.prepareStatement("insert into IA_COS (BATCH, SEMESTER, SUBJECT_CODE, IA_NUMBER, QUESTION, CO) values (?,?,?,?,?,?)");
            pstmt.setString(1,batch.getSelectedItem().toString());
            pstmt.setString(2,semester.getSelectedItem().toString());
            pstmt.setString(3,subcode.getSelectedItem().toString());
            pstmt.setString(4,iano.getSelectedItem().toString());
            pstmt.setInt(5,8);
            pstmt.setString(6,coq8.getSelectedItem().toString());
            pstmt.execute();
            
            pstmt=conn.prepareStatement("insert into IA_COS (BATCH, SEMESTER, SUBJECT_CODE, IA_NUMBER, QUESTION, CO) values (?,?,?,?,?,?)");
            pstmt.setString(1,batch.getSelectedItem().toString());
            pstmt.setString(2,semester.getSelectedItem().toString());
            pstmt.setString(3,subcode.getSelectedItem().toString());
            pstmt.setString(4,iano.getSelectedItem().toString());
            pstmt.setInt(5,9);
            pstmt.setString(6,asgnco.getSelectedItem().toString());
            pstmt.execute();
            
            JOptionPane.showMessageDialog(null,"CO's for IA "+ iano.getSelectedItem().toString() +" added successfully!!!!");
        }
        catch(HeadlessException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_btnsubmitActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        semester.setSelectedIndex(0);
        batch.setSelectedIndex(0);
        subcode.removeAllItems();
        subcode.addItem("Select subject code");
        iano.setSelectedIndex(0);
        coq1.setSelectedIndex(0);
        coq2.setSelectedIndex(0);
        coq3.setSelectedIndex(0);
        coq4.setSelectedIndex(0);
        coq5.setSelectedIndex(0);
        coq6.setSelectedIndex(0);
        coq7.setSelectedIndex(0);
        coq8.setSelectedIndex(0);
        asgnco.setSelectedIndex(0);
        semester.requestFocus();
    }//GEN-LAST:event_btnclearActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        setVisible(false);
        Home_Page ob=new Home_Page();
        ob.setVisible(true);
    }//GEN-LAST:event_btnbackActionPerformed

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
            java.util.logging.Logger.getLogger(Add_COs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_COs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_COs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_COs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_COs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> asgnco;
    private javax.swing.JComboBox<String> batch;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JComboBox<String> coq1;
    private javax.swing.JComboBox<String> coq2;
    private javax.swing.JComboBox<String> coq3;
    private javax.swing.JComboBox<String> coq4;
    private javax.swing.JComboBox<String> coq5;
    private javax.swing.JComboBox<String> coq6;
    private javax.swing.JComboBox<String> coq7;
    private javax.swing.JComboBox<String> coq8;
    private javax.swing.JComboBox<String> iano;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
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
    private javax.swing.JComboBox<String> semester;
    private javax.swing.JComboBox<String> subcode;
    // End of variables declaration//GEN-END:variables
}
