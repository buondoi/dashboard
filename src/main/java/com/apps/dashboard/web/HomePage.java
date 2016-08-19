package com.apps.dashboard.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created on 8/17/16.
 */
@Controller
@RequestMapping("/")
public class HomePage
{
	@RequestMapping(method = RequestMethod.GET, produces = "text/html")
	public String load()
	{
		return "index";
	}
}
