package Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class tblsinav {

	@Id
	@SequenceGenerator(name = "sq_tblsinav",sequenceName = "sqtblmusteriid",initialValue = 1,allocationSize = 1)
	@GeneratedValue(generator="sq_tblsinav")
	private long id;
	private String sinavadi;
	private int silid;
	private int sorusayisi;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSinavadi() {
		return sinavadi;
	}
	public void setSinavadi(String sinavadi) {
		this.sinavadi = sinavadi;
	}
	public int getSilid() {
		return silid;
	}
	public void setSilid(int silid) {
		this.silid = silid;
	}
	public int getSorusayisi() {
		return sorusayisi;
	}
	public void setSorusayisi(int sorusayisi) {
		this.sorusayisi = sorusayisi;
	}
	
	
		
}
