package service;

import java.util.ArrayList;

import Objects.HotelStrategy;
import Objects.ResultMessage;
import Objects.WebStrategy;

public   interface StrategyBLService {
	//提供给界面调用的接口
	
	/**
	 * @param input
	 * @return 
	 */
	public ResultMessage hotelstrategy_make(HotelStrategy strategy);

	public ResultMessage hotelstrategy_update(HotelStrategy strategy);

	public ResultMessage webstrategy_make(WebStrategy strategy);
	
	public ResultMessage webstrategy_update(WebStrategy strategy);
	
	//提供给同层调用的接口
	public ArrayList<HotelStrategy> getStrategy(int hotelid,int clientid);
	
	public ArrayList<WebStrategy> getStrategy(int clientid);
}
