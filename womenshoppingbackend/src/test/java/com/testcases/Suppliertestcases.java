

	package com.testcases;
	import static org.junit.Assert.*;
	import org.junit.BeforeClass;
	import org.junit.Test;
	import org.springframework.context.annotation.AnnotationConfigApplicationContext;
	import com.dao.*;
	import com.model.Supplier;

	public class Suppliertestcases 
	{

	static  Supplierdao supplierdao;

	@SuppressWarnings("resource")
	@BeforeClass
	public static void initialize()
	{
		System.out.println("Starting into Initiailze User Test case ");
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.niit");
		context.refresh();
		
		Supplierdao Supplierdao = (Supplierdao)context.getBean("Supplierdao");
		System.out.println("Ending into Initialization user test case ");;
		
	
	}

	@Test
	public void createSupplierTest()
	{
		
		System.out.println("Starting into creating Supplier Test case ");
		Supplier supplier=new Supplier();
		supplier.setSid(101);
		supplier.setSuppliername("manasa");
		assertTrue("problem in Supplier", supplierdao.insertSupplier(supplier));
		System.out.println("Ending..... into Createing Supplier....");
		
	}

	

	
	}

