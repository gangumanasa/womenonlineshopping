package com.daoimpl;

import javax.transaction.Transactional;

//import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Service;

import com.dao.SupplierDAO;
import com.model.Supplier;


@Repository("supplierDAO")

public class Supplierdaoimpl implements SupplierDAO
{
	@Autowired 
	SessionFactory sessionFactory;
	
	
	public Supplierdaoimpl(SessionFactory sessionFactory)
	{
		this.sessionFactory =sessionFactory;
	}
	
	@Transactional
	public boolean addSupplier(Supplier supplier) 
	{

		try 
		{
sessionFactory.getCurrentSession().saveOrUpdate(supplier);
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
