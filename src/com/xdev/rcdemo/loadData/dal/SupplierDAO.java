
package com.xdev.rcdemo.loadData.dal;

import com.xdev.rcdemo.loadData.entities.Supplier;
import com.xdev.dal.JPADAO;
import java.lang.Integer;

/**
 * Home object for domain model class Supplier.
 * 
 * @see Supplier
 */
public class SupplierDAO extends JPADAO<Supplier, Integer> {
	public SupplierDAO() {
		super(Supplier.class);
	}
}