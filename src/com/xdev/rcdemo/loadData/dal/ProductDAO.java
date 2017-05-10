
package com.xdev.rcdemo.loadData.dal;

import com.xdev.rcdemo.loadData.entities.Product;
import com.xdev.dal.JPADAO;
import java.lang.Integer;

/**
 * Home object for domain model class Product.
 * 
 * @see Product
 */
public class ProductDAO extends JPADAO<Product, Integer> {
	public ProductDAO() {
		super(Product.class);
	}
}