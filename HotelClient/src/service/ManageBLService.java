package service;

import Objects.ResultMessage;
import vo.ClientVO;
import vo.HotelWorkerVO;
import vo.WebMarketVO;

public interface ManageBLService {
	//提供给界面调用的接口
	public ClientVO manage_searchClient(int clientid);
	
	public ResultMessage manage_updateClient(int clientid);
	
	public ResultMessage manage_addHotel(int hotelid);
	
	public ResultMessage manage_addHotelWorker(int hotelid,HotelWorkerVO w);
	
	public HotelWorkerVO manage_searchHotelWorker(int hotelid);
	
	public ResultMessage manage_updateHotelWorker(int hotelid);
	
	public ResultMessage manage_addMarketWorker(WebMarketVO mw);
	
	public WebMarketVO manage_searchMarketWorker(int marketWorkerid);
	
	public ResultMessage manage_updateMarketWorker(WebMarketVO mw);
	
}
