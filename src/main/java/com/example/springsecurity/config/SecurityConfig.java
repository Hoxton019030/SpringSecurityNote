package com.example.springsecurity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author Avaruus Studios
 * @name SecurityConfig
 * @date 2022/8/23
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    protected void configure(HttpSecurity http) {
        try {
            http.authorizeHttpRequests()
                    .antMatchers(HttpMethod.GET, "/users/**").authenticated().
                    antMatchers(HttpMethod.GET).permitAll().
                    antMatchers(HttpMethod.POST, "/users").permitAll().
                    anyRequest().authenticated()
                    .and()
                    .csrf().disable()
                    .formLogin();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
