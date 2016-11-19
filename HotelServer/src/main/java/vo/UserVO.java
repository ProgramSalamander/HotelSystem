package vo;



public class UserVO  {
	int id;
	String password;
	public UserVO(int i,String p){
		id=i;
		password=p;
	}
	public int getID(){
		return id;
	}
	public String getPassword(){
		return password;
	}
}
