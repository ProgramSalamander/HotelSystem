package logiccontroller;


import java.util.ArrayList;
import vo.*;
import service.*;
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
