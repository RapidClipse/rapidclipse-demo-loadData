package com.xdev.rcdemo.loadData.entities;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;

import com.xdev.dal.DAO;
import com.xdev.rcdemo.loadData.dal.ProductDAO;
import com.xdev.util.Caption;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Product
 */
@DAO(daoClass = ProductDAO.class)
@Caption("{%productname}")
@Entity
@Table(name = "PRODUCTS", schema = "PUBLIC", catalog = "NORTHWIND")
public class Product implements java.io.Serializable {

	private Integer productid;
	private Category category;
	private Supplier supplier;
	private String productname;
	private String quantityperunit;
	private BigDecimal unitprice;
	private Short unitsinstock;
	private Short unitsonorder;
	private Short reorderlevel;
	private boolean discontinued;
	private Set<Orderdetail> orderdetails = new HashSet<Orderdetail>(0);

	public Product() {
	}

	@Caption("Productid")
	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "PRODUCTID", unique = true, nullable = false, columnDefinition = "INTEGER")
	public Integer getProductid() {
		return this.productid;
	}

	public void setProductid(Integer productid) {
		this.productid = productid;
	}

	@Caption("Category")
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "CATEGORYID", columnDefinition = "INTEGER")
	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Caption("Supplier")
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "SUPPLIERID", columnDefinition = "INTEGER")
	public Supplier getSupplier() {
		return this.supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	@Caption("Productname")
	@Column(name = "PRODUCTNAME", nullable = false, columnDefinition = "VARCHAR", length = 40)
	public String getProductname() {
		return this.productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	@Caption("Quantityperunit")
	@Column(name = "QUANTITYPERUNIT", columnDefinition = "VARCHAR", length = 20)
	public String getQuantityperunit() {
		return this.quantityperunit;
	}

	public void setQuantityperunit(String quantityperunit) {
		this.quantityperunit = quantityperunit;
	}

	@Caption("Unitprice")
	@Column(name = "UNITPRICE", columnDefinition = "DECIMAL", precision = 10, scale = 4)
	public BigDecimal getUnitprice() {
		return this.unitprice;
	}

	public void setUnitprice(BigDecimal unitprice) {
		this.unitprice = unitprice;
	}

	@Caption("Unitsinstock")
	@Column(name = "UNITSINSTOCK", columnDefinition = "SMALLINT")
	public Short getUnitsinstock() {
		return this.unitsinstock;
	}

	public void setUnitsinstock(Short unitsinstock) {
		this.unitsinstock = unitsinstock;
	}

	@Caption("Unitsonorder")
	@Column(name = "UNITSONORDER", columnDefinition = "SMALLINT")
	public Short getUnitsonorder() {
		return this.unitsonorder;
	}

	public void setUnitsonorder(Short unitsonorder) {
		this.unitsonorder = unitsonorder;
	}

	@Caption("Reorderlevel")
	@Column(name = "REORDERLEVEL", columnDefinition = "SMALLINT")
	public Short getReorderlevel() {
		return this.reorderlevel;
	}

	public void setReorderlevel(Short reorderlevel) {
		this.reorderlevel = reorderlevel;
	}

	@Caption("Discontinued")
	@Column(name = "DISCONTINUED", nullable = false, columnDefinition = "BOOLEAN")
	public boolean isDiscontinued() {
		return this.discontinued;
	}

	public void setDiscontinued(boolean discontinued) {
		this.discontinued = discontinued;
	}

	@Caption("Orderdetails")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
	public Set<Orderdetail> getOrderdetails() {
		return this.orderdetails;
	}

	public void setOrderdetails(Set<Orderdetail> orderdetails) {
		this.orderdetails = orderdetails;
	}

}
