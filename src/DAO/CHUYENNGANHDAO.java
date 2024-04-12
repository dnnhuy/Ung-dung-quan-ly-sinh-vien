/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Connection.Connect;
import Model.ChuyenNganh;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Acer
 */
public class CHUYENNGANHDAO{
    //Thêm
    public boolean insert(ChuyenNganh cn) throws Exception {
        String Sql;
        Sql = "insert into ChuyenNganh (MaCN,TenCN, MaKhoa) values(?,?,?)";
        Connection conn = Connect.openConnect();
        PreparedStatement pm = conn.prepareStatement(Sql);
        pm.setString(1, cn.getMaCN());
        pm.setString(2, cn.getTenCN());
        pm.setString(3, cn.getMaKhoa());
        return pm.executeUpdate() > 0;
    }
    //Xóa
    public boolean Delete(String MaCN) throws Exception {
        String sql = "Delete from ChuyenNganh where BINARY_CHECKSUM(MaCN) = BINARY_CHECKSUM (?)";
        Connection conn = Connect.openConnect();
        PreparedStatement pm = conn.prepareStatement(sql);
        pm.setString(1, MaCN);
        return pm.executeUpdate() > 0;
    }
    //Sửa
    public boolean Update(ChuyenNganh cn) throws Exception {
        String Sql;
        Sql = "Update ChuyenNganh SET MaCN=?,TenCN=?, MaKhoa=?  WHERE MaCN = ?";
       Connection conn = Connect.openConnect();
        PreparedStatement pm = conn.prepareStatement(Sql);
        pm.setString(1, cn.getMaCN());
        pm.setString(2, cn.getTenCN());
        pm.setString(3, cn.getMaKhoa());
        pm.setString(4, cn.getMaCN());
        return pm.executeUpdate() > 0;
    }

}
