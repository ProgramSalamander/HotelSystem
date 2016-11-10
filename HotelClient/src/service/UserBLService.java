package service;

import objects.*;

public interface UserBLService {
	// 提供给界面调用的接口
	/**
	 * @param username
	 * @param password
	 * @return 用户登录
	 */
	public ResultMessage login(String username, String password);

	/**
	 * @param username
	 * @param password
	 * @return 用户注册
	 */
	public ResultMessage register(String username, String password);
}
