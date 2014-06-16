package com.mission.shop.product.dao.model;

import java.io.Serializable;
import java.util.Date;

public class ProductCat implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product_cat.id
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product_cat.product_id
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	private Long productId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product_cat.cat_id
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	private Long catId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product_cat.create_time
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product_cat.last_update_time
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	private Date lastUpdateTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table product_cat
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product_cat.id
	 * @return  the value of product_cat.id
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product_cat.id
	 * @param id  the value for product_cat.id
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product_cat.product_id
	 * @return  the value of product_cat.product_id
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	public Long getProductId() {
		return productId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product_cat.product_id
	 * @param productId  the value for product_cat.product_id
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product_cat.cat_id
	 * @return  the value of product_cat.cat_id
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	public Long getCatId() {
		return catId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product_cat.cat_id
	 * @param catId  the value for product_cat.cat_id
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	public void setCatId(Long catId) {
		this.catId = catId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product_cat.create_time
	 * @return  the value of product_cat.create_time
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product_cat.create_time
	 * @param createTime  the value for product_cat.create_time
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product_cat.last_update_time
	 * @return  the value of product_cat.last_update_time
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product_cat.last_update_time
	 * @param lastUpdateTime  the value for product_cat.last_update_time
	 * @mbggenerated  Thu Jun 12 16:14:17 CST 2014
	 */
	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
}