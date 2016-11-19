package mock;

import objects.Client;

public class MockClient10 extends Client{
	int client_id;
	
	public MockClient10(int id){
		client_id=id;
	}
	
	public int getclient_id(){
		return client_id;
	}
}
