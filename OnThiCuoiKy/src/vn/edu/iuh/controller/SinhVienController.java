package vn.edu.iuh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import vn.edu.iuh.command.CommandSinhVien;

@Controller
@RequestMapping("sinhvien/")
public class SinhVienController {
	@RequestMapping("show-form")
	public ModelAndView showForm() {
		CommandSinhVien sinhVien = new CommandSinhVien();
		return new ModelAndView("form-student", "sinhVien", sinhVien);
	}
	@RequestMapping("themSV")
	public ModelAndView them(@ModelAttribute("sinhVien") CommandSinhVien sinhVien) {
		
		return new ModelAndView();
	}
}
