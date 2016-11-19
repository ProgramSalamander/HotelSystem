package service.dataservice;

import java.util.ArrayList;

import po.*;
import objects.*;

public interface StrategyDataService {
	//���ݾƵ�name���Ҷ�Ӧ�Ƶ����
	public HotelStrategyPO find_hotel(String name) ;
	
	//��ӾƵ����
	public ResultMessage insert_hotel(HotelStrategyPO po);
	
	//ɾ���Ƶ����
	public ResultMessage delete_hotel(HotelStrategyPO po);
	
	//���¾Ƶ����
	public ResultMessage update_hotel(HotelStrategyPO po);
	
	//�鿴�Ƶ�����б�
	public ArrayList<HotelStrategyPO> showlist_hotel() ;
	
	//��ѯ��վ����
	public WebStrategyPO find_web(String name);
	
	//�����վ����
	public ResultMessage insert_web(WebStrategyPO po);
	
	//ɾ����վ����
	public ResultMessage delete_web(WebStrategyPO po);
	
	//������վ����
	public ResultMessage update_web(WebStrategyPO po);
	
	//�鿴��վ�����б�
	public ArrayList<WebStrategyPO> showlist_web();
}
