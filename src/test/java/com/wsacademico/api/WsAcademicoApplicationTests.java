package com.wsacademico.api;

import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.wsacademico.api.comum.Estado;
import com.wsacademico.api.service.ViaCepService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WsAcademicoApplicationTests {

	@Test
	public void contextLoads() {
		
		
	}
	
	@Test
	public void getEstado() throws Exception {
		
		Estado estado = Estado.getEstadoPorCodigo(14);
		
		System.out.println(estado.getDescricao()+" "+estado.getSigla());
		
	}

}
