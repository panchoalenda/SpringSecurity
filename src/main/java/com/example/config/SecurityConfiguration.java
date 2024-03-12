package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
          .csrf(AbstractHttpConfigurer::disable) //.csrf((csrf)->csrf.disable()) -> es lo mismo
          .authorizeHttpRequests((auth)->auth
            .requestMatchers(HttpMethod.GET,"/v1/index2") //Acá coloco todos los que no van a necesitar una autorización

          )
          .build();
    }

}