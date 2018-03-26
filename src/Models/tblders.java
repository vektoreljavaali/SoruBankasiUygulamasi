package Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class tblders {

	@Id
	@SequenceGenerator(name = "sq_tblders",sequenceName = "sqtbldersid",initialValue = 1,allocationSize = 1)
	@GeneratedValue(generator="sq_tblders")
	private long id;
	private long sinavid;
	private String ad;
	private int sorusayisi;
	private int silid;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getSinavid() {
		return sinavid;
	}
	public void setSinavid(long sinavid) {
		this.sinavid = sinavid;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public int getSorusayisi() {
		return sorusayisi;
	}
	public void setSorusayisi(int sorusayisi) {
		this.sorusayisi = sorusayisi;
	}
	public int getSilid() {
		return silid;
	}
	public void setSilid(int silid) {
		this.silid = silid;
	}
	
	
}
