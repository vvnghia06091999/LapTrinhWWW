package vn.edu.iuh.daos;

import java.util.List;

import vn.edu.iuh.model.TaiKhoan;

public interface TaiKhoanDAO {
	public TaiKhoan addTaiKhoan(TaiKhoan taiKhoan);

	public TaiKhoan updateTaiKhoan(TaiKhoan taiKhoan);

	public TaiKhoan removeTaiKhoan(TaiKhoan taiKhoan);

	public List<TaiKhoan> getAllTaiKhoan();

	public List<TaiKhoan> getTaiKhoanByIDAndMK(String tenTaiKhoan, String matKhau);
}
