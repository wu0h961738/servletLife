package com.presentation.servletPrac.filter;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
public class TattooFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;
        httpRequest.setAttribute("filter", "filter驗證完嚕");
        HttpServletResponse httpResponse = (HttpServletResponse) servletResponse;
        httpResponse.reset();
        httpResponse.setHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
        httpResponse.getWriter()
                .print(new ObjectMapper()
                        .writeValueAsString("response went through filter"));
        httpResponse.getWriter().flush();
        log.info("do filter");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
