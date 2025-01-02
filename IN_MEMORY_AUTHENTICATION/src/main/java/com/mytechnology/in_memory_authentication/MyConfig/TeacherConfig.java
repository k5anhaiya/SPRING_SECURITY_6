package com.mytechnology.in_memory_authentication.MyConfig;


import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import java.security.PublicKey;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity(prePostEnabled = true)
public class TeacherConfig {
    @Bean
    public UserDetailsService userDetailsService(){
        UserDetails user1= User.builder().username("kanhaiya").password(passwordEncoder().encode("kanha")).roles("ADMIN").build();
        UserDetails user2= User.builder().username("manish").password(passwordEncoder().encode("mkmk")).roles("USER").build();
        UserDetails user4= User.builder().username("raja").password(passwordEncoder().encode("rkrk")).roles("USER").build();
        UserDetails user5= User.builder().username("raushan").password(passwordEncoder().encode("raushan")).roles("USER").build();
        UserDetails user6= User.builder().username("rajan").password(passwordEncoder().encode("rajan")).roles("USER").build();
        return new InMemoryUserDetailsManager(user1,user2,user4,user5,user6);
    }
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    SecurityFilterChain SecurityfilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests((requests) -> requests.anyRequest().authenticated());
        http.formLogin(withDefaults());
        http.httpBasic(withDefaults());
        return http.build();
    }
}
