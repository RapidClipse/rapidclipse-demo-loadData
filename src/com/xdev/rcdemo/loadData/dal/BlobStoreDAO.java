package com.xdev.rcdemo.loadData.dal;

import com.xdev.dal.JPADAO;
import com.xdev.rcdemo.loadData.entities.BlobStore;

public class BlobStoreDAO extends JPADAO<BlobStore, Integer> {

	public BlobStoreDAO() {
		super(BlobStore.class);
	}

}
