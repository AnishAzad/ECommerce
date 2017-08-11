/* 
package com.Lap.dao;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;


import com.Lap.model.Register;
import com.Lap.model.Usercredential;

@Repository("registerdao")
public class Registerdao 
{
	
	@Autowired
	SessionFactory sessionFactory;
	
	public void addUser(Register r)
	{
		System.out.println("Register DAO");
		System.out.println(r.getName());
	    Usercredential user=new Usercredential();
		user.setUserid(r.getUserid());
		user.setPassword(r.getPassword());
		//System.out.println(r.getUserid());
		System.out.println("User Credentials");
		try
		{
		Session session= sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		tx.begin();
		session.save(r);
		session.save(user);
		tx.commit();
		session.flush();
		session.close();
		}
		catch(Exception e)
		{
			System.out.println("Error"+e);
		}
	}
	
	public Register getInfo(String username)
	{
	     try
		{		
		Session session = sessionFactory.openSession();
	      Transaction tx = session.getTransaction();
	      tx.begin();
	      Register user=(Register) session.get(Register.class,username);
	      System.out.println(user);
	      tx.commit();
	      return user;
		}
	      catch(Exception e)
			{
				System.out.println("Error"+e);
			}
		return null;

	      }

	public static Usercredential get(String userid) {
		// TODO Auto-generated method stub
		return null;
	}

	//public static UserDetails get(String username) {
		// TODO Auto-generated method stub
		//return null;
	//}
	
	
	public Usercredential getUserById(String userid) {
		return (Usercredential) sessionFactory.getCurrentSession().get(Usercredential.class, userid);
	}

	public Register getUserByName(String name) {
		return (Register) sessionFactory.getCurrentSession().createQuery("from User where name='"+name+"'").uniqueResult();
	}

	public Register login_session_attributes(String userid, String password) {
		//user = (User) sessionFactory.getCurrentSession().get(User.class, id);
		return (Register) sessionFactory.getCurrentSession().createQuery("from User where id='"+userid+"' and password='"+password+"'").uniqueResult();
	}


		
}*/




package com.Lap.dao;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Lap.model.Category;
import com.Lap.model.Register;
import com.Lap.model.Usercredential;

@Repository
public class Registerdao
{
	
	@Autowired
	SessionFactory sessionFactory;
	
	public void addUser(Register r)
	{
		System.out.println("Register DAO");
		System.out.println(r.getName());
		Usercredential uc=new Usercredential();
		uc.setUserid(r.getUserid());
		uc.setPassword(r.getPassword());
		System.out.println("User Credentials");
		try
		{
		Session session= sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		tx.begin();
		session.save(r);
		session.save(uc);
		tx.commit();
		session.flush();
		session.close();
		}
		catch(Exception e)
		{
			System.out.println("Error"+e);
		}
	}
	
	public Register getInfo(String username)
	{
		
		Session session = sessionFactory.openSession();
	      Transaction tx = session.getTransaction();
	      tx.begin();
	      Register uc=(Register) session.get(Register.class,username);
	      System.out.println(uc);
	      tx.commit();
	      return uc;
	}

	public Usercredential getUserid(String userid) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
