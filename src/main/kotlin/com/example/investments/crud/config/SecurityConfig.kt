package com.example.investments.crud.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpMethod
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configurers.oauth2.server.resource.OAuth2ResourceServerConfigurer
import org.springframework.security.web.SecurityFilterChain

@EnableWebSecurity
@Configuration(proxyBeanMethods = false)
class SecurityConfig {

    @Throws(Exception::class)
    @Bean
    fun configure(http: HttpSecurity): SecurityFilterChain =
        http
            .authorizeRequests {
                it
                    .antMatchers(HttpMethod.GET, "/**").hasAuthority("SCOPE_orders.read")
                    .antMatchers(HttpMethod.POST, "/**").hasAuthority("SCOPE_orders.write")
                    .anyRequest().authenticated()
            }
            .oauth2ResourceServer { oauth2: OAuth2ResourceServerConfigurer<HttpSecurity?> -> oauth2.jwt() }
            .build()

}