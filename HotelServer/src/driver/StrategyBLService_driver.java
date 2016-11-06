package driver;

import businesslogicsevice.ResultMessage;
import businesslogicsevice.StrategyBLService;
import vo.HotelStrategyVO;
import vo.WebStrategyVO;

public class StrategyBLService_driver {
	public void drive(StrategyBLService strategyBLService){
		
		//酒店工作人员制定促销策略
		HotelStrategyVO hotelstrategy=strategyBLService.hotelstrategy_make("input");
		System.out.println(hotelstrategy.getname());
		System.out.println(hotelstrategy.getcondition());
		System.out.println(hotelstrategy.getstart_time());
		System.out.println(hotelstrategy.getend_time());
		System.out.println(hotelstrategy.getexecuteway());
		System.out.println(hotelstrategy.getsuperposition());
		
		//酒店工作人员更新销售策略
		ResultMessage result_hotel=strategyBLService.hotelstrategy_update("input");
		if(result_hotel==ResultMessage.Success){
			System.out.println("更新成功");
		}
		else{
			System.out.println("更新失败");
		}
		
		//网站营销人员制定促销策略
		WebStrategyVO webstrategy=strategyBLService.webstrategy_make("input");
		System.out.println(webstrategy.getname());
		System.out.println(webstrategy.getcondition());
		System.out.println(webstrategy.getstart_time());
		System.out.println(webstrategy.getend_time());
		System.out.println(webstrategy.getexecuteway());
		System.out.println(webstrategy.getsuperposition());
		
		//网站营销人员更新促销策略
		ResultMessage result_web=strategyBLService.hotelstrategy_update("input");
		if(result_web==ResultMessage.Success){
			System.out.println("更新成功");
		}
		else{
			System.out.println("更新失败");
		}
	}
}
