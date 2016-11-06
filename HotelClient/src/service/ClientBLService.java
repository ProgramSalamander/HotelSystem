package service;

import vo.*;
import java.util.ArrayList;

import objects.*;

public interface ClientBLService {
	// 提供给界面调用的接口

	/**
	 * @param clientid
	 * @return 客户获取详细信息
	 */
	public ClientVO client_checkInfo(int clientid);

	/**
	 * @param vo
	 * @return 客户更新详细信息
	 */
	public ResultMessage client_updateInfo(ClientVO vo);

	/**
	 * @param clientid
	 * @return 客户获取历史酒店列表
	 */
	public ArrayList<HotelVO> client_getpreviousHotelList(int clientid);

	/**
	 * @param clientid
	 * @return 客户查看信用值
	 */
	public int client_checkCredit(int clientid);

	/**
	 * @param clientid
	 * @return 客户获取信用记录
	 */
	public ArrayList<String> client_checkCreditList(int clientid);

	/**
	 * @param location
	 * @return 客户获取对应地址的酒店列表
	 */
	public ArrayList<HotelVO> client_setLocation(String location);

	/**
	 * @param hotelname
	 * @return 符合对应酒店名的酒店列表
	 */
	public ArrayList<HotelVO> client_searchHotel(String hotelname);

	/**
	 * @param type
	 * @return 有符合对应房间类型的酒店列表
	 */
	public ArrayList<HotelVO> client_searchHotel(RoomType type);

	/**
	 * @param lowprice
	 * @param highprice
	 * @return 有符合对应价格区间的房间的酒店列表
	 */
	public ArrayList<HotelVO> client_searchHotel(int lowprice, int highprice);

	/**
	 * @param inTime
	 * @param leaveTime
	 * @return 有符合对应时间段的房间的酒店列表
	 */
	public ArrayList<HotelVO> client_searchHotel(String inTime, String leaveTime);

	/**
	 * @param star
	 * @return 符合对应星级的酒店列表
	 */
	public ArrayList<HotelVO> client_searchHotel(int star);

	/**
	 * @param lowscore
	 * @param highscore
	 * @return 符合对应评分区间的酒店列表
	 */
	public ArrayList<HotelVO> client_searchHotel(double lowscore, double highscore);

	/**
	 * @param hotelid
	 * @return 客户获取酒店详细信息
	 */
	public HotelVO client_checkHotelInfo(int hotelid);

	/**
	 * @param e
	 * @param clientid
	 * @return 客户评价酒店
	 */
	public ResultMessage client_evaluateHotel(Evaluation e, int clientid);

	/**
	 * @param info
	 * @param clientid
	 * @return 客户注册会员
	 */
	public ResultMessage client_enrollVIP(VIPInfo info, int clientid);

	// 提供给同层调用的接口

	/**
	 * @param clientId
	 * @param value
	 * @param tag
	 * @return 更新客户信用值
	 */
	public ResultMessage updateClientCredit(int clientId, int value, int tag);

	/**
	 * @param clientid
	 * @return 查看客户详细信息
	 */
	public Client checkClientInfo(int clientid);

	/**
	 * @param client
	 * @return 更新客户详细信息
	 */
	public ResultMessage updateClientInfo(Client client);
}
