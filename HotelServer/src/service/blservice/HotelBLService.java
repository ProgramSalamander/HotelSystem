package service.blservice;

import java.util.ArrayList;

import Objects.AcommodationInfo;
import Objects.Hotel;
import Objects.HotelWorker;
import Objects.ResultMessage;
import Objects.Room;
import VO.HotelVO;

public interface HotelBLService {
	//�ṩ��������õĽӿ�
	public HotelVO hotel_checkInfo(int hotelid);
	
	public ResultMessage hotel_updateInfo(HotelVO vo);
	
	public ResultMessage hotel_importRoom(Room room);
	
	public ResultMessage hotel_updateAccomodation(AcommodationInfo info);
	
	//�ṩ��ͬ����õĽӿ�
	public ArrayList<Hotel> searchHotel(int hotelid);
	
	public ArrayList<Hotel> previousHotel(int clientid);
	
	public ResultMessage addHotel(Hotel hotel);
	
	public ResultMessage addHotelWorker(HotelWorker worker);
	
	public HotelWorker searchHotelWorker(int hotelid);
	
	public ResultMessage updateHotelWokerInfo(int hotelid,HotelWorker worker);
}
