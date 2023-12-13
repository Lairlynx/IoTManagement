package com.unitbv.iotmngapp.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Entity
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 255)
    private String name;

    @Size(max = 1000)
    private String description;

    private boolean status;

    @OneToMany(mappedBy = "device", cascade = CascadeType.ALL)
    private List<Sensor> sensors;

    private LocalDateTime createdAt;

    private LocalDateTime lastModifiedAt;

    // Constructors
    public Device() {
        // Default constructor
    }

    public Device(String name, String description, boolean status) {
        this.name = name;
        this.description = description;
        this.status = status;
    }

    // Getters and setters

    // Additional methods, annotations, and overrides

    // Equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return Objects.equals(id, device.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // ToString
    @Override
    public String toString() {
        return "Device{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                '}';
    }
}