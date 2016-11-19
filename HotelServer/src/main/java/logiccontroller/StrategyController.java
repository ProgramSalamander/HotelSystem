package logiccontroller;

import java.util.ArrayList;
import vo.*;
import service.blservice.*;
import objects.*;



 public class StrategyController implements StrategyBLService{
	//�Ƶ������Ϣ
		String hotelname="��ҵ���";
		String hotelcondition="��";
		String hotelstart_time="2016-10-14-0:00";
		String hotelend_time="2016-10-20-0:00";
		String hotelexecuteway="����";
		boolean hotelsuperposition=false;
		
 //��վ������Ϣ
    String webname="��ҵ���";
	String webcondition="��";
	String webstart_time="2016-10-14-0:00";
	String webend_time="2016-10-20-0:00";
	String webexecuteway="����";
	boolean websuperposition=false;
	
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
		HotelStrategy hs=new HotelStrategy();
		ArrayList<HotelStrategy> hotelStrategy = new ArrayList<HotelStrategy>();
		hotelStrategy.add(hs);
		return hotelStrategy;
	}
	@Override
	public ArrayList<WebStrategy> getStrategy(int clientid) {
		// TODO Auto-generated method stub
		WebStrategy ws=new WebStrategy();
		ArrayList<WebStrategy> webStrategy = new ArrayList<WebStrategy>();
		webStrategy.add(ws);
		return webStrategy;
	}
}
