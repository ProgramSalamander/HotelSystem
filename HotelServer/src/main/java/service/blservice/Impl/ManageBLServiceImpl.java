package service.blservice.Impl;

import objects.ResultMessage;
import service.blservice.ManageBLService;
import vo.ClientVO;
import vo.HotelVO;
import vo.HotelWorkerVO;
import vo.WebMarketVO;

public class ManageBLServiceImpl implements ManageBLService {
	/**
	 * @param clientid
	 * @return 搜索客户
	 */
	@Override
	public ClientVO manage_searchClient(int clientid) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @param clientid
	 * @return 更新客户信息
	 */
	@Override
	public ResultMessage manage_updateClient(ClientVO clientvo) {
		// TODO Auto-generated method stub
		return ResultMessage.Success;
	}

	/**
	 * @param hotelid
	 * @return 添加酒店
	 */
	@Override
	public ResultMessage manage_addHotel(HotelVO hotelvo) {
		// TODO Auto-generated method stub
		return ResultMessage.Success;
	}

	/**
	 * @param hotelid
	 * @param w
	 * @return 添加酒店工作人员
	 */
	@Override
	public ResultMessage manage_addHotelWorker(HotelWorkerVO w) {
		// TODO Auto-generated method stub
		return ResultMessage.Success;
	}

	/**
	 * @param hotelid
	 * @return 搜索酒店工作人员
	 */
	@Override
	public HotelWorkerVO manage_searchHotelWorker(int hotelid) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @param hotelid
	 * @return 更新酒店工作人员信息
	 */
	@Override
	public ResultMessage manage_updateHotelWorker(HotelWorkerVO w) {
		// TODO Auto-generated method stub
		return ResultMessage.Success;
	}

	/**
	 * @param mw
	 * @return 添加网站营销人员
	 */
	@Override
	public ResultMessage manage_addMarketWorker(WebMarketVO mw) {
		// TODO Auto-generated method stub
		return ResultMessage.Success;
	}

	/**
	 * @param marketWorkerid
	 * @return 搜索网站营销人员
	 */
	@Override
	public WebMarketVO manage_searchMarketWorker(int marketWorkerid) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @param mw
	 * @return 更新网站营销人员信息
	 */
	@Override
	public ResultMessage manage_updateMarketWorker(WebMarketVO mw) {
		// TODO Auto-generated method stub
		return ResultMessage.Success;
	}

}
