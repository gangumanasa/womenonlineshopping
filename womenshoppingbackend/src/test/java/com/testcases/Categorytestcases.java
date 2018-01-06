


	package com.testcases;
	import static org.junit.Assert.*;
	import org.junit.BeforeClass;
	import org.junit.Test;
	import org.springframework.context.annotation.AnnotationConfigApplicationContext;
	import com.dao.*;
import com.model.Category;


	public class Categorytestcases 
	{

	static  CategoryDAO categoryDAO;

	
	@BeforeClass
	public static void initialize()
	{
		System.out.println("Starting into Initiailze category Test case ");
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();

		context.scan("com.niit");
		context.refresh();
		
		 categoryDAO = (CategoryDAO)context.getBean("Categorydao");
		System.out.println("Ending into Initialization user test case ");;
		
	
	}

	@Test
	public void createCategoryTest()
	{
		
		System.out.println("Starting into creating Supplier Test case ");
		Category category=new Category();
		category.setCid(1101);
		category.setcName("mamatha");
		assertTrue("problem in Supplier", categoryDAO.addCategory(category));
		System.out.println("Ending..... into Createing category....");
		
	}

	

	
	}

