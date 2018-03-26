package Beans.Admin;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import DAO.tblalanDAO;
import DAO.tbldersDAO;
import DAO.tblsinavDAO;
import Models.tblalan;
import Models.tblders;
import Models.tblsinav;

@ManagedBean(name="beanDersTanimlama")
@SessionScoped
public class DersTanimlama {

	ArrayList<tblsinav> sinavListesi = new ArrayList<>();
	ArrayList<tblalan> alanListesi = new ArrayList<>();
	ArrayList<tblders> dersListesi = new ArrayList<>();
	
	tblders tmp = new tblders();
	private long sinavid;
	private long alanid;
	private String dersadi;
	private int sorusayisi;
	
	tbldersDAO DB = new tbldersDAO();
	tblalanDAO DBAlan = new tblalanDAO();
	tblsinavDAO DBSinav = new tblsinavDAO();
	
	public DersTanimlama() {
		System.out.println("ilk kod..");
		alanListesi = (ArrayList<tblalan>) DBAlan.Listele();
		dersListesi = (ArrayList<tblders>) DB.Listele();
		sinavid=-1;
	}
	
	public void kaydet() {
		tmp = new tblders();
		tmp.setAd(dersadi);
		tmp.setSorusayisi(sorusayisi);
		tmp.setSinavid(sinavid);
		
		dersListesi.add(tmp);
		DB.Kaydet(tmp);
		
	}
	
	public void alanListele() {
	  	  	
	}
	
	
	public ArrayList<tblsinav> getSinavListesi() {
		sinavListesi=(ArrayList<tblsinav>) DBSinav.Listele();
		return sinavListesi;
	}
	public void setSinavListesi(ArrayList<tblsinav> sinavListesi) {
		this.sinavListesi = sinavListesi;
	}
	public ArrayList<tblalan> getAlanListesi() {
	 alanListesi=(ArrayList<tblalan>) DBAlan.SecListele(sinavid);
		
	return alanListesi;
	}
	public void setAlanListesi(ArrayList<tblalan> alanListesi) {
		this.alanListesi = alanListesi;
	}
	public ArrayList<tblders> getDersListesi() {
		return dersListesi;
	}
	public void setDersListesi(ArrayList<tblders> dersListesi) {
		this.dersListesi = dersListesi;
	}
	public long getSinavid() {
		return sinavid;
	}
	public void setSinavid(long sinavid) {
		this.sinavid = sinavid;
	}
	public long getAlanid() {
		return alanid;
	}
	public void setAlanid(long alanid) {
		this.alanid = alanid;
	}
	public String getDersadi() {
		return dersadi;
	}
	public void setDersadi(String dersadi) {
		this.dersadi = dersadi;
	}
	public int getSorusayisi() {
		return sorusayisi;
	}
	public void setSorusayisi(int sorusayisi) {
		this.sorusayisi = sorusayisi;
	}

}
