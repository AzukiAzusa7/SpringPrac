package mrs.domain.service.user;

@Service
public class AppUserDetailsService implements UserDetailsService{
	@Autowired
	UserRepository userReporitory;
	
	@Override
	public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException{
		Optional<User> user = userRepository.findById(userId);
		user.orElseThrow(() -> new UsernameNotFoundException("User Not Found:" + username));
		return user.map(AppUserDetails::new).get();
	}
}