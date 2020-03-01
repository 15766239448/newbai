package cn.sz.lh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



public class MyFirstPage {

	@Controller
	@RequestMapping("/")
	public class FirstPageController {
		@RequestMapping("/")
		public String firstpage() {
			return "main";
		}
}
}
