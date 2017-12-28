package com.daoimpl;
	import javax.transaction.Transactional;
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dao.Userdao;
	import com.model.User;

	@Repository(Userdao)
	public class Userdaoimpl implements Userdao {

		@Autowired
		static
		SessionFactory sessionFactory;
		
		@Autowired
		public Userdaoimpl(SessionFactory sessionFactory)
		{
			
			this.sessionFactory=sessionFactory;
			
		}
		
		@Transactional
		public boolean insertUser(User user) {

	Session session=sessionFactory.openSession();

	session.beginTransaction();
	session.saveOrUpdate(user);
	session.getTransaction().commit();
	return false;

			
		}

		public void inserUser(User user) {
			// TODO Auto-generated method stub
			
		}

		
	}



