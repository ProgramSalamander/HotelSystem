package mork;

import objects.WebMarket;

public class MorkWebMarket11 extends WebMarket {
	int webmarketid;
	String name;
	String contact;
	
	public MorkWebMarket11(int id,String n,String c){
		webmarketid = id;
		name=n;
		contact=c;
	}
	public int getid(){
		return webmarketid;
	}
	public String getname(){
		return name;
	}
	public String getcontact(){
		return contact;
	}
}
