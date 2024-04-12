/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Connection.Connect;
import Model.Giangvien;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Acer
 */
public class GIANGVIENDAO {
    //Thêm
    public boolean insert(Giangvien GV) throws Exception {
        String Sql;
        Sql = "insert into GiangVien(MaGV,HoTenGV,NgaySinhGV,GioiTinhGV,SDTGV,CMNDGV,MaKhoa) values(?,?,?,?,?,?,?)";
        Connection conn = Connect.openConnect();
        PreparedStatement pm = conn.prepareStatement(Sql);
        pm.setString(1, GV.getMaGV());
        pm.setString(2, GV.getHoTenGV());
        pm.setString(3, GV.getNgaySinhGV());
        pm.setString(4, GV.getGioiTinhGV());
        pm.setString(5, GV.getSDTGV());
        pm.setString(6, GV.getCMNDGV());
        pm.setString(7,  GV.getMaKhoa());
        return pm.executeUpdate() > 0;
    }
    //Xóa
    public boolean Delete(String MaGV) throws Exception {
        String sql = "Delete from GiangVien where BINARY_CHECKSUM(MaGV) = BINARY_CHECKSUM (?)";
        Connection conn = Connect.openConnect();
        PreparedStatement pm = conn.prepareStatement(sql);
        pm.setString(1, MaGV);
        return pm.executeUpdate() > 0;
    }
    //Sửa
    public boolean Update(Giangvien GV) throws Exception {
        String Sql;
        Sql = "Update GiangVien SET MaGV=?,HoTenGV=?,NgaySinhGV=?,GioiTinhGV=?,SDTGV=?,CMNDGV=?,MaKhoa=? WHERE MaGV = ?";
       Connection conn = Connect.openConnect();
        PreparedStatement pm = conn.prepareStatement(Sql);
        pm.setString(1, GV.getMaGV());
        pm.setString(2, GV.getHoTenGV());
        pm.setString(3, GV.getNgaySinhGV());
        pm.setString(4, GV.getGioiTinhGV());
        pm.setString(5, GV.getSDTGV());
        pm.setString(6, GV.getCMNDGV());
        pm.setString(7, GV.getMaKhoa());
        pm.setString(8, GV.getMaGV());
        return pm.executeUpdate() > 0;
    }

}
