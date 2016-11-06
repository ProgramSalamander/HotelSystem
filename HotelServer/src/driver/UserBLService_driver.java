package driver;

import businesslogicsevice.ResultMessage;
import businesslogicsevice.UserBLService;

public class UserBLService_driver {
	public void drive(UserBLService userBLService){
		
		//µÇÂ¼
		ResultMessage result_login=userBLService.login(1, "123456");
		if(result_login==ResultMessage.Success){
			System.out.println("µÇÂ¼³É¹¦");
		}
		else{
			System.out.println("µÇÂ¼Ê§°Ü");
		}
	}
}
