package com.example;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {

	//basic 
	@RequestMapping("/hai")   // default uri   => 
	public String method1()
	{
		return "firstjsp";
	}
	
	//using Model map
	@RequestMapping("/hello")
	public String method2(ModelMap map)
	{
		
		map.addAttribute("message", "hello this is firsts controller class");
		return "hellojsp";	
	}
	
	//using modeland view
	@RequestMapping("/goodmoring")
	public ModelAndView method3()
	{
		ModelAndView mav=new ModelAndView("goodmoringjsp");
		mav.addObject("data", "hello good morning");
		return mav;	
	}
	
	
}
