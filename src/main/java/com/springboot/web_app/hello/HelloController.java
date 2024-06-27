package com.springboot.web_app.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloController {
	
	
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello! What are you learning today?";
	}
	
	
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>Spring Boot HTML Page</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("First spring boot html page.");
		sb.append("</body>");
		sb.append("</html>");
		
			
				
			
			
				
			
		
		return sb.toString();
	}
}