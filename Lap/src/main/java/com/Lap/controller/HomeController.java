package com.Lap.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


	@Controller("homeController")
	public class HomeController {

	
	public HomeController() {
		System.out.println("at Controller");
	}
	
	@RequestMapping("/")
	public String showHome()
	{
		return "index";
	}
	
	@RequestMapping("/AboutUs")
	public String showAboutUs() 
	{
			System.out.println("About Us");
			return "AboutUs";
	}
	
	@RequestMapping("/Admin")
	public String showAdmin() 
	{
			System.out.println("Admin");
			return "Admin";
	}
	
	@RequestMapping("/index")
	public String showindex() 
	{
			System.out.println("index");
			return "index";
	}
	
	/*@RequestMapping("/Login")
	public String showLogin() 
	{
			System.out.println("Login");
			return "Login";
	}
	*/
	
	
	/*
	@RequestMapping("/Login")
	public String login(@RequestParam(value="error",required=false) String error,
			@RequestParam(value="logout",required=false) String logout,Model model){
		if(error!=null)
			model.addAttribute("error","Invalid Username and Password.. Please enter valid username and password");
		if(logout!=null)
			model.addAttribute("logout","Loggedout successfully..");
		return "Login";
	}

*/	

		}
	
	

	
	
	
	





