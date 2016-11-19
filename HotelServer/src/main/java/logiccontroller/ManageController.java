package logiccontroller;


import vo.*;
import service.blservice.*;

import java.util.ArrayList;

import objects.*;
import objects.VIPInfo.VIPType;

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
			ArrayList<String> credit_record = new ArrayList<String>();
			VIPInfo info = new VIPInfo(VIPType.NORMAL, 1, "2000/01/01");
			ClientVO vo = new ClientVO(1, "张三", "11111111111", 0, credit_record, info);
			return vo;
		}

		@Override
		//网站管理人员更新客户信息
		public ResultMessage manage_updateClient(ClientVO clientvo) {
			// TODO Auto-generated method stub
			if(clientvo.getClientid()==1)
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
			return new WebMarketVO(1,MarketWorker_name,MarketWorker_contact);
		}

		

		@Override
		//网站管理人员添加酒店
		public ResultMessage manage_addHotel(HotelVO hotelvo) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		//网站管理人员添加酒店工作人员
		public ResultMessage manage_addHotelWorker(HotelWorkerVO w) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		//网站管理人员搜索酒店工作人员
		public HotelWorkerVO manage_searchHotelWorker(int hotelid) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		//网站管理人员更新酒店工作人员信息
		public ResultMessage manage_updateHotelWorker(HotelWorkerVO hotelworkervo) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ResultMessage manage_updateMarketWorker(WebMarketVO mw) {
			// TODO Auto-generated method stub
			return null;
		}
}
