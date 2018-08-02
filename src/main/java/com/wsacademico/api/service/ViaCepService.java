package com.wsacademico.api.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.commons.lang.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import com.wsacademico.api.comum.util.StringServicoUtil;

public class ViaCepService {

	private static URL url;
	private static JSONObject json;
	
	@Autowired
	private StringServicoUtil stringUtil;
	
	public JSONObject getJsonEnderecoPorCep(String cep) throws JSONException, IOException {
		
		cep = stringUtil.somenteNumeros(cep);
		
		if(StringUtils.isNotBlank(cep)) {
			url = new URL("https://viacep.com.br/ws/"+cep+"/json/"); 
		}else {
			
			return null;
		}
		
		HttpURLConnection connection;
		
		connection = (HttpURLConnection) url.openConnection();
		
		connection.setConnectTimeout(6000);
		connection.setReadTimeout(6000);
		
		InputStream content = connection.getInputStream();
		BufferedReader inputReader = new BufferedReader(new InputStreamReader(content));
		StringBuilder stringBuilder = new StringBuilder();
		String inline ="";
		
		while((inline = inputReader.readLine()) != null) {
			
			stringBuilder.append(inline);
		}
		
		json = new JSONObject(stringBuilder.toString());
		
		return json;
	}
}
