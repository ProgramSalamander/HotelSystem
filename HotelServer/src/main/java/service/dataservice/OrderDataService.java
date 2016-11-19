package service.dataservice;

import java.util.ArrayList;

import po.*;
import objects.*;

public interface OrderDataService {
	//���ݶ���id���Ҷ�Ӧ����
	public OrderPO find (int id) ;
	
	//���ݾƵ�name���Ҷ�Ӧ�����б�
	public ArrayList<OrderPO> find (String name) ;
	
	//��Ӷ���
	public ResultMessage insert(OrderPO po);
	
	//ɾ������
	public ResultMessage delete(OrderPO po);
	
	//���¶���
	public ResultMessage update(OrderPO po);
	
}
