package com.singhrepo.covid19tracker.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ErrController implements ErrorController{
	@RequestMapping(path = "/error")
	@Override
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return "redirect:/cotrac/home";
	}

}
