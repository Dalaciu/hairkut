package com.echipacox.entity;

import lombok.Data;

import javax.persistence.*;

@Table(name = "booked_appointments")
@Entity
@Data
public class BookedAppointmentsEntity extends BaseEntity {

    @Column
    private Integer count;

    @ManyToOne
    @JoinColumn(name = "appointment_id")
    private AppointmentEntity appointmentEntity;

}
