package com.kangnam.healthproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class OneTouchController {
	
	@RequestMapping(value = "/onetouch", method = RequestMethod.GET)
	public String getOneTouch() {
		return "/onetouch";
	}

	@RequestMapping(value = "/categorylist", method = RequestMethod.GET)
	public String getOCategoryList() {
		return "/map_category";
	}
//	@RequestMapping(value = "/categorylist", method = RequestMethod.GET)
//	public String getOCategoryList() {
//		return "/map_category";
//	}
	
}
