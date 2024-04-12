create database QLSINHVIENUFM
go
USE QLSINHVIENUFM

go 
CREATE TABLE Nganhdaotao --10
(
  Manganh		nvarchar (10) constraint PK_Nganhdaotao_Manganh primary key, 
  Tennganh		nvarchar (30)  not null,
  Hedaotao		nvarchar (30)  not null,
  Loaihinh		nvarchar (30)  not null,
  Khoa			nvarchar (30)  not null,
)
go 
CREATE TABLE Lopsinhvien --5
(
  LopSV			nvarchar (30)  constraint PK_Lopsinhvien_LopSV primary key, 
  Tencovan		nvarchar (50)  not null,
  Manganh		nvarchar (10) constraint FK_SinhVien_Manganh references Nganhdaotao(Manganh)
)

go
CREATE TABLE SinhVien --1
(
  MSSV			nchar (10) constraint PK_SinhVien_MSSV primary key, 
  HoSV			nvarchar (30)  not null,
  TenSV			nvarchar (10)  not null,
  Ngaysinh		datetime not null, 
  Noisinh		nvarchar (50) not null,
  Gioitinh		nvarchar (5) not null constraint CK_SinhVien_Gioitinh Check (Gioitinh in ('Nam', N'Nữ', N'Khác')),
  Dantoc		nvarchar(15) not null, 
  SoCMND		nchar (15) not null,
  Tongiao		nvarchar(15) not null,
  LoaiSV		nvarchar(20) not null,
  Tinhtranghoc	nvarchar(20) not null,
  Quequan		nvarchar (20) not null,
  LopSV			nvarchar (30)   constraint FK_SinhVien_LopSV references Lopsinhvien(LopSV)
)

go
CREATE TABLE TTKhoahoc --3
(
	Khoahoc		nvarchar (10) constraint PK_TTKhoahoc_Khoahoc primary key,
	Nienkhoa	nvarchar (10) not null,
	Namnhaphoc	nvarchar (10) not null,
	Namketthuc	nvarchar (10) not null,
	MSSV		nchar (10) constraint FK_TTKhoahoc_MSSV references SinhVien(MSSV),
	Manganh		nvarchar (10) constraint FK_TTKhoahoc_Manganh references Nganhdaotao(Manganh),
)


go
CREATE TABLE Giangvien --2
(
  HotenGV		nvarchar (50) constraint PK_Giangvien_HotenGV primary key, 
  NgaysinhGV	datetime not null, 
  GioitinhGV	nchar (5) not null constraint CK_Giangvien_GioitinhGV Check (GioitinhGV in ('Nam', N'Nữ', N'Khác')),
  SdtGV			nvarchar(10) not null, 
  EmailGV		nvarchar(40) not null
)
go

CREATE TABLE Hocphan --6
(
  MaHP		nchar (10) constraint PK_Hocphan_MaHP primary key, 
  TenHP		nvarchar (30)  not null,
  Sotinchi	nchar (10) not null, 
  Sotiet	nchar (10) not null
)

go
CREATE TABLE LopHocphan --4
(
  MaLHP			nchar (10) constraint PK_LopHocphan_MaLHP primary key, 
  Thu			nvarchar(10) not null,
  Phong			nvarchar(10) not null,
  Ngaybatdau	datetime  not null,
  Ngayketthuc	datetime not null,
  MaHP			nchar(10)  constraint FK_LopHocphan_MaHP references Hocphan(MaHP),
  HotenGV		nvarchar (50) constraint FK_LopHocphan_HotenGV references Giangvien(HotenGV)
)

go
CREATE TABLE DangKyLopHocphan --7
(
  MSSV		nchar (10) not null constraint FK_DangKyLopHocphan_MSSV references SinhVien(MSSV),
  MaLHP		nchar (10)  not null constraint FK_DangKyLopHocphan_MaLHP references LopHocphan(MaLHP),

  constraint PK_DangKyLopMH primary key (MSSV, MaLHP)
)


go
CREATE TABLE Diem --11
(
  MSSV		nchar (10) not null constraint FK_Diem_MSSV references SinhVien(MSSV),
  MaLHP		nchar (10)  not null constraint FK_Diem_MaLHP references LopHocphan(MaLHP),
  Diem   tinyint not null constraint CK_Diem_Diem Check (Diem in (0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)), 
  constraint PK_Diem primary key (MSSV, MaLHP)
)

go
CREATE TABLE HDRenluyen --8
(
  MaHD		nchar (10) not null constraint PK_HDRenluyen_MaHD primary key,
  TenHD		nvarchar (30) not null ,
  Donvi		nvarchar (30) not null ,
  DiemHD    tinyint not null constraint CK_HDRenluyen_DiemHD Check (DiemHD in (3, 4, 5)), 
  Ngaytochuc	datetime not null, 
  Ngaycapnhat	datetime not null,
)

go
CREATE TABLE ThamgiaHDRenluyen --9
(
  MSSV		nchar (10) not null constraint FK_ThamgiaHDRenluyen_MSSV references SinhVien(MSSV),
  MaHD		nchar (10)  not null constraint FK_ThamgiaHDRenluyen_MaHD references HDRenluyen(MaHD),
  constraint PK_ThamgiaHDRenluyen primary key (MSSV, MaHD)
)