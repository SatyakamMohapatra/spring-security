package com.satya.learningspringsecurity.learningspringsecurity.config;
//package com.satya.learningspringsecurity.learningspringsecurity;
//
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@EnableWebSecurity
//public class SecurityConfigJDBC extends WebSecurityConfigurerAdapter {
//
//	@Autowired
//	private DataSource dataSource;
//
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.jdbcAuthentication()
//					.dataSource(dataSource)
//					.usersByUsernameQuery("select username,password,enabled from users where username = ?")
//					.authoritiesByUsernameQuery("select username,authority from authorities where username = ?");
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
