package test;

import static org.junit.Assert.*;

import org.junit.Test;

import objects.ResultMessage;
import service.blservice.Impl.UserBLServiceImpl;

public class Usertest {

	@Test
	public void testlogin(){
		UserBLServiceImpl user=new UserBLServiceImpl();
		String username="张三";
		String password="123456";
		ResultMessage login_result=user.login(username, password);
		
		assertEquals(ResultMessage.Success,login_result);
	}
	
	@Test
	public void testregistr(){
		UserBLServiceImpl user=new UserBLServiceImpl();
		String username="张三";
		String password="123456";
		ResultMessage register_result=user.register(username, password);
		
		assertEquals(ResultMessage.Success,register_result);
	}
}
