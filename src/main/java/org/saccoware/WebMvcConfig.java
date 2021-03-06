package org.saccoware;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
public class WebMvcConfig extends WebMvcConfigurerAdapter{
	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler(
		"/imgages/**",
         "/css/**",
         "/javascript/**")
         .addResourceLocations(
                 "classpath:/static/images/",
                 "classpath:/static/css/",
                 "classpath:/static/javascript/");
		}
	
}
