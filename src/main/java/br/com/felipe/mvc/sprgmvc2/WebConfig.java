package br.com.felipe.mvc.sprgmvc2;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import br.com.felipe.mvc.sprgmvc2.interceptor.InterceptadorDeAcessos;

@Configuration
public class WebConfig extends WebMvcConfigurationSupport{

	@Override
	protected void addInterceptors(InterceptorRegistry registry) {
	
		registry.addInterceptor(new InterceptadorDeAcessos()).addPathPatterns("/**");
	}
}
