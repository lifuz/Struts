package com.lifuz.action;

import java.util.Collection;

import com.lifuz.model.Manager;
import com.opensymphony.xwork2.ActionSupport;

public class CollectAction extends ActionSupport {

	private static final long serialVersionUID = -5441090420819001131L;

	private Collection<Manager> mgrs;

	public Collection<Manager> getMgrs() {
		return mgrs;
	}

	public void setMgrs(Collection<Manager> mgrs) {
		this.mgrs = mgrs;
	}
	
	@Override
	public String execute() throws Exception {
		
		System.out.println(mgrs);
		
		return SUCCESS;
	}

}
