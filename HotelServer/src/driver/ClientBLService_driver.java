package driver;
import java.util.ArrayList;
import vo.*;
import service.*;
import service.blservice.*;
import objects.*;
import objects.VIPInfo.VIPType;



public class ClientBLService_driver {

	public void drive(ClientBLService clientBLService){
		
		//测试client_checkInfo
		ClientVO vo = clientBLService.client_checkInfo(1);
		System.out.println(vo.getClient_name());
		System.out.println(vo.getContact());
		System.out.println(vo.getCredit());
		ArrayList<String> list1 = vo.getCredit_record();
		for(String s:list1){
			System.out.println(list1);
		}
		VIPInfo info = vo.getInfo();
		System.out.println(info.getVIPid());
		System.out.println(info.getType());
		if(info.getType()==VIPType.NORMAL){
			System.out.println(info.getBirthday());
		}
		else
			System.out.println(info.getEnterpriseName());

		//测试client_updateInfo
		
		ResultMessage resultMessage = clientBLService.client_updateInfo(vo);
		if(resultMessage==ResultMessage.Success){
			System.out.println("更新客户信息成功");
		}
		else {
			System.out.println("更新客户信息失败");
		}

		//测试client_getpreviousHotelList
		ArrayList<HotelVO> list = clientBLService.client_getpreviousHotelList(1);
		HotelVO vo2 = null;
		if(list.isEmpty()){
			System.out.println("客户未曾预定过酒店");
		}
		else{
			for(int i=0;i<list.size();i++){
				vo2 = list.get(i);
				System.out.println(vo2.getname());
				System.out.println(vo2.getevaluation());
			}
		}

		//测试client_checkCredit
		int credit_record = clientBLService.client_checkCredit(1);
		System.out.println(credit_record);

		//测试client_setLocation
		list = clientBLService.client_setLocation("南京");
		for(int i=0;i<list.size();i++){
			vo2 = list.get(i);
			System.out.println(vo2.getname());
			System.out.println(vo2.getevaluation());
		}

		//测试client_searchHotel
		list = clientBLService.client_searchHotel("condition");
		for(int i=0;i<list.size();i++){
			vo2 = list.get(i);
			System.out.println(vo2.getname());
			System.out.println(vo2.getevaluation());
		}

		//测试client_checkHotelInfo
		vo2 = clientBLService.client_checkHotelInfo(1);
		System.out.println(vo2.getname());
		System.out.println(vo2.getaddress());
		System.out.println(vo2.getbussiness_address());
		System.out.println(vo2.getintroduction());
		System.out.println(vo2.getservice());
		//此处省略一部分输出
		//。。。

		//测试client_evaluateHotel
		Evaluation e=new Evaluation(4.0,"good");
		resultMessage = clientBLService.client_evaluateHotel(e,1);
		if(resultMessage == ResultMessage.Success){
			System.out.println("评价成功");
		}
		else
			System.out.println("评价失败");

		//测试client_enrollVIP
		VIPInfo vip=new VIPInfo(VIPType.NORMAL,1,"2001/1/1");
 		resultMessage = clientBLService.client_enrollVIP(vip,1);
		if(resultMessage == ResultMessage.Success)
			System.out.println("注册会员成功");
		else
			System.out.println("注册会员失败");
	}

}
