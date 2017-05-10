package com.xdev.rcdemo.loadData.entities;

import com.xdev.dal.DAO;
import com.xdev.rcdemo.loadData.dal.TerritoryDAO;
import com.xdev.util.Caption;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Territory
 */
@DAO(daoClass = TerritoryDAO.class)
@Caption("{%territoryid}")
@Entity
@Table(name = "TERRITORIES", schema = "PUBLIC", catalog = "NORTHWIND")
public class Territory implements java.io.Serializable {

	private String territoryid;
	private Region region;
	private String territorydescription;
	private Set<Employee> employees = new HashSet<Employee>(0);

	public Territory() {
	}

	@Caption("Territoryid")
	@Id

	@Column(name = "TERRITORYID", unique = true, nullable = false, columnDefinition = "VARCHAR", length = 20)
	public String getTerritoryid() {
		return this.territoryid;
	}

	public void setTerritoryid(String territoryid) {
		this.territoryid = territoryid;
	}

	@Caption("Region")
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "REGIONID", nullable = false, columnDefinition = "INTEGER")
	public Region getRegion() {
		return this.region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	@Caption("Territorydescription")
	@Column(name = "TERRITORYDESCRIPTION", nullable = false, columnDefinition = "VARCHAR", length = 50)
	public String getTerritorydescription() {
		return this.territorydescription;
	}

	public void setTerritorydescription(String territorydescription) {
		this.territorydescription = territorydescription;
	}

	@Caption("Employees")
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "territories")
	public Set<Employee> getEmployees() {
		return this.employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

}
