package mock;

import objects.RoomType;

public class MockRoom1 {
	RoomType room_type;
	int room_num;
	
	public MockRoom1(RoomType roomtype,int numofroom){
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
