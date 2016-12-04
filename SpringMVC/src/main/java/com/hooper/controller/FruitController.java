package com.hooper.controller;

import com.hooper.common.annotation.AuthAnnotation;
import com.hooper.common.exception.ErrorCodeException;
import com.hooper.model.Fruit;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/fruit")
public class FruitController {

	@AuthAnnotation
	@RequestMapping(value="{fruitName}", method = RequestMethod.GET)
	public String getFruit(@PathVariable String fruitName, ModelMap model) {

		Fruit fruit = new Fruit(fruitName, 1000);
		model.addAttribute("model", fruit);

		model.addAttribute("do me a faver","kiss me asshole");

		return "list";

	}


	@RequestMapping(value = "index",method = RequestMethod.GET)
	public Object index(){
		Fruit fruit = new Fruit("butterfly", 2000);
		return new ModelAndView("list").addObject("model",fruit);
	}

	@RequestMapping(value = "NEx",method = RequestMethod.GET)
	public Object NEx(){
		throw new NumberFormatException();
	}

	@RequestMapping(value = "CEx",method = RequestMethod.GET)
	public Object CEx(){
		throw new ErrorCodeException("1111","错误");
	}
}