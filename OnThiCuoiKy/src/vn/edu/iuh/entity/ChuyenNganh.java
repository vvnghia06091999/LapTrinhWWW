package vn.edu.iuh.entity;

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
	private Integer id_CN;
	private String tenCN;
	private String moTa;
	@OneToMany(mappedBy = "chuyenNganh", fetch = FetchType.EAGER)
	private List<SinhVien> sinhViens;
	private static final long serialVersionUID = 1L;

	public ChuyenNganh() {
		super();
	}

	public Integer getId_CN() {
		return this.id_CN;
	}

	public void setId_CN(Integer id_CN) {
		this.id_CN = id_CN;
	}

	public String getTenCN() {
		return this.tenCN;
	}

	public void setTenCN(String tenCN) {
		this.tenCN = tenCN;
	}

	public String getMoTa() {
		return this.moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public List<SinhVien> getSinhViens() {
		return sinhViens;
	}

	public void setSinhViens(List<SinhVien> sinhViens) {
		this.sinhViens = sinhViens;
	}

	public ChuyenNganh(String tenCN, String moTa) {
		super();
		this.tenCN = tenCN;
		this.moTa = moTa;
	}

	@Override
	public String toString() {
		return "ChuyenNganh [id_CN=" + id_CN + ", tenCN=" + tenCN + ", moTa=" + moTa + ", sinhViens=" + sinhViens + "]";
	}

}
