
package service.dataservice;

import java.util.ArrayList;
import po.*;
import objects.*;

public interface HotelDataService {
	//根据酒店名查找酒店
	public HotelPO find(String hotelname);
	
	//添加酒店
	public ResultMessage insert(HotelPO po);
	
	//更新酒店基本信息
	public ResultMessage update(HotelPO po);
	
	//删除酒店
	public ResultMessage delete(HotelPO po);
	
	//返回所有被对应客户预订过的酒店
	public ArrayList<HotelPO> showClientHotels(int clientid);
	
	//返回对应酒店的工作人员
	public HotelWorkerPO findHotelWorker(String hotelname);
	
	//添加对应酒店的工作人员
	public ResultMessage insertHotelWorker(String hotelname,HotelWorkerPO po);
	
	//更新对应酒店的工作人员信息
	public ResultMessage updateHotelWorker(String hotelname,HotelWorkerPO po);
	
	//删除对应酒店的工作人员
	public ResultMessage deleteHotelWorker(String hotelname,HotelWorkerPO po);
	
}

