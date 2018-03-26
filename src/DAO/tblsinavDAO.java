package DAO;

import java.util.List;

import Models.tblsinav;
import util.BaseServices;
import util.ICRUD;

public class tblsinavDAO implements ICRUD<tblsinav>{

	BaseServices<tblsinav> bs = new BaseServices<>();
	
	@Override
	public void Kaydet(tblsinav o) {
		try {
			bs.kaydet(o);
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		
		
	}
	@Override
	public void Duzenle(tblsinav o) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Sil(tblsinav o) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<tblsinav> Listele() {
		return bs.listele(tblsinav.class);
	}
	@Override
	public tblsinav Bul(int id) {
		return null;
	}
	
	
	
}
