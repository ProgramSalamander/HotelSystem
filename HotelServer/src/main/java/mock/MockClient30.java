package mock;

import objects.Client;

public class MockClient30 extends Client {
	int clientid;
	public MockClient30(int clientid) {
		this.clientid = clientid;
	}
	public int getId(){
		return clientid;
	}
}
