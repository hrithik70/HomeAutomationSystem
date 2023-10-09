package com.metamorphosys.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.metamorphosys.appDo.MasterRoomDO;
import com.metamorphosys.response.MasterRoomResponse;
import com.metamorphosys.service.MasterRoomService;

@RestController
public class MasterRoomController {

	// Use of Logger
	static final Logger logger = (Logger) LoggerFactory.getLogger(MasterRoomController.class);

	@Autowired
	private MasterRoomService masterService;

	
	// saveData() method : To save the command by user
	@PostMapping("/")
	public ResponseEntity<MasterRoomResponse> saveData(@RequestBody MasterRoomDO masterRoomDo) {
		MasterRoomResponse saveCommandResponse = masterService.saveCommand(masterRoomDo);
		return new ResponseEntity<MasterRoomResponse>(saveCommandResponse, saveCommandResponse.getHttpStatus());

	}

	// getRoomList() method : To find all the users performed command
	@GetMapping("/roomList")
	public ResponseEntity<MasterRoomResponse> getRoomList() {
		MasterRoomResponse allRoomList = masterService.getAllRoomList();
		logger.info(allRoomList.toString());
		return new ResponseEntity<MasterRoomResponse>(allRoomList, allRoomList.getHttpStatus());

	}

	// getRoomById() method : To F
	@GetMapping("room/{uid}")
	public ResponseEntity<MasterRoomResponse> getRoomById(@PathVariable int uid) {
		MasterRoomResponse roomByUserId = masterService.getRoomByUserId(uid);
		return new ResponseEntity<MasterRoomResponse>(roomByUserId, roomByUserId.getHttpStatus());
	}

}
