/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Acer
 */
public class LopHP {
    private String MaLHP ;
    private String TenHP;
    private String NgayBd;
    private String NgayKt;
    private String NgayDukienthi;
    private String HK ;
    private String Nam;
    private String MaHP ;
    private String MaGV ;
    
    // khởi tạo mặc định
    public LopHP()
    {}

    public LopHP(String MaLHP, String TenHP, String NgayBd, String NgayKt, String NgayDukienthi, String HK, String Nam, String MaHP, String MaGV) {
        this.MaLHP = MaLHP;
        this.TenHP = TenHP;
        this.NgayBd = NgayBd;
        this.NgayKt = NgayKt;
        this.NgayDukienthi = NgayDukienthi;
        this.HK = HK;
        this.Nam = Nam;
        this.MaHP = MaHP;
        this.MaGV = MaGV;
    }

    public String getMaLHP() {
        return MaLHP;
    }

    public void setMaLHP(String MaLHP) {
        this.MaLHP = MaLHP;
    }

    public String getTenHP() {
        return TenHP;
    }

    public void setTenHP(String TenHP) {
        this.TenHP = TenHP;
    }

    public String getNgayBd() {
        return NgayBd;
    }

    public void setNgayBd(String NgayBd) {
        this.NgayBd = NgayBd;
    }

    public String getNgayKt() {
        return NgayKt;
    }

    public void setNgayKt(String NgayKt) {
        this.NgayKt = NgayKt;
    }

    public String getNgayDukienthi() {
        return NgayDukienthi;
    }

    public void setNgayDukienthi(String NgayDukienthi) {
        this.NgayDukienthi = NgayDukienthi;
    }

    public String getHK() {
        return HK;
    }

    public void setHK(String HK) {
        this.HK = HK;
    }

    public String getNam() {
        return Nam;
    }

    public void setNam(String Nam) {
        this.Nam = Nam;
    }

    public String getMaHP() {
        return MaHP;
    }

    public void setMaHP(String MaHP) {
        this.MaHP = MaHP;
    }

    public String getMaGV() {
        return MaGV;
    }

    public void setMaGV(String MaGV) {
        this.MaGV = MaGV;
    }

    
    
    
    
}
