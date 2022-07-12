package com.echipacox.entity;

import lombok.Data;

import javax.persistence.*;

@Table(name = "appointments")
@Entity
@Data
public class AppointmentsEntity extends BaseEntity {

    @Column
    private String bookedAppointmentId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity userEntity;

    @ManyToOne
    @JoinColumn(name = "booked_appointment_id")
    private BookedAppointmentsEntity bookedAppointmentsEntity;
}
