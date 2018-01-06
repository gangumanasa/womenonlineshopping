package com.daoimpl;

import javax.transaction.Transactional;

//import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Service;

import com.dao.CategoryDAO;
import com.model.*;


@Repository("categoryDAO")

public class Categorydaoimpl implements CategoryDAO
{
	
	
	@Autowired 
	SessionFactory sessionFactory;
	
	
	public Categorydaoimpl(SessionFactory sessionFactory)
	{
		this.sessionFactory =sessionFactory;
	}
	
	@Transactional
	public boolean addCategory(Category category) 
	{

		try 
		{
sessionFactory.getCurrentSession().saveOrUpdate(category);
System.out.println("Insertion Successfully....");
		return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception raised......"+e);
		return false;
		}
	}

}
