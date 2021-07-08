package com.presentation.servletPrac.config;

import com.presentation.servletPrac.filter.TattooFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanRegisterConfig {
    @Bean
    public FilterRegistrationBean filterRegistration(){
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new TattooFilter());
        registrationBean.setName("TattooFilter");
        registrationBean.addUrlPatterns("/handle/tattoo"); //只攔截該方法
        registrationBean.setOrder(1); //數字越小越優先
        return registrationBean;
    }

}
