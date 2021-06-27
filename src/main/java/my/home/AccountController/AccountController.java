package my.home.AccountController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="account")
public class AccountController {
	@RequestMapping(value="login")
	public @ResponseBody String login() {
		return "login";
	}
}
