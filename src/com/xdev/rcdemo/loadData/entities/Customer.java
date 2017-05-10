package com.xdev.rcdemo.loadData.entities;

import com.xdev.dal.DAO;
import com.xdev.rcdemo.loadData.dal.CustomerDAO;
import com.xdev.util.Caption;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Customer
 */
@DAO(daoClass = CustomerDAO.class)
@Caption("{%customerid}")
@Entity
@Table(name = "CUSTOMERS", schema = "PUBLIC", catalog = "NORTHWIND")
public class Customer implements java.io.Serializable {

	private String customerid;
	private String companyname;
	private String contactname;
	private String contacttitle;
	private String address;
	private String city;
	private String region;
	private String postalcode;
	private String country;
	private String phone;
	private String fax;
	private Set<Order> orders = new HashSet<Order>(0);
	private Set<Customerdemographic> customerdemographics = new HashSet<Customerdemographic>(0);

	public Customer() {
	}

	@Caption("Customerid")
	@Id

	@Column(name = "CUSTOMERID", unique = true, nullable = false, columnDefinition = "VARCHAR", length = 5)
	public String getCustomerid() {
		return this.customerid;
	}

	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}

	@Caption("Companyname")
	@Column(name = "COMPANYNAME", nullable = false, columnDefinition = "VARCHAR", length = 40)
	public String getCompanyname() {
		return this.companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	@Caption("Contactname")
	@Column(name = "CONTACTNAME", columnDefinition = "VARCHAR", length = 30)
	public String getContactname() {
		return this.contactname;
	}

	public void setContactname(String contactname) {
		this.contactname = contactname;
	}

	@Caption("Contacttitle")
	@Column(name = "CONTACTTITLE", columnDefinition = "VARCHAR", length = 30)
	public String getContacttitle() {
		return this.contacttitle;
	}

	public void setContacttitle(String contacttitle) {
		this.contacttitle = contacttitle;
	}

	@Caption("Address")
	@Column(name = "ADDRESS", columnDefinition = "VARCHAR", length = 60)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Caption("City")
	@Column(name = "CITY", columnDefinition = "VARCHAR", length = 15)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Caption("Region")
	@Column(name = "REGION", columnDefinition = "VARCHAR", length = 15)
	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	@Caption("Postalcode")
	@Column(name = "POSTALCODE", columnDefinition = "VARCHAR", length = 10)
	public String getPostalcode() {
		return this.postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	@Caption("Country")
	@Column(name = "COUNTRY", columnDefinition = "VARCHAR", length = 15)
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Caption("Phone")
	@Column(name = "PHONE", columnDefinition = "VARCHAR", length = 24)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Caption("Fax")
	@Column(name = "FAX", columnDefinition = "VARCHAR", length = 24)
	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	@Caption("Orders")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
	public Set<Order> getOrders() {
		return this.orders;
	}

	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}

	@Caption("Customerdemographics")
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "CUSTOMERCUSTOMERDEMO", schema = "PUBLIC", catalog = "NORTHWIND", joinColumns = {
			@JoinColumn(name = "CUSTOMERID", nullable = false, updatable = false, columnDefinition = "VARCHAR") }, inverseJoinColumns = {
					@JoinColumn(name = "CUSTOMERTYPEID", nullable = false, updatable = false, columnDefinition = "VARCHAR") })
	public Set<Customerdemographic> getCustomerdemographics() {
		return this.customerdemographics;
	}

	public void setCustomerdemographics(Set<Customerdemographic> customerdemographics) {
		this.customerdemographics = customerdemographics;
	}

}
