package com.example.csrfdemo1.filters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.web.csrf.CsrfToken;

import javax.servlet.*;
import java.io.IOException;


public class CsrfTokenLogger implements Filter {

    private Logger logger = LoggerFactory.getLogger(CsrfTokenLogger.class);

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        Object o = request.getAttribute("_csrf");
        CsrfToken token = (CsrfToken) o;
        logger.info("CSRF token " + token.getToken());
        chain.doFilter(request, response);
    }
}