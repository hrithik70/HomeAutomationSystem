package com.metamorphosys.appDo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "MasterRoom")
public class MasterRoomDO {

	@Id
	private int serialNo;
	private boolean fan;
	private boolean tv;
	private boolean light;
	private boolean ac;
	private int uid;
	

	public int getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}

	public boolean isFan() {
		return fan;
	}

	public void setFan(boolean fan) {
		this.fan = fan;
	}

	public boolean isTv() {
		return tv;
	}

	public void setTv(boolean tv) {
		this.tv = tv;
	}

	public boolean isLight() {
		return light;
	}

	public void setLight(boolean light) {
		this.light = light;
	}

	public boolean isAc() {
		return ac;
	}

	public void setAc(boolean ac) {
		this.ac = ac;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	

	@Override
	public String toString() {
		return "MasterRoomDO [serialNo=" + serialNo + ", fan=" + fan + ", tv=" + tv + ", light=" + light + ", ac=" + ac
				+ ", uid=" + uid + "]";
	}

	public MasterRoomDO(int serialNo, boolean fan, boolean tv, boolean light, boolean ac, int uid) {
		super();
		this.serialNo = serialNo;
		this.fan = fan;
		this.tv = tv;
		this.light = light;
		this.ac = ac;
		this.uid = uid;
	}

	public MasterRoomDO() {
		super();
		// TODO Auto-generated constructor stub
	}

}
