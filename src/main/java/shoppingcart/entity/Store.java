package shoppingcart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="store")
public class Store {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "store_id")    
    private Long id;
	@Column(name = "store_name")
	private String name;
	@Column(name = "telno")
	private String telno;
	@Column(name = "location")
	private String location;
	@Column(name = "workinghours")
	private String workinghours;
	@Column(name = "weeklyholiday")
	private String weeklyholiday;
	
	public Store(String name, String telno, String location, String workinghours, String weeklyholiday) {
		super();
		this.name = name;
		this.telno = telno;
		this.location = location;
		this.workinghours = workinghours;
		this.weeklyholiday = weeklyholiday;
	}
	


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelno() {
		return telno;
	}
	public void setTelno(String telno) {
		this.telno = telno;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getWorkinghours() {
		return workinghours;
	}
	public void setWorkinghours(String workinghours) {
		this.workinghours = workinghours;
	}
	public String getWeeklyholiday() {
		return weeklyholiday;
	}
	public void setWeeklyholiday(String weeklyholiday) {
		this.weeklyholiday = weeklyholiday;
	}
	public Store() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "store [name=" + name + ", telno=" + telno + ", location=" + location + ", workinghours=" + workinghours
				+ ", weeklyholiday=" + weeklyholiday + "]";
	}
	
	

}
