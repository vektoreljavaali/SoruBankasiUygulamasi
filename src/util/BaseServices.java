package util;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class BaseServices<T>{

	 public Session getSession(){
		    return hibernateutil.getSessionFactory().openSession();
		    }
		    
	public void kaydet(T t) throws SecurityException{
		       Session ss = getSession();
		        Transaction trs = (Transaction) ss.beginTransaction();
		        ss.save(t);
		        trs.commit();
		        ss.close();
		    }
		    
		   public void duzenle(T t) throws SecurityException{
		    Session ss = getSession();
		        Transaction trs = (Transaction) ss.beginTransaction();
		        ss.update(t);
		        trs.commit();
		        ss.close();
		    }
		    
		   public void sil(T t) throws SecurityException{
		    Session ss = getSession();
		        Transaction trs = (Transaction) ss.beginTransaction();
		        ss.delete(t);
		        trs.commit();
		        ss.close();
		    }
		    
		   public List listele(Class t){
		     Session ss = getSession();
		       Criteria cr = ss.createCriteria(t);
		       return cr.list();
		   } 
	
}
