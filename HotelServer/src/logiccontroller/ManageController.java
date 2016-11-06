package logiccontroller;

import VO.ClientVO;
import VO.HotelWorkerVO;
import VO.WebMarketVO;
import businesslogicsevice.ManageBLService;
import businesslogicsevice.ResultMessage;

public class ManageController implements ManageBLService{
	//�û�����Ϣ����
		String client_name="jack";
		String client_contact="11111111111";
		int client_credit=0;
		String credit_record="��";
		int client_memberid=000001;
		String client_member_type="PERSON";
		String client_birthday="1997-1-1";
		String client_company="�Ͼ���ѧ";
		
		//�Ƶ깤����Ա����Ϣ����
		String hotelWorker_name="tom";
		String hotelWorker_contact="11111111111";
		String hotelWorker_hotel="���";
		
		//��վӪ����Ա��Ϣ����
		String MarketWorker_name="Mike";
		String MarketWorker_contact="11111111111";
		
		@Override
		//��վ������Ա�����ͻ����鿴�ͻ���Ϣ
		public ClientVO manage_searchClient(int client_id){
			// TODO Auto-generated method stub
			return new ClientVO(client_name,client_contact,client_credit,credit_record,client_memberid,
					client_member_type,client_birthday,client_company);
		}

		@Override
		//��վ������Ա���¿ͻ���Ϣ
		public ResultMessage manage_updateClient(int client_id) {
			// TODO Auto-generated method stub
			if(client_id==1)
				return ResultMessage.Success;
			else return ResultMessage.Fail;
		}

		@Override
		//��վ������Ա��ӾƵ�
		public ResultMessage manage_addHotel(String hotel_name) {
			// TODO Auto-generated method stub
			if(hotel_name=="���")
				return ResultMessage.Success;
			else return ResultMessage.Fail;
		}

		@Override
		//��վ������Ա��ӾƵ깤����Ա
		public ResultMessage manage_addHotelWorker(String hotel_name, HotelWorkerVO w) {
			// TODO Auto-generated method stub
			if(hotel_name==w.gethotel())
				return ResultMessage.Success;
			else return ResultMessage.Fail;
		}

		@Override
		//��վ������Ա�����Ƶ깤����Ա
		public HotelWorkerVO manage_searchHotelWorker(String hotel_name) {
			// TODO Auto-generated method stub
			return new HotelWorkerVO(hotelWorker_name,hotelWorker_contact,hotelWorker_hotel);
		}

		@Override
		//��վ������Ա���¾Ƶ깤����Ա
		public ResultMessage manage_updateHotelWorker(String hotel_name) {
			// TODO Auto-generated method stub
			if(hotel_name=="���")
				return ResultMessage.Success;
			else return ResultMessage.Fail;
		}

		@Override
		//��վ������Ա�����վӪ����Ա
		public ResultMessage manage_addMarketWorker(WebMarketVO mw) {
			// TODO Auto-generated method stub
			if(mw.getname()=="����")
				return ResultMessage.Success;
			else return ResultMessage.Fail;
		}

		@Override
		//��վ������Ա������վӪ����Ա
		public WebMarketVO manage_searchMarketWorker(int marketWorker_id) {
			// TODO Auto-generated method stub
			return new WebMarketVO(MarketWorker_name,MarketWorker_contact);
		}

		@Override
		//��վ������Ա������վӪ����Ա��Ϣ
		public ResultMessage manage_web_updateMarketWorker(WebMarketVO mw) {
			// TODO Auto-generated method stub
			if(mw.getname()=="����")
				return ResultMessage.Success;
			else return ResultMessage.Fail;
		}
}
