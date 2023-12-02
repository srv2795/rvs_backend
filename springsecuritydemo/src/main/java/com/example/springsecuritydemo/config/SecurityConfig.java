package com.example.springsecuritydemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableMethodSecurity
public class SecurityConfig {

    //Basic authentication service
    @Bean
    public SecurityFilterChain getSecurityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.csrf(Customizer.withDefaults())
                .authorizeHttpRequests(auth -> auth.anyRequest()
                        .authenticated())
                .httpBasic(Customizer.withDefaults());

        return httpSecurity.build();
    }

    // In memory authentication service
    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails user1 = User.builder().username("ashu")
                .password(passwordEncoder().encode("1234")).roles("USER").build();
        UserDetails user2 = User.builder().username("chetan")
                .password(passwordEncoder().encode("6789")).roles("ADMIN").build();

        return new InMemoryUserDetailsManager(user1, user2);
    }

    @Bean
    public static PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
