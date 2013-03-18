package com.kuku.administrator.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CATEGORY")
public class Category implements Serializable {

	@Id
	@Column(name = "AUTHORITY_ID")
	@GeneratedValue
	private Integer categoryId;
	@Column(name = "DESCRIPTION_CATEGORY")
	private String descriptionCategory;
	
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public String getDescriptionCategory() {
		return descriptionCategory;
	}
	public void setDescriptionCategory(String descriptionCategory) {
		this.descriptionCategory = descriptionCategory;
	}
	
}
