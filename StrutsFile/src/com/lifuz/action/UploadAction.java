package com.lifuz.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import com.opensymphony.xwork2.ActionSupport;

public class UploadAction extends ActionSupport {

	private static final long serialVersionUID = -9128912434490349146L;
	
	private File ppt;
	private String pptContentType;
	private String pptFileName;
	public File getPpt() {
		return ppt;
	}
	public void setPpt(File ppt) {
		this.ppt = ppt;
	}
	public String getPptContentType() {
		return pptContentType;
	}
	public void setPptContentType(String pptContentType) {
		this.pptContentType = pptContentType;
	}
	public String getPptFileName() {
		return pptFileName;
	}
	public void setPptFileName(String pptFileName) {
		this.pptFileName = pptFileName;
	}
	
	@Override
	public String execute() throws Exception {
		
		System.out.println(pptFileName);
		
		FileOutputStream out = new FileOutputStream("D:\\var/mcc/image/" + pptFileName);
		
		FileInputStream in = new FileInputStream(ppt);
		
		byte[] buf = new byte[1024];
		
		int len = 0;
		
		while((len = in.read(buf)) != -1) {
			out.write(buf, 0, len);
		}
		
		out.close();
		in.close();
		
		return SUCCESS;
	}

}
