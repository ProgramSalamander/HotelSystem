package po;

import java.io.Serializable;

public class WebManagerPO implements Serializable{
	String name;
	String contact;
	
	public WebManagerPO(String n,String c){
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
