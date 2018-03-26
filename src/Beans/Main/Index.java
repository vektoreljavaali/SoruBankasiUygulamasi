package Beans.Main;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="index")
@SessionScoped
public class Index {

	private String urlLinkleri="Admin/sinavtanimlama.xhtml";

	
	public void sayfaSec(int id) {
		
		switch (id) {
		case 1:urlLinkleri="Admin/sinavtanimlama.xhtml";break;
		case 2:urlLinkleri="Admin/alantanimlama.xhtml";break;
		case 3:urlLinkleri="Admin/derstanimlama.xhtml";break;
		case 4:urlLinkleri="Admin/konutanimlama.xhtml";break;
		case 5:urlLinkleri="Admin/sorutanimlama.xhtml";break;
		default:urlLinkleri="Admin/sinavtanimlama.xhtml";break;
		}
		
	}
		
	
	public String getUrlLinkleri() {
		
		return urlLinkleri;
	}

	public void setUrlLinkleri(String urlLinkleri) {
		
		this.urlLinkleri = urlLinkleri;
	}
	
	
	
}
