package vn.edu.iuh.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UploadController {
	private static final String UPLOAD_DIRETORY = "/images";

	@RequestMapping(value = "uploadform", method = RequestMethod.GET)
	public ModelAndView uploadForm() {
		return new ModelAndView("uploadFormView");
	}

	@RequestMapping(value = "savefile", method = RequestMethod.POST)
	public ModelAndView saveImage(@RequestParam CommonsMultipartFile file, HttpSession session) throws Exception {
		ServletContext context = session.getServletContext();
		String path = context.getRealPath(UPLOAD_DIRETORY);
		String fileName = file.getOriginalFilename();

		System.out.println(path + File.separator + fileName);

		byte[] bytes = file.getBytes();
		BufferedOutputStream stream = new BufferedOutputStream(
				new FileOutputStream(new File(path + File.separator + fileName)));
		stream.write(bytes);
		stream.flush();
		stream.close();

		return new ModelAndView("uploadFormView", "filesuccess", "File successfully saved!");
	}
}
