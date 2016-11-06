package driver;



import VO.ClientVO;
import VO.HotelWorkerVO;
import VO.WebMarketVO;
import businesslogicsevice.ManageBLService;
import businesslogicsevice.ResultMessage;



public class ManageBLService_driver {

	public void drive(ManageBLService manageBLService){

		//����manage_searchClient
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

		

		//����manage_updateClient
		ResultMessage resultMessage = manageBLService.manage_updateClient(1);
		if(resultMessage==ResultMessage.Success){
			System.out.println("���¿ͻ���Ϣ�ɹ�");
		}

		else
			System.out.println("���¿ͻ���Ϣʧ��");

		

		//����manage_addHotel
		resultMessage = manageBLService.manage_addHotel("���ֺ�̩");
		if(resultMessage==ResultMessage.Success)
			System.out.println("��ӾƵ�ɹ�");
		else
			System.out.println("��ӾƵ�ʧ��");

		

		//����manage_addHotelWorker
		resultMessage = manageBLService.manage_addHotelWorker("���ֺ�̩", new HotelWorkerVO("lucy", "11111111111", "���ֺ�̩"));
		if(resultMessage==ResultMessage.Success)
			System.out.println("��ӾƵ깤����Ա�ɹ�");
		else
			System.out.println("��ӾƵ깤����Աʧ��");

		

		//����manage_searchHotelWorker
		HotelWorkerVO hWorkerVO = manageBLService.manage_searchHotelWorker("���");
		System.out.println(hWorkerVO.gethotel());
		System.out.println(hWorkerVO.getname());
		System.out.println(hWorkerVO.getcontact());

		

		//����manage_updateHotelWorker
		resultMessage = manageBLService.manage_updateHotelWorker("���");
		if(resultMessage==ResultMessage.Success)
			System.out.println("���¾Ƶ깤����Ա��Ϣ�ɹ�");
		else
			System.out.println("���¾Ƶ깤����Ա��Ϣʧ��");

		

		//����manage_addMarketWorker
		resultMessage = manageBLService.manage_addMarketWorker(new WebMarketVO("jack", "11111111111"));
		if(resultMessage==ResultMessage.Success)
			System.out.println("�������Ӫ����Ա�ɹ�");
		else
			System.out.println("�������Ӫ����Աʧ��");

		

		//����manage_searchMarketWorker
		WebMarketVO webMarketVO = manageBLService.manage_searchMarketWorker(1);
	    System.out.println(webMarketVO.getname());
		System.out.println(webMarketVO.getcontact());

		

		//����manage_updateMarketWorker
		resultMessage = manageBLService.manage_web_updateMarketWorker(new WebMarketVO("tom", "11111111111"));
		if(resultMessage==ResultMessage.Success)
			System.out.println("��������Ӫ����Ա��Ϣ�ɹ�");
		else
			System.out.println("��������Ӫ����Ա��Ϣʧ��");

	}
}