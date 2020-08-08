package cn.ljm.alipay.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {
	/**
	 * 购物车
	 * @return
	 */
	@RequestMapping("/")
	public String index() {
		return "pay";
	}

}
