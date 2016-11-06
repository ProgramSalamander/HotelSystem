package service.blservice.Impl;

import java.util.ArrayList;

import objects.AccommodationInfo;
import objects.Hotel;
import objects.HotelWorker;
import objects.ResultMessage;
import objects.Room;
import service.blservice.HotelBLService;
import vo.HotelVO;

public class HotelBLServiceImpl implements HotelBLService {

	@Override
	public HotelVO hotel_checkInfo(int hotelid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage hotel_updateInfo(HotelVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage hotel_importRoom(Room room) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage hotel_updateAccomodation(AccommodationInfo info) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Hotel searchHotel(int hotelid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Hotel> previousHotel(int clientid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage addHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage addHotelWorker(HotelWorker worker) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HotelWorker searchHotelWorker(int hotelid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage updateHotelWokerInfo(int hotelid, HotelWorker worker) {
		// TODO Auto-generated method stub
		return null;
	}

}
