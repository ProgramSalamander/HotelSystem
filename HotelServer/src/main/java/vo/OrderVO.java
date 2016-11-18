package vo;



public class OrderVO  {
	int id;
	String state;
	boolean execute;
	String hotel;
	String start_time;
	String end_time;
	String latest_execute_time;
	String room_type;
	int room_number;
	String strategy;
	int price;
	int expect_number_of_people;
	
	public OrderVO(int i,String s,boolean e,String h,String st,String et,String lt,String rt,int rm,String str,int p,int en){
		id=i;
		state=s;
		execute=e;
		hotel=h;
		start_time=st;
		end_time=et;
		latest_execute_time=lt;
		room_type=rt;
		room_number=rm;
		strategy=str;
		price=p;
		expect_number_of_people=en;
	}
	public int getid(){
		return id;
	}
	public String getstate(){
		return state;
	}
	public boolean getexecute(){
		return execute;
	}
	public String gethotel(){
		return hotel;
	}
	public String getstart_time(){
		return start_time;
	}
	public String getend_time(){
		return end_time;
	}
	public String getlatest_execute_time(){
		return latest_execute_time; 
	}
	public String getroom_type(){
		return room_type;
	}
	public int getroom_number(){
		return room_number;
	}
	public String getstrategy(){
		return strategy;
	}
	public int getprice(){
		return price;
	}
	public int getexpect_number_of_people(){
		return expect_number_of_people;
	}
}
