package com.wsacademico.api.comum.util;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

/**
 * Classe Util para formatar String.
 * @author eberson
 * 
 * @since 20/03/2018
 * @version 1.0
 * */
@Service
public class StringServicoUtil {

	/**
	 * Método responsável por retornar somente números
	 * de uma string.
	 * @author eberson
	 * 
	 * @param texto
	 * @return somente numeros
	 * */
	public String somenteNumeros(String texto) {
		
		String numeros="";
		char[] letras = texto.toCharArray();
		for (char letra : letras) {
			if(Character.isDigit(letra)) {
				numeros+=letra;
			}
		}
		
		return numeros;
	}
	
	/**
	 * Método responsável por validar campo texto.
	 * @author eberson
	 * 
	 * @param texto
	 * 
	 * @return true para texto <b>null</b> ou <b>""</b> ou <b>" "</b>.
	 * */
	public boolean validaStringVazia(String texto) {
		
		return StringUtils.isBlank(texto);
	}
	
	/**
	 * Método responsável por validar campo texto.
	 * @author eberson
	 * 
	 * @param texto
	 * 
	 * @return true para texto <b>"texto"</b> ou <b>"  texto  "</b>.
	 * */
	public boolean validaStringNaoVazia(String texto) {
		
		return StringUtils.isNotBlank(texto);
	}
}
