/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Form;

import Connection.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Acer
 */
public class THONGKE extends javax.swing.JFrame {

    /**
     * Creates new form THONGKE1
     */
    DefaultTableModel tbtModel;
    public THONGKE() {
        initComponents();
        setLocationRelativeTo(null);
        initcbbLop();
        initcbbMaKhoa();
    }
private void initcbbLop() {
        try {
            String sql = "Select MaLop from Lop";
            Connection conn = Connect.openConnect();
            PreparedStatement pm = conn.prepareStatement(sql);
            ResultSet rs = pm.executeQuery();
            cbbLop.removeAllItems();
            while (rs.next()) {
                cbbLop.addItem(rs.getString("MaLop"));
            }
            rs.close();
            pm.close();
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            e.printStackTrace();
        }
    }
private void initcbbMaKhoa() {
        try {
            String sql = "Select MaKhoa from Khoa";
            Connection conn = Connect.openConnect();
            PreparedStatement pm = conn.prepareStatement(sql);
            ResultSet rs = pm.executeQuery();
            cbbMaKhoa.removeAllItems();
            while (rs.next()) {
                cbbMaKhoa.addItem(rs.getString("MaKhoa"));
            }
            rs.close();
            pm.close();
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            e.printStackTrace();
        }
    }   

     public void LoadulieuLop() {

        try {
            tbl_lop.removeAll();
            String[] arr = {"MSSV", "Họ tên SV", "Ngày sinh","Giới tính","SDT","CMND","Lớp","Tỉnh"};
            tbtModel = new DefaultTableModel(arr, 0);
            String Sql;
        Sql =   "SELECT * " +
                "FROM SinhVien " +
                "WHERE exists ( select *  from Lop 	"+
                "where MaLop=? and Lop.MaLop=SinhVien.MaLop) ";
        Connection conn = Connect.openConnect();
        PreparedStatement pm = conn.prepareStatement(Sql);
        pm.setString(1, cbbLop.getItemAt(cbbLop.getSelectedIndex()));
           
            ResultSet rs = pm.executeQuery();
            tbtModel.setRowCount(0);
            while (rs.next()) {
                String[] row = new String[]
            {
                    rs.getString("MSSV"), rs.getString("HoTenSV"),
                    rs.getString("NgaySinhSV"),rs.getString("GioiTinhSV"),
                    rs.getString("SDTSV"),rs.getString("CMND"),
                    rs.getString("MaLop"),rs.getString("MaTinh")};
                
                tbtModel.addRow(row);
            }
            tbl_lop.setModel(tbtModel);
            tbtModel.fireTableDataChanged();
            Connect.CloseConnect(conn);
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
    
     public void LoadulieuKhoa() {

        try {
            tbl_khoa.removeAll();
            String[] arr = {"MaGV", "Họ tên", "Ngày sinh","Giới tính","SDT","CMND","Khoa"};
            tbtModel = new DefaultTableModel(arr, 0);
            String Sql;
        Sql =   "SELECT * " +
                "FROM GiangVien " +
                "WHERE exists ( select *  from Khoa 	"+
                "where MaKhoa=? and Khoa.MaKhoa=GiangVien.MaKhoa) ";
        Connection conn = Connect.openConnect();
        PreparedStatement pm = conn.prepareStatement(Sql);
        pm.setString(1, cbbMaKhoa.getItemAt(cbbMaKhoa.getSelectedIndex()));
           
            ResultSet rs = pm.executeQuery();
            tbtModel.setRowCount(0);
            while (rs.next()) {
                String[] row = new String[]
            {
                    rs.getString("MaGV"), rs.getString("HoTenGV"),
                    rs.getString("NgaySinhGV"),rs.getString("GioiTinhGV"),
                    rs.getString("SDTGV"),rs.getString("CMNDGV"),
                    rs.getString("MaKhoa")};
                
                tbtModel.addRow(row);
            }
            tbl_khoa.setModel(tbtModel);
            tbtModel.fireTableDataChanged();
            Connect.CloseConnect(conn);
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_lop = new javax.swing.JTable();
        cbbLop = new javax.swing.JComboBox<>();
        lblDong6 = new javax.swing.JLabel();
        bttInSV = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btt_thoat = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_khoa = new javax.swing.JTable();
        cbbMaKhoa = new javax.swing.JComboBox<>();
        lblDong7 = new javax.swing.JLabel();
        bttInCN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btt_trove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tbl_lop.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbl_lop);

        cbbLop.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblDong6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDong6.setText("Mã lớp:");

        bttInSV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bttInSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/in.png"))); // NOI18N
        bttInSV.setText("In");
        bttInSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttInSVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(lblDong6)
                .addGap(22, 22, 22)
                .addComponent(cbbLop, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bttInSV, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDong6)
                    .addComponent(cbbLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttInSV))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("#9Slide03 SFU DIN Mittelschrift", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/thongke.png"))); // NOI18N
        jLabel4.setText("THỐNG KÊ");

        btt_thoat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btt_thoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/thoat.png"))); // NOI18N
        btt_thoat.setText("Thoát");
        btt_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_thoatActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tbl_khoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tbl_khoa);

        cbbMaKhoa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblDong7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDong7.setText("Mã khoa:");

        bttInCN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bttInCN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/in.png"))); // NOI18N
        bttInCN.setText("In");
        bttInCN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttInCNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(30, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDong7)
                        .addGap(22, 22, 22)
                        .addComponent(cbbMaKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(bttInCN, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDong7)
                    .addComponent(cbbMaKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttInCN))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/lop.png"))); // NOI18N
        jLabel1.setText("Danh sách sinh viên theo lớp");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/khoa.png"))); // NOI18N
        jLabel2.setText("Danh sách giảng viên theo khoa");

        btt_trove.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btt_trove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/back.png"))); // NOI18N
        btt_trove.setText("Trở về");
        btt_trove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_troveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(115, 115, 115))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(450, 450, 450)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btt_trove, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(btt_thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btt_thoat)
                    .addComponent(btt_trove))
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btt_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_thoatActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btt_thoatActionPerformed

    private void bttInSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttInSVActionPerformed
        // TODO add your handling code here:
        LoadulieuLop();
    }//GEN-LAST:event_bttInSVActionPerformed

    private void bttInCNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttInCNActionPerformed
        // TODO add your handling code here:
        LoadulieuKhoa() ;
    }//GEN-LAST:event_bttInCNActionPerformed

    private void btt_troveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_troveActionPerformed
        // TODO add your handling code here:
        TRANGCHU tc = new TRANGCHU();
        tc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btt_troveActionPerformed

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
            java.util.logging.Logger.getLogger(THONGKE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(THONGKE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(THONGKE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(THONGKE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new THONGKE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttInCN;
    private javax.swing.JButton bttInSV;
    private javax.swing.JButton btt_thoat;
    private javax.swing.JButton btt_trove;
    private javax.swing.JComboBox<String> cbbLop;
    private javax.swing.JComboBox<String> cbbMaKhoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDong6;
    private javax.swing.JLabel lblDong7;
    private javax.swing.JTable tbl_khoa;
    private javax.swing.JTable tbl_lop;
    // End of variables declaration//GEN-END:variables
}
