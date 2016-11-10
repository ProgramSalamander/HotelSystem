package mock;

import objects.Room;
import objects.RoomType;

public class MockRoom10 extends Room{
	RoomType room_type;
	int room_num;
	
	public MockRoom10(RoomType roomtype,int numofroom){
		room_type=roomtype;
		room_num=numofroom;
	}
	
	public RoomType getroomtye(){
		return room_type;
	}
	
	public int getroomnum(){
		return room_num;
	}
}
