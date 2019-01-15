package ua.online.courses.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "item")
public class Item extends BaseEntity{
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String desc;
	
	@Column(name = "amount")
	private int amount;
	
	@Column(columnDefinition = "DECIMAL(5,2)")
	private BigDecimal price;
	
	public Item() {
		
	}

	public Item(String name, String desc, int amount, BigDecimal price) {
		this.name = name;
		this.desc = desc;
		this.amount = amount;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", desc=" + desc + ", amount=" + amount + ", price=" + price + ", getId()="
				+ getId() + "]";
	}


	

}
