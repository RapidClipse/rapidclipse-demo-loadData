
package com.xdev.rcdemo.loadData.dal;

import com.xdev.dal.JPADAO;
import com.xdev.rcdemo.loadData.entities.Category;
import java.lang.Integer;

/**
 * Home object for domain model class Category.
 * 
 * @see Category
 */
public class CategoryDAO extends JPADAO<Category, Integer> {
	public CategoryDAO() {
		super(Category.class);
	}
}