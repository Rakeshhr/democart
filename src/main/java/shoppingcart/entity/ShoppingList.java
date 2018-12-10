package shoppingcart.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shoppinglist")
public class ShoppingList {
	
	@Id
	@Column(name = "shoppinglist_name")
	private String name;
	
	@Column(name = "item_id")
	private Long item_id;
	
	@Column(name = "store_id")
	private Long store_id;

	public ShoppingList(String name, Long item_id, Long store_id) {
		super();
		this.name = name;
		this.item_id = item_id;
		this.store_id = store_id;
	}

	public ShoppingList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getItem_id() {
		return item_id;
	}

	public void setItem_id(Long item_id) {
		this.item_id = item_id;
	}

	public Long getStore_id() {
		return store_id;
	}

	public void setStore_id(Long store_id) {
		this.store_id = store_id;
	}
	
}
