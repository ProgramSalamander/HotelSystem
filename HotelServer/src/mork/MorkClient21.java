package mork;

import objects.Client;

public class MorkClient21 extends Client{
	int clientid;
	public MorkClient21(int id){
		clientid = id;
	}
	public int getid(){
		return this.clientid;
	}
}
