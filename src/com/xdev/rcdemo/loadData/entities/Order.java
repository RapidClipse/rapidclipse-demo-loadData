package com.xdev.rcdemo.loadData.entities;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;

import com.xdev.dal.DAO;
import com.xdev.rcdemo.loadData.dal.OrderDAO;
import com.xdev.util.Caption;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Order
 */
@DAO(daoClass = OrderDAO.class)
@Caption("{%shipname}")
@Entity
@Table(name = "ORDERS", schema = "PUBLIC", catalog = "NORTHWIND")
public class Order implements java.io.Serializable {

	private Integer orderid;
	private Customer customer;
	private Employee employee;
	private Shipper shipper;
	private Date orderdate;
	private Date requireddate;
	private Date shippeddate;
	private BigDecimal freight;
	private String shipname;
	private String shipaddress;
	private String shipcity;
	private String shipregion;
	private String shippostalcode;
	private String shipcountry;
	private Set<Orderdetail> orderdetails = new HashSet<Orderdetail>(0);

	public Order() {
	}

	@Caption("Orderid")
	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ORDERID", unique = true, nullable = false, columnDefinition = "INTEGER")
	public Integer getOrderid() {
		return this.orderid;
	}

	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}

	@Caption("Customer")
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "CUSTOMERID", columnDefinition = "VARCHAR")
	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Caption("Employee")
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "EMPLOYEEID", columnDefinition = "INTEGER")
	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Caption("Shipper")
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "SHIPVIA", columnDefinition = "INTEGER")
	public Shipper getShipper() {
		return this.shipper;
	}

	public void setShipper(Shipper shipper) {
		this.shipper = shipper;
	}

	@Caption("Orderdate")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ORDERDATE", columnDefinition = "TIMESTAMP", length = 23)
	public Date getOrderdate() {
		return this.orderdate;
	}

	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}

	@Caption("Requireddate")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "REQUIREDDATE", columnDefinition = "TIMESTAMP", length = 23)
	public Date getRequireddate() {
		return this.requireddate;
	}

	public void setRequireddate(Date requireddate) {
		this.requireddate = requireddate;
	}

	@Caption("Shippeddate")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SHIPPEDDATE", columnDefinition = "TIMESTAMP", length = 23)
	public Date getShippeddate() {
		return this.shippeddate;
	}

	public void setShippeddate(Date shippeddate) {
		this.shippeddate = shippeddate;
	}

	@Caption("Freight")
	@Column(name = "FREIGHT", columnDefinition = "DECIMAL", precision = 10, scale = 4)
	public BigDecimal getFreight() {
		return this.freight;
	}

	public void setFreight(BigDecimal freight) {
		this.freight = freight;
	}

	@Caption("Shipname")
	@Column(name = "SHIPNAME", columnDefinition = "VARCHAR", length = 40)
	public String getShipname() {
		return this.shipname;
	}

	public void setShipname(String shipname) {
		this.shipname = shipname;
	}

	@Caption("Shipaddress")
	@Column(name = "SHIPADDRESS", columnDefinition = "VARCHAR", length = 60)
	public String getShipaddress() {
		return this.shipaddress;
	}

	public void setShipaddress(String shipaddress) {
		this.shipaddress = shipaddress;
	}

	@Caption("Shipcity")
	@Column(name = "SHIPCITY", columnDefinition = "VARCHAR", length = 15)
	public String getShipcity() {
		return this.shipcity;
	}

	public void setShipcity(String shipcity) {
		this.shipcity = shipcity;
	}

	@Caption("Shipregion")
	@Column(name = "SHIPREGION", columnDefinition = "VARCHAR", length = 15)
	public String getShipregion() {
		return this.shipregion;
	}

	public void setShipregion(String shipregion) {
		this.shipregion = shipregion;
	}

	@Caption("Shippostalcode")
	@Column(name = "SHIPPOSTALCODE", columnDefinition = "VARCHAR", length = 10)
	public String getShippostalcode() {
		return this.shippostalcode;
	}

	public void setShippostalcode(String shippostalcode) {
		this.shippostalcode = shippostalcode;
	}

	@Caption("Shipcountry")
	@Column(name = "SHIPCOUNTRY", columnDefinition = "VARCHAR", length = 15)
	public String getShipcountry() {
		return this.shipcountry;
	}

	public void setShipcountry(String shipcountry) {
		this.shipcountry = shipcountry;
	}

	@Caption("Orderdetails")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "order")
	public Set<Orderdetail> getOrderdetails() {
		return this.orderdetails;
	}

	public void setOrderdetails(Set<Orderdetail> orderdetails) {
		this.orderdetails = orderdetails;
	}

}
