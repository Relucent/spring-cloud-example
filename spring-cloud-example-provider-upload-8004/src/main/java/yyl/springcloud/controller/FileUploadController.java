package yyl.springcloud.controller;

import java.util.HashMap;
import java.util.Map;

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
	public Object upload(@RequestParam(value = "file", required = true) MultipartFile file) {
		String originalFilename = file.getOriginalFilename();
		String contentType = file.getContentType();
		long size = file.getSize();
		System.out.println("OriginalFilename" + file.getOriginalFilename());
		// FileCopyUtils.copy(file.getInputStream(), out);
		Map<String,Object> result = new HashMap<>();
		result.put("originalFilename", originalFilename);
		result.put("contentType", contentType);
		result.put("size", size);
		return result;
	}

}
