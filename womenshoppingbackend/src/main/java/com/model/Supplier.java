package com.model;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Supplier implements Serializable
{
	@Id
	private int sid;
	private  String suppliername;
	
	@OneToMany(targetEntity=Product.class, fetch=FetchType.EAGER, mappedBy="Supplier")
	private set<product> product=new HashSet<product>(0);

	public set<product> getProduct() {
		return product;
	}

	public void setProduct(set<product> product) {
		this.product = product;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSuppliername() {
		return suppliername;
	}

	public void setSuppliername(String suppliername) {
		this.suppliername = suppliername;
	}

	
	

	
	
}
