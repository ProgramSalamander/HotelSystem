package po;

import java.io.Serializable;

public class HotelWorkerPO implements Serializable{
	String name;
	String contact;
	String hotel;
	
	public HotelWorkerPO(String n,String c,String h){
		name=n;
		contact=c;
		hotel=h;
	}
	public String getname(){
		return name;
	}
	public String getcontact(){
		return contact;
	}
	public String gethotel(){
		return hotel;
	}
}
