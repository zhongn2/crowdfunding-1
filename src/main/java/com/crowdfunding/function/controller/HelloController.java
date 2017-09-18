package com.crowdfunding.function.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.crowdfunding.function.entity.HelloEntity;
import com.crowdfunding.function.service.HelloService;


@Controller
public class HelloController {

	@Autowired
	HelloService helloService;
	
	@RequestMapping("/")
	public String home() {
		return "redirect:/index";
	}
	
	@RequestMapping("/index")
	public String getIndex() {
		return "index";
	}
	
	@ResponseBody
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String getHello(){
		return "how are you";
	}
	
	@ResponseBody
	@RequestMapping(value="/helloTest",method=RequestMethod.GET)
	public String getHelloEntity(){
		try {
			List<HelloEntity> helloEntities = helloService.getHelloEntity();
			String msg = helloService.getMassage();
			if (msg != null) {
				return msg;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "false";
	}
	
}
