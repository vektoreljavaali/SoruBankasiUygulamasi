package Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class tblalan {

	@Id
	@SequenceGenerator(name = "sq_tblalan",sequenceName = "sqtblalanid",initialValue = 1,allocationSize = 1)
	@GeneratedValue(generator="sq_tblalan")	
	private long id;
	private String alanadi;
	private long sinavid;
	private int sorusayisi;
	private int silid;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAlanadi() {
		return alanadi;
	}
	public void setAlanadi(String alanadi) {
		this.alanadi = alanadi;
	}
	public long getSinavid() {
		return sinavid;
	}
	public void setSinavid(long sinavid) {
		this.sinavid = sinavid;
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


























