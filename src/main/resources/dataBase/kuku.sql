/*SCRIPT TO CREATE DATABASE */

CREATE DATABASE KUKU;

/*SCRIPT TO CREATE TABLES*/

CREATE TABLE USERS(
USERNAME VARCHAR(50) NOT NULL PRIMARY KEY,
PASSWORD VARCHAR(50) NOT NULL,
ENABLED BOOLEAN NOT NULL
);

CREATE TABLE AUTHORITIES(
USERNAME VARCHAR(50) NOT NULL,
AUTHORITY VARCHAR(50) NOT NULL,
CONSTRAINT FK_AUTHORITIES_USERS FOREIGN KEY(USERNAME) REFERENCES USERS(USERNAME));

CREATE UNIQUE INDEX AUTH_USERS on authorities (USERNAME,AUTHORITY);

CREATE TABLE USER_INFO(
USERNAME VARCHAR(50) NOT NULL PRIMARY KEY,
NAME VARCHAR(30) NOT NULL,
LAST_NAME VARCHAR(30),
BIRTHDAY DATE NOT NULL,
SEX CHAR(1),
CONSTRAINT FK_USERS FOREIGN KEY(USERNAME) REFERENCES USERS(USERNAME));

CREATE TABLE POST(
POST_ID INTEGER(4) NOT NULL PRIMARY KEY AUTO_INCREMENT,
USERNAME VARCHAR(50) NOT NULL,
DATE_POST DATE NOT NULL,
TITLE VARCHAR(70) NOT NULL,
CATEGORY_ID INTEGER(4) NOT NULL,
CONTENT VARCHAR(2000) NOT NULL,
URL_IMAGE VARCHAR(100),
CONSTRAINT FK_USERS FOREIGN KEY(USERNAME) REFERENCES USERS(USERNAME),
CONSTRAINT FK_CATEGORY FOREIGN KEY(CATEGORY_ID) REFERENCES CATEGORY(CATEGORY_ID)
);

CREATE TABLE CATEGORY(
CATEGORY_ID INTEGER(4) NOT NULL PRIMARY KEY AUTO_INCREMENT,
DESCRIPTION_CATEGORY VARCHAR(50)
);
