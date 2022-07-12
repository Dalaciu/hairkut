package com.echipacox.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "users_table")
@Entity
@Data
@ToString(exclude = "password")
public class UserEntity extends BaseEntity{

    @Column
    private String email;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String password;

    @Column
    private String phoneNumber;

    @Column
    private String role;

    @Column
    private String username;
}
