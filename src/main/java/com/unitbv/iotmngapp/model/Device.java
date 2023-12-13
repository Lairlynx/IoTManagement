package com.unitbv.iotmngapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String type;
    private boolean online;

    // Constructors, getters, setters

    //Default constructor
    public Device() {
    	
    }

    //Parameterized constructor
    public Device(String name, String description, boolean status) {
    	this.name = name;
    	this.type = description;
    	this.online = status;
    	}
    }
