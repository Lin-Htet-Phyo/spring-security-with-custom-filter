package com.example.springsecuritymaster12102022.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.hierarchicalroles.RoleHierarchy;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.access.expression.DefaultWebSecurityExpressionHandler;

import static com.example.springsecuritymaster12102022.security.SecurityRole.*;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig1 {

//    @Autowired
//    private RoleHierarchy roleHierarchy;
//
//    @Bean
//    public UserDetailsService userDetailsService() {
//
//        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
//        var uds = new InMemoryUserDetailsManager();
//        var john = User.withUsername("john")
//                .password(encoder.encode("password"))
//                .roles(SUPER_ADMIN)
//                .build();
//        var emma = User.withUsername("emma")
//                .password(encoder.encode("password"))
//                .roles(EMPLOYEES_ADMIN)
//                .build();
//        var william = User.withUsername("william")
//                .password(encoder.encode("password"))
//                .roles(DEPARTMENT_CREATE, DEPARTMENT_PAGE_VIEW,DEPARTMENT_READ)
//                .build();
//        var lucas = User.withUsername("lucas")
//                .password(encoder.encode("password"))
//                .roles(CUSTOMERS_READ, CUSTOMERS_PAGE_VIEW)
//                .build();
//        var tom = User.withUsername("tom")
//                .password(encoder.encode("password"))
//                .roles()
//                .build();
//
//        uds.createUser(john);
//        uds.createUser(emma);
//        uds.createUser(william);
//        uds.createUser(lucas);
//        uds.createUser(tom);
//
//        return uds;
//    }
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http.formLogin();
//
//        http.authorizeRequests()
//                .requestMatchers("/bootstrap/**").permitAll()
//                .anyRequest()
//                .permitAll();
//        return http.build();
//    }
//
//    private DefaultWebSecurityExpressionHandler expressionHandler() {
//        DefaultWebSecurityExpressionHandler expressionHandler = new DefaultWebSecurityExpressionHandler();
//        expressionHandler.setRoleHierarchy(roleHierarchy);
//        return expressionHandler;
//    }
}
