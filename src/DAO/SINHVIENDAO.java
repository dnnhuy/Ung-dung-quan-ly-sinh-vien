/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Connection.Connect;
import Model.Sinhvien;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Acer
 */
public class SINHVIENDAO {
    //Thêm
    public boolean insert(Sinhvien SV) throws Exception {
        String Sql;
        Sql = "insert into SinhVien(MSSV,HoTenSV,NgaySinhSV,GioiTinhSV,SDTSV,CMND,MaLop,MaTinh) values(?,?,?,?,?,?,?,?)";
        Connection conn = Connect.openConnect();
        PreparedStatement pm = conn.prepareStatement(Sql);
        pm.setString(1, SV.getMSSV());
        pm.setString(2, SV.getHoTenSV());
        pm.setString(3, SV.getNgaySinhSV());
        pm.setString(4, SV.getGioiTinhSV());
        pm.setString(5, SV.getSDTSV());
        pm.setString(6, SV.getCMND());
        pm.setString(7, SV.getMaLop());
        pm.setString(8,  SV.getMaTinh());
        return pm.executeUpdate() > 0;
    }
    //Xóa
    public boolean Delete(String MSSV) throws Exception {
        String sql = "Delete from SinhVien where BINARY_CHECKSUM(MSSV) = BINARY_CHECKSUM (?)";
        Connection conn = Connect.openConnect();
        PreparedStatement pm = conn.prepareStatement(sql);
        pm.setString(1, MSSV);
        return pm.executeUpdate() > 0;
    }
    //Sửa
    public boolean Update(Sinhvien SV) throws Exception {
        String Sql;
        Sql = "Update SinhVien SET MSSV=?,HoTenSV=?,NgaySinhSV=?,GioiTinhSV=?,SDTSV=?,CMND=?,MaLop=?,MaTinh=? WHERE MSSV = ?";
       Connection conn = Connect.openConnect();
        PreparedStatement pm = conn.prepareStatement(Sql);
        pm.setString(1, SV.getMSSV());
        pm.setString(2, SV.getHoTenSV());
        pm.setString(3, SV.getNgaySinhSV());
        pm.setString(4, SV.getGioiTinhSV());
        pm.setString(5, SV.getSDTSV());
        pm.setString(6, SV.getCMND());
        pm.setString(7, SV.getMaLop());
        pm.setString(8,  SV.getMaTinh());
        pm.setString(9, SV.getMSSV());
        return pm.executeUpdate() > 0;
    }

}
