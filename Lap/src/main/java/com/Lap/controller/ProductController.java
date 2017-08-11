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
import com.Lap.dao.Productdao;
import com.Lap.model.Product;



import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import javax.validation.Valid;
import java.util.List;
import java.util.Map;




@Controller("productController")
public class ProductController
    
{
	
 @Autowired
 Productdao pdao;



	

 public String getdata()
     {
	 ArrayList list=(ArrayList)pdao.showProduct();
     Gson gson = new Gson();
	 String jsonInString = gson.toJson(list);
      return jsonInString;
      }
	

	

      @RequestMapping(value="/AddProduct")
	public ModelAndView AddProduct(Model m)

	{
  		System.out.println("GET METHOD called");
  		/*String[] s=pdao.showcatesupplier();
		System.out.println(s[0]);
		m.addAttribute("catelist",s[0]);
		m.addAttribute("supplist",s[1]);		
		*/
	

m.addAttribute("prdt", new Product());
		ModelAndView mv=new ModelAndView("AddProduct","Product",new Product());
		return mv;

	
	}
	

      
	@RequestMapping(value="/AddProduct",method=RequestMethod.POST)
	public ModelAndView AddProduct(@ModelAttribute("prdt") Product prdt, HttpServletRequest request,RedirectAttributes attributes,Model m)
	{
		System.out.println("Controller called");
		
		System.out.println(prdt.getPid());
		pdao.AddProduct(prdt);
		
		String path="F:\\Workspace1\\Lap\\src\\main\\webapp\\resources\\image\\";
		path=path+String.valueOf(prdt.getPid())+".jpg";
		System.out.println(path);
		File f=new File(path);
		MultipartFile filedet=prdt.getPimage();
		
		if(!filedet.isEmpty())
		{
			try
			{
			  byte[] bytes=filedet.getBytes();
			  System.out.println(bytes.length);
			  FileOutputStream fos=new FileOutputStream(f);
              			BufferedOutputStream bs=new BufferedOutputStream(fos);
              			bs.write(bytes);
              			bs.close();
             			 System.out.println("File Uploaded Successfully");
			}
			catch(Exception e)
			{
				System.out.println("Exception Arised"+e);
			}
		}
		else
		{
			System.out.println("File is Empty not Uploaded");
			
		}
		m.addAttribute("list",getdata());
		ModelAndView mv=new ModelAndView("ViewProduct","Product",new Product());
		return mv;
 
	
	}
	
	
	
	
	
	@RequestMapping(value="/ViewProduct")
	public ModelAndView ViewProduct1(Model m)
	{
		m.addAttribute("list",getdata());
		ModelAndView mv=new ModelAndView("ViewProduct","Product",new Product());
		return mv;
	}
	
	
	
	
	@RequestMapping(value="/FullProduct")
	public String userview(Model m)
	{
		System.out.println("Hello");
		System.out.println(getdata());
		m.addAttribute("list",getdata());
		return "FullProduct";
	}
	
	
	

	@RequestMapping(value="/ProductDescription")
	public ModelAndView viewdescrp(@RequestParam("id")int pid,Model m)
	{
		System.out.println("Hello");
		System.out.println(pid);
		Product p=pdao.showProduct(pid);
		Gson gson = new Gson();
		String list=gson.toJson(p);
		m.addAttribute("list1",list);
	    ModelAndView mv=new ModelAndView("ProductDescription","Product",new Product());
		return mv;
			//System.out.println(getdata());		
	}
	
	
	
	

	@RequestMapping(value="/AddToCart",method=RequestMethod.GET)
	public ModelAndView addtocart(@RequestParam("addpid")int pid,Model m)
	{
		System.out.println("Hello");
		System.out.println(pid);
		Product p=pdao.showProduct(pid);
		Gson gson = new Gson();
		String list=gson.toJson(p);
		m.addAttribute("list1",list);
	    ModelAndView mv=new ModelAndView("AddToCart","Product",new Product());
		return mv;
		//System.out.println(getdata());
		
	}
	
	
	
	
	@RequestMapping(value="/EditProduct")
	public ModelAndView EditProduct(@RequestParam("pid")int pid,Model m) 
	{
		Product p=pdao.showProduct(pid);
		m.addAttribute("EditProduct1",p);
		ModelAndView mv=new ModelAndView("EditProduct","Product",new Product());
		return mv;

	}
	
	
	
	//Getting values from Category Page
	@RequestMapping(value="/EditProduct",method=RequestMethod.POST)
	public ModelAndView EditProduct(Product typepro,Model m) 
	{
		pdao.EditProduct(typepro);
		m.addAttribute("list",getdata());
		ModelAndView mv=new ModelAndView("EditProduct","Product",new Product());
		return mv;

	}
	
  @RequestMapping(value="/DeleteProduct")
		
	  public ModelAndView DeleteProduct(Model m)

	  	{
		  ModelAndView mv=new ModelAndView("DeleteProduct","Product",new Product());
			return mv;
	  	}

	
	
	@RequestMapping(value="/DeleteProduct",method=RequestMethod.POST)
	public ModelAndView DeleteProduct(@RequestParam("pid")int pid,Model m)
	
	{
		pdao.DeleteProduct(pid);
		m.addAttribute("list",getdata());
		//m.addAttribute("list",pdao.DeleteProduct());
		ModelAndView mv=new ModelAndView("DeleteProduct","Product",new Product());
		return mv;
	}
	
	
	


	



	
}