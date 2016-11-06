package driver;
import java.util.ArrayList;
import VO.ClientVO;
import VO.HotelVO;
import businesslogicsevice.ClientBLService;
import businesslogicsevice.ResultMessage;



public class ClientBLService_driver {

	public void drive(ClientBLService clientBLService){
		
		//����client_checkInfo
		ClientVO vo = clientBLService.client_checkInfo();
		System.out.println(vo.getname());
		System.out.println(vo.getcontact());
		System.out.println(vo.getcredit());
		System.out.println(vo.getcredit_record());
		System.out.println(vo.getmemberid());
		System.out.println(vo.getmember_type());
		if(vo.getmember_type().equals("PERSON"))
			System.out.println(vo.getbirthday());
		else
			System.out.println(vo.getcompany());

		//����client_updateInfo
		ResultMessage resultMessage = clientBLService.client_updateInfo("input");
		if(resultMessage==ResultMessage.Success){
			System.out.println("���¿ͻ���Ϣ�ɹ�");
		}
		else {
			System.out.println("���¿ͻ���Ϣʧ��");
		}

		//����client_getpreviousHotelList
		ArrayList<HotelVO> list = clientBLService.client_getpreviousHotelList();
		HotelVO vo2 = null;
		if(list.isEmpty()){
			System.out.println("�ͻ�δ��Ԥ�����Ƶ�");
		}
		else{
			for(int i=0;i<list.size();i++){
				vo2 = list.get(i);
				System.out.println(vo2.getname());
				System.out.println(vo2.getevaluation());
			}
		}

		//����client_checkCredit
		String credit_record = clientBLService.client_checkCredit();
		System.out.println(credit_record);

		//����client_setLocation
		list = clientBLService.client_setLocation("�Ͼ�");
		for(int i=0;i<list.size();i++){
			vo2 = list.get(i);
			System.out.println(vo2.getname());
			System.out.println(vo2.getevaluation());
		}

		//����client_searchHotel
		list = clientBLService.client_searchHotel("condition");
		for(int i=0;i<list.size();i++){
			vo2 = list.get(i);
			System.out.println(vo2.getname());
			System.out.println(vo2.getevaluation());
		}

		//����client_checkHotelInfo
		vo2 = clientBLService.client_checkHotelInfo();
		System.out.println(vo2.getname());
		System.out.println(vo2.getaddress());
		System.out.println(vo2.getbussiness_address());
		System.out.println(vo2.getintroduction());
		System.out.println(vo2.getservice());
		//�˴�ʡ��һ�������
		//������

		//����client_evaluateHotel
		resultMessage = clientBLService.client_evaluateHotel("evaluation");
		if(resultMessage == ResultMessage.Success){
			System.out.println("���۳ɹ�");
		}
		else
			System.out.println("����ʧ��");

		//����client_enrollVIP
		resultMessage = clientBLService.client_enrollVIP("info");
		if(resultMessage == ResultMessage.Success)
			System.out.println("ע���Ա�ɹ�");
		else
			System.out.println("ע���Աʧ��");
	}

}
