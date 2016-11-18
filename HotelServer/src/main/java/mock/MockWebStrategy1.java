package mock;

import objects.WebStrategy;

public class MockWebStrategy1 extends WebStrategy{
	String name;
	String condition;
	String start_time;
	String end_time;
	String executeway;
	boolean superposition;
	
	public MockWebStrategy1(String n,String con,String st,String et,String ew,boolean iss){
		this.name=n;
		this.condition=con;
		this.start_time=st;
		this.end_time=et;
		this.executeway=ew;
		this.superposition=iss;
	}
}
