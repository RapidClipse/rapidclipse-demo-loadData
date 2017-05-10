
package com.xdev.rcdemo.loadData.dal;

import com.xdev.rcdemo.loadData.entities.Region;
import com.xdev.dal.JPADAO;

/**
 * Home object for domain model class Region.
 * 
 * @see Region
 */
public class RegionDAO extends JPADAO<Region, Integer> {
	public RegionDAO() {
		super(Region.class);
	}
}