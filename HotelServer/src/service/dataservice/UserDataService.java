package service.dataservice;

import java.util.ArrayList;

import po.*;
import objects.*;

public interface UserDataService {
	
	//根据id查询对应user
	public UserPO find (String name) ;
	
	//添加用户
	public ResultMessage insert(UserPO po);
	
	//更新用户
	public ResultMessage update(UserPO po);
	
	//删除用户
	public ResultMessage delete(UserPO po);
	
	
	//查询所有网站工作人员
	public ArrayList<UserPO> showUsers();
}
