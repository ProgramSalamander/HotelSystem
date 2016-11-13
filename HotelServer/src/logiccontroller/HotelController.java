package logiccontroller;


import java.util.ArrayList;
import vo.*;
import service.blservice.*;
import objects.*;

public class HotelController implements HotelBLService{
	//酒店信息参数
		String hotel_address="南京";
		String hotel_business_address="新街口";
		String hotel_name="如家";
		String hotel_introduction="好";
		String hotel_service="好";
		String hotel_room_state="未预定";
		String hotel_room_type="双人房";
		int hotel_room_number=1;
		int hotel_room_price=200;
		String hotel_order="无";
		String hotel_evaluation="无";
		

	//酒店工作人员的信息参数
		String hotelWorker_name="tom";
		String hotelWorker_contact="11111111111";
		String hotelWorker_hotel="如家";


		@Override
		//酒店工作人员更新酒店信息
		public ResultMessage hotel_updateInfo(HotelVO vo) {
			// TODO Auto-generated method stub
			if(vo!=null)
				return ResultMessage.Success;
			else return ResultMessage.Fail;
		}


		@Override
		public HotelVO hotel_checkInfo(int hotelid) {
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

			return new Hotel(hotel_address,hotel_business_address,hotel_name,hotel_introduction,hotel_service,
					hotel_room_state,hotel_room_type,hotel_room_number,hotel_room_price,hotel_order,hotel_evaluation);

		}

		@Override
		public ArrayList<Hotel> previousHotel(int clientid) {
			// TODO Auto-generated method stub

			return null;

			ArrayList<Hotel> HotelList_Client=new ArrayList<Hotel>();
			Hotel hotel=new Hotel(hotel_address,hotel_business_address,hotel_name,hotel_introduction,hotel_service,
					hotel_room_state,hotel_room_type,hotel_room_number,hotel_room_price,hotel_order,hotel_evaluation);
			HotelList_Client.add(hotel);
			return HotelList_Client;

		}

		@Override
		public ResultMessage addHotel(Hotel hotel) {
			// TODO Auto-generated method stub

			return null;

			if(hotel_name=="如家")
				return ResultMessage.Success;
			else return ResultMessage.Fail;

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
