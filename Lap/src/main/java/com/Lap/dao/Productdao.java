package com.Lap.dao;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;

import com.Lap.model.Product;

//import com.Lap.model.Category;

//import com.Lap.model.Supplier;

@Repository("productdao")
public class Productdao
{
	
	@Autowired
	SessionFactory sessionFactory;
	
	public void AddProduct(Product p)
	{
	System.out.println(p.getPname());
		try
		{
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(p);
		tx.commit();
		session.flush();
		session.close();
		}
		catch(Exception e)
		{
			System.out.println("Error"+e);
		}
	}
	
	
	public List showProduct()
	{
		
		Session session=sessionFactory.openSession();
		Transaction tx=session.getTransaction();
		tx.begin();
		List showprod=session.createQuery("from Product").list();
		System.out.print(showprod);
		tx.commit();
		session.flush();
		session.close();
		return showprod;
	}
	
	public Product showProduct(int showprod)
	{
		Session session = sessionFactory.openSession();
	      Transaction tx = session.getTransaction();
	      tx.begin();
	      Product p=(Product)session.get(Product.class,showprod);
	      tx.commit();
	      session.flush();
	    session.close();
	      return p;
		
	}
	
		
	
	/*public String[] showcatesupplier()
	{
		Session session=sessionFactory.openSession();
		Transaction tx=session.getTransaction();
		tx.begin();
		List showcate=session.createQuery("from Category").list();
		List showsupp=session.createQuery("from Supplier").list();
		tx.commit();
		session.flush();
		session.clear();
		Gson g=new Gson();
		String[] cate=new String[2];
		cate[0]=g.toJson(showcate);
		cate[1]=g.toJson(showsupp);
		session.close();
		return cate;
		
	}
	*/
	public void EditProduct(Product typepro)
	{
		
		Session s=sessionFactory.openSession();
	    Transaction tx=s.getTransaction();
		tx.begin();
		Product p=(Product)s.get(Product.class,typepro.getPid());
		p.setPquan(typepro.getPquan());
		p.setPcost(typepro.getPcost());
		//p.setPid(editprod.getPid());
		s.update(p);
		tx.commit();
		System.out.println("8");
		s.close();
		
	}
	public void DeleteProduct(int delprodid)
	{
		System.out.println("0");
		Session session = sessionFactory.openSession();
		System.out.println("1");
	      Transaction tx = session.getTransaction();
	      System.out.println("2");
	      tx.begin();
	      System.out.println("3");
	        Product p=(Product)session.get(Product.class,delprodid);
	        System.out.println("3");
	        System.out.println(p);
	         session.delete(p); 
	         System.out.println("3");
	         tx.commit();
	}


	

}
	/*public String[] showcatseller()
	{
		// TODO Auto-generated method stub
		return null;
	}	*/


