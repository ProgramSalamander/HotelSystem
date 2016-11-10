package objects;

public class AccommodationInfo {
	String roomNumber;
	String check_in;
	String plan_check_out;
	String actual_check_out;
	
	public AccommodationInfo(String rN,String checkIn,String pcheckOut,String accheckOut){
		roomNumber = rN;
		check_in = checkIn;
		plan_check_out = pcheckOut;
		actual_check_out = accheckOut;
	}
	
	public String getRoomNumber(){
		return roomNumber;
	}
	public String getCheckIn(){
		return check_in;
	}
	public String getPlanCheckOut(){
		return plan_check_out;
	}
	public String getActualCheckOut(){
		return actual_check_out;
	}
}
