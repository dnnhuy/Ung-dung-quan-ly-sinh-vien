/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Form;

/**
 *
 * @author Acer
 */
public class TRANGCHU extends javax.swing.JFrame {

    /**
     * Creates new form TRANGCHU
     */
    public TRANGCHU() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btt_lhp = new javax.swing.JButton();
        btt_gv = new javax.swing.JButton();
        btt_tinhtp = new javax.swing.JButton();
        btt_hp = new javax.swing.JButton();
        btt_sv = new javax.swing.JButton();
        btt_lop = new javax.swing.JButton();
        btt_khoa = new javax.swing.JButton();
        btt_chuyennganh = new javax.swing.JButton();
        btt_thongke = new javax.swing.JButton();
        btt_thoat = new javax.swing.JButton();
        btt_diem = new javax.swing.JButton();
        btt_dk = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trang chủ");

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setFont(new java.awt.Font("#9Slide03 SFU DIN Mittelschrift", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TRƯỜNG ĐẠI HỌC TÀI CHÍNH - MARKETING");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logoUFM.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btt_lhp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btt_lhp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/lophp.png"))); // NOI18N
        btt_lhp.setText("Quản lý lớp học phần");
        btt_lhp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_lhpActionPerformed(evt);
            }
        });

        btt_gv.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btt_gv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/giangvien.png"))); // NOI18N
        btt_gv.setText("Quản lý giảng viên");
        btt_gv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_gvActionPerformed(evt);
            }
        });

        btt_tinhtp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btt_tinhtp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/tinhtp.png"))); // NOI18N
        btt_tinhtp.setText("Quản lý tỉnh/TP");
        btt_tinhtp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_tinhtpActionPerformed(evt);
            }
        });

        btt_hp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btt_hp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/hocphan.png"))); // NOI18N
        btt_hp.setText("Quản lý học phần");
        btt_hp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_hpActionPerformed(evt);
            }
        });

        btt_sv.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btt_sv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/sv.png"))); // NOI18N
        btt_sv.setText("Quản lý sinh viên");
        btt_sv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_svActionPerformed(evt);
            }
        });

        btt_lop.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btt_lop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/lop.png"))); // NOI18N
        btt_lop.setText("Quản lý lớp học");
        btt_lop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_lopActionPerformed(evt);
            }
        });

        btt_khoa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btt_khoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/khoa.png"))); // NOI18N
        btt_khoa.setText("Quản lý khoa");
        btt_khoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_khoaActionPerformed(evt);
            }
        });

        btt_chuyennganh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btt_chuyennganh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/chuyennganh.png"))); // NOI18N
        btt_chuyennganh.setText("Chuyên ngành");
        btt_chuyennganh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_chuyennganhActionPerformed(evt);
            }
        });

        btt_thongke.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btt_thongke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/thongke.png"))); // NOI18N
        btt_thongke.setText("Thống kê");
        btt_thongke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_thongkeActionPerformed(evt);
            }
        });

        btt_thoat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btt_thoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/thoat.png"))); // NOI18N
        btt_thoat.setText("Thoát");
        btt_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_thoatActionPerformed(evt);
            }
        });

        btt_diem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btt_diem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/diem.png"))); // NOI18N
        btt_diem.setText("Quản lý điểm");
        btt_diem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_diemActionPerformed(evt);
            }
        });

        btt_dk.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btt_dk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/dangky.png"))); // NOI18N
        btt_dk.setText("Quản lý đăng ký");
        btt_dk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_dkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btt_sv, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btt_gv, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btt_tinhtp, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btt_thongke, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btt_thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btt_lop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btt_lhp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btt_hp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btt_chuyennganh, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btt_khoa, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btt_diem, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btt_dk, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btt_sv)
                    .addComponent(btt_lop)
                    .addComponent(btt_khoa))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btt_gv)
                    .addComponent(btt_hp)
                    .addComponent(btt_chuyennganh))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btt_lhp)
                    .addComponent(btt_tinhtp)
                    .addComponent(btt_diem))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btt_thoat)
                    .addComponent(btt_thongke)
                    .addComponent(btt_dk))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("#9Slide03 SFU DIN Mittelschrift", 1, 27)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("TRANG CHỦ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 42, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(36, 36, 36))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(268, 268, 268)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btt_lhpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_lhpActionPerformed
        // TODO add your handling code here:
        LOPHOCPHAN lhp = new LOPHOCPHAN();
                lhp.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_btt_lhpActionPerformed

    private void btt_gvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_gvActionPerformed
        // TODO add your handling code here:
        GIANGVIEN gv = new GIANGVIEN();
                gv.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_btt_gvActionPerformed

    private void btt_tinhtpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_tinhtpActionPerformed
        // TODO add your handling code here:
        TINHTP T= new TINHTP();
        T.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_btt_tinhtpActionPerformed

    private void btt_hpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_hpActionPerformed
        // TODO add your handling code here:
        HOCPHAN hp = new HOCPHAN();
                hp.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_btt_hpActionPerformed

    private void btt_svActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_svActionPerformed

                SINHVIEN sv = new SINHVIEN();
                sv.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_btt_svActionPerformed

    private void btt_lopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_lopActionPerformed
        // TODO add your handling code here:
                LOP l = new LOP();
                l.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_btt_lopActionPerformed

    private void btt_khoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_khoaActionPerformed
        // TODO add your handling code here:LOP l = new LOP();
                 KHOA k= new KHOA()    ;    
                 k.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_btt_khoaActionPerformed

    private void btt_chuyennganhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_chuyennganhActionPerformed
        // TODO add your handling code here:
        CHUYENNGANH cn= new CHUYENNGANH();
       cn.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_btt_chuyennganhActionPerformed

    private void btt_thongkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_thongkeActionPerformed
        // TODO add your handling code here:
        THONGKE TK= new THONGKE();
        TK.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_btt_thongkeActionPerformed

    private void btt_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_thoatActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btt_thoatActionPerformed

    private void btt_diemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_diemActionPerformed
        // TODO add your handling code here:
        DIEMTHI DT= new DIEMTHI();
        DT.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_btt_diemActionPerformed

    private void btt_dkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_dkActionPerformed
        // TODO add your handling code here:
       DANGKY dk = new DANGKY();
        dk.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btt_dkActionPerformed

    
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
            java.util.logging.Logger.getLogger(TRANGCHU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TRANGCHU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TRANGCHU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TRANGCHU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TRANGCHU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btt_chuyennganh;
    private javax.swing.JButton btt_diem;
    private javax.swing.JButton btt_dk;
    private javax.swing.JButton btt_gv;
    private javax.swing.JButton btt_hp;
    private javax.swing.JButton btt_khoa;
    private javax.swing.JButton btt_lhp;
    private javax.swing.JButton btt_lop;
    private javax.swing.JButton btt_sv;
    private javax.swing.JButton btt_thoat;
    private javax.swing.JButton btt_thongke;
    private javax.swing.JButton btt_tinhtp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
