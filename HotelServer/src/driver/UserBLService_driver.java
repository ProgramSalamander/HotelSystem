package driver;



import service.blservice.*;
import objects.*;

public class UserBLService_driver {
	public void drive(UserBLService userBLService){
		
		//µÇÂ¼
		ResultMessage result_login=userBLService.login("hh", "123456");
		if(result_login==ResultMessage.Success){
			System.out.println("µÇÂ¼³É¹¦");
		}
		else{
			System.out.println("µÇÂ¼Ê§°Ü");
		}
	}
}
