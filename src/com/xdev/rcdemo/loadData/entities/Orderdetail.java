package com.xdev.rcdemo.loadData.entities;

import com.xdev.dal.DAO;
import com.xdev.rcdemo.loadData.dal.OrderdetailDAO;
import com.xdev.util.Caption;
import java.math.BigDecimal;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Orderdetail
 */
@DAO(daoClass = OrderdetailDAO.class)
@Caption("{%id}")
@Entity
@Table(name = "ORDERDETAILS", schema = "PUBLIC", catalog = "NORTHWIND")
public class Orderdetail implements java.io.Serializable {

	private OrderdetailId id;
	private Order order;
	private Product product;
	private BigDecimal unitprice;
	private short quantity;
	private float discount;

	public Orderdetail() {
	}

	@Caption("Id")
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "orderid", column = @Column(name = "ORDERID", nullable = false, columnDefinition = "INTEGER")),
			@AttributeOverride(name = "productid", column = @Column(name = "PRODUCTID", nullable = false, columnDefinition = "INTEGER")) })
	public OrderdetailId getId() {
		return this.id;
	}

	public void setId(OrderdetailId id) {
		this.id = id;
	}

	@Caption("Order")
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ORDERID", nullable = false, insertable = false, updatable = false, columnDefinition = "INTEGER")
	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Caption("Product")
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "PRODUCTID", nullable = false, insertable = false, updatable = false, columnDefinition = "INTEGER")
	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Caption("Unitprice")
	@Column(name = "UNITPRICE", nullable = false, columnDefinition = "DECIMAL", precision = 10, scale = 4)
	public BigDecimal getUnitprice() {
		return this.unitprice;
	}

	public void setUnitprice(BigDecimal unitprice) {
		this.unitprice = unitprice;
	}

	@Caption("Quantity")
	@Column(name = "QUANTITY", nullable = false, columnDefinition = "SMALLINT")
	public short getQuantity() {
		return this.quantity;
	}

	public void setQuantity(short quantity) {
		this.quantity = quantity;
	}

	@Caption("Discount")
	@Column(name = "DISCOUNT", nullable = false, columnDefinition = "REAL", precision = 7, scale = 0)
	public float getDiscount() {
		return this.discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

}
