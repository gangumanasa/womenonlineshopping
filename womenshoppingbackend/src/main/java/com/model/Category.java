package com.model;
import java.io.Serializable;
import java.util.*;

import javax.persistence.*;
import javax.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
//@Table(name="CategoryTable")
public class Category implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int cid;
	private String cName;
	@OneToMany(targetEntity=Product.class, fetch=FetchType.EAGER, mappedBy="Category")
	private Set<Product> product=new HashSet<Product>(0);
	
	public Set<Product> getProduct() {
		return product;
	}
	public void setProduct(Set<Product> product) {
		this.product = product;
	}
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	
	

}
