package driver;



import service.blservice.*;
import objects.*;

public class UserBLService_driver {
	public void drive(UserBLService userBLService){
		
		//��¼
		ResultMessage result_login=userBLService.login("hh", "123456");
		if(result_login==ResultMessage.Success){
			System.out.println("��¼�ɹ�");
		}
		else{
			System.out.println("��¼ʧ��");
		}
	}
}
