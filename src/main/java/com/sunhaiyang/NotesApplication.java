package com.sunhaiyang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

@SpringBootApplication
@EnableElasticsearchRepositories(basePackages = {"com.sunhaiyang.repository"})
public class NotesApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotesApplication.class, args);
	}

	@Bean
	public ServletRegistrationBean servletRegistrationBean(WebApplicationContext context){
		DispatcherServlet servlet = new DispatcherServlet(context);
		ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(servlet,"/api/*");
		servletRegistrationBean.setName("ApiServlet");
		return servletRegistrationBean;
	}
}
