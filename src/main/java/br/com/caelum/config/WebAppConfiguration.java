package br.com.caelum.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@org.springframework.context.annotation.Configuration
@ComponentScan("br.com.caelum")
public class WebAppConfiguration extends WebMvcConfigurerAdapter { 
	
	@Bean
	public ViewResolver viewResolver() { 
		InternalResourceViewResolver viewResolver = 
										new InternalResourceViewResolver();
		
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
	}
}