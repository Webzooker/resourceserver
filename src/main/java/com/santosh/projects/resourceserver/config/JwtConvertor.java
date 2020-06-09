package com.santosh.projects.resourceserver.config;

import java.util.Map;

import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.jwt.Jwt;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.DefaultAccessTokenConverter;
import org.springframework.stereotype.Component;

@Component
public class JwtConvertor extends DefaultAccessTokenConverter implements Converter<S, T> {

	@Override
	public AbstractAuthenticationToken convert(Jwt source) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OAuth2Authentication extractAuthentication(Map<String, ?> map) {
		OAuth2Authentication auth = super.extractAuthentication(map);
		AccessTokenMapper details = new AccessTokenMapper();
		
		if(map.get("userId") != null) 
			details.setUserId((String) map.get("userId"));
		
		if (map.get("first_name") != null)
			details.setFirstName((String) map.get("firstName"));
		if (map.get("last_name") != null)
			details.setLastName((String) map.get("lastName"));
		if (map.get("country") != null)
			details.setCountry((String) map.get("country"));
		if (map.get("mobile") != null)
			details.setMobile((String) map.get("mobile"));
		if (map.get("user_type") != null)
			details.setUserType((String) map.get("userType"));
		
			
	}
	
}