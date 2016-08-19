package com.apps.dashboard.web.config;

import com.apps.dashboard.web.HomePage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;
import org.thymeleaf.templateresolver.TemplateResolver;


/**
 * Created on 8/19/16.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = HomePage.class)
public class WebMVC extends WebMvcConfigurerAdapter
{
	@Bean
	public ViewResolver viewResolver(SpringTemplateEngine templateEngine)
	{
		final ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
		viewResolver.setTemplateEngine(templateEngine);
		viewResolver.setViewNames(new String[] { "*.html" });
		return viewResolver;
	}

	@Bean
	protected SpringTemplateEngine templateEngine(TemplateResolver templateResolver)
	{
		final SpringTemplateEngine engine = new SpringTemplateEngine();
		engine.setTemplateResolver(templateResolver);
		return engine;
	}

	@Bean
	protected TemplateResolver templateResolver()
	{
		final ServletContextTemplateResolver templateResolver = new ServletContextTemplateResolver();
		templateResolver.setSuffix(".html");
		templateResolver.setTemplateMode("HTML5");
		templateResolver.setPrefix("/");
		return templateResolver;
	}

	@Override
	public void addResourceHandlers(final ResourceHandlerRegistry registry)
	{
		super.addResourceHandlers(registry);
		registry.addResourceHandler("/plugins/**").addResourceLocations("/plugins/");
		registry.addResourceHandler("/apps/**").addResourceLocations("/apps/");
	}
}
