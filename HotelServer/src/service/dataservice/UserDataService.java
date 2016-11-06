package service.dataservice;

import java.util.ArrayList;

import PO.UserPO;
import businesslogicsevice.ResultMessage;

public interface UserDataService {
	
	//����id��ѯ��Ӧuser
	public UserPO find (String name) ;
	
	//����û�
	public ResultMessage insert(UserPO po);
	
	//�����û�
	public ResultMessage update(UserPO po);
	
	//ɾ���û�
	public ResultMessage delete(UserPO po);
	
	
	//��ѯ������վ������Ա
	public ArrayList<UserPO> showUsers();
}
