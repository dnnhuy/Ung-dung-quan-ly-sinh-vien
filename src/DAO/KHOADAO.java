/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Connection.Connect;
import Model.Khoa;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Acer
 */
public class KHOADAO {
    //Thêm
    public boolean insert(Khoa k) throws Exception {
        String Sql;
        Sql = "insert into Khoa(MaKhoa,TenKhoa) values(?,?)";
        Connection conn = Connect.openConnect();
        PreparedStatement pm = conn.prepareStatement(Sql);
        pm.setString(1, k.getMaKhoa());
        pm.setString(2, k.getTenKhoa());
        return pm.executeUpdate() > 0;
    }
    //Xóa
    public boolean Delete(String MaKhoa) throws Exception {
        String sql = "Delete from Khoa where BINARY_CHECKSUM(MaKhoa) = BINARY_CHECKSUM (?)";
        Connection conn = Connect.openConnect();
        PreparedStatement pm = conn.prepareStatement(sql);
        pm.setString(1, MaKhoa);
        return pm.executeUpdate() > 0;
    }
    //Sửa
    public boolean Update(Khoa k) throws Exception {
        String Sql;
        Sql = "Update Khoa SET MaKhoa=?,TenKhoa=?  WHERE MaKhoa = ?";
       Connection conn = Connect.openConnect();
        PreparedStatement pm = conn.prepareStatement(Sql);
        pm.setString(1, k.getMaKhoa());
        pm.setString(2, k.getTenKhoa());
        pm.setString(3, k.getMaKhoa());
        return pm.executeUpdate() > 0;
    }

}
