package com.testcases;
import static org.junit.Assert.*;

import org.junit.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dao.ProductDAO;
import com.model.Product;

public class Producttestcases 
{

	static ProductDAO productDAO;
	
	
	@BeforeClass
	public static void initialize()
	{
		System.out.println("Starting into Initiailze Product Test case ");
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com");
		context.refresh();
		@SuppressWarnings("unused")
		ProductDAO ProductDAO=(ProductDAO)context.getBean("productdao");
		System.out.println("Ending into Initialization product test case ");;
		
	
	}

	@Test
	public void createproducttest()
	{
		
		System.out.println("Starting into creating Product Test case ");
		Product product=new Product();
		
		product.setPid(1201);
		product.setpDescription("this is the discription of product");
		product.setpName("kalmkari dress");
		product.setPrice(1200.00);
		product.setStock(200);
		
		
		assertTrue("problem in Product", productDAO.addProduct(product));
	}
}
