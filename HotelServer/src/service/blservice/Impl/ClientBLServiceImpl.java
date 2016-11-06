package service.blservice.Impl;

import java.util.ArrayList;

import objects.Client;
import objects.Evaluation;
import objects.ResultMessage;
import objects.RoomType;
import objects.VIPInfo;
import service.blservice.ClientBLService;
import vo.ClientVO;
import vo.HotelVO;

public class ClientBLServiceImpl implements ClientBLService {

	@Override
	public ClientVO client_checkInfo(int clientid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage client_updateInfo(ClientVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<HotelVO> client_getpreviousHotelList(int clientid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int client_checkCredit(int clientid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<String> client_checkCreditList(int clientid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<HotelVO> client_setLocation(String location) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<HotelVO> client_searchHotel(String hotelname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<HotelVO> client_searchHotel(RoomType type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<HotelVO> client_searchHotel(int lowprice, int highprice) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<HotelVO> client_searchHotel(String inTime, String leaveTime) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<HotelVO> client_searchHotel(int star) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<HotelVO> client_searchHotel(double lowscore, double highscore) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HotelVO client_checkHotelInfo(int hotelid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage client_evaluateHotel(Evaluation e, int clientid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage client_enrollVIP(VIPInfo info, int clientid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage updateClientCredit(int clientId, int value, int tag) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client checkClientInfo(int clientid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage updateClientInfo(Client client) {
		// TODO Auto-generated method stub
		return null;
	}

}
