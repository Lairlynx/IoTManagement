package com.unitbv.iotmngapp.service;

import com.unitbv.iotmngapp.model.Device;
import com.unitbv.iotmngapp.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeviceService {

    @Autowired
    private DeviceRepository deviceRepository;

    //TODO: business logic related to devices
}
