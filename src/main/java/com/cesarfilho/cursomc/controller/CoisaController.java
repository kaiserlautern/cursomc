package com.cesarfilho.cursomc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/coisas")
public class CoisaController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String coisar() {
		return "REST está funcionando";

	}


}
