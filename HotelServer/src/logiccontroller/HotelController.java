package logiccontroller;

import VO.HotelVO;
import businesslogicsevice.HotelBLService;
import businesslogicsevice.ResultMessage;

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
		//�Ƶ깤����Ա�鿴�Ƶ���Ϣ
		public HotelVO hotel_checkInfo() {
			// TODO Auto-generated method stub
			return new HotelVO(hotel_address,hotel_business_address,hotel_name,hotel_introduction,hotel_service,
					hotel_room_state,hotel_room_type,hotel_room_number,hotel_room_price,hotel_order,hotel_evaluation);
		}

		@Override
		//�Ƶ깤����Ա���¾Ƶ���Ϣ
		public ResultMessage hotel_updateInfo(HotelVO vo) {
			// TODO Auto-generated method stub
			if(vo!=null)
				return ResultMessage.Success;
			else return ResultMessage.Fail;
		}

		@Override
		//�Ƶ깤����Ա¼����ÿͷ�
		public ResultMessage hotel_importRoom(String Room) {
			// TODO Auto-generated method stub
			if(Room!=null)
				return ResultMessage.Success;
			else return ResultMessage.Fail;
		}

		@Override
		//�Ƶ깤����Ա������ס��Ϣ
		public ResultMessage hotel_updateAccomodation(String AccomodationInfo) {
			// TODO Auto-generated method stub
			if(AccomodationInfo!=null)
				return ResultMessage.Success;
			else return ResultMessage.Fail;
		}
}
