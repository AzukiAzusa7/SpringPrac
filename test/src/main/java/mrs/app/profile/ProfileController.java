package mrs.app;

@Controller
public class IndexController{
	@Autowired
	UserService userService;
	
	@RequestMapping("profile/{userId}")
	public String viewProfile(@PathVariable String userId,Model model){
		UserProfile userProfile = userService.findById(userId).get().getUserProfile();
		model.addAttrubute("userRequest",userProfile);
		return "profile/profile";
	}
	@RequestMapping(value = "profile/{userId}/update",method=RequestMethod.POST)
	public String update(@PathVariable String userId,@Validated @ModelAttribute UserUpdateRequest userUpdateRequest,BindingResult result,Model model){
		if(result.hasErrors()){
			List<String> errorList = result.getAllErrors().stream().map(e -> e.getDefaultMessage()).collect(Collectors.toList());
			model.addAttribute("validationError",errorList);
			return "profile/{userId}";
		}
		userService.update(userUpdateRequest);
		return "redirect:/profile/{userId}";
	}
}