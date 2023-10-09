package com.metamorphosys.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.metamorphosys.appDo.HallRoomDO;
import com.metamorphosys.exception.LightException;

@RestController
public class HallRoomController {

	@PostMapping("/hall")
	HallRoomDO saveData(@RequestBody HallRoomDO roomDO) {
		System.out.println(roomDO);
		if (roomDO.getBrightness() == 0) {
			roomDO.setLight(false);
		} else if (roomDO.getBrightness() > 0 && roomDO.getBrightness() < 50) {
			roomDO.setLight(true);
		} else if (roomDO.getBrightness() >= 50 && roomDO.getBrightness() <= 100) {
			roomDO.setLight(true);
			throw new LightException("Brightness is too High and Light is on...");
		} else {
			throw new LightException("Brightness is out of range it should be 1-100");
		}
		return roomDO;
	}

}
