package com.wsacademico.api.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

import com.wsacademico.api.security.AppUserDetailsService;

@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {
	
	private static final String CLIENT_USER="angular";
	/* Ramos@99 */
	private static final String CLIENT_PASSWORD="$2a$10$EQrhzcxKQUVR5PocwQmhjuU/bLQKmoMMTCB8dimP2RMq3aoAwRTRq";
	/*Palavra chave que valida o token*/
	private static final String SIGNING_KEY="3b3r20n";
	
	private static final String SCOPE_READ="read";
	private static final String SCOPE_WRITE="write";
	
	private static final String GRANT_TYPE_FOR_LOGIN="password";
	private static final String GRANT_TYPE_FOR_REFRESH="refresh_token";
	
	/*Em Segundos*/
	/*1800 segundos - 30 minutos ativo*/
	private static final int TOKEN_VALIDITY_SECONDS=20;
	/*Validade de um dia para o refresh token*/
	/*Irá durar um dia inteiro*/
	private static final int REFRESH_TOKEN_VALIDITY_SECONDS=3600 * 24;
	
	@Autowired
	@Qualifier("authenticationManagerBean")
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private AppUserDetailsService appUserDetailsService;
	
	@Override
	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
		clients.inMemory()
			.withClient(CLIENT_USER)
			.secret(CLIENT_PASSWORD)
			.scopes(SCOPE_READ,SCOPE_WRITE)
			.authorizedGrantTypes(GRANT_TYPE_FOR_LOGIN,GRANT_TYPE_FOR_REFRESH)
			.accessTokenValiditySeconds(TOKEN_VALIDITY_SECONDS)
			.refreshTokenValiditySeconds(REFRESH_TOKEN_VALIDITY_SECONDS); 
	}
	
	@Override
	public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
		endpoints
			.tokenStore(tokenStore())
			.accessTokenConverter(accessTokenConverter())
			.reuseRefreshTokens(false) /*Não reutilizar o refresh_token quando o mesmo solicitar a geração de um novo access Token*/
			.authenticationManager(authenticationManager).userDetailsService(appUserDetailsService);
	}
	
	@Bean
	public JwtAccessTokenConverter accessTokenConverter() {
		JwtAccessTokenConverter accessTokenConverter = new JwtAccessTokenConverter();
		accessTokenConverter.setSigningKey(SIGNING_KEY);
		return accessTokenConverter;
	}

	@Bean
	public TokenStore tokenStore() {
		/*Cria token em memória para testes.*/
		return new JwtTokenStore(accessTokenConverter());
	}
	
	public static void main(String[] args) {
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		System.out.println(encoder.encode("aluna01"));
	}
}
