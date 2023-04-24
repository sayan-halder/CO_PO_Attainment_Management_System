import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class Calculate_PO_Values extends javax.swing.JFrame {
    MyConnection dbc=new MyConnection();
    Connection conn=dbc.connectme();
    ResultSet rs;
    PreparedStatement pstmt;
    float co1=0,co2=0,co3=0,co4=0,co5=0;
    
    public Calculate_PO_Values() {
        super("CALCULATE PO's VALUES");
        initComponents();
        jTable1.setRowHeight(35);
        jTable2.setRowHeight(35);
    }
    
    public void PO_Value()
    {
        float cov = 0;
        try
        {
            for(int i=1;i<=5;i++)
            {
                pstmt=conn.prepareStatement("select * from CO_FINAL_RESULT where BATCH=? and SEMESTER=? and SUBJECT_CODE=? and CO_NUMBER=?");
                pstmt.setString(1, batch.getSelectedItem().toString());
                pstmt.setString(2, semester.getSelectedItem().toString());
                pstmt.setString(3, subcode.getSelectedItem().toString());
                pstmt.setInt(4, i);
                rs=pstmt.executeQuery();
                rs.next();
                cov=rs.getFloat("OVERALL_ATTAINMENT");
                
                pstmt=conn.prepareStatement("update PO_DETAILS set COV=? \n"+
                                                                 "where BATCH=? and SEMESTER=? and SUBJECT_CODE=? and CO_NUMBER=?");
                pstmt.setFloat(1,cov);
                pstmt.setString(2, batch.getSelectedItem().toString());
                pstmt.setString(3, semester.getSelectedItem().toString());
                pstmt.setString(4, subcode.getSelectedItem().toString());
                pstmt.setInt(5,i);
                pstmt.execute();
                
                pstmt=conn.prepareStatement("update PO_DETAILS set\n" +
                                                                 "po1v=po1*cov/3, po2v=po2*cov/3,\n" +
                                                                 "po3v=po3*cov/3, po4v=po4*cov/3,\n" +
                                                                 "po5v=po5*cov/3, po6v=po6*cov/3,\n" +
                                                                 "po7v=po7*cov/3, po8v=po8*cov/3,\n" +
                                                                 "po9v=po9*cov/3, po10v=po10*cov/3,\n" +
                                                                 "po11v=po11*cov/3, po12v=po12*cov/3\n" +
                                                                 "where BATCH=? and SEMESTER=? and SUBJECT_CODE=? and CO_NUMBER=?");
                pstmt.setString(1, batch.getSelectedItem().toString());
                pstmt.setString(2, semester.getSelectedItem().toString());
                pstmt.setString(3, subcode.getSelectedItem().toString());
                pstmt.setInt(4,i);
                pstmt.execute();
            }
        }
        catch(SQLException e)
        { 
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    int po1c=0, po2c=0, po3c=0, po4c=0, po5c=0, po6c=0, po7c=0, po8c=0, po9c=0, po10c=0, po11c=0, po12c=0;
    
    public void sum()
    {
        try
        {
            pstmt=conn.prepareStatement("insert into PO_ATTAINMENT (BATCH, SEMESTER, SUBJECT_CODE, \n"+
                                                             "PO1S, PO2S, PO3S, PO4S, PO5S, PO6S, PO7S, PO8S, PO9S, PO10S, PO11S, PO12S, \n"+
                                                             "PO1AS, PO2AS, PO3AS, PO4AS, PO5AS, PO6AS, PO7AS, PO8AS, PO9AS, PO10AS, PO11AS, PO12AS) \n"+
                                                             "\n"+
                                                             "select BATCH, SEMESTER, SUBJECT_CODE, \n"+
                                                             "sum(PO1), sum(PO2), sum(PO3), sum(PO4), sum(PO5), sum(PO6), sum(PO7), sum(PO8), sum(PO9), sum(PO10), sum(PO11), sum(PO12), \n"+
                                                             "sum(PO1V), sum(PO2V), sum(PO3V), sum(PO4V), sum(PO5V), sum(PO6V), sum(PO7V), sum(PO8V), sum(PO9V), sum(PO10V), sum(PO11V), sum(PO12V) from PO_DETAILS \n"+
                                                             "where BATCH=? and SEMESTER=? and SUBJECT_CODE=?" +
                                                             "group by BATCH, SEMESTER, SUBJECT_CODE");
            pstmt.setString(1, batch.getSelectedItem().toString());
            pstmt.setString(2, semester.getSelectedItem().toString());
            pstmt.setString(3, subcode.getSelectedItem().toString());
            pstmt.execute();
            
            int countPO = 0;
            
            /***********/
            pstmt=conn.prepareStatement("select count(PO1) from PO_DETAILS where PO1 > 0 and BATCH=? and SEMESTER=? and SUBJECT_CODE=?");
            pstmt.setString(1, batch.getSelectedItem().toString());
            pstmt.setString(2, semester.getSelectedItem().toString());
            pstmt.setString(3, subcode.getSelectedItem().toString());
            rs=pstmt.executeQuery();
            rs.next();
            countPO = rs.getInt(1);
            po1c = rs.getInt(1);
            pstmt=conn.prepareStatement("update PO_ATTAINMENT set PO1C=? \n" + 
                                                             "where BATCH=? and SEMESTER=? and SUBJECT_CODE=?");
            pstmt.setInt(1,countPO);
            pstmt.setString(2,batch.getSelectedItem().toString());
            pstmt.setString(3,semester.getSelectedItem().toString());
            pstmt.setString(4,subcode.getSelectedItem().toString());
            pstmt.execute();
            
            /***********/
            pstmt=conn.prepareStatement("select count(PO2) from PO_DETAILS where PO2 > 0 and BATCH=? and SEMESTER=? and SUBJECT_CODE=?");
            pstmt.setString(1, batch.getSelectedItem().toString());
            pstmt.setString(2, semester.getSelectedItem().toString());
            pstmt.setString(3, subcode.getSelectedItem().toString());
            rs=pstmt.executeQuery();
            rs.next();
            countPO = rs.getInt(1);
            po2c = rs.getInt(1);
            pstmt=conn.prepareStatement("update PO_ATTAINMENT set PO2C=? \n" + 
                                                             "where BATCH=? and SEMESTER=? and SUBJECT_CODE=?");
            pstmt.setInt(1,countPO);
            pstmt.setString(2,batch.getSelectedItem().toString());
            pstmt.setString(3,semester.getSelectedItem().toString());
            pstmt.setString(4,subcode.getSelectedItem().toString());
            pstmt.execute();
            
            /***********/
            pstmt=conn.prepareStatement("select count(PO3) from PO_DETAILS where PO3 > 0 and BATCH=? and SEMESTER=? and SUBJECT_CODE=?");
            pstmt.setString(1, batch.getSelectedItem().toString());
            pstmt.setString(2, semester.getSelectedItem().toString());
            pstmt.setString(3, subcode.getSelectedItem().toString());
            rs=pstmt.executeQuery();
            rs.next();
            countPO = rs.getInt(1);
            po3c = rs.getInt(1);
            pstmt=conn.prepareStatement("update PO_ATTAINMENT set PO3C=? \n" + 
                                                             "where BATCH=? and SEMESTER=? and SUBJECT_CODE=?");
            pstmt.setInt(1,countPO);
            pstmt.setString(2,batch.getSelectedItem().toString());
            pstmt.setString(3,semester.getSelectedItem().toString());
            pstmt.setString(4,subcode.getSelectedItem().toString());
            pstmt.execute();
            
            /***********/
            pstmt=conn.prepareStatement("select count(PO4) from PO_DETAILS where PO4 > 0 and BATCH=? and SEMESTER=? and SUBJECT_CODE=?");
            pstmt.setString(1, batch.getSelectedItem().toString());
            pstmt.setString(2, semester.getSelectedItem().toString());
            pstmt.setString(3, subcode.getSelectedItem().toString());
            rs=pstmt.executeQuery();
            rs.next();
            countPO = rs.getInt(1);
            po4c = rs.getInt(1);
            pstmt=conn.prepareStatement("update PO_ATTAINMENT set PO4C=? \n" + 
                                                             "where BATCH=? and SEMESTER=? and SUBJECT_CODE=?");
            pstmt.setInt(1,countPO);
            pstmt.setString(2,batch.getSelectedItem().toString());
            pstmt.setString(3,semester.getSelectedItem().toString());
            pstmt.setString(4,subcode.getSelectedItem().toString());
            pstmt.execute();
            
            /***********/
            pstmt=conn.prepareStatement("select count(PO5) from PO_DETAILS where PO5 > 0 and BATCH=? and SEMESTER=? and SUBJECT_CODE=?");
            pstmt.setString(1, batch.getSelectedItem().toString());
            pstmt.setString(2, semester.getSelectedItem().toString());
            pstmt.setString(3, subcode.getSelectedItem().toString());
            rs=pstmt.executeQuery();
            rs.next();
            countPO = rs.getInt(1);
            po5c = rs.getInt(1);
            pstmt=conn.prepareStatement("update PO_ATTAINMENT set PO5C=? \n" + 
                                                             "where BATCH=? and SEMESTER=? and SUBJECT_CODE=?");
            pstmt.setInt(1,countPO);
            pstmt.setString(2,batch.getSelectedItem().toString());
            pstmt.setString(3,semester.getSelectedItem().toString());
            pstmt.setString(4,subcode.getSelectedItem().toString());
            pstmt.execute();
            
            /***********/
            pstmt=conn.prepareStatement("select count(PO6) from PO_DETAILS where PO6 > 0 and BATCH=? and SEMESTER=? and SUBJECT_CODE=?");
            pstmt.setString(1, batch.getSelectedItem().toString());
            pstmt.setString(2, semester.getSelectedItem().toString());
            pstmt.setString(3, subcode.getSelectedItem().toString());
            rs=pstmt.executeQuery();
            rs.next();
            countPO = rs.getInt(1);
            po6c = rs.getInt(1);
            pstmt=conn.prepareStatement("update PO_ATTAINMENT set PO6C=? \n" + 
                                                             "where BATCH=? and SEMESTER=? and SUBJECT_CODE=?");
            pstmt.setInt(1,countPO);
            pstmt.setString(2,batch.getSelectedItem().toString());
            pstmt.setString(3,semester.getSelectedItem().toString());
            pstmt.setString(4,subcode.getSelectedItem().toString());
            pstmt.execute();
            
            /***********/
            pstmt=conn.prepareStatement("select count(PO7) from PO_DETAILS where PO7 > 0 and BATCH=? and SEMESTER=? and SUBJECT_CODE=?");
            pstmt.setString(1, batch.getSelectedItem().toString());
            pstmt.setString(2, semester.getSelectedItem().toString());
            pstmt.setString(3, subcode.getSelectedItem().toString());
            rs=pstmt.executeQuery();
            rs.next();
            countPO = rs.getInt(1);
            po7c = rs.getInt(1);
            pstmt=conn.prepareStatement("update PO_ATTAINMENT set PO7C=? \n" + 
                                                             "where BATCH=? and SEMESTER=? and SUBJECT_CODE=?");
            pstmt.setInt(1,countPO);
            pstmt.setString(2,batch.getSelectedItem().toString());
            pstmt.setString(3,semester.getSelectedItem().toString());
            pstmt.setString(4,subcode.getSelectedItem().toString());
            pstmt.execute();
            
            /***********/
            pstmt=conn.prepareStatement("select count(PO8) from PO_DETAILS where PO8 > 0 and BATCH=? and SEMESTER=? and SUBJECT_CODE=?");
            pstmt.setString(1, batch.getSelectedItem().toString());
            pstmt.setString(2, semester.getSelectedItem().toString());
            pstmt.setString(3, subcode.getSelectedItem().toString());
            rs=pstmt.executeQuery();
            rs.next();
            countPO = rs.getInt(1);
            po8c = rs.getInt(1);
            pstmt=conn.prepareStatement("update PO_ATTAINMENT set PO8C=? \n" + 
                                                             "where BATCH=? and SEMESTER=? and SUBJECT_CODE=?");
            pstmt.setInt(1,countPO);
            pstmt.setString(2,batch.getSelectedItem().toString());
            pstmt.setString(3,semester.getSelectedItem().toString());
            pstmt.setString(4,subcode.getSelectedItem().toString());
            pstmt.execute();
            
            /***********/
            pstmt=conn.prepareStatement("select count(PO9) from PO_DETAILS where PO9 > 0 and BATCH=? and SEMESTER=? and SUBJECT_CODE=?");
            pstmt.setString(1, batch.getSelectedItem().toString());
            pstmt.setString(2, semester.getSelectedItem().toString());
            pstmt.setString(3, subcode.getSelectedItem().toString());
            rs=pstmt.executeQuery();
            rs.next();
            countPO = rs.getInt(1);
            po9c = rs.getInt(1);
            pstmt=conn.prepareStatement("update PO_ATTAINMENT set PO9C=? \n" + 
                                                             "where BATCH=? and SEMESTER=? and SUBJECT_CODE=?");
            pstmt.setInt(1,countPO);
            pstmt.setString(2,batch.getSelectedItem().toString());
            pstmt.setString(3,semester.getSelectedItem().toString());
            pstmt.setString(4,subcode.getSelectedItem().toString());
            pstmt.execute();
            
            /***********/
            pstmt=conn.prepareStatement("select count(PO10) from PO_DETAILS where PO10 > 0 and BATCH=? and SEMESTER=? and SUBJECT_CODE=?");
            pstmt.setString(1, batch.getSelectedItem().toString());
            pstmt.setString(2, semester.getSelectedItem().toString());
            pstmt.setString(3, subcode.getSelectedItem().toString());
            rs=pstmt.executeQuery();
            rs.next();
            countPO = rs.getInt(1);
            po10c = rs.getInt(1);
            pstmt=conn.prepareStatement("update PO_ATTAINMENT set PO10C=? \n" + 
                                                             "where BATCH=? and SEMESTER=? and SUBJECT_CODE=?");
            pstmt.setInt(1,countPO);
            pstmt.setString(2,batch.getSelectedItem().toString());
            pstmt.setString(3,semester.getSelectedItem().toString());
            pstmt.setString(4,subcode.getSelectedItem().toString());
            pstmt.execute();
            
            /***********/
            pstmt=conn.prepareStatement("select count(PO11) from PO_DETAILS where PO11 > 0 and BATCH=? and SEMESTER=? and SUBJECT_CODE=?");
            pstmt.setString(1, batch.getSelectedItem().toString());
            pstmt.setString(2, semester.getSelectedItem().toString());
            pstmt.setString(3, subcode.getSelectedItem().toString());
            rs=pstmt.executeQuery();
            rs.next();
            countPO = rs.getInt(1);
            po11c = rs.getInt(1);
            pstmt=conn.prepareStatement("update PO_ATTAINMENT set PO11C=? \n" + 
                                                             "where BATCH=? and SEMESTER=? and SUBJECT_CODE=?");
            pstmt.setInt(1,countPO);
            pstmt.setString(2,batch.getSelectedItem().toString());
            pstmt.setString(3,semester.getSelectedItem().toString());
            pstmt.setString(4,subcode.getSelectedItem().toString());
            pstmt.execute();
            
            /***********/
            pstmt=conn.prepareStatement("select count(PO12) from PO_DETAILS where PO12 > 0 and BATCH=? and SEMESTER=? and SUBJECT_CODE=?");
            pstmt.setString(1, batch.getSelectedItem().toString());
            pstmt.setString(2, semester.getSelectedItem().toString());
            pstmt.setString(3, subcode.getSelectedItem().toString());
            rs=pstmt.executeQuery();
            rs.next();
            countPO = rs.getInt(1);
            po12c = rs.getInt(1);
            pstmt=conn.prepareStatement("update PO_ATTAINMENT set PO12C=? \n" + 
                                                             "where BATCH=? and SEMESTER=? and SUBJECT_CODE=?");
            pstmt.setInt(1,countPO);
            pstmt.setString(2,batch.getSelectedItem().toString());
            pstmt.setString(3,semester.getSelectedItem().toString());
            pstmt.setString(4,subcode.getSelectedItem().toString());
            pstmt.execute();
        }
        catch(SQLException e)
        { 
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public void attainment()
    {
        try
        {
            if(po1c > 0)
            {
                pstmt=conn.prepareStatement("update PO_ATTAINMENT set\n" +
                                                                  "PO1FA=PO1AS/PO1C where BATCH=? and SEMESTER=? and SUBJECT_CODE=?");
                pstmt.setString(1, batch.getSelectedItem().toString());
                pstmt.setString(2, semester.getSelectedItem().toString());
                pstmt.setString(3, subcode.getSelectedItem().toString());
                pstmt.execute();
            }
            if(po2c > 0)
            {
                pstmt=conn.prepareStatement("update PO_ATTAINMENT set\n" +
                                                                  "PO2FA=PO2AS/PO2C where BATCH=? and SEMESTER=? and SUBJECT_CODE=?");
                pstmt.setString(1, batch.getSelectedItem().toString());
                pstmt.setString(2, semester.getSelectedItem().toString());
                pstmt.setString(3, subcode.getSelectedItem().toString());
                pstmt.execute();
            }
            if(po3c > 0)
            {
                pstmt=conn.prepareStatement("update PO_ATTAINMENT set\n" +
                                                                  "PO3FA=PO3AS/PO3C where BATCH=? and SEMESTER=? and SUBJECT_CODE=?");
                pstmt.setString(1, batch.getSelectedItem().toString());
                pstmt.setString(2, semester.getSelectedItem().toString());
                pstmt.setString(3, subcode.getSelectedItem().toString());
                pstmt.execute();
            }
            if(po4c > 0)
            {
                pstmt=conn.prepareStatement("update PO_ATTAINMENT set\n" +
                                                                  "PO4FA=PO4AS/PO4C where BATCH=? and SEMESTER=? and SUBJECT_CODE=?");
                pstmt.setString(1, batch.getSelectedItem().toString());
                pstmt.setString(2, semester.getSelectedItem().toString());
                pstmt.setString(3, subcode.getSelectedItem().toString());
                pstmt.execute();
            }
            if(po5c > 0)
            {
                pstmt=conn.prepareStatement("update PO_ATTAINMENT set\n" +
                                                                  "PO5FA=PO5AS/PO5C where BATCH=? and SEMESTER=? and SUBJECT_CODE=?");
                pstmt.setString(1, batch.getSelectedItem().toString());
                pstmt.setString(2, semester.getSelectedItem().toString());
                pstmt.setString(3, subcode.getSelectedItem().toString());
                pstmt.execute();
            }
            if(po6c > 0)
            {
                pstmt=conn.prepareStatement("update PO_ATTAINMENT set\n" +
                                                                  "PO6FA=PO6AS/PO6C where BATCH=? and SEMESTER=? and SUBJECT_CODE=?");
                pstmt.setString(1, batch.getSelectedItem().toString());
                pstmt.setString(2, semester.getSelectedItem().toString());
                pstmt.setString(3, subcode.getSelectedItem().toString());
                pstmt.execute();
            }
            if(po7c > 0)
            {
                pstmt=conn.prepareStatement("update PO_ATTAINMENT set\n" +
                                                                  "PO7FA=PO7AS/PO7C where BATCH=? and SEMESTER=? and SUBJECT_CODE=?");
                pstmt.setString(1, batch.getSelectedItem().toString());
                pstmt.setString(2, semester.getSelectedItem().toString());
                pstmt.setString(3, subcode.getSelectedItem().toString());
                pstmt.execute();
            }
            if(po8c > 0)
            {
                pstmt=conn.prepareStatement("update PO_ATTAINMENT set\n" +
                                                                  "PO8FA=PO8AS/PO8C where BATCH=? and SEMESTER=? and SUBJECT_CODE=?");
                pstmt.setString(1, batch.getSelectedItem().toString());
                pstmt.setString(2, semester.getSelectedItem().toString());
                pstmt.setString(3, subcode.getSelectedItem().toString());
                pstmt.execute();
            }
            if(po9c > 0)
            {
                pstmt=conn.prepareStatement("update PO_ATTAINMENT set\n" +
                                                                  "PO9FA=PO9AS/PO9C where BATCH=? and SEMESTER=? and SUBJECT_CODE=?");
                pstmt.setString(1, batch.getSelectedItem().toString());
                pstmt.setString(2, semester.getSelectedItem().toString());
                pstmt.setString(3, subcode.getSelectedItem().toString());
                pstmt.execute();
            }
            if(po10c > 0)
            {
                pstmt=conn.prepareStatement("update PO_ATTAINMENT set\n" +
                                                                  "PO10FA=PO10AS/PO10C where BATCH=? and SEMESTER=? and SUBJECT_CODE=?");
                pstmt.setString(1, batch.getSelectedItem().toString());
                pstmt.setString(2, semester.getSelectedItem().toString());
                pstmt.setString(3, subcode.getSelectedItem().toString());
                pstmt.execute();
            }
            if(po11c > 0)
            {
                pstmt=conn.prepareStatement("update PO_ATTAINMENT set\n" +
                                                                  "PO11FA=PO11AS/PO11C where BATCH=? and SEMESTER=? and SUBJECT_CODE=?");
                pstmt.setString(1, batch.getSelectedItem().toString());
                pstmt.setString(2, semester.getSelectedItem().toString());
                pstmt.setString(3, subcode.getSelectedItem().toString());
                pstmt.execute();
            }
            if(po12c > 0)
            {
                pstmt=conn.prepareStatement("update PO_ATTAINMENT set\n" +
                                                                  "PO12FA=PO12AS/PO12C where BATCH=? and SEMESTER=? and SUBJECT_CODE=?");
                pstmt.setString(1, batch.getSelectedItem().toString());
                pstmt.setString(2, semester.getSelectedItem().toString());
                pstmt.setString(3, subcode.getSelectedItem().toString());
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
        btnshow = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true), "Calculate PO's Values", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 0, 20))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CALCULATE PO's VALUES");

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
                "CO NUMBER", "PO1", "PO2", "PO3", "PO4", "PO5", "PO6", "PO7", "PO8", "PO9", "PO10", "PO11", "PO12"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTable1);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ATTAINMENT OF ALL PO'S");

        jTable2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PO1", "PO2", "PO3", "PO4", "PO5", "PO6", "PO7", "PO8", "PO9", "PO10", "PO11", "PO12"
            }
        ));
        jTable2.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(577, 577, 577)
                .addComponent(btnback)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1258, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1258, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addComponent(btnshow))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(484, 484, 484)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(464, 464, 464)
                                .addComponent(jLabel5)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
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
                    .addComponent(subcode, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnshow))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
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

    private void btnshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowActionPerformed
        try
        {
            PO_Value();
            
            pstmt=conn.prepareStatement("delete from PO_ATTAINMENT");
            pstmt.execute();
            
            pstmt=conn.prepareStatement("select CO_NUMBER as [CO], PO1V as [PO1], PO2V as [PO2], PO3V as [PO3], PO4V as [PO4], PO5V as [PO5], PO6V as [PO6], PO7V as [PO7], PO8V as [PO8], PO9V as [PO9], PO10V as [PO10], PO11V as [PO11], PO12V as [PO12] \n" +
                                                             "from PO_DETAILS where BATCH=? and SEMESTER=? and SUBJECT_CODE=?");
            pstmt.setString(1, batch.getSelectedItem().toString());
            pstmt.setString(2, semester.getSelectedItem().toString());
            pstmt.setString(3, subcode.getSelectedItem().toString());
            rs=pstmt.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
            sum();
            
            attainment();
            
            pstmt=conn.prepareStatement("select PO1FA as [PO1], PO2FA as [PO2], PO3FA as [PO3], PO4FA as [PO4], PO5FA as [PO5], PO6FA as [PO6], PO7FA as [PO7], PO8FA as [PO8], PO9FA as [PO9], PO10FA as [PO10], PO11FA as [PO11], PO12FA as [PO12] \n" +
                                                             "from PO_ATTAINMENT where BATCH=? and SEMESTER=? and SUBJECT_CODE=?");
            pstmt.setString(1, batch.getSelectedItem().toString());
            pstmt.setString(2, semester.getSelectedItem().toString());
            pstmt.setString(3, subcode.getSelectedItem().toString());
            rs=pstmt.executeQuery();
            jTable2.setModel(DbUtils.resultSetToTableModel(rs));
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
            java.util.logging.Logger.getLogger(Calculate_PO_Values.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculate_PO_Values.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculate_PO_Values.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculate_PO_Values.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculate_PO_Values().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> batch;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnshow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JComboBox<String> semester;
    private javax.swing.JComboBox<String> subcode;
    // End of variables declaration//GEN-END:variables
}
