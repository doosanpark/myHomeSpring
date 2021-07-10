package my.home.AccountController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@PostMapping( value = "/listmap",
	        consumes = MediaType.APPLICATION_JSON_VALUE,
	        produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<java.lang.Object> listmap(@RequestParam HashMap<String, Object> paramMap) {
		Map<String, Object> retVal = new HashMap<>();
		int resultVal = mapper.selAccntExist(paramMap);
		retVal.put("result", resultVal);
		return  ResponseEntity.ok(retVal);
	}
}
