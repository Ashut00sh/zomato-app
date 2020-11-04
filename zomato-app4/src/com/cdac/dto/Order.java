package com.cdac.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "`order`")
public class Order {
	@Id
	@Column(name="order_id")
	@GeneratedValue
	private int orderId;
	@Column(name="menu_name")
	private String menuName;
	@Column(name="quantity")
	private int quantity;
	private int userId;
	//private String status;
	public Order() {
		
	}
	
	public Order(int orderId) {
	
		this.orderId = orderId;
	}

	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return " " + orderId + ", " + menuName + ", " + quantity + ", " + userId + ", " ;
	}


	
}
