
package service.dataservice;

import po.*;
import objects.*;
public interface ClientDataService {
	//����id���Ҷ�Ӧ�Ŀͻ�
	public ClientPO find(int clientid);
	
	//��ӿͻ�
	public ResultMessage insert(ClientPO po);
	
	//���¿ͻ���Ϣ
	public ResultMessage update(ClientPO po);
	
	//ɾ���ͻ�
	public ResultMessage delete(ClientPO po);
	
	//���¿ͻ�����ֵ
	public ResultMessage updateCredit(ClientPO po);
}

