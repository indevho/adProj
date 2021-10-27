package aaa.model;

import lombok.Data;

@Data
public class Menu {

	String url, ttt;

	public Menu(String url, String ttt) {
		super();
		this.url = url;
		this.ttt = ttt;
	}
	
	public Menu() {
		// TODO Auto-generated constructor stub
	}
}
