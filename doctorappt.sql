use mydb;

create table doctor(
id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
firstname varchar(20),
lastname varchar(20)
);

INSERT INTO doctor VALUES(1,'Hibbert','Julius');

create table appt(
id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
docId int,
firstname varchar(20),
lastname varchar(20),
apptdate TIME,
kind varchar(20),
FOREIGN KEY(docId) REFERENCES doctor(id)
);

INSERT INTO appt VALUES(1000,1,'Sterling','Archer','8:00:00','New Patient');


select * from doctor;

select * from appt
