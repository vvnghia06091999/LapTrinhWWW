package vn.edu.iuh.service;

import java.util.List;

import vn.edu.iuh.model.DanhMuc;



public interface DanhMucService {
	public DanhMuc addDanhMuc(DanhMuc danhMuc);
	public DanhMuc updateDanhMuc(DanhMuc danhMuc);
	public DanhMuc removeDanhMuc(DanhMuc danhMuc);
	public List<DanhMuc> getAllDanhMuc();
	public DanhMuc getDanhMucbyTen(String ten);
}
