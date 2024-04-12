
package DAO;
import Connection.Connect;
import Model.LopHP;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Acer
 */
public class LOPHOCPHANDAO {
    //Thêm
    public boolean insert(LopHP LHP) throws Exception {
        String Sql;
        Sql = "insert into LopHP(MaLHP,TenHP,NgayBd,NgayKt,NgayDukienthi,HK,Nam,MaHP, MaGV) values(?,?,?,?,?,?,?,?,?)";
        Connection conn = Connect.openConnect();
        PreparedStatement pm = conn.prepareStatement(Sql);
        pm.setString(1, LHP.getMaLHP());
        pm.setString(2, LHP.getTenHP());
        pm.setString(3, LHP.getNgayBd());
        pm.setString(4, LHP.getNgayKt());
        pm.setString(5, LHP.getNgayDukienthi());
        pm.setString(6, LHP.getHK());
        pm.setString(7, LHP.getNam());
        pm.setString(8,  LHP.getMaHP());
        pm.setString(9,  LHP.getMaGV());
        return pm.executeUpdate() > 0;
    }
    //Xóa
    public boolean Delete(String MaLHP) throws Exception {
        String sql = "Delete from LopHP where BINARY_CHECKSUM(MaLHP) = BINARY_CHECKSUM (?)";
        Connection conn = Connect.openConnect();
        PreparedStatement pm = conn.prepareStatement(sql);
        pm.setString(1, MaLHP);
        return pm.executeUpdate() > 0;
    }
    //Sửa
    public boolean Update(LopHP LHP) throws Exception {
        String Sql;
        Sql = "Update LopHP SET MaLHP=?,TenHP=?,NgayBd=?,NgayKt=?,NgayDukienthi=?,HK=?,Nam=?,MaHP=?,MaGV=? WHERE MaLHP = ?";
       Connection conn = Connect.openConnect();
        PreparedStatement pm = conn.prepareStatement(Sql);
        pm.setString(1, LHP.getMaLHP());
        pm.setString(2, LHP.getTenHP());
        pm.setString(3, LHP.getNgayBd());
        pm.setString(4, LHP.getNgayKt());
        pm.setString(5, LHP.getNgayDukienthi());
        pm.setString(6, LHP.getHK());
        pm.setString(7, LHP.getNam());
        pm.setString(8,  LHP.getMaHP());
        pm.setString(9,  LHP.getMaGV());
        pm.setString(10, LHP.getMaLHP());
        return pm.executeUpdate() > 0;
    }

}
