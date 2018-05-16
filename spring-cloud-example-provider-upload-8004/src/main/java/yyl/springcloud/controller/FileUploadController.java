package yyl.springcloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadController {

	// ~ http://localhost:8004/upload
	@PostMapping("/upload")
	@ResponseBody
	public String upload(@RequestParam(value = "file", required = true) MultipartFile file) {
		String originalFilename = file.getOriginalFilename();
		System.out.println("OriginalFilename" + file.getOriginalFilename());
		// byte[] bytes = file.getBytes();
		// FileCopyUtils.copy(in, out);
		return originalFilename;
	}

}
