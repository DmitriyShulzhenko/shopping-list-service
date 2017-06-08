package com.dshulzhenko.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ShoppingItem {
	private String name;
	private String quanity;
	private String comment;

	public ShoppingItem() {
		
	}
	
	public ShoppingItem(String name, String quanity, String comment) {
		super();
		this.name = name;
		this.quanity = quanity;
		this.comment = comment;
	}

	@JsonProperty
	public String getName() {
		return name;
	}

	@JsonProperty
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty
	public String getQuanity() {
		return quanity;
	}

	@JsonProperty
	public void setQuanity(String quanity) {
		this.quanity = quanity;
	}

	@JsonProperty
	public String getComment() {
		return comment;
	}

	@JsonProperty
	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
