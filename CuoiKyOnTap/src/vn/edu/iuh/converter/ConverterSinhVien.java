package vn.edu.iuh.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

import vn.edu.iuh.command.CommandSinhVien;
import vn.edu.iuh.entities.SinhVien;

@Service
public class ConverterSinhVien implements Converter<CommandSinhVien, SinhVien>{

	@Override
	public SinhVien convert(CommandSinhVien sv) {
		// TODO Auto-generated method stub
		if(sv==null)
			return null;
		else {
			SinhVien sinhVien = new SinhVien();
			sinhVien.setHoTen(sv.getHoTen());
			sinhVien.setGioiTinh(sv.getGioiTinh());
			sinhVien.setChuyenNganh(sv.getChuyenNganh());
			sinhVien.setNgaySinh(sv.getNgaySinh());
			sinhVien.setPhoto(sv.getPhoto().getOriginalFilename());
			return sinhVien;
		}
	}

}
