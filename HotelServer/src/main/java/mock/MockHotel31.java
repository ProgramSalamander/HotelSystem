package mock;

import objects.Hotel;

public class MockHotel31 extends Hotel {
	String hotelname;
	public MockHotel31(String hotelname) {
		this.hotelname = hotelname;
	}
	
	public String getHotelname(){
		return hotelname;
	}
}
