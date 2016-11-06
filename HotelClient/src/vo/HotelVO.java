package vo;


public class HotelVO {
	String address;
	String business_address;
	String name;
	String introduction;
	String service;
	String room_state;
	String room_type;
	int room_number;
	int room_price;
	String order;
	String evaluation;
	
	public HotelVO(String a,String ba,String na,String in,String s,String rs,String rt,int rn,int rp,String o,String e){
		address=a;
		business_address=ba;
		name=na;
		introduction=in;
		service=s;
		room_state=rt;
		room_type=rt;
		room_number=rn;
		room_price=rp;
		order=o;
		evaluation=e;
	}
	public String getaddress(){
		return address;
	}
	public String getbussiness_address(){
		return business_address;
	}
	public String getname(){
		return name;
	}
	public String getintroduction(){
		return introduction;
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
