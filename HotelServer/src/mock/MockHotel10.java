package mock;

import objects.Hotel;

public class MockHotel10 extends Hotel{
	int hotel_id;
	
	public MockHotel10(int id){
		hotel_id=id;
	}
	
	public int gethotel_id(){
		return hotel_id;
	}
}
