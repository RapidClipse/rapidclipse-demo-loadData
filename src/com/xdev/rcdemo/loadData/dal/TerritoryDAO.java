
package com.xdev.rcdemo.loadData.dal;

import com.xdev.rcdemo.loadData.entities.Territory;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class Territory.
 * 
 * @see Territory
 */
public class TerritoryDAO extends JPADAO<Territory, String> {
	public TerritoryDAO() {
		super(Territory.class);
	}
}