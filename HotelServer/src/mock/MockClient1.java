package mock;

import objects.Client;

public class MockClient1 extends Client{
	int clientid;
	public MockClient1(int id){
		clientid = id;
	}
	public int getClientid(){
		return clientid;
	}
}
