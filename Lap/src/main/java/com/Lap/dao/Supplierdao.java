package com.Lap.dao;

import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;
import com.Lap.model.Supplier;


@Repository("supplierdao")
public class Supplierdao
{
	
	@Autowired
	SessionFactory sessionFactory;
	
	public void AddSupplier(Supplier s)
	{
	System.out.println(s.getsname());
		try
		{
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(s);
		tx.commit();
		session.flush();
		session.close();
		}
		catch(Exception e)
		{
			System.out.println("Error"+e);
		}
	}

	
	



	public List showSupplier()
	{
		
		Session session=sessionFactory.openSession();
		Transaction tx=session.getTransaction();
		tx.begin();
		List showsupp=session.createQuery("from Supplier").list();
		System.out.print(showsupp);
		tx.commit();
		session.flush();
		session.close();
		return showsupp;
	}
	
	public Supplier showSupplier(int showsupp)
	{
		Session session = sessionFactory.openSession();
	      Transaction tx = session.getTransaction();
	      tx.begin();
	      Supplier s=(Supplier)session.get(Supplier.class,showsupp);
	      tx.commit();
	      session.flush();
	    session.close();
	      return s;
		
	}
	
	
	public void EditSupplier(Supplier typesup)
	{
		
		Session u=sessionFactory.openSession();
	    Transaction tx=u.getTransaction();
		tx.begin();
		Supplier s=(Supplier)u.get(Supplier.class,typesup.getsid());
		s.setsdesc(typesup.getsdesc());
		u.update(s);
		tx.commit();
		System.out.println("8");
		u.close();
		
	}

public void DeleteSupplier(int delsuppid)
{
	System.out.println("0");
	Session session = sessionFactory.openSession();
	System.out.println("1");
      Transaction tx = session.getTransaction();
      System.out.println("2");
      tx.begin();
      System.out.println("3");
        Supplier s=(Supplier)session.get(Supplier.class,delsuppid);
        System.out.println("3");
        System.out.println(s);
         session.delete(s); 
         System.out.println("3");
         tx.commit();
}




}
	