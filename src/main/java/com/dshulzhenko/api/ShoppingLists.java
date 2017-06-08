package com.dshulzhenko.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ShoppingLists {
	private String token;	
	private Map<String,ArrayList<ShoppingItem>> shoppingLists = new HashMap<String,ArrayList<ShoppingItem>>();

	public ShoppingLists() {
		
	}
	
	public ShoppingLists(String token, Map<String, ArrayList<ShoppingItem>> shoppingLists) {
		super();
		this.token = token;
		this.shoppingLists = shoppingLists;
	}
	
	@JsonProperty
	public String getToken() {
		return token;
	}

	@JsonProperty
	public void setToken(String token) {
		this.token = token;
	}

	@JsonProperty
	public Map<String, ArrayList<ShoppingItem>> getShoppingLists() {
		return shoppingLists;
	}

	@JsonProperty
	public void setShoppingLists(Map<String, ArrayList<ShoppingItem>> shoppingLists) {
		this.shoppingLists = shoppingLists;
	}
	
	
	
}

