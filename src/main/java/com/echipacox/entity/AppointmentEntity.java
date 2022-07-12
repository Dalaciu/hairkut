package com.echipacox.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Table(name = "appointment_table")
@Entity
@Data
public class AppointmentEntity extends BaseEntity {

    @Column
    private Date bookDate;

    @Column
    private String description;

    @Column
    private Integer duration;

    @Column
    private String haircutType;

    @Column
    private BigDecimal price;

    @Column
    private String stylist;

}
