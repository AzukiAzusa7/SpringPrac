package src.domain.service.user;

@Service
@Transactional(rollbackOn = Exception.class)
public class UserService{
	@Autowired
	private UserRepository userRepository;
	//
	public User findById(String userId){
		return userRepository.findById(userId).get();
	}
	//ユーザー情報更新
	public void update(UserUpdateRequest userUpdateRequest){
		UserProfile userProfile = findById(userUpdateRequest.getUserId());
		userProfile.setNickName(userUpdateRequest.getNickName());
		userRepository.save(userProfile);
	}
}
