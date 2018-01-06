
	package com.testcases;
	import static org.junit.Assert.*;
	import org.junit.BeforeClass;
	import org.junit.Test;
	import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dao.SupplierDAO;
import com.model.Supplier;

	public class Suppliertestcases 
	{

	static  SupplierDAO supplierDAO;

	
	@BeforeClass
	public static void initialize()
	{
		System.out.println("Starting into Initiailze User Test case ");
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com");
		context.refresh();
		
		supplierDAO = (SupplierDAO)context.getBean("supplierDAO");
		System.out.println("Ending into Initialization user test case ");;
		
	
	}

	@Test
	public void createSupplierTest()
	{
		
		System.out.println("Starting into creating Supplier Test case ");
		Supplier supplier=new Supplier();
		supplier.setSid(101);
		supplier.setSuppliername("manasa");
		assertTrue("problem in Supplier", supplierDAO.addSupplier(supplier));
		System.out.println("Ending..... into Createing Supplier....");
		
	}

	

	
	}

