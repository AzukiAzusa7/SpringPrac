package mrs.app;

@Controller
public class IndexController{
	@Autowired
	UserService userService;
	
	@RequestMapping("index")
	String indexForm(User user,Model model){
		UserProfile userProfile = userService.findById(user.get).get().getUserProfile();
		model.addAttribute("userProfile",userProfile);
		return "index";
	}
}