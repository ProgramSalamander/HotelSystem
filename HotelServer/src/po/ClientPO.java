package po;

import java.io.Serializable;

public class ClientPO implements Serializable{
	int clientid;
	String name;
	String contact;
	int credit;
	String credit_record;
	int memberid;
	String member_type;
	String birthday;
	String company;

	
	
	
	public ClientPO(int id,String n,String c,int c1,String cr,int m,String mt,String b,String co){
		clientid=id;
		name=n;
		contact=c;
		credit=c1;
		credit_record=cr;
		memberid=m;
		member_type=mt;
		birthday=b;
		company=co;
	}
	public int getid(){
		return clientid;
	}
	public String getname(){
		return name;
	}
	public String getcontact(){
		return contact;
	}
	public int getcredit(){
		return credit;
	}
	public String getcredit_record(){
		return credit_record;
	}
	public int getmemberid(){
		return memberid;
	}
	public String getmember_type(){
		return member_type;
	}
	public String getbirthday(){
		return birthday;
	}
	public String getcompany(){
		return company;
	}	
}
