package vn.edu.iuh.command;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.springframework.web.multipart.MultipartFile;

import vn.edu.iuh.entities.ChuyenNganh;

public class CommandSinhVien {
	private Integer id;
	//@NotBlank(message = "Không được để trống tên SV!")
	@Pattern(regexp = "^[\\p{L} ]+$", message = "Tên không hợp lệ hoặc đang để trống")
	private String hoTen;
	private String gioiTinh;
	private MultipartFile photo;
	private Date ngaySinh;
	private ChuyenNganh chuyenNganh;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public ChuyenNganh getChuyenNganh() {
		return chuyenNganh;
	}

	public void setChuyenNganh(ChuyenNganh chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}

	public MultipartFile getPhoto() {
		return photo;
	}

	public void setPhoto(MultipartFile photo) {
		this.photo = photo;
	}

	public CommandSinhVien(String hoTen, String gioiTinh, MultipartFile photo, Date ngaySinh, ChuyenNganh chuyenNganh) {
		super();
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.photo = photo;
		this.ngaySinh = ngaySinh;
		this.chuyenNganh = chuyenNganh;
	}

	public CommandSinhVien() {
		super();
	}
	
	

}
