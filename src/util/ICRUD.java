package util;

import java.util.List;

public interface ICRUD<V> {

	    public void Kaydet(V o);
	    public void Duzenle(V o);
	    public void Sil(V o);
	    public List<V> Listele();
	    public V Bul(int id);
}
