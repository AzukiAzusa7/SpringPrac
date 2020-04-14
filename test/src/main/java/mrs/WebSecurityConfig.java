package mrs;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecuritConfigurerAdapter{
	@Autowired
	AppUserDetailsService userDetailsService;

	@Bean
	passwordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/js/**", "/css/**").permitAll().antMatchers("/**").authenticated().and()
				.formLogin().loginPage("/login").loginProcessingUrl("/login").usernameParameter("username")
				.passwordParameter("password").defaultSuccessUrl("/index", true).failureUrl("/login?error=true")
				.permitAll();
	}
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
	}
