package io.Bottomline.hwAssignemnt;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	private
		int counter;
	@RequestMapping("/")
	public String helloWorld() {
		return "HelloWorld - " + counter++;
	}
}
