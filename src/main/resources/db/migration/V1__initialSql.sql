create table appointment_table
(
    id serial constraint appointment_table_pk
    primary key,
    haircut_type text not null,
    stylist text,
    duration int,
    book_date date not null,
    description text,
    price double precision
);

create table users_table
(
    id serial
    constraint users_pk
    primary key,

    username varchar(20) not null,
    first_name text not null,
    last_name text not null,
    email varchar(30) not null,
    phone_number varchar(15),
    password varchar(300),
    role text
);

create unique index users_table_email_uindex
    on users_table (email);

create table booked_appointments
(
    id serial
    constraint booked_appointments_pk
    primary key,

    appointment_id int
    constraint booked_appointments_appointment_table_fk
    references appointment_table,
    count int default 1
);

create table appointments
(
    id serial
    constraint appointments_pk
    primary key,

    user_id int
    constraint appointments_users_table_id_fk
    references users_table,

    booked_appointment_id int
    constraint appointments_booked_appointments_id_fk
    references booked_appointments
);



