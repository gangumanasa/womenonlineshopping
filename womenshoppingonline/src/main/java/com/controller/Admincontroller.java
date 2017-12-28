package com.controller;
import com.daoimpl.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.annotation.ModelAndViewResolver;

import com.daoimpl.Categorydaoimpl;
import com.daoimpl.Supplierdaoimpl;
import com.model.Category;
import com.model.Supplier;
@Controller
public class Admincontroller 

{	
	
	@Autowired 
	Supplierdaoimpl supplierdaoimpl;
	@Autowired
	Categorydaoimpl categorydaoimpl;
	
	
	
	@RequestMapping("/adding")
	public String adding()
	{
		return adding();
	}
	
	@RequestMapping(value="/saveSupp",method=RequestMethod.POST)
	@Transactional
	public ModelAndView saveSuppData(@RequestParam("sid")int sid,@RequestParam("sname")String sname)
	{
		ModelAndView mv=new ModelAndView();
		Supplier ss=new Supplier();
		ss.setSid(sid);
		ss.setSuppliername(sname);
		Supplierdaoimpl.insertSupplier(ss);
		mv.setViewName("adding");
		return mv;
		
		@RequestMapping(value="/saveCat",method=RequestMethod.POST)
		@Transactional
		public ModelAndView saveCatData(@RequestParam("cid")int sid,@RequestParam("cname")String sname)
		{
			ModelAndView mv=new ModelAndView();
			Category cc=new Category();
			cc.setCid(cid);;
			cc.setcName(cName);
			Categorydaoimpl.insertCategory(cc);
			mv.setViewName("adding");
			return mv;
			
			
	}

	
	

}
