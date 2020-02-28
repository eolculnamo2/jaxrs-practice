package com.rob.project1.config;

import com.rob.project1.resources.ApplicationResource;
import com.rob.project1.resources.PokemonResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {

		register(PokemonResource.class);
		register(ApplicationResource.class);
	}
}
