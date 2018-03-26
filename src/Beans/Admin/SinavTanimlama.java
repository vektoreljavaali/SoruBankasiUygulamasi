package Beans.Admin;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

import org.hibernate.Session;
import org.hibernate.Transaction;

import DAO.tblsinavDAO;
import Models.tblsinav;
import util.hibernateutil;

@SuppressWarnings("deprecation")
@ManagedBean(name="beanSinavTanimlama")
@SessionScoped
public class SinavTanimlama {
	
	private List<tblsinav> listeSinav = new ArrayList<tblsinav>();

	tblsinavDAO db; 
	private tblsinav sinav;
	private tblsinav tmp;
	
	
	private String sinavadi;
	private int sorusayisi;
	

	
	
	public tblsinav getTmp() {
		return tmp;
	}

	public void setTmp(tblsinav tmp) {
		this.tmp = tmp;
	}

	public String getSinavadi() {
		return sinavadi;
	}

	public void setSinavadi(String sinavadi) {
		this.sinavadi = sinavadi;
	}

	public int getSorusayisi() {
		return sorusayisi;
	}

	public void setSorusayisi(int sorusayisi) {
		this.sorusayisi = sorusayisi;
	}

	public SinavTanimlama() {
		db = new tblsinavDAO();
		this.sinavadi="Bizim Sýnav";
		this.sorusayisi=120;
		sinav = new tblsinav();	
		listeSinav = db.Listele();
	}
	
	public void ekle() {
		tmp = new tblsinav();
		tmp.setSinavadi(this.sinavadi);
		tmp.setSorusayisi(this.sorusayisi);	
		listeSinav.add(tmp);
		db.Kaydet(tmp);
		this.sinavadi="";
		this.sorusayisi=0;
	}
	
	
	public tblsinav getSinav() {
		return sinav;
	}


	public void setSinav(tblsinav sinav) {
		this.sinav = sinav;
	}


	public List<tblsinav> getListeSinav() {
		return listeSinav;
	}

	public void setListeSinav(List<tblsinav> listeSinav) {
		this.listeSinav = listeSinav;
	}
	
	
	
}
