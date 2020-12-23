package vn.edu.iuh.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import vn.edu.iuh.daos.NhaCungCapDAO;
import vn.edu.iuh.model.NhaCungCap;
import vn.edu.iuh.service.NhaCungCapService;

@Service
public class NhaCungCapServiceImpl implements NhaCungCapService {
	private NhaCungCapDAO nhaCungCapDAO;
	
	public void setNhaCungCapDAO(NhaCungCapDAO nhaCungCapDAO) {
		this.nhaCungCapDAO = nhaCungCapDAO;
	}

	@Override
	@Transactional
	public NhaCungCap addNhaCungCap(NhaCungCap nhaCungCap) {
		// TODO Auto-generated method stub
		return nhaCungCapDAO.addNhaCungCap(nhaCungCap);
	}

	@Override
	@Transactional
	public NhaCungCap updateNhaCungCap(NhaCungCap nhaCungCap) {
		// TODO Auto-generated method stub
		return nhaCungCapDAO.updateNhaCungCap(nhaCungCap);
	}

	@Override
	@Transactional
	public NhaCungCap removeNhaCungCap(NhaCungCap nhaCungCap) {
		// TODO Auto-generated method stub
		return nhaCungCapDAO.removeNhaCungCap(nhaCungCap);
	}

	@Override
	@Transactional
	public List<NhaCungCap> getAllNhaCungCap() {
		// TODO Auto-generated method stub
		return nhaCungCapDAO.getAllNhaCungCap();
	}
	@Override
	@Transactional
	public NhaCungCap getNhaCungCapbyTen(String ten) {
		// TODO Auto-generated method stub
		return nhaCungCapDAO.getNhaCungCapbyTen(ten);
	}
	
}
