package vo;



public class HotelStrategyVO {
	String name;
	String condition;
	String start_time;
	String end_time;
	String executeway;
	boolean superposition;
	
	public HotelStrategyVO(String n,String con,String st,String et,String ew,boolean iss){
		name=n;
		condition=con;
		start_time=st;
		end_time=et;
		executeway=ew;
		superposition=iss;
	}
	public String getname(){
		return name;
	}
	public String getcondition(){
		return condition;
	}
	public String getstart_time(){
		return start_time;
	}
	public String getend_time(){
		return end_time;
	}
	public String getexecuteway(){
		return executeway;
	}
	public boolean getsuperposition(){
		return superposition;
	}
}
