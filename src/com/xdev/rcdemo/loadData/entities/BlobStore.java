package com.xdev.rcdemo.loadData.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import com.xdev.dal.DAO;
import com.xdev.rcdemo.loadData.dal.BlobStoreDAO;

@Entity
@DAO(daoClass = BlobStoreDAO.class)
@Table(name = "BLOBSTORE")
public class BlobStore {

	private int id;
	private String filename;
	private byte[] filecontent;
	private String mimetype;
	private String description;

	public BlobStore() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	public int getId() {
		return this.id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	@Column(name = "FILENAME", nullable = false)
	public String getFilename() {
		return this.filename;
	}

	public void setFilename(final String noname) {
		this.filename = noname;
	}

	@Lob
	@Column(name = "FILECONTENT", nullable = false)
	public byte[] getFilecontent() {
		return this.filecontent;
	}

	public void setFilecontent(final byte[] noname2) {
		this.filecontent = noname2;
	}

	@Column(name = "MIMETYPE")
	public String getMimetype() {
		return this.mimetype;
	}

	public void setMimetype(final String noname3) {
		this.mimetype = noname3;
	}

	@Column(name = "DESCRIPTION")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String noname) {
		this.description = noname;
	}

}
