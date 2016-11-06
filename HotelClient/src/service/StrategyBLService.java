package service;

import java.util.ArrayList;

import Objects.HotelStrategy;
import Objects.ResultMessage;
import Objects.WebStrategy;

public   interface StrategyBLService {
	//�ṩ��������õĽӿ�
	
	/**
	 * @param input
	 * @return 
	 */
	public ResultMessage hotelstrategy_make(HotelStrategy strategy);

	public ResultMessage hotelstrategy_update(HotelStrategy strategy);

	public ResultMessage webstrategy_make(WebStrategy strategy);
	
	public ResultMessage webstrategy_update(WebStrategy strategy);
	
	//�ṩ��ͬ����õĽӿ�
	public ArrayList<HotelStrategy> getStrategy(int hotelid,int clientid);
	
	public ArrayList<WebStrategy> getStrategy(int clientid);
}
