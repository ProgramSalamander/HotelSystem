package po;

import java.io.Serializable;
import java.util.ArrayList;

import objects.VIPInfo;

public class ClientPO implements Serializable {
	int clientid;
	String client_name;
	String contact;
	int credit;
	ArrayList<String> credit_record;
	VIPInfo info;

	public ClientPO(int clientid, String client_name, String contact, int credit, ArrayList<String> credit_record,
			VIPInfo info) {
		super();
		this.clientid = clientid;
		this.client_name = client_name;
		this.contact = contact;
		this.credit = credit;
		this.credit_record = credit_record;
		this.info = info;
	}

	public int getClientid() {
		return clientid;
	}

	public void setClientid(int clientid) {
		this.clientid = clientid;
	}

	public String getClient_name() {
		return client_name;
	}

	public void setClient_name(String client_name) {
		this.client_name = client_name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public ArrayList<String> getCredit_record() {
		return credit_record;
	}

	public void setCredit_record(ArrayList<String> credit_record) {
		this.credit_record = credit_record;
	}

	public VIPInfo getInfo() {
		return info;
	}

	public void setInfo(VIPInfo info) {
		this.info = info;
	}

}
