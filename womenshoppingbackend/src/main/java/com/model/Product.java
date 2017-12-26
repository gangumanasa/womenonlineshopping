package com.model;

import java.beans.Transient;
import java.io.Serializable;
import java.util.HashSet;
import java.util.function.Supplier;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;



@Component
@Entity
public class Product implements Serializable

{
	@Id
	@GeneratedValue 
	private int pid;
	private String pName;
	private String pDescription;
	private double price;
	private int stock;
	@OneToMany( fetch=FetchType.EAGER)
	@JoinColumn(name="cid")
	private Category category;
	
	
	@OneToMany(fetch=FetchType.EAGER)
	@JoinColumn(name="cid")
	private Supplier supplier;
	
	
	@Transient
	MultipartFile pimage;

	private String imageName;
	
	
	
	
	
	
	
}
