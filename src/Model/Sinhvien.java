
package Model;

public class Sinhvien {
    private String MSSV ;
    private String HoTenSV;
    private String NgaySinhSV;
    private String GioiTinhSV ;
    private String SDTSV;
    private String CMND;
    private String MaLop;
    private String MaTinh;
    // khởi tạo mặc định
    public Sinhvien()
    {
    }

    public Sinhvien(String MSSV, String HoTenSV, String NgaySinhSV, String GioiTinhSV, String SDTSV, String CMND, String MaTinh, String MaLop) {
        this.MSSV = MSSV;
        this.HoTenSV = HoTenSV;
        this.NgaySinhSV = NgaySinhSV;
        this.GioiTinhSV = GioiTinhSV;
        this.SDTSV = SDTSV;
        this.CMND = CMND;
        this.MaLop = MaLop;
        this.MaTinh = MaTinh;
        
    }

    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public String getHoTenSV() {
        return HoTenSV;
    }

    public void setHoTenSV(String HoTenSV) {
        this.HoTenSV = HoTenSV;
    }

    public String getNgaySinhSV() {
        return NgaySinhSV;
    }

    public void setNgaySinhSV(String NgaySinhSV) {
        this.NgaySinhSV = NgaySinhSV;
    }

    public String getGioiTinhSV() {
        return GioiTinhSV;
    }

    public void setGioiTinhSV(String GioiTinhSV) {
        this.GioiTinhSV = GioiTinhSV;
    }

    public String getSDTSV() {
        return SDTSV;
    }

    public void setSDTSV(String SDTSV) {
        this.SDTSV = SDTSV;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getMaTinh() {
        return MaTinh;
    }

    public void setMaTinh(String MaTinh) {
        this.MaTinh = MaTinh;
    }

    public String getMaLop() {
        return MaLop;
    }

    public void setMaLop(String MaLop) {
        this.MaLop = MaLop;
    }
    
    
    
}
