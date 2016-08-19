package com.apps.dashboard;

import com.apps.dashboard.web.config.WebMVC;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Configuration;


/**
 * Created on 8/17/16.
 */
@Configuration
@EnableAutoConfiguration
public class App
{
	public static void main(String[] args)
	{
		new SpringApplicationBuilder(App.class, WebMVC.class).web(true).run(args);
	}
}
