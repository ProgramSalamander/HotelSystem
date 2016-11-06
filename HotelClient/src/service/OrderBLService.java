package service;

import java.util.ArrayList;

import vo.*;
import objects.*;

public interface OrderBLService {
	// 提供给界面调用的接口
	/**
	 * @param clientid
	 * @return 客户浏览订单
	 */
	public ArrayList<OrderVO> order_client_browse(int clientid);

	/**
	 * @param clientid
	 * @param state
	 * @return 客户根据订单状态浏览
	 */
	public ArrayList<OrderVO> order_client_browse(int clientid, OrderState state);

	/**
	 * @param clientid
	 * @param isExecute
	 * @return 客户根据执行情况浏览
	 */
	public ArrayList<OrderVO> order_client_browse(int clientid, boolean isExecute);

	/**
	 * @param hotelid
	 * @return 酒店浏览订单
	 */
	public ArrayList<OrderVO> order_hotel_browse(int hotelid);

	/**
	 * @param hotelid
	 * @param state
	 * @return 酒店根据订单状态浏览
	 */
	public ArrayList<OrderVO> order_hotel_browse(int hotelid, OrderState state);

	/**
	 * @param hotelid
	 * @param isExecute
	 * @return 酒店根据执行情况浏览
	 */
	public ArrayList<OrderVO> order_hotel_browse(int hotelid, boolean isExecute);

	/**
	 * @param clientid
	 * @param orderid
	 * @return 客户撤销订单
	 */
	public ResultMessage order_client_cancel(int clientid, int orderid);

	/**
	 * @param vo
	 * @return 客户生成订单
	 */
	public ResultMessage order_client_generate(OrderVO vo);

	/**
	 * @param orderid
	 * @return 酒店执行订单
	 */
	public ResultMessage order_hotel_execute(int orderid);

	/**
	 * @return 网站营销人员浏览未执行订单
	 */
	public ArrayList<OrderVO> order_market_browseUnfilled();

	/**
	 * @param orderid
	 * @return 网站营销人员撤销异常订单
	 */
	public ResultMessage order_market_cancelAbnormal(int orderid);

	/**
	 * @param type
	 * @param num
	 * @return 计算订单总价（无促销策略）
	 */
	public int calculateTotalwithoutStrategy(RoomType type, int num);

	/**
	 * @param type
	 * @param num
	 * @param list1
	 * @param list2
	 * @return 计算订单总价（有促销策略）
	 */
	public int calculateTotalwithStrategy(RoomType type, int num, ArrayList<HotelStrategy> list1,
			ArrayList<WebStrategy> list2);

	// 提供给同层调用的接口
	/**
	 * @param leaveTime
	 * @return 更新订单实际离开时间
	 */
	public ResultMessage updateActualLeaveTime(int orderid, String leaveTime);
}
