package objects;

public class VIPInfo {
	public enum VIPType {
		NORMAL, Enterprise
	};

	VIPType type;
	int VIPid;
	String birthday;
	String enterpriseName;

	public VIPInfo(VIPType type, int vIPid, String info) {
		this.type = type;
		VIPid = vIPid;
		if(type == VIPType.NORMAL)
			birthday = info;
		else
			enterpriseName = info;
	}

	public VIPType getType() {
		return type;
	}

	public void setType(VIPType type) {
		this.type = type;
	}

	public int getVIPid() {
		return VIPid;
	}

	public void setVIPid(int vIPid) {
		VIPid = vIPid;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getEnterpriseName() {
		return enterpriseName;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}
}
