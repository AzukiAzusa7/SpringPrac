package mrs.app.index;
//https://medium-company.com/category/work/development/java/
@Controller
public class LoginController{
	@RequestMapping("login")
	String loginForm(){
		return "login/login";
	}
	//@RequestMapping("logout")
}