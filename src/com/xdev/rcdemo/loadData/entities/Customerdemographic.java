package com.xdev.rcdemo.loadData.entities;

import com.xdev.dal.DAO;
import com.xdev.rcdemo.loadData.dal.CustomerdemographicDAO;
import com.xdev.util.Caption;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Customerdemographic
 */
@DAO(daoClass = CustomerdemographicDAO.class)
@Caption("{%customertypeid}")
@Entity
@Table(name = "CUSTOMERDEMOGRAPHICS", schema = "PUBLIC", catalog = "NORTHWIND")
public class Customerdemographic implements java.io.Serializable {

	private String customertypeid;
	private String customerdesc;
	private Set<Customer> customers = new HashSet<Customer>(0);

	public Customerdemographic() {
	}

	@Caption("Customertypeid")
	@Id

	@Column(name = "CUSTOMERTYPEID", unique = true, nullable = false, columnDefinition = "VARCHAR", length = 10)
	public String getCustomertypeid() {
		return this.customertypeid;
	}

	public void setCustomertypeid(String customertypeid) {
		this.customertypeid = customertypeid;
	}

	@Caption("Customerdesc")
	@Lob
	@Column(name = "CUSTOMERDESC", columnDefinition = "CLOB")
	public String getCustomerdesc() {
		return this.customerdesc;
	}

	public void setCustomerdesc(String customerdesc) {
		this.customerdesc = customerdesc;
	}

	@Caption("Customers")
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "customerdemographics")
	public Set<Customer> getCustomers() {
		return this.customers;
	}

	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}

}
