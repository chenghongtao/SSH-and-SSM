package com.cht.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private File pic; // 文件内容
	private String picFileName; // 文件名称
	private String picContentType; // 文件类型
	private String saveDir; // 文件保存路径

	public String getSaveDir() {
		return saveDir;
	}

	public void setSaveDir(String saveDir) {
		this.saveDir = saveDir;
	}

	public File getPic() {
		return pic;
	}

	public void setPic(File pic) {
		this.pic = pic;
	}

	public String getPicFileName() {
		return picFileName;
	}

	public void setPicFileName(String picFileName) {
		this.picFileName = picFileName;
	}

	public String getPicContentType() {
		return picContentType;
	}

	public void setPicContentType(String picContentType) {
		this.picContentType = picContentType;
	}

	public String upload() {
		FileInputStream inputStream = null;
		FileOutputStream outputStream = null;
		System.out.println(1111111111);
		// // 获取项目根路径
		// String root = ServletActionContext.getServletContext().getRealPath("/");
		// String savePath = root + "/WEB-INF/upload";
		// // 找到存放文件的路径，如果不存在，则创建
		// File saveDir = new File(savePath);
		// if (!saveDir.exists()) {
		// saveDir.mkdirs();
		// }
		// System.out.println(saveDir.getAbsolutePath());
		// 上传文件

		try {
			String root = ServletActionContext.getServletContext().getRealPath("/");
			inputStream = new FileInputStream(this.getPic());
			File save = new File(root, saveDir);
			if (!save.exists()) {
				save.mkdirs();
			}
			File file = new File(save, this.picFileName);
			if (file.exists()) {
				file = new File(save, +new Date().getTime() + this.picFileName);
			}
			outputStream = new FileOutputStream(file);
			byte[] buff = new byte[1024];
			int len = 0;
			while ((len = inputStream.read(buff)) != -1) {
				outputStream.write(buff, 0, len);
			}
			outputStream.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				inputStream.close();
				outputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("上传成功！");
		return "success";

	}

}
