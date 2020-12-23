package vn.edu.iuh.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import vn.edu.iuh.daos.DanhMucDAO;
import vn.edu.iuh.model.DanhMuc;
import vn.edu.iuh.service.DanhMucService;

@Service
public class DanhMucServiceImpl implements DanhMucService {
	private DanhMucDAO danhMucDAO;

	public void setDanhMucDAO(DanhMucDAO danhMucDAO) {
		this.danhMucDAO = danhMucDAO;
	}

	@Override
	@Transactional
	public DanhMuc addDanhMuc(DanhMuc danhMuc) {
		// TODO Auto-generated method stub
		return danhMucDAO.addDanhMuc(danhMuc);
	}

	@Override
	@Transactional
	public DanhMuc updateDanhMuc(DanhMuc danhMuc) {
		// TODO Auto-generated method stub
		return danhMucDAO.updateDanhMuc(danhMuc);
	}

	@Override
	@Transactional
	public DanhMuc removeDanhMuc(DanhMuc danhMuc) {
		// TODO Auto-generated method stub
		return danhMucDAO.removeDanhMuc(danhMuc);
	}

	@Override
	@Transactional
	public List<DanhMuc> getAllDanhMuc() {
		// TODO Auto-generated method stub
		return danhMucDAO.getAllDanhMuc();
	}

	@Override
	@Transactional
	public DanhMuc getDanhMucbyTen(String ten) {
		// TODO Auto-generated method stub
		return danhMucDAO.getDanhMucbyTen(ten);
	}
}
