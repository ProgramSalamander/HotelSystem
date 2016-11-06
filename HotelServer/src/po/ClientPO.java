package po;

import java.io.Serializable;

public class ClientPO implements Serializable{
	String name;
	String contact;
	int credit;
	String credit_record;
	int memberid;
	String member_type;
	String birthday;
	String company;

	
	
	
	public ClientPO(String n,String c,int c1,String cr,int m,String mt,String b,String co){
		name=n;
		contact=c;
		credit=c1;
		credit_record=cr;
		memberid=m;
		member_type=mt;
		birthday=b;
		company=co;
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
