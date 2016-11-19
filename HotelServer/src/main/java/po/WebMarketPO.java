package po;

import java.io.Serializable;

public class WebMarketPO implements Serializable{
	int webmarketid;
	String name;
	String contact;
	
	public WebMarketPO(int id,String n,String c){
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
