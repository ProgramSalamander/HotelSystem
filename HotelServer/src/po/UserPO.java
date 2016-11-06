package po;

import java.io.Serializable;

public class UserPO implements Serializable {
	int id;
	String password;
	public UserPO(int i,String p){
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
