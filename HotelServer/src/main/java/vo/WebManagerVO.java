package vo;



public class WebManagerVO {
	String name;
	String contact;
	
	public WebManagerVO(String n,String c){
		name=n;
		contact=c;
	}
	public String getname(){
		return name;
	}
	public String getcontact(){
		return contact;
	}
}
