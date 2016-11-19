
package service.dataservice;

import po.*;
import objects.*;

public interface ManageDataService {
	//����id������վӪ����Ա
	public WebMarketPO findWebMarket(String WebMarketname);
	
	//�����վӪ����Ա
	public ResultMessage insertWebMarket(WebMarketPO po);
	
	//������վӪ����Ա��Ϣ
	public ResultMessage updateWebMarket(WebMarketPO po);
	
	//ɾ����վӪ����Ա
	public ResultMessage deleteWebMarket(WebMarketPO po);
	
	//����id������վ������Ա
	public WebManagerPO findWebManager(String WebMangername);
	
	//�����վ������Ա
	public ResultMessage insertWebManager(WebManagerPO po);
	
	//������վ������Ա��Ϣ
	public ResultMessage updateWebManager(WebManagerPO po);
	
	//ɾ����վ������Ա
	public ResultMessage deleteWebManager(WebManagerPO po);
	
}

