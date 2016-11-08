package test;

import org.junit.*;
import objects.ResultMessage;
import service.blservice.ClientBLService;
import service.blservice.Impl.ClientBLServiceImpl;
import test.mocksOfClientTest.MockClient;
public class Clienttest {
	@Test
	public void  updateClientCreditTest(){
		ClientBLService client = new ClientBLServiceImpl();
		Assert.assertEquals(ResultMessage.Success, client.updateClientCredit(1, 100, 0));
	}
	
	@Test
	public void checkClientInfoTest(){
		ClientBLService  client = new ClientBLServiceImpl();
		MockClient client1 = new MockClient(1);
		Assert.assertEquals(client1, client.checkClientInfo(1));
	}
	
	@Test
	public void updateClientInfoTest(){
		ClientBLService client = new ClientBLServiceImpl();
		MockClient client2 = new MockClient(2);
		Assert.assertEquals(ResultMessage.Success, client.updateClientInfo(client2));
	}
}
