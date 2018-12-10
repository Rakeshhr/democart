package shoppingcart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import shoppingcart.db.StoreDAO;
import shoppingcart.entity.Item;
import shoppingcart.entity.Store;

@Service
public class StoreService {
	@Autowired
	StoreDAO storeDAO;
	
	public boolean createStore(Store store)
	{
		return storeDAO.createStore(store);
	}
	public List<Store> getAllStore()
	{
		return storeDAO.getAllStore();
	}
	public boolean createItem(Item item)
	{
		return storeDAO.createitem(item);
	}
	public List<Item> getAllItem()
	{
		return storeDAO.getAllItem();
	}
}
