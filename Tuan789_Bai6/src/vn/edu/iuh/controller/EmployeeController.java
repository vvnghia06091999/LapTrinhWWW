package vn.edu.iuh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import vn.edu.iuh.beans.Employee;
import vn.edu.iuh.dao.EmployeeDao;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeDao employeeDao;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView showView() {
		return new ModelAndView("addView", "command", new Employee());
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView addEmployee(@ModelAttribute("emp") Employee emp) {
		employeeDao.save(emp);
		return new ModelAndView("redirect:/employeeView");
	}

	// goi danh sach employee
	@RequestMapping(value = "/employeeView", method = RequestMethod.GET)
	public ModelAndView showEmployees() {
		List<Employee> list = employeeDao.getAllEmployee();
		return new ModelAndView("employeeView", "list", list);
	}
}
