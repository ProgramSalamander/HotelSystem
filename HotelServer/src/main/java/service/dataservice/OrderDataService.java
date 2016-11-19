package service.dataservice;

import java.util.ArrayList;

import po.*;
import objects.*;

public interface OrderDataService {
	//根据订单id查找对应订单
	public OrderPO find (int id) ;
	
	//根据酒店name查找对应订单列表
	public ArrayList<OrderPO> find (String name) ;
	
	//添加订单
	public ResultMessage insert(OrderPO po);
	
	//删除订单
	public ResultMessage delete(OrderPO po);
	
	//更新订单
	public ResultMessage update(OrderPO po);
	
}
