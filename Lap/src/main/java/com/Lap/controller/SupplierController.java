package com.Lap.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import com.google.gson.Gson;
import com.Lap.dao.Supplierdao;

//import Com.Mobile.Model.Product;
import com.Lap.model.Supplier;




@Controller("supplierController")
public class SupplierController
    
{
	
 @Autowired
 Supplierdao sdao;


 public String getdata()
 {
 ArrayList list=(ArrayList)sdao.showSupplier();
 Gson gson = new Gson();
 String jsonInString = gson.toJson(list);
  return jsonInString;
  }

	
 @RequestMapping(value="/AddSupplier")
 public ModelAndView AddSupplier(Model m)
 {
 ModelAndView mv=new ModelAndView("AddSupplier","Supplier",new Supplier());
 return mv;
 }
 	

       
 @RequestMapping(value="/AddSupplier",method=RequestMethod.POST)
 	public ModelAndView AddSupplier(@ModelAttribute Supplier srdt, HttpServletRequest request,RedirectAttributes attributes,Model m)
 	     {
 		System.out.println("Controller called");
 		
 		System.out.println(srdt.getsid());
 		sdao.AddSupplier(srdt);
 		m.addAttribute("list",getdata());
 		m.addAttribute("list",sdao.showSupplier());
 		ModelAndView mv=new ModelAndView("ViewSupplier","Supplier",new Supplier());
 		return mv;
  
 	
        }
 

 
 @RequestMapping(value="/ViewSupplier")
	public ModelAndView ViewSupplier1(Model m)
	{
		m.addAttribute("list",getdata());
		ModelAndView mv=new ModelAndView("ViewSupplier","Supplier",new Supplier());
		return mv;
	}
	
 

@RequestMapping(value="/EditSupplier")
	public ModelAndView EditSupplier(@RequestParam("sid")int sid,Model m) 
	{
	Supplier s=sdao.showSupplier(sid);
		m.addAttribute("EditSupplier1",s);
		ModelAndView mv=new ModelAndView("EditSupplier","Supplier",new Supplier());
		return mv;

	}
	
	
	
	//Getting values from Category Page
	@RequestMapping(value="/EditSupplier",method=RequestMethod.POST)
	public ModelAndView EditSupplier(Supplier typesup,Model m) 
	{
		sdao.EditSupplier(typesup);
		m.addAttribute("list",getdata());
		ModelAndView mv=new ModelAndView("EditSupplier","Supplier",new Supplier());
		return mv;

	}


@RequestMapping(value="/DeleteSupplier")
	
 public ModelAndView DeleteSupplier(Model m)

 	{
	  ModelAndView mv=new ModelAndView("DeleteSupplier","Supplier",new Supplier());
		return mv;
 	}



@RequestMapping(value="/DeleteSupplier",method=RequestMethod.POST)
public ModelAndView DeleteSupplier(@RequestParam("sid")int sid,Model m)

{
	sdao.DeleteSupplier(sid);
	m.addAttribute("list",getdata());
	//m.addAttribute("list",pdao.DeleteProduct());
	ModelAndView mv=new ModelAndView("DeleteSupplier","Supplier",new Supplier());
	return mv;
}


}
