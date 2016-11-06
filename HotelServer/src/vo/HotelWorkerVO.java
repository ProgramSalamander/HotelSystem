package vo;



public class HotelWorkerVO {
	String name;
	String contact;
	String hotel;
	
	public HotelWorkerVO(String n,String c,String h){
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
