package com.Lap.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.Map;


import javax.servlet.http.HttpServletRequest;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
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
import com.Lap.dao.Categorydao;
import com.Lap.model.Category;
//import Com.Mobile.Model.Product;




@Controller("categorycontroller")
public class CategoryController
    
{
	

	
 @Autowired
 Categorydao cdao;


 public String getdata()
 {
 ArrayList list=(ArrayList)cdao.showCategory();
 Gson gson = new Gson();
 String jsonInString = gson.toJson(list);
  return jsonInString;
  }

	
 @RequestMapping(value="/AddCategory")
 public ModelAndView AddCategory(Model m)
 {
 ModelAndView mv=new ModelAndView("AddCategory","Category",new Category());
 return mv;
 }
 	

       
 @RequestMapping(value="/AddCategory",method=RequestMethod.POST)
 	public ModelAndView AddCategory(@ModelAttribute Category crdt, HttpServletRequest request,RedirectAttributes attributes,Model m)
 	     {
 		System.out.println("Controller called");
 		
 		System.out.println(crdt.getcid());
 		cdao.AddCategory(crdt);
 	 
 		m.addAttribute("list",cdao.showCategory());
 		ModelAndView mv=new ModelAndView("ViewCategory","Category",new Category());
 		return mv;
  
 	
        }
 

 
 @RequestMapping(value="/ViewCategory")
	public ModelAndView ViewCategory1(Model m)
	{
		m.addAttribute("list",getdata());
		ModelAndView mv=new ModelAndView("ViewCategory","Category",new Category());
		return mv;
	}
	
 

 @RequestMapping(value="/EditCategory")
	public ModelAndView EditCategory(@RequestParam("cid")int cid,Model m) 
	{
		Category c=cdao.showCategory(cid);
		m.addAttribute("EditCategory1",c);
		ModelAndView mv=new ModelAndView("EditCategory","Category",new Category());
		return mv;

	}
	
	
	
	//Getting values from Category Page
	@RequestMapping(value="/EditCategory",method=RequestMethod.POST)
	public ModelAndView EditCategory(Category typecat,Model m) 
	{
		cdao.EditCategory(typecat);
		m.addAttribute("list",getdata());
		ModelAndView mv=new ModelAndView("EditCategory","Category",new Category());
		return mv;

	}


@RequestMapping(value="/DeleteCategory")
	
 public ModelAndView DeleteCategory(Model m)

 	{
	  ModelAndView mv=new ModelAndView("DeleteCategory","Category",new Category());
		return mv;
 	}



@RequestMapping(value="/DeleteCategory",method=RequestMethod.POST)
public ModelAndView DeleteCategory(@RequestParam("cid")int cid,Model m)

{
	cdao.DeleteCategory(cid);
	//m.addAttribute("list",getdata());
	//m.addAttribute("list",pdao.DeleteProduct());
	ModelAndView mv=new ModelAndView("DeleteCategory","Category",new Category());
	return mv;
}


}
