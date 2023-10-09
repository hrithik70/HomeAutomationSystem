package com.metamorphosys.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.metamorphosys.appDo.MasterRoomDO;

public interface AutomationRepository extends JpaRepository<MasterRoomDO, Integer> {

	List<MasterRoomDO> findByUid(int uid);
}
