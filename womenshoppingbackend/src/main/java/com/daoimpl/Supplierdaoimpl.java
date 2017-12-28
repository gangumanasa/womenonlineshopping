package com.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.dao.*;
import com.model.Supplier;

@Repository
@Service
public class Supplierdaoimpl implements Supplierdao
{
	
	@Autowired
	SessionFactory sessionFactory;

	@Autowired
	public void SessionFactory(SessionFactory sessionFactory) 
	{
		this.sessionFactory = sessionFactory;
	}
	
	public  void insertSupplier(Supplier supplier)
	
	{
		Session session=sessionFactory.openSession();

		session.beginTransaction();
		session.saveOrUpdate(supplier);
		session.getTransaction().commit();

	}

	
	
	
	
	
	

}
