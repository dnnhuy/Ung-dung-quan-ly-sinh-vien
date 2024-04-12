/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Connection.Connect;
import Model.Hocphan;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Acer
 */
public class HOCPHANDAO {
    //Thêm
    public boolean insert(Hocphan HP) throws Exception {
        String Sql;
        Sql = "insert into HocPhan(MaHP,TenHP,SoTinChi,SoTietLT,SoTietTH,MaKhoa) values(?,?,?,?,?,?)";
        Connection conn = Connect.openConnect();
        PreparedStatement pm = conn.prepareStatement(Sql);
        pm.setString(1, HP.getMaHP());
        pm.setString(2, HP.getTenHP());
        pm.setString(3, HP.getSoTinChi());
        pm.setString(4, HP.getSoTietLT());
        pm.setString(5, HP.getSoTietTH());
        pm.setString(6, HP.getMaKhoa());
        return pm.executeUpdate() > 0;
    }
    //Xóa
    public boolean Delete(String MaHP) throws Exception {
        String sql = "Delete from HocPhan where BINARY_CHECKSUM(MaHP) = BINARY_CHECKSUM (?)";
        Connection conn = Connect.openConnect();
        PreparedStatement pm = conn.prepareStatement(sql);
        pm.setString(1, MaHP);
        return pm.executeUpdate() > 0;
    }
    //Sửa
    public boolean Update(Hocphan HP) throws Exception {
        String Sql;
        Sql = "Update HocPhan SET MaHP=?,TenHP=?,SoTinChi=?,SoTietLT=?,SoTietTH=?,MaKhoa=? WHERE MaHP = ?";
       Connection conn = Connect.openConnect();
        PreparedStatement pm = conn.prepareStatement(Sql);
        pm.setString(1, HP.getMaHP());
        pm.setString(2, HP.getTenHP());
        pm.setString(3, HP.getSoTinChi());
        pm.setString(4, HP.getSoTietLT());
        pm.setString(5, HP.getSoTietTH());
        pm.setString(6, HP.getMaKhoa());
        pm.setString(7, HP.getMaHP());
        return pm.executeUpdate() > 0;
    }

}
