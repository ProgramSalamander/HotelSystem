package po;

import java.io.Serializable;

public class WebMarketPO implements Serializable{
	String name;
	String contact;
	
	public WebMarketPO(String n,String c){
		name=n;
		contact=c;
	}
	public String getname(){
		return name;
	}
	public String getcontact(){
		return contact;
	}
}
