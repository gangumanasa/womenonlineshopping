package com.testcases;
import static org.junit.Assert.*;

import org.junit.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dao.UserDAO;
import com.model.User;

public class Usertestcases 
{

	static UserDAO userDAO;
		@BeforeClass
	public static void initialize()
	{
		System.out.println("Starting into Initiailze User Test case ");
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();

		context.scan("com");
		context.refresh();
		userDAO=(UserDAO)context.getBean("userDAO");
		
		System.out.println("Ending into Initialization user test case ");;
		
	
	}

	@Test
	public void createusertest()
	{
		
		System.out.println("Starting into creating User Test case ");
		User user=new User();
		
		user.setEmail("sruthi@gmail.com");
		user.setName("sruthi");
		user.setPassword("welcome");
		user.setPhone("92345222");
		user.setRoll("1234");
		user.setAddress("Dilsuknagar,Hyderabad");
		user.setEnabled(true);
		assertTrue("problem in User", userDAO.addUser(user));
		System.out.println("Ending into  User Test case ");
		
		
	}
}
