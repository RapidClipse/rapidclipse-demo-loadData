package com.xdev.rcdemo.loadData.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;

import com.xdev.dal.DAO;
import com.xdev.rcdemo.loadData.dal.EmployeeDAO;
import com.xdev.util.Caption;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Employee
 */
@DAO(daoClass = EmployeeDAO.class)
@Caption("{%lastname}")
@Entity
@Table(name = "EMPLOYEES", schema = "PUBLIC", catalog = "NORTHWIND")
public class Employee implements java.io.Serializable {

	private Integer employeeid;
	private Employee employee;
	private String lastname;
	private String firstname;
	private String title;
	private String titleofcourtesy;
	private Date birthdate;
	private Date hiredate;
	private String address;
	private String city;
	private String region;
	private String postalcode;
	private String country;
	private String homephone;
	private String extension;
	private byte[] photo;
	private String notes;
	private String photopath;
	private Double salary;
	private Set<Territory> territories = new HashSet<Territory>(0);
	private Set<Order> orders = new HashSet<Order>(0);
	private Set<Employee> employees = new HashSet<Employee>(0);

	public Employee() {
	}

	@Caption("Employeeid")
	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "EMPLOYEEID", unique = true, nullable = false, columnDefinition = "INTEGER")
	public Integer getEmployeeid() {
		return this.employeeid;
	}

	public void setEmployeeid(Integer employeeid) {
		this.employeeid = employeeid;
	}

	@Caption("Employee")
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "REPORTSTO", columnDefinition = "INTEGER")
	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Caption("Lastname")
	@Column(name = "LASTNAME", nullable = false, columnDefinition = "VARCHAR", length = 20)
	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Caption("Firstname")
	@Column(name = "FIRSTNAME", nullable = false, columnDefinition = "VARCHAR", length = 10)
	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	@Caption("Title")
	@Column(name = "TITLE", columnDefinition = "VARCHAR", length = 30)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Caption("Titleofcourtesy")
	@Column(name = "TITLEOFCOURTESY", columnDefinition = "VARCHAR", length = 25)
	public String getTitleofcourtesy() {
		return this.titleofcourtesy;
	}

	public void setTitleofcourtesy(String titleofcourtesy) {
		this.titleofcourtesy = titleofcourtesy;
	}

	@Caption("Birthdate")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "BIRTHDATE", columnDefinition = "TIMESTAMP", length = 23)
	public Date getBirthdate() {
		return this.birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	@Caption("Hiredate")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "HIREDATE", columnDefinition = "TIMESTAMP", length = 23)
	public Date getHiredate() {
		return this.hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
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

	@Caption("Homephone")
	@Column(name = "HOMEPHONE", columnDefinition = "VARCHAR", length = 24)
	public String getHomephone() {
		return this.homephone;
	}

	public void setHomephone(String homephone) {
		this.homephone = homephone;
	}

	@Caption("Extension")
	@Column(name = "EXTENSION", columnDefinition = "VARCHAR", length = 4)
	public String getExtension() {
		return this.extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	@Caption("Photo")
	@Lob
	@Column(name = "PHOTO", columnDefinition = "BLOB")
	public byte[] getPhoto() {
		return this.photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	@Caption("Notes")
	@Lob
	@Column(name = "NOTES", nullable = false, columnDefinition = "CLOB")
	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Caption("Photopath")
	@Column(name = "PHOTOPATH", columnDefinition = "VARCHAR")
	public String getPhotopath() {
		return this.photopath;
	}

	public void setPhotopath(String photopath) {
		this.photopath = photopath;
	}

	@Caption("Salary")
	@Column(name = "SALARY", columnDefinition = "DOUBLE", precision = 17, scale = 0)
	public Double getSalary() {
		return this.salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Caption("Territories")
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "EMPLOYEETERRITORIES", schema = "PUBLIC", catalog = "NORTHWIND", joinColumns = {
			@JoinColumn(name = "EMPLOYEEID", nullable = false, updatable = false, columnDefinition = "INTEGER") }, inverseJoinColumns = {
					@JoinColumn(name = "TERRITORYID", nullable = false, updatable = false, columnDefinition = "VARCHAR") })
	public Set<Territory> getTerritories() {
		return this.territories;
	}

	public void setTerritories(Set<Territory> territories) {
		this.territories = territories;
	}

	@Caption("Orders")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employee")
	public Set<Order> getOrders() {
		return this.orders;
	}

	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}

	@Caption("Employees")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employee")
	public Set<Employee> getEmployees() {
		return this.employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

}
