package com.lifuz.action;

import java.io.FileInputStream;
import java.io.InputStream;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 测试文件下载
 *
 * @作者： 李富
 * @邮箱：lifuzz@163.com
 * @时间：2016年3月6日
 */
public class DownloadAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private String contentType;
	private long contentLength;
	private String contentDisposition;

	private InputStream inputStream;

	public String getContentType() {
		return contentType;
	}

	public long getContentLength() {
		return contentLength;
	}

	public String getContentDisposition() {
		return contentDisposition;
	}

	public InputStream getInputStream() {
		return inputStream;
	}

	@Override
	public String execute() throws Exception {
		
		contentType = "text/html";
		
		ServletContext context = ServletActionContext.getServletContext();
		
		String path = context.getRealPath("/files/hidden.html");
		inputStream = new FileInputStream(path);
		
		contentLength = inputStream.available();
		
		return SUCCESS;
	}

}
