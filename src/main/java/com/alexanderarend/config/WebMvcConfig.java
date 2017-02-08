package com.alexanderarend.config;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;



/**
 * WebMvcConfig class enables Spring MVC with @EnableWebMvc annotation. It extends WebMvcConfigurerAdapter,
 * which provides empty methods that can be overridden to customize default configuration of Spring MVC.
 */
@EnableWebMvc
@Configuration
@EnableSwagger2
@ComponentScan(basePackages = "com.alexanderarend")
public class WebMvcConfig extends WebMvcConfigurerAdapter {
	/**
	 * Reads in the necessary properties files,
	 *
	 * @return the placeholder that has processed the file locations
	 */
	@Bean
	public static PropertyPlaceholderConfigurer propertyFiles() {
		PropertyPlaceholderConfigurer propertyPlaceholderConfigurer = new PropertyPlaceholderConfigurer();
		propertyPlaceholderConfigurer.setLocations(
				);
		return propertyPlaceholderConfigurer;
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
	    registry.addResourceHandler("swagger-ui.html")
	      .addResourceLocations("classpath:/META-INF/resources/");
	 
	    registry.addResourceHandler("/webjars/**")
	      .addResourceLocations("classpath:/META-INF/resources/webjars/");
	}
	 @Bean
	    public Docket api() { 
	        return new Docket(DocumentationType.SWAGGER_2)  
	          .select()                                  
	          .apis(RequestHandlerSelectors.any())              
	          .paths(PathSelectors.any())                          
	          .build()
	          .genericModelSubstitutes(ResponseEntity.class);                                           
	    }



	    /**
	     * Enable Default servlet handler
	     */
	    @Override
	    public void configureDefaultServletHandling(final DefaultServletHandlerConfigurer configurer) {
	        configurer.enable();
	    }
	
}
