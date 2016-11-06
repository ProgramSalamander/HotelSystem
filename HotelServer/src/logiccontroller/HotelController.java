package logiccontroller;

import VO.HotelVO;
import businesslogicsevice.HotelBLService;
import businesslogicsevice.ResultMessage;

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
		
		@Override
		//酒店工作人员查看酒店信息
		public HotelVO hotel_checkInfo() {
			// TODO Auto-generated method stub
			return new HotelVO(hotel_address,hotel_business_address,hotel_name,hotel_introduction,hotel_service,
					hotel_room_state,hotel_room_type,hotel_room_number,hotel_room_price,hotel_order,hotel_evaluation);
		}

		@Override
		//酒店工作人员更新酒店信息
		public ResultMessage hotel_updateInfo(HotelVO vo) {
			// TODO Auto-generated method stub
			if(vo!=null)
				return ResultMessage.Success;
			else return ResultMessage.Fail;
		}

		@Override
		//酒店工作人员录入可用客房
		public ResultMessage hotel_importRoom(String Room) {
			// TODO Auto-generated method stub
			if(Room!=null)
				return ResultMessage.Success;
			else return ResultMessage.Fail;
		}

		@Override
		//酒店工作人员更新入住信息
		public ResultMessage hotel_updateAccomodation(String AccomodationInfo) {
			// TODO Auto-generated method stub
			if(AccomodationInfo!=null)
				return ResultMessage.Success;
			else return ResultMessage.Fail;
		}
}
