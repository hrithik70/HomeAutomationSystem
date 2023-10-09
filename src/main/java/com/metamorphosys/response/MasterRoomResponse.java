package com.metamorphosys.response;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.metamorphosys.appDo.MasterRoomDO;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MasterRoomResponse {

	private String message;
	private MasterRoomDO data;
	private List<MasterRoomDO> list;
	private HttpStatus httpStatus;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public MasterRoomDO getData() {
		return data;
	}

	public void setData(MasterRoomDO data) {
		this.data = data;
	}

	public List<MasterRoomDO> getList() {
		return list;
	}

	public void setList(List<MasterRoomDO> list) {
		this.list = list;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	@Override
	public String toString() {
		return "MasterRoomResponse [message=" + message + ", data=" + data + ", list=" + list + ", httpStatus="
				+ httpStatus + "]";
	}

	public MasterRoomResponse(String message, MasterRoomDO data, List<MasterRoomDO> list, HttpStatus httpStatus) {
		super();
		this.message = message;
		this.data = data;
		this.list = list;
		this.httpStatus = httpStatus;
	}

	public MasterRoomResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

}
