package vn.edu.iuh.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import vn.edu.iuh.command.CommandSinhVien;
import vn.edu.iuh.converter.ConverterSinhVien;
import vn.edu.iuh.dao.ChuyenNganhDao;
import vn.edu.iuh.dao.SinhVienDao;
import vn.edu.iuh.entities.ChuyenNganh;
import vn.edu.iuh.entities.SinhVien;

@Controller
@Transactional
public class SinhVienController {
	
	@Autowired
	private ChuyenNganhDao chuyenNganhDao;
	@Autowired 
	private SinhVienDao sinhVienDao;
	@Autowired
	private ServletContext context;
	@Autowired
	private ConverterSinhVien converterSinhVien;

	@RequestMapping(value = {"/","/allsinhvien"}, method = RequestMethod.GET)
	public ModelAndView getAllSV() {
		List<ChuyenNganh> chuyenNganhs = chuyenNganhDao.getAllChuyenNganh();
		return new ModelAndView("listStudentView", "listChuyenNganh", chuyenNganhs);
		
	}

	@RequestMapping(value = "formThemSV", method = RequestMethod.GET)
	public ModelAndView getFormThemSinhVien() {
		CommandSinhVien commandSinhVien = new CommandSinhVien();

		return new ModelAndView("formStudentView","commandSinhVien",commandSinhVien);
	}
	
	@RequestMapping(value = "themSinhVien",method = RequestMethod.POST)
	public ModelAndView themSinhVien(@Validated @ModelAttribute("commandSinhVien") CommandSinhVien commandSinhVien,
			BindingResult errors) {
		String message;
		if (errors.hasErrors()) {
			message = "Vui lòng sửa các lỗi sau đây !";
			return new ModelAndView("formStudentView", "message", message);
		}
		MultipartFile photo = commandSinhVien.getPhoto();
		try {
			String photoPath = context.getRealPath("/images/" + photo.getOriginalFilename());
			photo.transferTo(new File(photoPath));

		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SinhVien sinhVien = converterSinhVien.convert(commandSinhVien);
		sinhVienDao.themSV(sinhVien);
		
		return new ModelAndView("newStudent","student",sinhVien);
	}
	
	@ModelAttribute("dsCN")
	public List<ChuyenNganh> dsCN() {
		return chuyenNganhDao.getAllChuyenNganh();
	}
}
