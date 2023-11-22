package com.unitbv.iot.repository;

import com.unitbv.iot.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository  extends JpaRepository<Device,Long>{

}
	