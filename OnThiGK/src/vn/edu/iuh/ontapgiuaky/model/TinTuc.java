package vn.edu.iuh.ontapgiuaky.model;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: TinTuc
 *
 */
@Entity

public class TinTuc implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maTT;
	private String tieuDe;
	private String noiDungTT;
	private String lienKet;
	@ManyToOne
	@JoinColumn(name = "maDM")
	private DanhMuc danhMuc;
	private static final long serialVersionUID = 1L;

	public TinTuc() {
		super();
	}

	public int getMaTT() {
		return this.maTT;
	}

	public void setMaTT(int maTT) {
		this.maTT = maTT;
	}

	public String getTieuDe() {
		return this.tieuDe;
	}

	public void setTieuDe(String tieuDe) {
		this.tieuDe = tieuDe;
	}

	public String getNoiDungTT() {
		return this.noiDungTT;
	}

	public void setNoiDungTT(String noiDungTT) {
		this.noiDungTT = noiDungTT;
	}

	public String getLienKet() {
		return this.lienKet;
	}

	public void setLienKet(String lienKet) {
		this.lienKet = lienKet;
	}

	public DanhMuc getDanhMuc() {
		return danhMuc;
	}

	public void setDanhMuc(DanhMuc danhMuc) {
		this.danhMuc = danhMuc;
	}

}
