package shoppingcart.db;

import java.util.List;

import shoppingcart.entity.Item;
import shoppingcart.entity.Store;

public interface StoreDAO {
	public boolean createStore(Store store) ;
	public List<Store> getAllStore();
	public boolean createitem(Item item);
	public List<Item> getAllItem();
}
