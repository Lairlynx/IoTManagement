package com.unitbv.iotmngapp.repository;

import com.unitbv.iotmngapp.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, Long> {
    //TODO: additional query methods
}
