package service.dataservice;

import java.util.ArrayList;

import PO.HotelStrategyPO;
import PO.WebStrategyPO;
import businesslogicsevice.ResultMessage;

public interface StrategyDataService {
	//根据酒店name查找对应酒店策略
	public HotelStrategyPO find_hotel(String name) ;
	
	//添加酒店策略
	public ResultMessage insert_hotel(HotelStrategyPO po);
	
	//删除酒店策略
	public ResultMessage delete_hotel(HotelStrategyPO po);
	
	//更新酒店策略
	public ResultMessage update_hotel(HotelStrategyPO po);
	
	//查看酒店策略列表
	public ArrayList<HotelStrategyPO> showlist_hotel() ;
	
	//查询网站策略
	public WebStrategyPO find_web(String name);
	
	//添加网站策略
	public ResultMessage insert_web(WebStrategyPO po);
	
	//删除网站策略
	public ResultMessage delete_web(WebStrategyPO po);
	
	//更新网站策略
	public ResultMessage update_web(WebStrategyPO po);
	
	//查看网站策略列表
	public ArrayList<WebStrategyPO> showlist_web();
}
