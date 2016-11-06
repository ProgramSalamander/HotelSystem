package service;

import Objects.ResultMessage;

public interface UserBLService {
	//提供给界面调用的接口
	public ResultMessage login(String username,String password);
	
	public ResultMessage regist(String username,String password);
}
