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
	 * @return �����ͻ�
	 */
	@Override
	public ClientVO manage_searchClient(int clientid) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @param clientid
	 * @return ���¿ͻ���Ϣ
	 */
	@Override
	public ResultMessage manage_updateClient(ClientVO clientvo) {
		// TODO Auto-generated method stub
		return ResultMessage.Success;
	}

	/**
	 * @param hotelid
	 * @return ��ӾƵ�
	 */
	@Override
	public ResultMessage manage_addHotel(HotelVO hotelvo) {
		// TODO Auto-generated method stub
		return ResultMessage.Success;
	}

	/**
	 * @param hotelid
	 * @param w
	 * @return ��ӾƵ깤����Ա
	 */
	@Override
	public ResultMessage manage_addHotelWorker(HotelWorkerVO w) {
		// TODO Auto-generated method stub
		return ResultMessage.Success;
	}

	/**
	 * @param hotelid
	 * @return �����Ƶ깤����Ա
	 */
	@Override
	public HotelWorkerVO manage_searchHotelWorker(int hotelid) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @param hotelid
	 * @return ���¾Ƶ깤����Ա��Ϣ
	 */
	@Override
	public ResultMessage manage_updateHotelWorker(HotelWorkerVO w) {
		// TODO Auto-generated method stub
		return ResultMessage.Success;
	}

	/**
	 * @param mw
	 * @return �����վӪ����Ա
	 */
	@Override
	public ResultMessage manage_addMarketWorker(WebMarketVO mw) {
		// TODO Auto-generated method stub
		return ResultMessage.Success;
	}

	/**
	 * @param marketWorkerid
	 * @return ������վӪ����Ա
	 */
	@Override
	public WebMarketVO manage_searchMarketWorker(int marketWorkerid) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @param mw
	 * @return ������վӪ����Ա��Ϣ
	 */
	@Override
	public ResultMessage manage_updateMarketWorker(WebMarketVO mw) {
		// TODO Auto-generated method stub
		return ResultMessage.Success;
	}

}
