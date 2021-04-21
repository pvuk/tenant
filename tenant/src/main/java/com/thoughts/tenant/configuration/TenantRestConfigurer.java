package com.thoughts.tenant.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.thoughts.tenant.entity.Users;

/**
 * 
 * @author P.V. UdayKiran
 * @version 1, created on Wed 21-Apr-2021 17:41
 */
@Configuration
@Component
public class TenantRestConfigurer implements RepositoryRestConfigurer {
	
	@Override
	public void configureJacksonObjectMapper(ObjectMapper objectMapper) {
//		objectMapper.configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, true);
	}

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(Users.class);
	}
}
