package service.blservice;

import objects.ResultMessage;
import vo.ClientVO;
import vo.HotelVO;
import vo.HotelWorkerVO;
import vo.WebMarketVO;

public interface ManageBLService {
	// 提供给界面调用的接口
		/**
		 * @param clientid
		 * @return 搜索客户
		 */
		public ClientVO manage_searchClient(int clientid);

		/**
		 * @param clientid
		 * @return 更新客户信息
		 */
		public ResultMessage manage_updateClient(ClientVO clientvo);

		/**
		 * @param hotelid
		 * @return 添加酒店
		 */
		public ResultMessage manage_addHotel(HotelVO hotelvo);

		/**
		 * @param hotelid
		 * @param w
		 * @return 添加酒店工作人员
		 */
		public ResultMessage manage_addHotelWorker(HotelWorkerVO w);

		/**
		 * @param hotelid
		 * @return 搜索酒店工作人员
		 */
		public HotelWorkerVO manage_searchHotelWorker(int hotelid);

		/**
		 * @param hotelid
		 * @return 更新酒店工作人员信息
		 */
		public ResultMessage manage_updateHotelWorker(HotelWorkerVO w);

		/**
		 * @param mw
		 * @return 添加网站营销人员
		 */
		public ResultMessage manage_addMarketWorker(WebMarketVO mw);

		/**
		 * @param marketWorkerid
		 * @return 搜索网站营销人员
		 */
		public WebMarketVO manage_searchMarketWorker(int marketWorkerid);

		/**
		 * @param mw
		 * @return 更新网站营销人员信息
		 */
		public ResultMessage manage_updateMarketWorker(WebMarketVO mw);
}
