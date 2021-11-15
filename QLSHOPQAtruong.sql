CREATE DATABASE QLSHOPQANHOM3

IF OBJECT_ID('NHANVIEN') IS NOT NULL
DROP TABLE NHANVIEN
GO
CREATE TABLE NHANVIEN
 (
	MANV NVARCHAR(15) NOT NULL ,
      TENNV NVARCHAR(30) NOT NULL ,
	  SDT NVARCHAR(12) NOT NULL ,
      DIACHI NVARCHAR(50) NOT NULL ,
      TRANGTHAI NVARCHAR(30) NOT NULL ,
      CONSTRAINT pk_nhanvien PRIMARY KEY ( MANV )
     
    )

IF OBJECT_ID('TAIKHOAN') IS NOT NULL
DROP TABLE TAIKHOAN
GO
CREATE TABLE TAIKHOAN
 (
     USERNAME NVARCHAR(30) NOT NULL ,
	 
	  PASSWORD NVARCHAR(30) NOT NULL ,
      ROLE NVARCHAR(15) NOT NULL ,
	   MANV NVARCHAR(15) NOT NULL
      CONSTRAINT pk_taikhoan PRIMARY KEY ( USERNAME ) ,
     CONSTRAINT FK_TAIKHOAN_NHANVIEN FOREIGN KEY(MANV) REFERENCES NHANVIEN(MANV)
    )
	IF OBJECT_ID('KHACHHANG') IS NOT NULL
DROP TABLE KHACHHANG
GO
CREATE TABLE KHACHHANG
 (
     MAKH NVARCHAR(15) NOT NULL ,
      TENKH NVARCHAR(30) NOT NULL ,
	  SDT NVARCHAR(12) NOT NULL ,
      DIACHI NVARCHAR(50) NOT NULL ,
      TRANGTHAI NVARCHAR(30) NOT NULL ,
      CONSTRAINT pk_khachhang PRIMARY KEY ( makh )
    )
	IF OBJECT_ID('HOADON') IS NOT NULL
DROP TABLE HOADON
GO
CREATE TABLE HOADON
 (
      MAHD NVARCHAR(15) NOT NULL ,
      MANV NVARCHAR(15)  NULL ,
      MAKH NVARCHAR(15)  NULL ,
      NGAYLAP DATE  NULL,
      TONGTIEN FLOAT  NULL ,
      CONSTRAINT pk_hoadon PRIMARY KEY ( mahd ) ,
      CONSTRAINT fk_hoadon_nhanvien FOREIGN KEY ( manv ) REFERENCES nhanvien ( manv ) ,
      CONSTRAINT fk_hoadon_khachhang FOREIGN KEY ( makh ) REFERENCES khachhang ( makh ),
    )
	IF OBJECT_ID('theloai') IS NOT NULL
DROP TABLE theloai
GO
CREATE TABLE theloai
 (
      MATHELOAI NVARCHAR(15) NOT NULL ,
      TENTHELOAI NVARCHAR(50) NOT NULL ,
       CONSTRAINT pk_theloai PRIMARY KEY ( MATHELOAI ) ,
     
    )
IF OBJECT_ID('SANPHAM') IS NOT NULL
DROP TABLE SANPHAM
GO
CREATE TABLE SANPHAM
 (
      MASP NVARCHAR(15) NOT NULL ,
	  TENSP NVARCHAR(50) NOT NULL ,  
	  HINHANH NVARCHAR(50) NOT NULL ,
	  SOLUONG INT NOT NULL ,
      GIABAN FLOAT NOT NULL ,  
      MOTA NVARCHAR(250) NOT NULL ,
	  MATHELOAI NVARCHAR(15) NOT NULL ,
      CONSTRAINT pk_sanpham PRIMARY KEY ( masp ),
	  CONSTRAINT FK_THELOAI_SANPHAM FOREIGN KEY(MATHELOAI) REFERENCES THELOAI
    )
IF OBJECT_ID('HOADONCT') IS NOT NULL
DROP TABLE HOADONCT
GO
CREATE TABLE HOADONCT
 (
      MAHD NVARCHAR(15) NOT NULL ,
      MASP NVARCHAR(15) NOT NULL ,
	  TENSP NVARCHAR(50) NOT NULL,
      SOLUONG INT NOT NULL ,
      DONGIA FLOAT NOT NULL ,
      CONSTRAINT pk_HOADONCT PRIMARY KEY ( mahd, masp ) ,
      CONSTRAINT fk_HOADONCT_sanpham FOREIGN KEY ( masp ) REFERENCES sanpham ( masp ) ,
      CONSTRAINT fk_HOADONCT_hoadon FOREIGN KEY ( mahd ) REFERENCES hoadon ( mahd )
     
    )

	select * from taikhoan
	select * from nhanvien
	select * from khachhang
	select * from hoadon
	select * from hoadonct
	select * from sanpham
	select * from theloai
	

    INSERT INTO NHANVIEN VALUES('QL01',N'Trần Nam Trường','0123451',N'ĐOAN HÙNG',N'Quản Lý'),
	('QL02',N'Nguyễn Danh Vinh','0123452',N'ĐOAN HÙNG',N'Quản Lý'),
	('NV01',N'Nguyễn Minh Đức','0123453',N'THANH HÓA',N'Nhân Viên'),
	('NV02',N'Nguyễn Duy Văn','0123454',N'THANH HÓA',N'Nhân Viên'),
	('NV03',N'Duong Van Hung','0123454',N'THANH HÓA',N'Nhân Viên')


	 insert into taikhoan values(N'truongtnph16707@pft.edu.vn','1108',N'QL123','QL01'),
	                            (N'vinhndph16560@fpt.edu.vn','1108',N'QL123','QL02'),
								(N'ducnmph17022@fpt.edu.vn','2404',N'NHÂN VIÊN','NV01'),
								(N'vanndph14485@fpt.edu.vn','2404',N'NHÂN VIÊN','NV02'),
								(N'hungdvph14470@fpt.edu.vn','2404',N'NHÂN VIÊN','NV02')

	insert into taikhoan values(N'truongtnph16707','1108',N'QL123','QL01')
	update taikhoan set manv='QL01' where username= 'truongtnph16707@pft.edu.vn'
    delete taikhoan

	   INSERT INTO KHACHHANG VALUES('KH01',N'TUYÊN', '0330101996',N'CHÍ ĐÁM',N'Mới'),
	                                ('KH02',N'VIỆT', '0301092002', N'XUÂN PHƯƠNG',N'Mới')

	  INSERT INTO HOADON VALUES('HD03','NV02','KH02','08/07/2021',150000),
								('HD01','NV01','KH02','09/07/2021',300000),
	                            ('HD02','NV01','KH01','09/07/2021',300000)

	  INSERT INTO theloai VALUES  ('TL01',N'Thu đông'),
	                               ('TL02',N'Áo lạnh')

	   INSERT INTO SANPHAM VALUES('SP01',N'ÁO LEN','1.PNG',1,130000,N'ÁO LEN HÀN QUỐC','TL01'),
	                             ('SP02',N'QUẦN JEAN ỐNG XUÔNG','1.PNG',3,130000,N'QUẦN JEAN ỐNG SUÔNG PHÙ HỢP VỚI MỌI LỨA TUỔI','TL02'),
								 ('SP03',N'ÁO THUN ','1.PNG',2,130000,N'ÁO THUN','TL02')

	   delete  from hoadonct
	   delete hoadon
	   INSERT INTO HOADONCT VALUES	('HD03','SP02',N'QUẦN JEAN ỐNG SUÔNG',1,150000),
									('HD01','SP02',N'QUẦN JEAN ỐNG SUÔNG',2,150000),
									('HD02','SP01',N'ÁO LEN',2,150000)

	 

  select sum(tongtien) AS TONG , count(hoadon.mahd) AS HOADON , count(masp) AS SP from hoadon 
  join hoadonct on hoadon.MAHD = HOADONCT.MAHD
  where ngaylap = '02-10-2021'
  select * from HOADON where ngaylap = '02-10-2021'
  select * from HOADONCT


  ---
    select * from taikhoan
	select * from nhanvien
	select * from khachhang
	select * from hoadon
	select * from hoadonct
	select * from theloai
========================================================
--DOANH THU
select hoadon.mahd,ngaylap,manv,makh,count(sanpham.masp) as slsp, (sum(hoadonct.soluong) * giaban) - (sum(hoadonct.soluong)*gianhap) as ck,
(sum(hoadonct.soluong) * giaban) as tongtien 
from sanpham join hoadonct on sanpham.MASP = HOADONCT.MASP
join hoadon on HOADONCT.MAHD = hoadon.MAHD
where  ngaylap between  '10/01/2021' and '10/30/2021'
group by hoadon.mahd,ngaylap,manv,makh,giaban,gianhap
---
