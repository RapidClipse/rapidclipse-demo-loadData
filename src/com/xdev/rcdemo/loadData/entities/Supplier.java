package com.xdev.rcdemo.loadData.entities;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;

import com.xdev.dal.DAO;
import com.xdev.rcdemo.loadData.dal.SupplierDAO;
import com.xdev.util.Caption;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Supplier
 */
@DAO(daoClass = SupplierDAO.class)
@Caption("{%companyname}")
@Entity
@Table(name = "SUPPLIERS", schema = "PUBLIC", catalog = "NORTHWIND")
public class Supplier implements java.io.Serializable {

	private Integer supplierid;
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
	private String homepage;
	private Set<Product> products = new HashSet<Product>(0);

	public Supplier() {
	}

	@Caption("Supplierid")
	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "SUPPLIERID", unique = true, nullable = false, columnDefinition = "INTEGER")
	public Integer getSupplierid() {
		return this.supplierid;
	}

	public void setSupplierid(Integer supplierid) {
		this.supplierid = supplierid;
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

	@Caption("Homepage")
	@Lob
	@Column(name = "HOMEPAGE", columnDefinition = "CLOB")
	public String getHomepage() {
		return this.homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	@Caption("Products")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "supplier")
	public Set<Product> getProducts() {
		return this.products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

}
