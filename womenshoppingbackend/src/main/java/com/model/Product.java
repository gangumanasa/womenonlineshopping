package com.model;


import java.io.Serializable;
import javax.persistence.*;


import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
//import org.springframework.web.multipart.MultipartFile;



@Component
@Entity
public class Product implements Serializable

{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue 
	private int pid;
	private String pName;
	private String pDescription;
	private double price;
	private int stock;
	@OneToMany( fetch=FetchType.EAGER)
	@JoinColumn(name="cid")
	private Product product;
	
	
	@SuppressWarnings("rawtypes")
	@OneToMany(fetch=FetchType.EAGER)
	@JoinColumn(name="cid")
	private Supplier supplier;
	
	
	@javax.persistence.Transient
	MultipartFile pimage;

	private String imageName;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpDescription() {
		return pDescription;
	}

	public void setpDescription(String pDescription) {
		this.pDescription = pDescription;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	



	/*public MultipartFile getPimage() {
		return pimage;
	}

	public void setPimage(MultipartFile pimage) {
		this.pimage = pimage;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}*/
	
	
	

	
	
	
	
}
