package DAO;

import java.util.List;

import Models.tblders;
import util.BaseServices;
import util.ICRUD;

public class tbldersDAO implements ICRUD<tblders>{

	BaseServices<tblders> bs = new BaseServices<>();

	@Override
	public void Kaydet(tblders o) {
		bs.kaydet(o);		
	}

	@Override
	public void Duzenle(tblders o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Sil(tblders o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<tblders> Listele() {
		return bs.listele(tblders.class);
	}

	@Override
	public tblders Bul(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
