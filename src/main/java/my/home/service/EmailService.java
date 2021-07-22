package my.home.service;

import java.util.HashMap;

import javax.servlet.http.HttpServletResponse;

public class EmailService {
	//이메일발송
	public void sendEmail(HashMap<String, Object> vo, String div) throws Exception;

	//비밀번호찾기
	public void findPw(HttpServletResponse resp, HashMap<String, Object> vo) throws Exception;
}
