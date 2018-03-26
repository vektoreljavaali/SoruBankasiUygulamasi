package DAO;

import java.util.ArrayList;
import java.util.List;

import Models.tblalan;
import Models.tblsinav;
import util.BaseServices;
import util.ICRUD;

public class tblalanDAO implements ICRUD<tblalan>{


	BaseServices<tblalan> bs = new BaseServices<>();
	
	@Override
	public void Kaydet(tblalan o) {
		bs.kaydet(o);
		
	}

	@Override
	public void Duzenle(tblalan o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Sil(tblalan o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<tblalan> Listele() {
		
		return bs.listele(tblalan.class);
	}

	@Override
	public tblalan Bul(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
		public List<tblalan> SecListele(long sinavid) {
			ArrayList<tblalan> ls = (ArrayList<tblalan>) bs.listele(tblalan.class);
			List<tblalan> tmp = new ArrayList<>();
			for (tblalan item : ls ) {
				if(item.getSinavid()==sinavid)
					tmp.add(item);
			}
			
		return tmp;
	}


	
	
}
