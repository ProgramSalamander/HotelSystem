package service;

import Objects.ResultMessage;

public interface UserBLService {
	//�ṩ��������õĽӿ�
	public ResultMessage login(String username,String password);
	
	public ResultMessage regist(String username,String password);
}
