package mock;

import objects.Hotel;

public class MockHotel30 extends Hotel{
	String location;
	public MockHotel30(String location){
		this.location = location;
	}
	
	public String getLocation(){
		return location;
	}
}
