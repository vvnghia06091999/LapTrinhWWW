package vn.edu.iuh.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import vn.edu.iuh.beans.Employee;

@Controller
public class EmployeeController {
	private List<Employee> list;

	public EmployeeController() {
		// TODO Auto-generated constructor stub
		list = new ArrayList<Employee>();
		list.add(new Employee(1, "Nghia1", 1231321, "admin"));
		list.add(new Employee(2, "Nghia2", 1231321, "admin"));
		list.add(new Employee(3, "Nghia3", 1231321, "admin"));
		list.add(new Employee(4, "Nghia4", 1231321, "admin"));
	}

	// Goi giao dien addView
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView showView() {
		return new ModelAndView("addView", "command", new Employee());
		// command ? , new Employee ?
	}

	// them employee vao
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView addEmployee(@ModelAttribute("emp") Employee emp) {
		list.add(new Employee(list.size() + 1, emp.getName(), emp.getSalary(), emp.getDesignation()));
		return new ModelAndView("redirect:/employeeView");
		//@ModelAttribute("emp") ?
	}

	// goi danh sach employee
	@RequestMapping(value = "/employeeView", method = RequestMethod.GET)
	public ModelAndView showEmployees() {
		return new ModelAndView("employeeView", "list", list);
	}

}
