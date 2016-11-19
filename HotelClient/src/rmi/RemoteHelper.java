package rmi;

import java.rmi.Remote;

import service.ClientBLService;
import service.HotelBLService;
import service.ManageBLService;
import service.OrderBLService;
import service.StrategyBLService;
import service.UserBLService;

public class RemoteHelper {
	private Remote remote;
	private static RemoteHelper remoteHelper = new RemoteHelper();
	public static RemoteHelper getInstance(){
		return remoteHelper;
	}
	
	private RemoteHelper() {
	}
	
	public void setRemote(Remote remote){
		this.remote = remote;
	}
	
	public ClientBLService getClientBLService(){
		return (ClientBLService)remote;
	}
	
	public HotelBLService getHotelBLService(){
		return (HotelBLService)remote;
	}

	public ManageBLService getManageBLService() {
		return (ManageBLService)remote;
	}
	
	public OrderBLService getOrderBLService() {
		return (OrderBLService)remote;
	}
	
	public StrategyBLService getStrategyBLService() {
		return (StrategyBLService)remote;
	}
	
	public UserBLService getUserBLService() {
		return (UserBLService)remote;
	}
}
