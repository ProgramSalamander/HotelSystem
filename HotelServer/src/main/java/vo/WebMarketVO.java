package vo;



public class WebMarketVO {
	int webmarketid;
	String name;
	String contact;
	
	public WebMarketVO(int id,String n,String c){
		webmarketid = id;
		name=n;
		contact=c;
	}
	public int getid(){
		return webmarketid;
	}
	public String getname(){
		return name;
	}
	public String getcontact(){
		return contact;
	}
}
