package mrs.app.index;

@Controller
public class LoginController{
	@Autowired
	UserService userService;
	
	@GetMapping("signup")
	String signupForm(){
		return "signup/signup";
	}
	@PostMapping("signup")
	public String create(@Validated @ModelAttribute UserRequest userRequest,BindingResult result,Model model){
		if(result.hasErrors()){
			return "signup";
		}
		userService.create(userRequest);
		return "redirect:/index";
	}
}