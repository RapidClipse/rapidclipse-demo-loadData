
package com.xdev.rcdemo.loadData.dal;

import com.xdev.rcdemo.loadData.entities.Orderdetail;
import com.xdev.dal.JPADAO;
import com.xdev.rcdemo.loadData.entities.OrderdetailId;

/**
 * Home object for domain model class Orderdetail.
 * 
 * @see Orderdetail
 */
public class OrderdetailDAO extends JPADAO<Orderdetail, OrderdetailId> {
	public OrderdetailDAO() {
		super(Orderdetail.class);
	}
}