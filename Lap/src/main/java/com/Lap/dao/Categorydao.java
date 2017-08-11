package com.Lap.dao;

import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;
import com.Lap.model.Category;




@Repository("categorydao")
public class Categorydao
{
	
	@Autowired
	SessionFactory sessionFactory;
	
	public void AddCategory(Category c)
	{
	System.out.println(c.getcname());
		try
		{
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(c);
		tx.commit();
		session.flush();
		session.close();
		}
		catch(Exception e)
		{
			System.out.println("Error"+e);
		}
	}

	
	
	

	public List showCategory()
	{
		
		Session session=sessionFactory.openSession();
		Transaction tx=session.getTransaction();
		tx.begin();
		List showcate=session.createQuery("from Category").list();
		System.out.print(showcate);
		tx.commit();
		session.flush();
		session.close();
		return showcate;
	}
	
	public Category showCategory(int showcate)
	{
		Session session = sessionFactory.openSession();
	      Transaction tx = session.getTransaction();
	      tx.begin();
	      Category c=(Category)session.get(Category.class,showcate);
	      tx.commit();
	      session.flush();
	    session.close();
	      return c;
		
	}
	
	
	public void EditCategory(Category typecat)
	{
		
		Session s=sessionFactory.openSession();
	    Transaction tx=s.getTransaction();
		tx.begin();
		Category c=(Category)s.get(Category.class,typecat.getcid());
		c.setcdesc(typecat.getcdesc());
		c.setcname(typecat.getcname());
		s.update(c);
		tx.commit();
		System.out.println("8");
		s.close();
		
	}

public void DeleteCategory(int delcateid)
{
	System.out.println("0");
	Session session = sessionFactory.openSession();
	System.out.println("1");
      Transaction tx = session.getTransaction();
      System.out.println("2");
      tx.begin();
      System.out.println("3");
        Category c=(Category)session.get(Category.class,delcateid);
        System.out.println("3");
        System.out.println(c);
         session.delete(c); 
         System.out.println("3");
         tx.commit();
}




}
	