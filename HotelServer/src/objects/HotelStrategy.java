package objects;

public class HotelStrategy {
	private String name;
	private String condition;
	private String start_time;
	private String end_time;
	private String executeway;
	private boolean superposition;
	
	public HotelStrategy(String n,String con,String st,String et,String ew,boolean iss){
		this.name=n;
		this.condition=con;
		this.start_time=st;
		this.end_time=et;
		this.executeway=ew;
		this.superposition=iss;
	}
	
	public void setname(String name){
		this.name=name;
	}
	public String getname(){
		return name;
	}
	
	public void setcondition(String condition){
		this.condition=condition;
	}
	public String getcondition(){
		return condition;
	}
	
	public void setstart_time(String start_time){
		this.start_time=start_time;
	}
	public String getstart_time(){
		return start_time;
	}
	
	public void setend_time(String end_time){
		this.end_time=end_time;
	}
	public String getend_time(){
		return end_time;
	}
	
	public void setexecuteway(String executeway){
		this.executeway=executeway;
	}
	public String getexecuteway(){
		return executeway;
	}
	
	public void setsuperposition( boolean superposition){
		this.superposition=superposition;
	}
	public boolean getsuperposition(){
		return superposition;
	}
}
