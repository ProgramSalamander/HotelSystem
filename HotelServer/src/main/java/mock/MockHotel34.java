package mock;

import objects.Hotel;

public class MockHotel34 extends Hotel {
	String inTime;
	String leaveTime;
	public MockHotel34(String inTime, String leaveTime) {
		this.inTime = inTime;
		this.leaveTime = leaveTime;
	}
	public String getInTime() {
		return inTime;
	}
	public String getLeaveTime() {
		return leaveTime;
	}
	
}
