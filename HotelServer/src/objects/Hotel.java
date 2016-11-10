package objects;

public class Hotel {
	private String address;
	private String bussiness_address;
	private String name;
	private String introduction;
	private String service;
	private String room_state;
	private String room_type;
	private int room_number;
	private int room_price;
	private String order;
	private String evaluation;
	
	public Hotel(String a,String ba,String na,String in,String s,String rs,String rt,int rn,int rp,String o,String e){
		this.address=a;
		this.bussiness_address=ba;
		this.name=na;
		this.introduction=in;
		this.service=s;
		this.room_state=rt;
		this.room_type=rt;
		this.room_number=rn;
		this.room_price=rp;
		this.order=o;
		this.evaluation=e;
	}
	public void setaddress(String address){
		this.address=address;
	}
	public String getaddress(){
		return address;
	}
	
	public void setbussiness_address(String bussiness_address){
		this.bussiness_address=bussiness_address;
	}
	public String getbussiness_address(){
		return bussiness_address;
	}
	
	public void setname(String name){
		this.name=name;
	}
	public String getname(){
		return name;
	}
	
	public void setintroduction(){
		this.introduction=introduction;
	}
	public String getintroduction(){
		return introduction;
	}
	
	public void setservice(String service){
		this.service=service;
	}
	public String getservice(){
		return service;
	}
	
	
	public String getroom_state(){
		return room_state;
	}
	public String getroom_type(){
		return room_type;
	}
	public int getroom_number(){
		return room_number;
	}
	public int getroom_price(){
		return room_price;
	}
	public String getorder(){
		return order;
	}
	public String getevaluation(){
		return evaluation;
	}
}
