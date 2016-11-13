package driver;



import java.util.ArrayList;
import vo.*;
import service.*;
import service.blservice.*;
import objects.*;
import objects.VIPInfo.VIPType;



public class ManageBLService_driver {

	public void drive(ManageBLService manageBLService){

		//测试manage_searchClient
		ClientVO vo = manageBLService.manage_searchClient(1);
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

		

		//测试manage_updateClient
		ArrayList<String> credit_record = new ArrayList<String>();
		VIPInfo info1 = new VIPInfo(VIPType.NORMAL, 1, "2000/01/01");
		ClientVO vo1 = new ClientVO(1, "张三", "11111111111", 0, credit_record, info1);
		ResultMessage resultMessage = manageBLService.manage_updateClient(vo1);
		if(resultMessage==ResultMessage.Success){
			System.out.println("更新客户信息成功");
		}

		else
			System.out.println("更新客户信息失败");

		

		//测试manage_addHotel
		resultMessage = manageBLService.manage_addHotel(new HotelVO(1,"1","1","1","1","1","1","1",1,1,"1","1"));
		if(resultMessage==ResultMessage.Success)
			System.out.println("添加酒店成功");
		else
			System.out.println("添加酒店失败");

		

		//测试manage_addHotelWorker
		resultMessage = manageBLService.manage_addHotelWorker(new HotelWorkerVO(1,"lucy", "11111111111", "格林豪泰"));
		if(resultMessage==ResultMessage.Success)
			System.out.println("添加酒店工作人员成功");
		else
			System.out.println("添加酒店工作人员失败");

		

		//测试manage_searchHotelWorker
		HotelWorkerVO hWorkerVO = manageBLService.manage_searchHotelWorker(1);
		System.out.println(hWorkerVO.gethotel());
		System.out.println(hWorkerVO.getname());
		System.out.println(hWorkerVO.getcontact());

		

		//测试manage_updateHotelWorker
		resultMessage = manageBLService.manage_updateHotelWorker(new HotelWorkerVO(1,"1","1","1"));
		if(resultMessage==ResultMessage.Success)
			System.out.println("更新酒店工作人员信息成功");
		else
			System.out.println("更新酒店工作人员信息失败");

		

		//测试manage_addMarketWorker
		resultMessage = manageBLService.manage_addMarketWorker(new WebMarketVO(1,"jack", "11111111111"));
		if(resultMessage==ResultMessage.Success)
			System.out.println("添加网络营销人员成功");
		else
			System.out.println("添加网络营销人员失败");

		

		//测试manage_searchMarketWorker
		WebMarketVO webMarketVO = manageBLService.manage_searchMarketWorker(1);
	    System.out.println(webMarketVO.getname());
		System.out.println(webMarketVO.getcontact());

		

		//测试manage_updateMarketWorker
		resultMessage = manageBLService.manage_updateMarketWorker(new WebMarketVO(1,"tom", "11111111111"));
		if(resultMessage==ResultMessage.Success)
			System.out.println("更新网络营销人员信息成功");
		else
			System.out.println("更新网络营销人员信息失败");

	}
}