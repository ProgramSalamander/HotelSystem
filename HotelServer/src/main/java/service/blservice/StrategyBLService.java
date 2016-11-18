package service.blservice;

import java.util.ArrayList;

import objects.*;

public   interface StrategyBLService {
	// 提供给界面调用的接口

		/**
		 * @param input
		 * @return 酒店添加促销策略
		 */
		public ResultMessage hotelstrategy_make(HotelStrategy strategy);

		/**
		 * @param strategy
		 * @return 酒店更新促销策略
		 */
		public ResultMessage hotelstrategy_update(HotelStrategy strategy);

		/**
		 * @param strategy
		 * @return 网站营销人员添加促销策略
		 */
		public ResultMessage webstrategy_make(WebStrategy strategy);

		/**
		 * @param strategy
		 * @return 网站营销人员更新促销策略
		 */
		public ResultMessage webstrategy_update(WebStrategy strategy);

		// 提供给同层调用的接口
		/**
		 * @param hotelid
		 * @param clientid
		 * @return 得到对应客户适用的对应酒店的促销策略列表
		 */
		public ArrayList<HotelStrategy> getStrategy(int hotelid, int clientid);

		/**
		 * @param clientid
		 * @return 得到对应客户使用的网站的促销策略列表
		 */
		public ArrayList<WebStrategy> getStrategy(int clientid);
}
