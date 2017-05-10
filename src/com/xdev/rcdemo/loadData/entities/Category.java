package com.xdev.rcdemo.loadData.entities;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;

import com.xdev.dal.DAO;
import com.xdev.rcdemo.loadData.dal.CategoryDAO;
import com.xdev.util.Caption;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Category
 */
@DAO(daoClass = CategoryDAO.class)
@Caption("{%categoryname}")
@Entity
@Table(name = "CATEGORIES", schema = "PUBLIC", catalog = "NORTHWIND")
public class Category implements java.io.Serializable {

	private Integer categoryid;
	private String categoryname;
	private String description;
	private byte[] picture;
	private Set<Product> products = new HashSet<Product>(0);

	public Category() {
	}

	@Caption("Categoryid")
	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "CATEGORYID", unique = true, nullable = false, columnDefinition = "INTEGER")
	public Integer getCategoryid() {
		return this.categoryid;
	}

	public void setCategoryid(Integer categoryid) {
		this.categoryid = categoryid;
	}

	@Caption("Categoryname")
	@Column(name = "CATEGORYNAME", nullable = false, columnDefinition = "VARCHAR", length = 15)
	public String getCategoryname() {
		return this.categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}

	@Caption("Description")
	@Lob
	@Column(name = "DESCRIPTION", columnDefinition = "CLOB")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Caption("Picture")
	@Lob
	@Column(name = "PICTURE", columnDefinition = "BLOB")
	public byte[] getPicture() {
		return this.picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}

	@Caption("Products")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
	public Set<Product> getProducts() {
		return this.products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

}
