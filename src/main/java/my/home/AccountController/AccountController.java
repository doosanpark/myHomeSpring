package my.home.AccountController;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import my.home.AccountDao.AccountMapper;

@Controller
@RequestMapping(value="account")
@CrossOrigin(origins = "http://localhost:3000")
public class AccountController {
	
	@Autowired
	private AccountMapper mapper;
	
	@RequestMapping(value="login")
	public @ResponseBody String login() {
		return "login";
	}
	
	@RequestMapping("listmap")
	public @ResponseBody String listmap(@RequestParam HashMap<String, Object> paramMap) {
		
		int resultVal = mapper.selAccntExist(paramMap);
		Gson gson = new Gson();
		return gson.toJson(resultVal);
	}
}
