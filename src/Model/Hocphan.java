
package Model;

public class Hocphan {
    private String MaHP ;
    private String TenHP;
    private String SoTinChi;
    private String SoTietLT;
    private String SoTietTH;
    private String MaKhoa;
    // khởi tạo mặc định
    public Hocphan()
    {}

    public Hocphan(String MaHP, String TenHP, String SoTinChi, String SoTietLT, String SoTietTH, String MaKhoa) {
        this.MaHP = MaHP;
        this.TenHP = TenHP;
        this.SoTinChi = SoTinChi;
        this.SoTietLT = SoTietLT;
        this.SoTietTH = SoTietTH;
        this.MaKhoa = MaKhoa;
    }

    public String getMaHP() {
        return MaHP;
    }

    public void setMaHP(String MaHP) {
        this.MaHP = MaHP;
    }

    public String getTenHP() {
        return TenHP;
    }

    public void setTenHP(String TenHP) {
        this.TenHP = TenHP;
    }

    public String getSoTinChi() {
        return SoTinChi;
    }

    public void setSoTinChi(String SoTinChi) {
        this.SoTinChi = SoTinChi;
    }

    public String getSoTietLT() {
        return SoTietLT;
    }

    public void setSoTietLT(String SoTietLT) {
        this.SoTietLT = SoTietLT;
    }

    public String getSoTietTH() {
        return SoTietTH;
    }

    public void setSoTietTH(String SoTietTH) {
        this.SoTietTH = SoTietTH;
    }

    public String getMaKhoa() {
        return MaKhoa;
    }

    public void setMaKhoa(String MaKhoa) {
        this.MaKhoa = MaKhoa;
    }

    
    
    
}
