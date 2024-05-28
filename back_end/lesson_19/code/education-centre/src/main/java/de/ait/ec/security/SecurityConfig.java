package de.ait.ec.security;

import de.ait.ec.models.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    SecurityFilterChain web(HttpSecurity http) throws Exception{
        http.httpBasic(Customizer.withDefaults());
        http.csrf(csrf -> csrf.disable());
        http.authorizeHttpRequests(authorize -> authorize
             //   .anyRequest().permitAll());
             //     .anyRequest().authenticated());
                .requestMatchers("/api/users/register/**").permitAll()
                .requestMatchers(HttpMethod.POST,"/api/courses/**").hasRole(User.Role.ADMIN.toString())
                .requestMatchers(HttpMethod.PUT,"/api/courses/{course-id}").hasRole(User.Role.ADMIN.toString())
                .requestMatchers(HttpMethod.DELETE,"/api/courses/{course-id}").hasRole(User.Role.ADMIN.toString())
                .requestMatchers(HttpMethod.GET,"/hello").permitAll()
                .anyRequest().authenticated());



        return http.build();
    }


}
