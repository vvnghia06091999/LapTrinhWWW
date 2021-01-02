package vn.edu.iuh.entity;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * Entity implementation class for Entity: SinhVien
 *
 */
@Entity

public class SinhVien implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_SV;
	private String tenSinhVien;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date ngaySinh;
	private String photo;
	@ManyToOne
	@JoinColumn(name = "maChuyenNganh")
	private ChuyenNganh chuyenNganh;
	private Long diem;
	private static final long serialVersionUID = 1L;

	public SinhVien() {
		super();
	}

	public Integer getId_SV() {
		return this.id_SV;
	}

	public void setId_SV(Integer id_SV) {
		this.id_SV = id_SV;
	}

	public String getTenSinhVien() {
		return this.tenSinhVien;
	}

	public void setTenSinhVien(String tenSinhVien) {
		this.tenSinhVien = tenSinhVien;
	}

	public Date getNgaySinh() {
		return this.ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public ChuyenNganh getChuyenNganh() {
		return chuyenNganh;
	}

	public void setChuyenNganh(ChuyenNganh chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}

	public Long getDiem() {
		return diem;
	}

	public void setDiem(Long diem) {
		this.diem = diem;
	}

	public SinhVien(String tenSinhVien, Date ngaySinh, String photo, ChuyenNganh chuyenNganh, Long diem) {
		super();
		this.tenSinhVien = tenSinhVien;
		this.ngaySinh = ngaySinh;
		this.photo = photo;
		this.chuyenNganh = chuyenNganh;
		this.diem = diem;
	}

	@Override
	public String toString() {
		return "SinhVien [id_SV=" + id_SV + ", tenSinhVien=" + tenSinhVien + ", ngaySinh=" + ngaySinh + ", photo="
				+ photo + ", chuyenNganh=" + chuyenNganh + ", diem=" + diem + "]";
	}

}
