package driver;

import businesslogicsevice.ResultMessage;
import businesslogicsevice.UserBLService;

public class UserBLService_driver {
	public void drive(UserBLService userBLService){
		
		//��¼
		ResultMessage result_login=userBLService.login(1, "123456");
		if(result_login==ResultMessage.Success){
			System.out.println("��¼�ɹ�");
		}
		else{
			System.out.println("��¼ʧ��");
		}
	}
}
