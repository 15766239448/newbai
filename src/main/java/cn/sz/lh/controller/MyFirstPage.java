package cn.sz.lh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

	@Controller
	@RequestMapping("/")
	public class MyFirstPage {
		
		@RequestMapping("/")
		public String firstpage() {
			return "forward:fp";
		}
		@RequestMapping("fp")
		public ModelAndView firstmain() {
			System.out.println("firstmain������ִ��..");
			ModelAndView mav = new ModelAndView();
			
			mav.addObject("msg", "�ҵ���Ϣ");
			mav.setViewName("main");
			return mav;
		}
}

