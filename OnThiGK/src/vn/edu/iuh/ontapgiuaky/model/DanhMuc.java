package vn.edu.iuh.ontapgiuaky.model;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: DanhMuc
 *
 */
@Entity
public class DanhMuc implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maDM;
	private String tenDanhMuc;
	private String nguoiQuanLy;
	private String ghiChu;
	@OneToMany(mappedBy = "danhMuc", fetch = FetchType.EAGER)
	private List<TinTuc> dsTinTuc;
	private static final long serialVersionUID = 1L;

	public DanhMuc() {
		super();
	}

	public int getMaDM() {
		return this.maDM;
	}

	public void setMaDM(int maDM) {
		this.maDM = maDM;
	}

	public String getTenDanhMuc() {
		return this.tenDanhMuc;
	}

	public void setTenDanhMuc(String tenDanhMuc) {
		this.tenDanhMuc = tenDanhMuc;
	}

	public String getNguoiQuanLy() {
		return this.nguoiQuanLy;
	}

	public void setNguoiQuanLy(String nguoiQuanLy) {
		this.nguoiQuanLy = nguoiQuanLy;
	}

	public String getGhiChu() {
		return this.ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	public List<TinTuc> getDsTinTuc() {
		return dsTinTuc;
	}

	public void setDsTinTuc(List<TinTuc> dsTinTuc) {
		this.dsTinTuc = dsTinTuc;
	}

}
