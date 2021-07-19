package com.presentation.servletPrac.config;

import com.presentation.servletPrac.interceptor.PaymentValidInterceptor;
import com.presentation.servletPrac.interceptor.DiscountInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        String[] addPathPatterns = {"/**"};
        String[] excludePathPatterns = {};

        //先註冊先贏
        registry.addInterceptor(new PaymentValidInterceptor())
                .addPathPatterns(addPathPatterns)
                .excludePathPatterns(excludePathPatterns);

        registry.addInterceptor(new DiscountInterceptor())
                .addPathPatterns(addPathPatterns)
                .excludePathPatterns(excludePathPatterns);
    }
}
