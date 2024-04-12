/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Connection.Connect;
import Model.DiemThi;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Acer
 */
public class DIEMTHIDAO{
    //Thêm
    public boolean insert(DiemThi dt) throws Exception {
        String Sql;
        Sql = "insert into DiemThi (MSSV,MaLHP,DiemQt, DiemThi, DiemTb, KetQua) values(?,?,?,?,?,?)";
        Connection conn = Connect.openConnect();
        PreparedStatement pm = conn.prepareStatement(Sql);
        pm.setString(1, dt.getMSSV());
        pm.setString(2, dt.getMaLHP());
        pm.setString(3, dt.getDiemQt());
        pm.setString(4, dt.getDiemThi());
        pm.setString(5, dt.getDiemTb());
        pm.setString(6, dt.getKetQua());
        return pm.executeUpdate() > 0;
    }
    //Xóa
    public boolean Delete(String MSSV, String MaLHP) throws Exception {
        String sql = "Delete from DiemThi  WHERE MSSV = ? and MaLHP=?";
        Connection conn = Connect.openConnect();
        PreparedStatement pm = conn.prepareStatement(sql);
        pm.setString(1, MSSV);
        pm.setString(2, MaLHP);
        return pm.executeUpdate() > 0;
    }
    //Sửa
    public boolean Update(DiemThi dt) throws Exception {
        String Sql;
        Sql = "Update DiemThi SET MSSV=?,MaLHP=?,DiemQt=?, DiemThi=?, DiemTb=?, KetQua=?  WHERE MSSV = ? and MaLHP=?";
       Connection conn = Connect.openConnect();
        PreparedStatement pm = conn.prepareStatement(Sql);
        pm.setString(1, dt.getMSSV());
        pm.setString(2, dt.getMaLHP());
        pm.setString(3, dt.getDiemQt());
        pm.setString(4, dt.getDiemThi());
        pm.setString(5, dt.getDiemTb());
        pm.setString(6, dt.getKetQua());
        pm.setString(7, dt.getMSSV());
        pm.setString(8, dt.getMaLHP());
        return pm.executeUpdate() > 0;
    }

}
