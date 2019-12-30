package com.satya.learningspringsecurity.learningspringsecurity.config;
//package com.satya.learningspringsecurity.learningspringsecurity;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@EnableWebSecurity
//public class SecurityConfigInMemory extends WebSecurityConfigurerAdapter {
//
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//			auth.inMemoryAuthentication().withUser("user")
//					.password("$2y$12$2jZttJgcfEBL09021EktnOjQoSUCWGNO5zlFSJs/omzA/DdAV5TXq")
//					.roles("USER_ROLE")
//					.and()
//					.withUser("admin")
//					.password("$2y$12$jdp0Vh2LKyq2zhZEi1RvYegXWI6ahT2zO73EpuKfqw.lPUSJkf/We")
//					.roles("ADMIN_ROLE");
//	}
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests()
//								.antMatchers("//h2-console/**").hasRole("ADMIN")
//								.antMatchers("/admin").hasRole("ADMIN")
//								.antMatchers("/user").hasAnyRole("ADMIN", "USER")
//								.antMatchers("/").permitAll()
//								.and().formLogin()
//								.and().csrf().ignoringAntMatchers("/h2-console/**")//don't apply CSRF protection to /h2-console
//				                .and().headers().frameOptions().sameOrigin();//allow use of frame to same origin urls
//	}
//
//	@Bean
//	public PasswordEncoder getPasswordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
//}
