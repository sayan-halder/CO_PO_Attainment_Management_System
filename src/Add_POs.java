import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Add_POs extends javax.swing.JFrame {
    MyConnection dbc=new MyConnection();
    Connection conn=dbc.connectme();
    ResultSet rs;
    PreparedStatement pstmt;
    
    public Add_POs() {
        super("ADD PO's");
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
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        btnclear = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        po1 = new javax.swing.JComboBox<>();
        po7 = new javax.swing.JComboBox<>();
        po2 = new javax.swing.JComboBox<>();
        po8 = new javax.swing.JComboBox<>();
        po3 = new javax.swing.JComboBox<>();
        po9 = new javax.swing.JComboBox<>();
        po4 = new javax.swing.JComboBox<>();
        po10 = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        po5 = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        po11 = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        po6 = new javax.swing.JComboBox<>();
        po12 = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        btnsubmit = new javax.swing.JButton();
        cono = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true), "Add PO's", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 0, 20))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ADD PO's VALUES");

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

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("PO1");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("PO7");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("PO2");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("PO8");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("PO3");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("PO9");

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("PO4");

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("PO10");

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

        po1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        po1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select PO number", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        po1.setPreferredSize(new java.awt.Dimension(6, 30));

        po7.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        po7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select PO number", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        po7.setPreferredSize(new java.awt.Dimension(6, 30));

        po2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        po2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select PO number", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        po2.setPreferredSize(new java.awt.Dimension(6, 30));

        po8.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        po8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select PO number", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        po8.setPreferredSize(new java.awt.Dimension(6, 30));

        po3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        po3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select PO number", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        po3.setPreferredSize(new java.awt.Dimension(6, 30));

        po9.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        po9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select PO number", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        po9.setPreferredSize(new java.awt.Dimension(6, 30));

        po4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        po4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select PO number", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        po4.setPreferredSize(new java.awt.Dimension(6, 30));

        po10.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        po10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select PO number", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        po10.setPreferredSize(new java.awt.Dimension(6, 30));

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("PO5");

        po5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        po5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select PO number", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        po5.setPreferredSize(new java.awt.Dimension(6, 30));

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("PO11");

        po11.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        po11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select PO number", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        po11.setPreferredSize(new java.awt.Dimension(6, 30));

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("PO6");

        po6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        po6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select PO number", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        po6.setPreferredSize(new java.awt.Dimension(6, 30));

        po12.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        po12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select PO number", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        po12.setPreferredSize(new java.awt.Dimension(6, 30));

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("PO12");

        btnsubmit.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnsubmit.setText("SUBMIT");
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });

        cono.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        cono.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select co number", "1", "2", "3", "4", "5" }));
        cono.setPreferredSize(new java.awt.Dimension(6, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(360, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(520, 520, 520))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cono, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(subcode, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(semester, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(129, 129, 129)
                                .addComponent(batch, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(294, 294, 294))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(btnsubmit)
                            .addGap(49, 49, 49)
                            .addComponent(btnclear)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnback)
                            .addGap(350, 350, 350))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel29)
                                        .addComponent(jLabel27)
                                        .addComponent(jLabel24)
                                        .addComponent(jLabel20)
                                        .addComponent(jLabel16))
                                    .addGap(28, 28, 28)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(po5, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(po4, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(po3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(po6, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addGap(28, 28, 28)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(po2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(po1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(29, 29, 29)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel28)
                                .addComponent(jLabel26)
                                .addComponent(jLabel30)
                                .addComponent(jLabel22)
                                .addComponent(jLabel18)
                                .addComponent(jLabel14))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(po11, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(po10, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(po7, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(po8, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(po9, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(po12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(330, 330, 330)))))
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
                    .addComponent(cono, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(po1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(po7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(po8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(po2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(po3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(po4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(po9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(po10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel27)
                        .addComponent(po5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel28)
                        .addComponent(po11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel29)
                        .addComponent(po6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel30)
                        .addComponent(po12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnback)
                    .addComponent(btnclear)
                    .addComponent(btnsubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
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
            pstmt= conn.prepareStatement("select SUBJECT_CODE from SUBJECT where BATCH=? and SEMESTER=?");
            pstmt.setString(1,batch.getSelectedItem().toString());
            pstmt.setString(2,semester.getSelectedItem().toString());
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
        subcode.addItem("Select subject code");*/
        cono.setSelectedIndex(0);
        po1.setSelectedIndex(0);
        po7.setSelectedIndex(0);
        po2.setSelectedIndex(0);
        po8.setSelectedIndex(0);
        po3.setSelectedIndex(0);
        po9.setSelectedIndex(0);
        po4.setSelectedIndex(0);
        po10.setSelectedIndex(0);
        po5.setSelectedIndex(0);
        po11.setSelectedIndex(0);
        po6.setSelectedIndex(0);
        po12.setSelectedIndex(0);
        semester.requestFocus();
    }//GEN-LAST:event_btnclearActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        setVisible(false);
        Home_Page ob=new Home_Page();
        ob.setVisible(true);
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        try
        {
            pstmt=conn.prepareStatement("insert into PO_DETAILS (BATCH, SEMESTER, SUBJECT_CODE, CO_NUMBER, PO1, PO2, PO3, PO4, PO5, PO6, PO7, PO8, PO9, PO10, PO11, PO12) \n" +
                                                             "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pstmt.setString(1, batch.getSelectedItem().toString());
            pstmt.setString(2, semester.getSelectedItem().toString());
            pstmt.setString(3, subcode.getSelectedItem().toString());
            pstmt.setString(4, cono.getSelectedItem().toString());
            pstmt.setString(5, po1.getSelectedItem().toString());
            pstmt.setString(6, po2.getSelectedItem().toString());
            pstmt.setString(7, po3.getSelectedItem().toString());
            pstmt.setString(8, po4.getSelectedItem().toString());
            pstmt.setString(9, po5.getSelectedItem().toString());
            pstmt.setString(10, po6.getSelectedItem().toString());
            pstmt.setString(11, po7.getSelectedItem().toString());
            pstmt.setString(12, po8.getSelectedItem().toString());
            pstmt.setString(13, po9.getSelectedItem().toString());
            pstmt.setString(14, po10.getSelectedItem().toString());
            pstmt.setString(15, po11.getSelectedItem().toString());
            pstmt.setString(16, po12.getSelectedItem().toString());
            pstmt.execute();

            JOptionPane.showMessageDialog(null,"PO's for CO-" + cono.getSelectedItem().toString() + " added successfully!!!!");
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
            java.util.logging.Logger.getLogger(Add_POs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_POs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_POs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_POs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_POs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> batch;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JComboBox<String> cono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> po1;
    private javax.swing.JComboBox<String> po10;
    private javax.swing.JComboBox<String> po11;
    private javax.swing.JComboBox<String> po12;
    private javax.swing.JComboBox<String> po2;
    private javax.swing.JComboBox<String> po3;
    private javax.swing.JComboBox<String> po4;
    private javax.swing.JComboBox<String> po5;
    private javax.swing.JComboBox<String> po6;
    private javax.swing.JComboBox<String> po7;
    private javax.swing.JComboBox<String> po8;
    private javax.swing.JComboBox<String> po9;
    private javax.swing.JComboBox<String> semester;
    private javax.swing.JComboBox<String> subcode;
    // End of variables declaration//GEN-END:variables
}
