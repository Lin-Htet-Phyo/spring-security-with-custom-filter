package com.example.springsecuritywithcustomfilter14102022.security.annotation.departments;

import org.springframework.security.access.annotation.Secured;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static com.example.springsecuritywithcustomfilter14102022.security.SecurityRoles.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Secured(ROLES_PREFIX + DEPARTMENTS_DELETE)
public @interface IsDepartmentsDelete {
}
