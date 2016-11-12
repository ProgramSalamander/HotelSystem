package po;

import java.io.Serializable;

public class HotelWorkerPO implements Serializable{
	int hotelid;
	String name;
	String contact;
	String hotel;
	
	public HotelWorkerPO(int id,String n,String c,String h){
		hotelid=id;
		name=n;
		contact=c;
		hotel=h;
	}
	public int gethotelid(){
		return hotelid;
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
