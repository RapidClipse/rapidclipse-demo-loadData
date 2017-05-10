
package com.xdev.rcdemo.loadData.dal;

import com.xdev.dal.JPADAO;
import com.xdev.rcdemo.loadData.entities.Customerdemographic;

/**
 * Home object for domain model class Customerdemographic.
 * 
 * @see Customerdemographic
 */
public class CustomerdemographicDAO extends JPADAO<Customerdemographic, String> {
	public CustomerdemographicDAO() {
		super(Customerdemographic.class);
	}
}