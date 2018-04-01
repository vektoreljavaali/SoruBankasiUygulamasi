package Beans.Main;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ValueChangeEvent;

import org.apache.catalina.util.TomcatCSS;

import DAO.tblalanDAO;
import DAO.tbldersDAO;
import DAO.tblsinavDAO;
import Models.*;

@ManagedBean(name="defaultsayfa")
@SessionScoped
public class Default {

	private String kullaniciAdi;
	private ArrayList<tblsinav> listesinav;
	private ArrayList<tblders> listeders;
	private ArrayList<tblalan> listealan;
	private ArrayList<tblsoru> listesoru;
	private int toplamkullanici;
	private int toplamcozulensoru;
	private int yapilansinav;
	private String solmenu;
	
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
	
	
	
	public Default() {
		kullaniciAdi = util.staticValues.girisAdi;
		toplamcozulensoru=3250;
		toplamkullanici=250;
		yapilansinav=1250;
		listesinav = new ArrayList<>();
		tblsinav ss = new tblsinav();
		ss.setId(1);
		ss.setSinavadi("KPSS");
		listesinav.add(ss);
		ss = new tblsinav();
		ss.setId(2);
		ss.setSinavadi("YDS");
		listesinav.add(ss);
		ss = new tblsinav();
		ss.setId(3);
		ss.setSinavadi("LYS");
		listesinav.add(ss);
		listeders = new ArrayList<>();
		tblders dd = new tblders();
		dd.setId(1);
		dd.setAd("Matematik");
		dd.setSinavid(1);
		listeders.add(dd);
		dd = new tblders();
		dd.setId(2);
		dd.setAd("Türkçe");
		dd.setSinavid(1);
		listeders.add(dd);
	
		dd = new tblders();
		dd.setId(1);
		dd.setAd("Gramer");
		dd.setSinavid(2);
		listeders.add(dd);
		dd = new tblders();
		dd.setId(2);
		dd.setAd("Paragraf");
		dd.setSinavid(2);
		listeders.add(dd);
		
		dd = new tblders();
		dd.setId(1);
		dd.setAd("Tarih");
		dd.setSinavid(3);
		listeders.add(dd);
		dd = new tblders();
		dd.setId(2);
		dd.setAd("biyoloji");
		dd.setSinavid(3);
		listeders.add(dd);
		solmenu = listele();
		
		alanListesi = (ArrayList<tblalan>) DBAlan.Listele();
		dersListesi = (ArrayList<tblders>) DB.Listele();
		sinavid=-1;
		System.out.println("burası çalıştı");
	}
	
	public String listele() {
		
		String anahat="" ;
		String kapanis= "</ul> </li>";
		
		
		
		for (tblsinav itemsinav : listesinav) {
			anahat+= "<li><a><i class='fa fa-home'></i>"+itemsinav.getSinavadi()+"<span class='fa fa-chevron-down'></span></a>"+
					   "<ul class='nav child_menu' style='display: none'>";
			for (tblders itemders : listeders) {
				if(itemsinav.getId()==itemders.getSinavid())
				anahat += "<li><a href='index2.html'>"+itemders.getAd()+"</a></li>";
			}
			anahat += kapanis;
		}
		
		return anahat;
	}
	
	
	public tblders getTmp() {
		return tmp;
	}

		public void getir() {
			alanListesi=(ArrayList<tblalan>) DBAlan.SecListele(sinavid);
			System.out.println("getir");
		}
	
	public void valueChangeMethod(ValueChangeEvent e){
		System.out.println(e.getNewValue().toString());
		alanListesi=(ArrayList<tblalan>) DBAlan.SecListele(sinavid);
		System.out.println("getir");
	}
	
	public void setTmp(tblders tmp) {
		this.tmp = tmp;
	}


	public long getSinavid() {
		return sinavid;
	}

	public void setSinavid(long sinavid) {
		this.sinavid = sinavid;
		System.out.println(sinavid);
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





	public String getSolmenu() {
		return solmenu;
	}





	public void setSolmenu(String solmenu) {
		this.solmenu = solmenu;
	}





	public String getKullaniciAdi() {
		return kullaniciAdi;
	}
	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}
	public ArrayList<tblsinav> getListesinav() {
		return listesinav;
	}
	public void setListesinav(ArrayList<tblsinav> listesinav) {
		this.listesinav = listesinav;
	}
	public ArrayList<tblders> getListeders() {
		return listeders;
	}
	public void setListeders(ArrayList<tblders> listeders) {
		this.listeders = listeders;
	}
	public ArrayList<tblalan> getListealan() {
		return listealan;
	}
	public void setListealan(ArrayList<tblalan> listealan) {
		this.listealan = listealan;
	}
	public ArrayList<tblsoru> getListesoru() {
		return listesoru;
	}
	public void setListesoru(ArrayList<tblsoru> listesoru) {
		this.listesoru = listesoru;
	}
	public int getToplamkullanici() {
		return toplamkullanici;
	}
	public void setToplamkullanici(int toplamkullanici) {
		this.toplamkullanici = toplamkullanici;
	}
	public int getToplamcozulensoru() {
		return toplamcozulensoru;
	}
	public void setToplamcozulensoru(int toplamcozulensoru) {
		this.toplamcozulensoru = toplamcozulensoru;
	}
	public int getYapilansinav() {
		return yapilansinav;
	}
	public void setYapilansinav(int yapilansinav) {
		this.yapilansinav = yapilansinav;
	}
	
	
	
	
}
