package logiccontroller;


import java.util.ArrayList;
import vo.*;
import service.blservice.*;
import objects.*;

public class HotelController implements HotelBLService{
	//�Ƶ���Ϣ����
		String hotel_address="�Ͼ�";
		String hotel_business_address="�½ֿ�";
		String hotel_name="���";
		String hotel_introduction="��";
		String hotel_service="��";
		String hotel_room_state="δԤ��";
		String hotel_room_type="˫�˷�";
		int hotel_room_number=1;
		int hotel_room_price=200;
		String hotel_order="��";
		String hotel_evaluation="��";
		
<<<<<<< HEAD
=======
	//�Ƶ깤����Ա����Ϣ����
		String hotelWorker_name="tom";
		String hotelWorker_contact="11111111111";
		String hotelWorker_hotel="���";
>>>>>>> parent of 4e318a4... Update HotelController.java

		@Override
		//�Ƶ깤����Ա���¾Ƶ���Ϣ
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
<<<<<<< HEAD
			return null;
=======
			return new Hotel(hotel_address,hotel_business_address,hotel_name,hotel_introduction,hotel_service,
					hotel_room_state,hotel_room_type,hotel_room_number,hotel_room_price,hotel_order,hotel_evaluation);
>>>>>>> parent of 4e318a4... Update HotelController.java
		}

		@Override
		public ArrayList<Hotel> previousHotel(int clientid) {
			// TODO Auto-generated method stub
<<<<<<< HEAD
			return null;
=======
			ArrayList<Hotel> HotelList_Client=new ArrayList<Hotel>();
			Hotel hotel=new Hotel(hotel_address,hotel_business_address,hotel_name,hotel_introduction,hotel_service,
					hotel_room_state,hotel_room_type,hotel_room_number,hotel_room_price,hotel_order,hotel_evaluation);
			HotelList_Client.add(hotel);
			return HotelList_Client;
>>>>>>> parent of 4e318a4... Update HotelController.java
		}

		@Override
		public ResultMessage addHotel(Hotel hotel) {
			// TODO Auto-generated method stub
<<<<<<< HEAD
			return null;
=======
			if(hotel_name=="���")
				return ResultMessage.Success;
			else return ResultMessage.Fail;
>>>>>>> parent of 4e318a4... Update HotelController.java
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
