package shoppingcart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="item")
public class Item {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")    
    private Long id;	
	@Column(name = "itemname")
	private String itemname;
	@Column(name = "quantity")
	private String quantity;
	@Column(name = "purbydate")
	private String purbydate;

	public Item(String itemname, String quantity, String purbydate) {
		super();
		this.itemname = itemname;
		this.quantity = quantity;
		this.purbydate = purbydate;
	}
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getPurbydate() {
		return purbydate;
	}
	public void setPurbydate(String purbydate) {
		this.purbydate = purbydate;
	}
	@Override
	public String toString() {
		return "Item [itemname=" + itemname + ", quantity=" + quantity + ", purbydate=" + purbydate + "]";
	}
	

}
