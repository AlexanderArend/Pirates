package com.alexanderarend.config;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;



/**
 * WebMvcConfig class enables Spring MVC with @EnableWebMvc annotation. It extends WebMvcConfigurerAdapter,
 * which provides empty methods that can be overridden to customize default configuration of Spring MVC.
 */
@EnableWebMvc
@Configuration
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

    /**
     * Enable Default servlet handler
     */
    @Override
    public void configureDefaultServletHandling(final DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
 

	
}
