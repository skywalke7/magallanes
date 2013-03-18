package com.kuku.administrator.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "POST")
public class Post implements Serializable{

	@Id
	@Column(name = "POST_ID")
	@GeneratedValue
	private Integer postId;
	@ManyToOne
	@JoinColumn(name="USERNAME")
	private User username;
	@Column(name = "DATE_POST")
	private Date datePost;
	@Column(name = "TITLE")
	private String title;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "CATEGORY_ID")
	private Set<Category> category = new HashSet<Category>();;
	@Column(name = "CONTENT")
	private String content;
	@Column(name = "URL_IMAGE")
	private String urlImage;
	
	public Integer getPostId() {
		return postId;
	}
	public void setPostId(Integer postId) {
		this.postId = postId;
	}
	public User getUsername() {
		return username;
	}
	public void setUsername(User username) {
		this.username = username;
	}
	public Date getDatePost() {
		return datePost;
	}
	public void setDatePost(Date datePost) {
		this.datePost = datePost;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Set<Category> getCategory() {
		return category;
	}
	public void setCategory(Set<Category> category) {
		this.category = category;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getUrlImage() {
		return urlImage;
	}
	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}
}
