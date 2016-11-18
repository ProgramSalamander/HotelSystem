package vo;



public class HotelWorkerVO {
	int hotelid;
	String name;
	String contact;
	String hotel;
	
	public HotelWorkerVO(int id,String n,String c,String h){
		hotelid = id;
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
