package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView indexGet(ModelAndView mv) {
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping(value="/",method=RequestMethod.POST)
	public ModelAndView indexPost(ModelAndView mv,@RequestParam("sampleVal")String sampleVal
			,@RequestParam("flute")String flute,@RequestParam("sexVal")String sex) {
		mv.setViewName("index");
		mv.addObject("sample",sex+"のあなたは"+sampleVal+"の登録です");
		mv.addObject("like","あなたの好きなフルーツは"+flute);
		return mv;
		}
	
	@RequestMapping(value="/f", method=RequestMethod.GET)
	public ModelAndView firstGet(ModelAndView mv){
	mv.addObject("name", "名前がここに入ります");
	mv.addObject("age", "年齢がここに入ります");
	mv.addObject("height", "身長がここに入ります");
	mv.setViewName("first");
	return mv;
	}
	@RequestMapping(value="/f", method=RequestMethod.POST)
	public ModelAndView firstPost(ModelAndView mv, @RequestParam("nameVal")String
	name,
	@RequestParam("ageVal")String age, @RequestParam("heightVal")String height){
	mv.addObject("name", name);
	mv.addObject("age", age);
	mv.addObject("height", height);
	mv.setViewName("first");
	return mv;
	}
}
