
package Model;

public class DangKy {
    private String MSSV ;
    private String MaLHP;
    private String NgayDk;
    
    
    // khởi tạo mặc định
    public DangKy ()
    {}

    public DangKy(String MSSV, String MaLHP, String NgayDk) {
        this.MSSV = MSSV;
        this.MaLHP = MaLHP;
        this.NgayDk = NgayDk;
    }

    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public String getMaLHP() {
        return MaLHP;
    }

    public void setMaLHP(String MaLHP) {
        this.MaLHP = MaLHP;
    }

    public String getNgayDk() {
        return NgayDk;
    }

    public void setNgayDk(String NgayDk) {
        this.NgayDk = NgayDk;
    }

    
    
}
