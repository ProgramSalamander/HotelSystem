package service.blservice;

import objects.*;
public interface UserBLService {
	// �ṩ��������õĽӿ�
	/**
	 * @param username
	 * @param password
	 * @return �û���¼
	 */
	public ResultMessage login(String username, String password);

	/**
	 * @param username
	 * @param password
	 * @return �û�ע��
	 */
	public ResultMessage register(String username, String password);
}