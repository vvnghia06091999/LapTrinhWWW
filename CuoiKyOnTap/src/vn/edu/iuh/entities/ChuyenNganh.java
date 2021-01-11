package vn.edu.iuh.entities;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: ChuyenNganh
 *
 */
@Entity

public class ChuyenNganh implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String tenChuyenNganh;
	private String moTa;
	private static final long serialVersionUID = 1L;
	@OneToMany(mappedBy = "chuyenNganh", fetch = FetchType.EAGER)
	private List<SinhVien> dsSinhViens;

	public ChuyenNganh() {
		super();
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTenChuyenNganh() {
		return this.tenChuyenNganh;
	}

	public void setTenChuyenNganh(String tenChuyenNganh) {
		this.tenChuyenNganh = tenChuyenNganh;
	}

	public String getMoTa() {
		return this.moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public List<SinhVien> getDsSinhViens() {
		return dsSinhViens;
	}

	public void setDsSinhViens(List<SinhVien> dsSinhViens) {
		this.dsSinhViens = dsSinhViens;
	}

}
