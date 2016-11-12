package logiccontroller;


import vo.*;
import service.blservice.*;
import objects.*;

public class ManageController implements ManageBLService{
	//用户的信息参数
		String client_name="jack";
		String client_contact="11111111111";
		int client_credit=0;
		String credit_record="无";
		int client_memberid=000001;
		String client_member_type="PERSON";
		String client_birthday="1997-1-1";
		String client_company="南京大学";
		
		//酒店工作人员的信息参数
		String hotelWorker_name="tom";
		String hotelWorker_contact="11111111111";
		String hotelWorker_hotel="如家";
		
		//网站营销人员信息参数
		String MarketWorker_name="Mike";
		String MarketWorker_contact="11111111111";
		
		@Override
		//网站管理人员搜索客户，查看客户信息
		public ClientVO manage_searchClient(int client_id){
			// TODO Auto-generated method stub
			return new ClientVO(client_name,client_contact,client_credit,credit_record,client_memberid,
					client_member_type,client_birthday,client_company);
		}

		@Override
		//网站管理人员更新客户信息
		public ResultMessage manage_updateClient(int client_id) {
			// TODO Auto-generated method stub
			if(client_id==1)
				return ResultMessage.Success;
			else return ResultMessage.Fail;
		}

		
		@Override
		//网站管理人员添加网站营销人员
		public ResultMessage manage_addMarketWorker(WebMarketVO mw) {
			// TODO Auto-generated method stub
			if(mw.getname()=="张三")
				return ResultMessage.Success;
			else return ResultMessage.Fail;
		}

		@Override
		//网站管理人员搜索网站营销人员
		public WebMarketVO manage_searchMarketWorker(int marketWorker_id) {
			// TODO Auto-generated method stub
			return new WebMarketVO(MarketWorker_name,MarketWorker_contact);
		}

		

		@Override
		public ResultMessage manage_addHotel(int hotelid) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ResultMessage manage_addHotelWorker(int hotelid, HotelWorkerVO w) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public HotelWorkerVO manage_searchHotelWorker(int hotelid) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ResultMessage manage_updateHotelWorker(int hotelid) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ResultMessage manage_updateMarketWorker(WebMarketVO mw) {
			// TODO Auto-generated method stub
			return null;
		}
}
