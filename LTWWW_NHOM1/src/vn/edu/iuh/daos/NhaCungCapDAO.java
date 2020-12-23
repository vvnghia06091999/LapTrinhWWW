package vn.edu.iuh.daos;

import java.util.List;

import vn.edu.iuh.model.NhaCungCap;

public interface NhaCungCapDAO {
	public NhaCungCap addNhaCungCap(NhaCungCap nhaCungCap);

	public NhaCungCap updateNhaCungCap(NhaCungCap nhaCungCap);

	public NhaCungCap removeNhaCungCap(NhaCungCap nhaCungCap);

	public List<NhaCungCap> getAllNhaCungCap();

	public NhaCungCap getNhaCungCapbyTen(String ten);
}
