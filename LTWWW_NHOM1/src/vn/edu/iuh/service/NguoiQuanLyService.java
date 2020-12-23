package vn.edu.iuh.service;

import java.util.List;

import vn.edu.iuh.model.NguoiQuanLy;


public interface NguoiQuanLyService {
	public NguoiQuanLy addNguoiQuanLy(NguoiQuanLy nguoiQuanLy);
	public NguoiQuanLy updateNguoiQuanLy(NguoiQuanLy nguoiQuanLy);
	public NguoiQuanLy removeNguoiQuanLy(NguoiQuanLy nguoiQuanLy);
	public List<NguoiQuanLy> getAllNguoiQuanLy();
}
