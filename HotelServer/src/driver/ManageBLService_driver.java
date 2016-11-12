package driver;



import java.util.ArrayList;
import vo.*;
import service.*;
import service.blservice.*;
import objects.*;



public class ManageBLService_driver {

	public void drive(ManageBLService manageBLService){

		//测试manage_searchClient
		ClientVO clientVO = manageBLService.manage_searchClient(1);
		System.out.println(clientVO.getname());
		System.out.println(clientVO.getcontact());
		System.out.println(clientVO.getcredit());
		System.out.println(clientVO.getcredit_record());
		System.out.println(clientVO.getmemberid());
		System.out.println(clientVO.getmember_type());
		if(clientVO.getmember_type().equals("PERSON"))
			System.out.println(clientVO.getbirthday());
		else
			System.out.println(clientVO.getcompany());

		

		//测试manage_updateClient
		ClientVO clientvo = new ClientVO(1,"1","1",1,"1",1,"1","1","1");
		ResultMessage resultMessage = manageBLService.manage_updateClient(clientvo);
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