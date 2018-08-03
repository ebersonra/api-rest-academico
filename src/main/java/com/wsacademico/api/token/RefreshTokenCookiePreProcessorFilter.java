package com.wsacademico.api.token;

import java.io.IOException;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

import org.apache.catalina.util.ParameterMap;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class RefreshTokenCookiePreProcessorFilter implements Filter {

	private static final String URL_OAUTH_TOKEN 		= "/oauth/token";
	private static final String PARAMETER_REFRESH_TOKEN = "refresh_token";
	private static final String COOKIE_REFRESH_TOKEN 	= "refreshToken";
	private static final String GRANT_TYPE 				= "grant_type";

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		
		if(URL_OAUTH_TOKEN.equalsIgnoreCase(req.getRequestURI())
				&& PARAMETER_REFRESH_TOKEN.equalsIgnoreCase(req.getParameter(GRANT_TYPE))
				&& req.getCookies() != null) {
			
			for(Cookie cookie : req.getCookies()) {
				
				if(cookie.getName().equalsIgnoreCase(COOKIE_REFRESH_TOKEN)) {
					String refreshToken = cookie.getValue();
					req = new MyServletRequestWrapper(req, refreshToken);
				}
			}
		}
		
		chain.doFilter(req, response);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}
	@Override
	public void destroy() {
		
	}
	
	static class MyServletRequestWrapper extends HttpServletRequestWrapper{
		
		private String refreshToken;
		
		public MyServletRequestWrapper(HttpServletRequest request, String refreshToken) {
			super(request);
			this.refreshToken = refreshToken;
		}
		
		@Override
		public Map<String, String[]> getParameterMap() {
			ParameterMap<String, String[]> map = new ParameterMap<>(getRequest().getParameterMap());
			map.put(PARAMETER_REFRESH_TOKEN, new String[] { refreshToken });
			map.setLocked(true);
			return map;
		}
		
	}
}
