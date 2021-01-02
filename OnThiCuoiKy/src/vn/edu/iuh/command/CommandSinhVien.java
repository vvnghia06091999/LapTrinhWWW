package vn.edu.iuh.command;

import java.util.Date;

public class CommandSinhVien {
	private Integer id_SV;
	private String tenSinhVien;
	private Date ngaySinh;
	private String photo;
	private Long diem;
	private Integer id_CN;

	public Integer getId_SV() {
		return id_SV;
	}

	public void setId_SV(Integer id_SV) {
		this.id_SV = id_SV;
	}

	public String getTenSinhVien() {
		return tenSinhVien;
	}

	public void setTenSinhVien(String tenSinhVien) {
		this.tenSinhVien = tenSinhVien;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public Long getDiem() {
		return diem;
	}

	public void setDiem(Long diem) {
		this.diem = diem;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public CommandSinhVien(String tenSinhVien, Date ngaySinh, String photo, Long diem, Integer id_CN) {
		super();
		this.tenSinhVien = tenSinhVien;
		this.ngaySinh = ngaySinh;
		this.photo = photo;
		this.diem = diem;
		this.id_CN = id_CN;
	}

	public Integer getId_CN() {
		return id_CN;
	}

	public void setId_CN(Integer id_CN) {
		this.id_CN = id_CN;
	}

	public CommandSinhVien() {
		super();
	}

}
