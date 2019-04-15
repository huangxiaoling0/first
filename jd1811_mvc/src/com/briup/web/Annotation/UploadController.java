package com.briup.web.Annotation;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
@Controller
public class UploadController {
	@RequestMapping("/uploadCon")
	public String upload(
			@RequestParam("file")
			MultipartFile[] files, 
			HttpServletRequest request) {
		if (files != null && files.length > 0) {
			for (MultipartFile file : files) {
				// 保存文件
				saveFile(request, file);
			}
		}
		// 重定向
		return "upload";
	}

	private void saveFile(HttpServletRequest request, MultipartFile file) {
		// 判断文件是否为空
		if (!file.isEmpty()) {
			try {
				//获取项目在服务器上的绝对位置
				System.out.println("path:"+request.getServletContext().getRealPath("/") );
				//保存的文件路径
				//需要的话可以给文件名上加时间戳
				String filePath = request.getServletContext().getRealPath("/") + "upload/"
						+ file.getOriginalFilename();
				System.out.println("realpath:"+filePath);
				File newFile = new File(filePath);
				//文件所在目录不存在就创建
				if (!newFile.getParentFile().exists()){
					newFile.getParentFile().mkdirs();
				}

				// 转存文件
				file.transferTo(newFile);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
