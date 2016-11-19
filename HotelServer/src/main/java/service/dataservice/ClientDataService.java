
package service.dataservice;

import po.*;
import objects.*;
public interface ClientDataService {
	//根据id查找对应的客户
	public ClientPO find(int clientid);
	
	//添加客户
	public ResultMessage insert(ClientPO po);
	
	//更新客户信息
	public ResultMessage update(ClientPO po);
	
	//删除客户
	public ResultMessage delete(ClientPO po);
	
	//更新客户信用值
	public ResultMessage updateCredit(ClientPO po);
}

