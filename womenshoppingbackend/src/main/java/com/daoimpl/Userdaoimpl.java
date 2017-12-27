package com.daoimpl;

	
	
	import javax.transaction.Transactional;

	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.springframework.beans.factory.annotation.Autowired;

import com.dao.Userdao;
import com.model.User;


	public class Userdaoimpl implements Userdao {

		@Autowired
		SessionFactory sessionFactory;
		
		@Autowired
		public Userdaoimpl(SessionFactory sessionFactory)
		{
			super();
			this.sessionFactory=sessionFactory;
			
		}
		
		@Transactional
		public void AddUser(User user) {

	Session session=sessionFactory.openSession();

	session.beginTransaction();
	session.saveOrUpdate(user);
	session.getTransaction().commit();

			
		}

		public static void insertUser(User user) {
			// TODO Auto-generated method stub
			
		}

		
	}



