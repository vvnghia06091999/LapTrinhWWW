package vn.edu.iuh.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import vn.edu.iuh.daos.DonHangDAO;
import vn.edu.iuh.model.DonHang;
import vn.edu.iuh.service.DonHangService;

@Service
public class DonHangServiceImpl implements DonHangService {
	private DonHangDAO donHangDAO;
	
	public void setDonHangDAO(DonHangDAO donHangDAO) {
		this.donHangDAO = donHangDAO;
	}

	@Override
	@Transactional
	public DonHang addKDonHang(DonHang donHang) {
		// TODO Auto-generated method stub
		return donHangDAO.addKDonHang(donHang);
	}

	@Override
	@Transactional
	public DonHang updateDonHang(DonHang donHang) {
		// TODO Auto-generated method stub
		return donHangDAO.updateDonHang(donHang);
	}

	@Override
	@Transactional
	public DonHang removeDonHang(DonHang donHang) {
		// TODO Auto-generated method stub
		return donHangDAO.removeDonHang(donHang);
	}

	@Override
	@Transactional
	public List<DonHang> getAllDonHang() {
		// TODO Auto-generated method stub
		return donHangDAO.getAllDonHang();
	}

	@Override
	@Transactional
	public int getIdMax() {
		// TODO Auto-generated method stub
		return donHangDAO.getIdMax();
	}
	@Override
	@Transactional
	public List<DonHang> getAllDonHangbyMaKhachHang(int maKhacHang) {
		// TODO Auto-generated method stub
		return donHangDAO.getAllDonHangbyMaKhachHang(maKhacHang);
	}
}
