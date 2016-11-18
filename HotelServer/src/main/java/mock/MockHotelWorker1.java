package mock;

import objects.HotelWorker;

public class MockHotelWorker1 extends HotelWorker{
	int hotelid;
	String name;
	String contact;
	String hotel;
	public MockHotelWorker1(int hotelid,String n,String c,String h){
		this.hotelid=hotelid;
		this.name=n;
		this.contact=c;
		this.hotel=h;
	}
	public int getHotelid(){
		return hotelid;
	}
	
	
}
