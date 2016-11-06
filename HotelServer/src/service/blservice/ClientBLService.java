package service.blservice;

import java.util.ArrayList;

import Objects.*;
import vo.ClientVO;
import vo.HotelVO;
public interface ClientBLService {
	//提供给界面调用的接口
	public ClientVO client_checkInfo(int clientid);
	
	public ResultMessage client_updateInfo(ClientVO vo);
	
	public ArrayList<HotelVO> client_getpreviousHotelList(int clientid);
	
	public String client_checkCredit(int clientid);
	
	public ArrayList<HotelVO> client_setLocation(String location);
	
	public ArrayList<HotelVO> client_searchHotel(String hotelname);
	
	public ArrayList<HotelVO> client_searchHotel(RoomType type);
	
	public ArrayList<HotelVO> client_searchHotel(int lowprice,int highprice);
	
	public ArrayList<HotelVO> client_searchHotel(String inTime,String leaveTime);
	
	public ArrayList<HotelVO> client_searchHotel(int star);
	
	public ArrayList<HotelVO> client_searchHotel(double lowscore,double highscore);
	
	public Hotel client_checkHotelInfo(int hotelid);
	
	public ResultMessage client_evaluateHotel(Evaluation e,int clientid);
	
	public ResultMessage client_enrollVIP(VIPInfo info,int clientid);
	
	//提供给同层调用的接口
	public ResultMessage client_updateCredit(int clientId,int value, int tag);
	
	public Client checkClientInfo(int clientid);
	
	public ResultMessage client_updateInfo(Client client);
}
