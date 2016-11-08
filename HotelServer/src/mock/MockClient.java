package test.mocksOfClientTest;

import objects.Client;

public class MockClient extends Client {
	int clientid;
	public MockClient(int clientid) {
		this.clientid = clientid;
	}
	public int getId(){
		return clientid;
	}
}
