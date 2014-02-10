package com.robb1e.helloworld

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*


@Controller
class HelloWorldController {

	@Autowired
	NameService nameService

	@RequestMapping("/")
	String index(Map<String, Object> model) {
		model.put('name', nameService.name())
		'index'
	}

}
