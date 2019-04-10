package com.ecomm.controller;

@Controller
public class ViewController
{
@RequestMapping(value="/login")

public String loginPage()
{
	return "login";
}
}
