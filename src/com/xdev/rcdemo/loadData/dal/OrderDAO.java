
package com.xdev.rcdemo.loadData.dal;

import com.xdev.rcdemo.loadData.entities.Order;
import com.xdev.dal.JPADAO;
import java.lang.Integer;

/**
 * Home object for domain model class Order.
 * 
 * @see Order
 */
public class OrderDAO extends JPADAO<Order, Integer> {
	public OrderDAO() {
		super(Order.class);
	}
}