package mork;

import objects.Client;

public class MorkClient11 extends Client{
	int clientid;
	public MorkClient11(int id){
		clientid = id;
	}
	public int getid(){
		return this.clientid;
	}
}
