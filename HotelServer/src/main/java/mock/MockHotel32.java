package mock;

import objects.Hotel;
import objects.RoomType;

public class MockHotel32 extends Hotel {
	RoomType type;
	public MockHotel32(RoomType type) {
		this.type  = type;
	}
	
	public RoomType getType(){
		return type;
	}
}
