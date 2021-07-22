package my.home.AccountController;

import java.util.HashMap;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="email", method=RequestMethod.POST)
public class EmailController {
	/* 비밀번호 찾기 */
	@RequestMapping(value = "/findpw", method = RequestMethod.GET)
	public void findPwGET() throws Exception{
	}

	@RequestMapping(value = "/findpw", method = RequestMethod.POST)
	public void findPwPOST(@ModelAttribute HashMap<String, Object> member, HttpServletResponse response) throws Exception{
		service.findPw(response, member);
	}
}
