package mock;

import objects.Client;

public class MockClient21 extends Client{
	int clientid;
	public MockClient21(int id){
		clientid = id;
	}
	public int getid(){
		return this.clientid;
	}
}
