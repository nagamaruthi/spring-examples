package com.naga.service;

import com.naga.DAOService;

public class EmployeeService {

	DAOService daoService;
	String companyName;
	String companyId;

	
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public DAOService getDaoService() {
		return daoService;
	}

	public void setDaoService(DAOService daoService) {
		this.daoService = daoService;
	}
	
	
	public String getData() {
		return "From Dao Service: "+daoService.getData()+"==company Name=="+this.companyName+"==company Id=="
					+this.companyId;
	}
	
}
