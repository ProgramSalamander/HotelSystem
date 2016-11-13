package mock;

import objects.AccommodationInfo;

public class MockAccommo1 extends AccommodationInfo{
	String roomNumber;
	String check_in;
	String plan_check_out;
	String actual_check_out;
	public MockAccommo1(String rN,String checkIn,String pcheckOut,String accheckOut){
		roomNumber = rN;
		check_in = checkIn;
		plan_check_out = pcheckOut;
		actual_check_out = accheckOut;
	}
}
