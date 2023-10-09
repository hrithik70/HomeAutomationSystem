package com.metamorphosys.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.metamorphosys.appDo.MasterRoomDO;
import com.metamorphosys.exception.UserNotFoundException;
import com.metamorphosys.repository.AutomationRepository;
import com.metamorphosys.response.MasterRoomResponse;

@Service
public class MasterRoomService {

	@Autowired
	private AutomationRepository appRepo;

	final static Logger logger = LoggerFactory.getLogger(MasterRoomService.class);

	// business logic for saving master room command in Database
	public MasterRoomResponse saveCommand(MasterRoomDO masterRoomDo) {
		MasterRoomDO saveDo = appRepo.save(masterRoomDo);
		MasterRoomResponse response = new MasterRoomResponse();
		if (saveDo != null) {
			response.setMessage("Room saved");
			response.setHttpStatus(HttpStatus.OK);
			return response;
		} else {
			response.setMessage("Room not Added..");
			response.setHttpStatus(HttpStatus.NOT_ACCEPTABLE);
			return response;
		}

	}

	// Business logic for finding All the list of Rooms
	public MasterRoomResponse getAllRoomList() {
		List<MasterRoomDO> findAllRoom = appRepo.findAll();
		MasterRoomResponse response = new MasterRoomResponse();
		if (findAllRoom != null) {
			response.setMessage("Successfully Fetch result.... ");
			response.setList(findAllRoom);
			response.setHttpStatus(HttpStatus.FOUND);
			return response;
		}
		response.setMessage("List Not Found ");
		response.setHttpStatus(HttpStatus.NOT_FOUND);
		return response;
	}

	public MasterRoomResponse getRoomByUserId(int uid) {
		List<MasterRoomDO> findByUid = appRepo.findByUid(uid);
		MasterRoomResponse response = new MasterRoomResponse();
		if (findByUid.size() == 0) {
			response.setHttpStatus(HttpStatus.NOT_FOUND);
			throw new UserNotFoundException("User id " + uid + " not found");

		} else {
			response.setMessage("User Found ");
			response.setList(findByUid);
			response.setHttpStatus(HttpStatus.FOUND);

		}
		return response;
	}

}
