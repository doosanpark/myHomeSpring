package my.home.AccountController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import my.home.AccountDao.AccountMapper;

@Controller
@RequestMapping(value="account", method=RequestMethod.POST)
@CrossOrigin(origins = "http://localhost:3000")
public class AccountController {
	
	@Autowired
	private AccountMapper mapper;
	
	@RequestMapping(value="login")
	public @ResponseBody String login() {
		return "login";
	}
	
	@PostMapping( value = "/selAccntExist")
	public @ResponseBody Map<String, Object> selAccntExist(@RequestBody HashMap<String, Object> paramMap) {
		Map<String, Object> retVal = new HashMap<>();
		System.out.println("paramMap :::: " + paramMap);
		int resultVal = mapper.selAccntExist(paramMap);
		System.out.println("resultVal :::: " + resultVal);
		retVal.put("result", resultVal);
		return  retVal;
	}
}
