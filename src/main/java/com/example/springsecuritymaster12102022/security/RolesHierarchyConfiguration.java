package com.example.springsecuritymaster12102022.security;

import com.example.springsecuritymaster12102022.security.util.RolesHierarchyBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.hierarchicalroles.RoleHierarchy;
import org.springframework.security.access.hierarchicalroles.RoleHierarchyImpl;

import static com.example.springsecuritymaster12102022.security.SecurityRole.*;

@Configuration
public class RolesHierarchyConfiguration {

    @Bean
    public RoleHierarchy roleHierarchy() {
        RoleHierarchyImpl roleHierarchy = new RoleHierarchyImpl();
        roleHierarchy.setHierarchy(
                new RolesHierarchyBuilder()
                        .append(SUPER_ADMIN, CUSTOMERS_ADMIN)
                        .append(CUSTOMERS_ADMIN, CUSTOMERS_CREATE)
                        .append(CUSTOMERS_ADMIN, CUSTOMERS_READ)
                        .append(CUSTOMERS_ADMIN, CUSTOMERS_DELETE)
                        .build()
        );
        return roleHierarchy;
    }

}
