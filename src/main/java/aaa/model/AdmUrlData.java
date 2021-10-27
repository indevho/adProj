package aaa.model;

import lombok.Data;

@Data
public class AdmUrlData {

	String cate, service;

	public AdmUrlData(String cate, String service) {
		super();
		this.cate = cate;
		this.service = service;
	}

	public AdmUrlData() {
		// TODO Auto-generated constructor stub
	}
}
