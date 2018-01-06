package com.daoimpl;
	
import java.util.*;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dao.UserDAO;
import com.model.Product;
import com.model.User;

@Repository("userDAO")
public class Userdaoimpl implements UserDAO 
{

	@Autowired 
	SessionFactory sessionFactory;
	
	
	public Userdaoimpl(SessionFactory sessionFactory)
	{
		this.sessionFactory =sessionFactory;
	}
	
	@Transactional
	public  boolean addUser(User user) 
	{

		try 
		{
sessionFactory.getCurrentSession().saveOrUpdate(user);
System.out.println("Insertion Successfully....");
		return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception raised......"+e);
		return false;
		}
	}
	
	public List<Product>retrieve() 
	{
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		List<Product> li=session.createQuery("from Product").list();
		session.getTransaction().commit();
		return li;
		
	}
	
	

}