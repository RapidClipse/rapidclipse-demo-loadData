package com.xdev.rcdemo.loadData.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * OrderdetailId
 */
@Embeddable
public class OrderdetailId implements java.io.Serializable {

	private int orderid;
	private int productid;

	public OrderdetailId() {
	}

	@Column(name = "ORDERID", nullable = false, columnDefinition = "INTEGER")
	public int getOrderid() {
		return this.orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	@Column(name = "PRODUCTID", nullable = false, columnDefinition = "INTEGER")
	public int getProductid() {
		return this.productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof OrderdetailId))
			return false;
		OrderdetailId castOther = (OrderdetailId) other;

		return (this.getOrderid() == castOther.getOrderid()) && (this.getProductid() == castOther.getProductid());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getOrderid();
		result = 37 * result + this.getProductid();
		return result;
	}

}
