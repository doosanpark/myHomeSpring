package my.home.AccountDao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountMapper {
	public int selAccntExist(HashMap<String, Object> paramMap);
}	