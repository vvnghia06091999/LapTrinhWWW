package vn.edu.iuh.daos;

import java.util.List;

import vn.edu.iuh.model.DonHang;


public interface DonHangDAO {
	public DonHang addKDonHang(DonHang donHang);
	public DonHang updateDonHang(DonHang donHang);
	public DonHang removeDonHang(DonHang donHang);
	public List<DonHang> getAllDonHang();
	public int getIdMax();
	public List<DonHang> getAllDonHangbyMaKhachHang(int maKhacHang);
}
