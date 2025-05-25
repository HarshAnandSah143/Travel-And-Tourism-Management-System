use travelmanagementsystem;

show databases;

use travelmanagementsystem;

create table account(username varchar(20) primary KEY,
name varchar(20),
 password varchar(20),
 security varchar(100),
 answer varchar(50));

show tables;

select * from account;

use travelmanagementsystem;

create table customer (
    username varchar(20),
    id_type varchar(20),
    number varchar(50),
    name varchar(50),
    gender varchar(10),
    country varchar(30),
    address varchar(100),
    phone varchar(15),
    email varchar(50)
);


create table hotels (
    name varchar(50),
    cost_per_day int,
    ac_cost int,
    food_cost int
);

insert into hotels values 
('the taj', 3000, 500, 800),
('oberoi', 2500, 400, 700),
('holiday inn', 2000, 300, 600);

create table bookhotel (
    username varchar(50),
    hotel varchar(50),
    persons int,
    days int,
    ac varchar(10),
    food varchar(10),
    id_type varchar(20),
    id_number varchar(50),
    phone varchar(20),
    total_price int
);

create table bookpackage (
    username varchar(50),
    package varchar(50),
    persons int,
    id varchar(20),
    number varchar(20),
    phone varchar(20),
    price int
);

create table package (
    packageid varchar(20) primary key,
    packagename varchar(50),
    date date,
    cost int
);

describe bookHotel;

describe hotels;

describe customer;

alter table hotels add column food_charges int;
alter table hotels add column ac_charges int;

SELECT * FROM bookpackage WHERE username = 'someuser';
