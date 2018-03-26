package Beans.Admin;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import DAO.tblalanDAO;
import DAO.tblsinavDAO;
import Models.tblalan;
import Models.tblsinav;

@ManagedBean(name="alantanimlama")
@SessionScoped
public class AlanTanimlama {

	private int sinavid;
	private String alanadi;
	private int sorusayisi;
	private ArrayList<tblalan> alanlistesi = new ArrayList<>(); 
	private ArrayList<tblsinav> sinavlistesi = new ArrayList<>();
	tblalanDAO DB = new tblalanDAO();		
	tblsinavDAO DBSinav = new tblsinavDAO();
	
	public void kaydet() {
	tblalan alan = new tblalan();
	alan.setAlanadi(alanadi);
	alan.setSilid(1);
	alan.setSinavid(sinavid);
	alan.setSorusayisi(sorusayisi);
	alanlistesi.add(alan);
	DB.Kaydet(alan);
	}
	
	
	public AlanTanimlama() {
		alanlistesi = (ArrayList<tblalan>) DB.Listele();
	}
	
	
	
	
	public ArrayList<tblsinav> getSinavlistesi() {
		sinavlistesi = (ArrayList<tblsinav>) DBSinav.Listele();
		return sinavlistesi;
	}


	public void setSinavlistesi(ArrayList<tblsinav> sinavlistesi) {
		this.sinavlistesi = sinavlistesi;
	}


	public ArrayList<tblalan> getAlanlistesi() {
		return alanlistesi;
	}



	public void setAlanlistesi(ArrayList<tblalan> alanlistesi) {
		this.alanlistesi = alanlistesi;
	}



	public int getSinavid() {
		return sinavid;
	}
	public void setSinavid(int sinavid) {
		this.sinavid = sinavid;
	}
	public String getAlanadi() {
		return alanadi;
	}
	public void setAlanadi(String alanadi) {
		this.alanadi = alanadi;
	}
	public int getSorusayisi() {
		return sorusayisi;
	}
	public void setSorusayisi(int sorusayisi) {
		this.sorusayisi = sorusayisi;
	}
	
	
	
	
	
}
