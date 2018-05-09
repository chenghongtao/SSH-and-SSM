package com.cht.file;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class DownLoadAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private String fileName; // 下载的文件名称
	private String downLoadFileName; // 文件保存在本地之后的名称

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		// 处理文件名称乱码问题,获取最后还会报canot find io错误
		try {
			fileName = new String(fileName.getBytes("ISO8859-1"), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		this.fileName = fileName;
	}

	public String downLoad() {
		return "down";
	}

	public InputStream getFileStream() {
		System.out.println(this.fileName);
		InputStream fileStream = ServletActionContext.getServletContext()
				.getResourceAsStream("/WEB-INF/upload/" + this.getFileName());
		return fileStream;
	}

	public String getDownLoadFileName() {
		try {
			this.downLoadFileName = new String(this.getFileName().getBytes("utf-8"), "ISO-8859-1");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return downLoadFileName;
	}
}
