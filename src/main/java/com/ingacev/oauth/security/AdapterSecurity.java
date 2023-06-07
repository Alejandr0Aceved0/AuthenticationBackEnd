package com.ingacev.oauth.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.HttpStatusEntryPoint;

@Configuration

/*
* En esta clase podemos definir que servicios queremos que sean publicos y cuales privados
*
*/

public class AdapterSecurity extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeHttpRequests()
                .antMatchers("/","/index.html").permitAll() //PERMITE EL ACCESO A LOS ENDPOINT EN /, Y index.html
                .anyRequest().authenticated();

        http.exceptionHandling().authenticationEntryPoint(new HttpStatusEntryPoint(HttpStatus.UNAUTHORIZED)); //Genera excepcion 401
        http.oauth2Login();
        http.logout().logoutSuccessUrl("/index.html").permitAll(); //Cuando haga logout lo redirige a index.html
        http.cors().and().csrf().disable(); //cors permite el acceso desde cualquier cliente, java, kotlin, js, react, etc
    }
}
