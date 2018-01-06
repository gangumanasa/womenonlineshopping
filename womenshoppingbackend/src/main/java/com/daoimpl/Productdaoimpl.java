package com.daoimpl;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dao.ProductDAO;
import com.model.Product;

@Repository("productDAO")
public class Productdaoimpl implements ProductDAO {

	
	@Autowired 
	SessionFactory sessionFactory;
	
	
	public Productdaoimpl(SessionFactory sessionFactory)
	{
		this.sessionFactory =sessionFactory;
	}
	
	@Transactional
	public boolean addProduct(Product product) 
	{

		try 
		{
sessionFactory.getCurrentSession().saveOrUpdate(product);
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
