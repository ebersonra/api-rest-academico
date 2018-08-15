package com.wsacademico.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wsacademico.api.model.Endereco;

@RestController
@RequestMapping("/enderecos")
public class CepController {
	
	@GetMapping("/{cep}")
	public Endereco enderecoPorCep(@PathVariable String cep) {
		Endereco endereco = new Endereco();
		
//		documentJSON = ViaCepAPI.getJsonEnderecoPorCep(cep);
//		if(documentJSON != null) {
//			
//		}
		return endereco; 
	}

}
