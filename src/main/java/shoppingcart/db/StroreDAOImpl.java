package shoppingcart.db;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import shoppingcart.entity.Item;
import shoppingcart.entity.Store;
@Repository
@Transactional
public class StroreDAOImpl implements StoreDAO{
	@Autowired
	SessionFactory sessionFactory;

	public boolean createStore(Store store) {		
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.save(store);
			tx.commit();
			session.close();
			return true;			
	}
	public List<Store> getAllStore() {
		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();
		String hql = "FROM Store";
		Query query = session.createQuery(hql); 
		List<Store> results = query.list();
		tx.commit();
		session.close();
		return results;
		
	}
	public boolean createitem(Item item) {		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(item);
		tx.commit();
		session.close();
		return true;			
}
	public List<Item> getAllItem() {
		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();
		String hql = "FROM Item";
		Query query = session.createQuery(hql); 
		List<Item> results = query.list();
		tx.commit();
		session.close();
		return results;
		
	}
	
}
