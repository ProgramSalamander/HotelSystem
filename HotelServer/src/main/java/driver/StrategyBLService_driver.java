package driver;

import java.util.ArrayList;
import vo.*;
import service.*;
import service.blservice.*;
import objects.*;

public class StrategyBLService_driver {
	public void drive(StrategyBLService strategyBLService){
		
		HotelStrategy hs=new HotelStrategy();
		//�Ƶ깤����Ա�ƶ���������
		ResultMessage hotelstrategy=strategyBLService.hotelstrategy_make(hs);
//		System.out.println(hotelstrategy.getname());
//		System.out.println(hotelstrategy.getcondition());
//		System.out.println(hotelstrategy.getstart_time());
//		System.out.println(hotelstrategy.getend_time());
//		System.out.println(hotelstrategy.getexecuteway());
//		System.out.println(hotelstrategy.getsuperposition());
//		
		//�Ƶ깤����Ա�������۲���
		ResultMessage result_hotel=strategyBLService.hotelstrategy_update(hs);
		if(result_hotel==ResultMessage.Success){
			System.out.println("���³ɹ�");
		}
		else{
			System.out.println("����ʧ��");
		}
		
		//��վӪ����Ա�ƶ���������
		WebStrategy ws=new WebStrategy();
		ResultMessage webstrategy=strategyBLService.webstrategy_make(ws);
//		System.out.println(webstrategy.getname());
//		System.out.println(webstrategy.getcondition());
//		System.out.println(webstrategy.getstart_time());
//		System.out.println(webstrategy.getend_time());
//		System.out.println(webstrategy.getexecuteway());
//		System.out.println(webstrategy.getsuperposition());
		
		//��վӪ����Ա���´�������
		ResultMessage result_web=strategyBLService.webstrategy_update(ws);
		if(result_web==ResultMessage.Success){
			System.out.println("���³ɹ�");
		}
		else{
			System.out.println("����ʧ��");
		}
	}
}
