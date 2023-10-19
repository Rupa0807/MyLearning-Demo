package com.rupa.RestJpa.security;

import jakarta.servlet.Filter;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

@Configuration
public class DemoSecurityConfig {

    @Bean
    public UserDetailsManager user(DataSource dataSource) throws SQLException {
       // dataSource.getConnection("springstudent","springstudent");
        return new JdbcUserDetailsManager(dataSource);
    }
    /*public InMemoryUserDetailsManager userdetails(){
        UserDetails Rupa= User.builder().username("Rupa").password("{noop}1234").roles("EMPLOYEE").build();
        UserDetails Shrivas= User.builder().username("Shrivas").password("{noop}1234").roles("EMPLOYEE","MANAGER").build();
        UserDetails Sarvesh= User.builder().username("Sarvesh").password("{noop}1234").roles("MANAGER","EMPLOYEE","ADMIN").build();

     return new InMemoryUserDetailsManager(Rupa,Shrivas,Sarvesh);}

*/
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {


     /*  http.authorizeHttpRequests(i->i.requestMatchers(HttpMethod.GET,"/employee").hasRole("EMPLOYEE")
                       .requestMatchers(HttpMethod.GET,"/employee").hasRole("EMPLOYEE")
                       .requestMatchers(HttpMethod.PUT,"/employee/*").hasRole("MANAGER")
               .requestMatchers(HttpMethod.POST,"/employee").hasRole("ADMIN")
       .requestMatchers(HttpMethod.DELETE,"/employee/*").hasRole("ADMIN"));*/

        http.httpBasic();
        http.csrf().disable();

       return http.build();


    }
}
