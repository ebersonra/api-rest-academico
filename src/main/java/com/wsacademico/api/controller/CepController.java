package com.wsacademico.api.controller;

import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wsacademico.api.model.Endereco;
import com.wsacademico.api.service.ViaCepService;

@RestController
@RequestMapping("/enderecos")
public class CepController {
	
	@GetMapping("/{cep}")
	public Endereco enderecoPorCep(@PathVariable String cep) {
		Endereco endereco = new Endereco();
		
		JSONObject documentJSON;
//		documentJSON = ViaCepAPI.getJsonEnderecoPorCep(cep);
//		if(documentJSON != null) {
//			
//		}
		return endereco; 
	}

}
