package br.com.edtonlemos.model;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class TourBean {
	
	private String type;

	public TourBean() {
	}
	
	public String submit() {
		if (type == null)
			return "";
		
		if(type.equals("City")) {
			return "city_response";
		} else 
			return "country_response";
		
	}
	
	//GETTERS AND SETTERS
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	

}
