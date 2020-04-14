package mrs.app.index;

@Controller
public class LoginController{
	@RequestMapping("login")
	String indexForm(){
		return "login/login";
	}
}