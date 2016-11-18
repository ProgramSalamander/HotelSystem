package mock;

import objects.Room;

public class MockRoom1 extends Room{
	String room_type;
	String room_price;
	int room_number;
	String check_in_date;
	String check_out_date;
	public MockRoom1(String rt,String rp,int rn,String checkin,String checkout){
		room_type = rt;
		room_price = rp;
		room_number = rn;
		check_in_date = checkin;
		check_out_date = checkout;
	}
	
}
