----------------------------------------
/*
SCRIPT DATABASE: People
*/
----------------------------------------

-- Database
CREATE DATABASE people
    WITH 
    OWNER = postgres
    ENCODING = 'UTF8'
    CONNECTION LIMIT = -1;
-- Sequence
CREATE SEQUENCE PE_SEQ_PERSON START WITH 1;
-- TABLE
CREATE TABLE PE_PERSON (PERSON_ID INTEGER NOT NULL, CODE_ VARCHAR(10), LASTNAME VARCHAR(100), NAME_ VARCHAR(50), PRIMARY KEY (PERSON_ID));
