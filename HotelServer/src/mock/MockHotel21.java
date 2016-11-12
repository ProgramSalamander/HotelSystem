package mock;

import objects.Hotel;

public class MockHotel21 extends Hotel{
	int hotelid;
	public MockHotel21(int id){
		hotelid = id;
	}
	public int getid(){
		return this.hotelid;
	}
}
