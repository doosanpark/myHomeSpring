package my.home.dao.impl;

import java.util.HashMap;

public class EmailDaoImpl {
	//비밀번호변경
	@Override
	public int updatePw(HashMap<String, Object> vo) throws Exception {
		return sqlSession.update(namespace+".updatePw", vo);
	}
}
