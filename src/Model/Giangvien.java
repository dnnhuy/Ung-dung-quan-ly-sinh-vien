package Model;

public class Giangvien {
    private String MaGV ;
    private String HoTenGV;
    private String NgaySinhGV;
    private String GioiTinhGV ;
    private String SDTGV;
    private String CMNDGV;
    private String MaKhoa;
    // khởi tạo mặc định
public Giangvien(){
    
}
    
    public Giangvien(String MaGV, String HoTenGV, String NgaySinhGV, String GioiTinhGV, String SDTGV, String CMNDGV, String MaKhoa) {
        this.MaGV = MaGV;
        this.HoTenGV = HoTenGV;
        this.NgaySinhGV = NgaySinhGV;
        this.GioiTinhGV = GioiTinhGV;
        this.SDTGV = SDTGV;
        this.CMNDGV = CMNDGV;
        this.MaKhoa = MaKhoa;
    }

    public String getMaGV() {
        return MaGV;
    }

    public void setMaGV(String MaGV) {
        this.MaGV = MaGV;
    }

    public String getHoTenGV() {
        return HoTenGV;
    }

    public void setHoTenGV(String HoTenGV) {
        this.HoTenGV = HoTenGV;
    }

    public String getNgaySinhGV() {
        return NgaySinhGV;
    }

    public void setNgaySinhGV(String NgaySinhGV) {
        this.NgaySinhGV = NgaySinhGV;
    }

    public String getGioiTinhGV() {
        return GioiTinhGV;
    }

    public void setGioiTinhGV(String GioiTinhGV) {
        this.GioiTinhGV = GioiTinhGV;
    }

    public String getSDTGV() {
        return SDTGV;
    }

    public void setSDTGV(String SDTGV) {
        this.SDTGV = SDTGV;
    }

    public String getCMNDGV() {
        return CMNDGV;
    }

    public void setCMNDGV(String CMNDGV) {
        this.CMNDGV = CMNDGV;
    }

    public String getMaKhoa() {
        return MaKhoa;
    }

    public void setMaKhoa(String MaKhoa) {
        this.MaKhoa = MaKhoa;
    }
    
    
    
    
}
