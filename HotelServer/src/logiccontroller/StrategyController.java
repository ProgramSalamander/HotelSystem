package logiccontroller;

import java.util.ArrayList;
import vo.*;
import service.blservice.*;
import objects.*;



 public class StrategyController implements StrategyBLService{
	//酒店策略信息
		String hotelname="开业酬宾";
		String hotelcondition="无";
		String hotelstart_time="2016-10-14-0:00";
		String hotelend_time="2016-10-20-0:00";
		String hotelexecuteway="九折";
		boolean hotelsuperposition=false;
		
 //网站策略信息
    String webname="开业酬宾";
	String webcondition="无";
	String webstart_time="2016-10-14-0:00";
	String webend_time="2016-10-20-0:00";
	String webexecuteway="九折";
	boolean websuperposition=false;
	
	//酒店工作人员制定促销策略
	public HotelStrategyVO hotelstrategy_make(String input){
		HotelStrategyVO hotelstrategy=new HotelStrategyVO(hotelname,hotelcondition,hotelstart_time,hotelend_time,hotelexecuteway,hotelsuperposition);
		return hotelstrategy;
	}
	//酒店工作人员更新销售策略
	public ResultMessage hotelstrategy_update(String input){
		if(input!=null){
			return ResultMessage.Success;
			}
			else{
				return ResultMessage.Fail;
			}
	}
	//网站营销人员制定销售策略
	public WebStrategyVO webstrategy_make(String input){
		WebStrategyVO webstrategy=new WebStrategyVO(webname,webcondition,webstart_time,webend_time,webexecuteway,websuperposition);
		return webstrategy;
	}
	//网站营销人员更新销售策略
	public ResultMessage webstrategy_update(String input){
		if(input!=null){
			return ResultMessage.Success;
			}
			else{
				return ResultMessage.Fail;
			}
	}
	@Override
	public ResultMessage hotelstrategy_make(HotelStrategy strategy) {
		// TODO Auto-generated method stub
		if(strategy!=null){
			return ResultMessage.Success;
			}
			else{
				return ResultMessage.Fail;
			}
	}
	@Override
	public ResultMessage hotelstrategy_update(HotelStrategy strategy) {
		// TODO Auto-generated method stub
		if(strategy!=null){
			return ResultMessage.Success;
			}
			else{
				return ResultMessage.Fail;
			}
	}
	@Override
	public ResultMessage webstrategy_make(WebStrategy strategy) {
		// TODO Auto-generated method stub
		if(strategy!=null){
			return ResultMessage.Success;
			}
			else{
				return ResultMessage.Fail;
			}
	}
	@Override
	public ResultMessage webstrategy_update(WebStrategy strategy) {
		// TODO Auto-generated method stub
		if(strategy!=null){
			return ResultMessage.Success;
			}
			else{
				return ResultMessage.Fail;
			}
	}
	@Override
	public ArrayList<HotelStrategy> getStrategy(int hotelid, int clientid) {
		// TODO Auto-generated method stub
		HotelStrategy hs=new HotelStrategy("开业酬宾","无","2016-10-14-0:00","2016-10-20-0:00","九折",false);
		ArrayList<HotelStrategy> hotelStrategy = new ArrayList<HotelStrategy>();
		hotelStrategy.add(hs);
		return hotelStrategy;
	}
	@Override
	public ArrayList<WebStrategy> getStrategy(int clientid) {
		// TODO Auto-generated method stub
		WebStrategy ws=new WebStrategy("开业酬宾","无","2016-10-14-0:00","2016-10-20-0:00","九折",false);
		ArrayList<WebStrategy> webStrategy = new ArrayList<WebStrategy>();
		webStrategy.add(ws);
		return webStrategy;
	}
}
