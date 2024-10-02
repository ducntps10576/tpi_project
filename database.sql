CREATE DATABASE tma_db;

use tma_db;

create table execution_record (
	serno int primary key NOT NULL AUTO_INCREMENT,
	serviceName varchar(50),
	msgid varchar(100),
	requestPayload varchar(200),
	request_timestamp timestamp
);