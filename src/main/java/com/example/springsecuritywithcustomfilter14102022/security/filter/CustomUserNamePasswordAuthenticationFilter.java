package com.example.springsecuritywithcustomfilter14102022.security.filter;

import com.example.springsecuritywithcustomfilter14102022.security.SecurityRoles;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.GenericFilterBean;

import java.io.IOException;
import java.util.Collections;

//http://localhost:8080/customers?X-AUTH-TOKEN=SECRET_AUTH_TOKEN_ADMIN

public class CustomUserNamePasswordAuthenticationFilter extends GenericFilterBean {

    private static final String SECRET_AUTH_TOKEN_ADMIN = "SECRET_AUTH_TOKEN_ADMIN";

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        SecurityContext securityContext = SecurityContextHolder.getContext();

        if (SECRET_AUTH_TOKEN_ADMIN.equals(servletRequest
                .getParameter("X-AUTH-TOKEN")) && securityContext != null) {
            securityContext.setAuthentication(
                    new AnonymousAuthenticationToken(
                            "x-auth",
                            "x-admin",
                            Collections.singletonList(
                                    new SimpleGrantedAuthority(SecurityRoles.ROLES_PREFIX +
                                            SecurityRoles.SUPER_ADMIN)
                            )
                    )
            );
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }
}
