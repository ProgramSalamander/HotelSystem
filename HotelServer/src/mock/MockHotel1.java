package mock;

import objects.Hotel;

public class MockHotel1 extends Hotel{
	int hotelid;
	public MockHotel1(int id){
		hotelid = id;
	}
	public int getHotelid(){
		return hotelid;
	}
}
