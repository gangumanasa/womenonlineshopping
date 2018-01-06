package com.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.daoimpl.*;
import com.model.*;


@Configuration
@ComponentScan("com")
@EnableTransactionManagement
public class Hyberconfig 
{

	
	@Bean(name="dataSource")
	public DataSource getH2Data()
	{
		DriverManagerDataSource datasource=new DriverManagerDataSource();
		
		
		datasource.setDriverClassName("org.h2.Driver");
		datasource.setUrl("jdbc:h2:tcp://localhost/~/batchs180250");
		datasource.setUsername("sa");
		datasource.setPassword("");
		System.out.println("------H2 is conencted ------");
		return datasource;
		
		
	}
	
	private Properties getH2properties()
	{
		Properties p=new Properties();
		
		p.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		
		p.put("hibernate.hbm2ddl.auto","update");
		p.put("hibernate.show_sql","true");
		
		System.out.println("Hibernate properties created .....");
		return p;
		
		
	}
	
	@Bean(name="sessionFactory")
	public SessionFactory getSessionFactory()
	{
		LocalSessionFactoryBuilder slfb=new LocalSessionFactoryBuilder(getH2Data());
		
		slfb.addProperties(getH2properties());
		
		slfb.addAnnotatedClass(User.class);
		slfb.addAnnotatedClass(Supplier.class);
		slfb.addAnnotatedClass(Category.class);
		slfb.addAnnotatedClass(Product.class);
				
		System.out.println("Session Factory created....");
		return slfb.buildSessionFactory();
		
	}
	@Autowired
	@Bean(name="Userdaoimpl")
	public Userdaoimpl saveUserdata(SessionFactory sf)
	{
		return new Userdaoimpl(sf);
		
	}
	@Autowired
	@Bean(name="upplierdaoimpl")
	public Supplierdaoimpl saveSuppdata(SessionFactory sf)
	{
		return new Supplierdaoimpl(sf);
		
	}
	@Autowired
	@Bean(name="Categorydaoimpl")
	public Categorydaoimpl saveCatdata(SessionFactory sf)
	{
		return new Categorydaoimpl(sf);
		
		
	}
	
	@Autowired
	@Bean(name="Productdaoimpl")
	public Productdaoimpl saveProddata(SessionFactory sf)
	{
		return new Productdaoimpl(sf);
	}	
	@Bean("transactionManager")
	public HibernateTransactionManager getHibernateTransactionManager(SessionFactory sessionFactory)
	{
		return new HibernateTransactionManager(sessionFactory);
		
		
	}
	/* 
	  @Bean
	  public UserDAO getUserDAO(SessionFactory sessionFactory)
	  {
	  		return new userDAo(sessionFactory )
	  }
	  
	  @Bean
	  public SupplierDAO getSupplierDAO(SessionFactory sessionFactory)
	  {
	  		return new supplierDAo(sessionFactory )
	  }
	                  */
	 
}
