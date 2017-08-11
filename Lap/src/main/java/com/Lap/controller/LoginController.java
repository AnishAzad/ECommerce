package com.Lap.controller;

import java.util.Collection;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;

import org.springframework.security.core.GrantedAuthority;

//import org.springframework.security.core.context.SecurityContextHolder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Lap.dao.Registerdao;
import com.Lap.model.Register;
import com.Lap.model.Usercredential;



	

	
@Controller("loginController")
public class LoginController

{

@Autowired
Usercredential user;

@Autowired
	Registerdao rdao;


@RequestMapping(value="Register", method=RequestMethod.GET)
	
public ModelAndView getLogin(@ModelAttribute("Register")Register register)
	
{
			
System.out.println("Register");	
			
ModelAndView model=new ModelAndView("Register");
			
return model;
	
}
	
	
	
@RequestMapping(value="Register", method=RequestMethod.POST)
	
public ModelAndView Success(Register reg, Model m)
	
{
			
rdao.addUser(reg);
			
ModelAndView model=new ModelAndView("Login","Register", new Register());
			
return model;
	}
	

@RequestMapping(value="/Login")
public ModelAndView Login()
{
	ModelAndView model=new ModelAndView("Login");
	return model;
}



/*@SuppressWarnings("unchecked")
@RequestMapping(value = "/login_session_attributes",method=RequestMethod.POST)
@RequestMapping(value = "/loginsuccess")
public String login_session_attributes(HttpSession session,Model model) {
	String userid = SecurityContextHolder.getContext().getAuthentication().getName();
	//Usercredential  user = rdao.get(userid);
	Usercredential  user = rdao.getUserid(userid);
	session.setAttribute("userId", user.getUserid());
	session.setAttribute("password", user.getPassword());
	session.setAttribute("LoggedIn", "true");

	Collection<GrantedAuthority> authorities = (Collection<GrantedAuthority>) SecurityContextHolder.getContext()	.getAuthentication().getAuthorities();
	String page="";
	String role="ROLE_USER";
	for (GrantedAuthority authority : authorities) 
	{
	  
	     if (authority.getAuthority().equals(role)) 
	     {
	    	 session.setAttribute("UserLoggedIn", "true");
		 //page="/addToCart";
	    	 page="/AddProduct";
	    	 //session.setAttribute("cartsize",cartdao.cartsize((int)session.getAttribute("userId")));
	     }
	     else 
	     {
	    	 session.setAttribute("Admin", "true");
		
	    }
	}
	return page;
}

}
*/

@SuppressWarnings("unchecked")
@RequestMapping(value = "/loginsuccess")
public String login_session_attributes(HttpSession session,Model model) 
{
	System.out.println("Hai..Am Anish");
	String userid = SecurityContextHolder.getContext().getAuthentication().getName();
	
	Collection<GrantedAuthority> authorities = (Collection<GrantedAuthority>) SecurityContextHolder.getContext().getAuthentication().getAuthorities();
	String page="";
	
	String role="ROLE_USER";
	for (GrantedAuthority authority:authorities) 
	{
	 System.out.println(authority.getAuthority());
	     if (authority.getAuthority().equals(role)) 
	     {
	    	 
	    	 session.setAttribute("UserLoggedIn", "true");
	    	 session.setAttribute("Userid", userid);
	    	 page="/addcart";
	    	 
	    	 break;
	     }
	     else 
	     {
	    	 session.setAttribute("LoggedIn", "true");
	    	 session.setAttribute("Admin", "true");
	    	 page="/Admin";
	    	 break;
	    }
	}
	return page;


}
}













	


	