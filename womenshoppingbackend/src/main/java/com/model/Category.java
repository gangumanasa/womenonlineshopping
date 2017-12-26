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
//@Table(Category)
public class Category implements Serializable
{
	@Id
	private int cid;
	private String cNmae;
	@OneToMany(targetEntity=Product.class, fetch=FetchType.EAGER, mappedBy="Category")
	private set<product> product=new HashSet<product>(0);
	
	public set<product> getProduct() {
		return product;
	}
	public void setProduct(set<product> product) {
		this.product = product;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getcNmae() {
		return cNmae;
	}
	public void setcNmae(String cNmae) {
		this.cNmae = cNmae;
	}
	
	

}
